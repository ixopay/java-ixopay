package com.ixopay.client.examples.springboot;

import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.ixopay.client.core.api.StatusApi;
import com.ixopay.client.core.api.TransactionApi;
import com.ixopay.client.core.model.Callback;
import com.ixopay.client.core.model.Debit;
import com.ixopay.client.core.model.ErrorType;
import com.ixopay.client.core.model.MaybeStatusResponse;
import com.ixopay.client.core.model.MaybeTransactionResponse;
import com.ixopay.client.core.model.StatusErrorResponse;
import com.ixopay.client.core.model.StatusResponse;
import com.ixopay.client.core.model.TransactionErrorResponse;
import com.ixopay.client.core.model.TransactionResponse;

@Controller
public class PurchaseController {
	private static final Logger logger = LoggerFactory.getLogger(PurchaseController.class);
	private final GatewayProperties gatewayProperties;
	private final TransactionApi transactionApi;
	private final StatusApi statusApi;

	@ConstructorBinding
	public PurchaseController(GatewayProperties gatewayProperties, TransactionApi transactionApi, StatusApi statusApi) {
		this.gatewayProperties = gatewayProperties;
		this.transactionApi = transactionApi;
		this.statusApi = statusApi;
	}

	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@PostMapping("/create")
	public ModelAndView createDebit(@RequestHeader(value = "X-Forwarded-Proto", defaultValue = "http", required = false) String forwardedProto) {
		final String merchantTransactionId = UUID.randomUUID().toString();

		final Debit debit = new Debit()
			.merchantTransactionId(merchantTransactionId)
			.amount("1")
			.currency("USD")
			.successUrl(ServletUriComponentsBuilder.fromCurrentServletMapping().scheme(forwardedProto).path("/status/{id}/success").build(merchantTransactionId))
			.cancelUrl(ServletUriComponentsBuilder.fromCurrentServletMapping().scheme(forwardedProto).path("/status/{id}/cancel").build(merchantTransactionId))
			.errorUrl(ServletUriComponentsBuilder.fromCurrentServletMapping().scheme(forwardedProto).path("/status/{id}/error").build(merchantTransactionId));

		if(gatewayProperties.callbackBaseUrl() != null) {
			debit.callbackUrl(UriComponentsBuilder.fromHttpUrl(gatewayProperties.callbackBaseUrl()).path("/callback/{id}").build(merchantTransactionId));
		}

		final MaybeTransactionResponse response = transactionApi.processDebit(gatewayProperties.sharedSecret(), gatewayProperties.apiKey(), debit);

		if(!response.getSuccess()) {
			TransactionErrorResponse error = (TransactionErrorResponse)response;

			return error(ErrorModel.from(error));
		}

		final TransactionResponse transaction = (TransactionResponse)response;

		if(transaction.getReturnType() == null)
			return error(new ErrorModel(-1, "null return type", null, null));

		switch( transaction.getReturnType() ) {
			case FINISHED:
				return new ModelAndView(String.format("redirect:%s", ServletUriComponentsBuilder.fromCurrentServletMapping().scheme(forwardedProto).path("/status/{id}").build(merchantTransactionId)));
			case REDIRECT:
				return new ModelAndView(String.format("redirect:%s", transaction.getRedirectUrl()));
			case HTML:
				return new ModelAndView("return_html", Map.of("htmlContent", transaction.getHtmlContent()));
			case PENDING:
				return new ModelAndView(String.format("redirect:%s", ServletUriComponentsBuilder.fromCurrentServletMapping().scheme(forwardedProto).path("/status/{id}/pending").build(merchantTransactionId)));
			case ERROR:
				if(transaction.getErrors() != null && !transaction.getErrors().isEmpty()) {
					final ErrorType error = transaction.getErrors().get(0);
					return error(new ErrorModel(error.getErrorCode(), error.getErrorMessage(), error.getAdapterCode(), error.getAdapterMessage()));
				}
				return error(new ErrorModel(-1, "unknown transaction error", null, null));
			default:
				return error(new ErrorModel(-1, String.format("unhandled return type %s", transaction.getReturnType()), null, null));
		}
	}

	@GetMapping({"/status/{id}/{status}", "/status/{id}"})
	public ModelAndView status(@PathVariable("id") String id, @PathVariable(value = "status", required = false) TransactionStatus transactionStatus) {
		final MaybeStatusResponse response = statusApi.transactionStatusByMerchantTransactionId(gatewayProperties.sharedSecret(), gatewayProperties.apiKey(), id);

		if(!response.getSuccess()) {
			StatusErrorResponse error = (StatusErrorResponse)response;

			return error(ErrorModel.from(error));
		}

		final StatusResponse status = (StatusResponse)response;
		return new ModelAndView("status", Map.of("transaction", status));
	}

	@PostMapping("/callback/{id}")
	@ResponseBody
	public String callback(@PathVariable("id") String id, @RequestBody Callback callback) {
		logger.info("received callback: id={} body={}", id, callback);
		return "OK";
	}

	private ModelAndView error(ErrorModel errorModel) {
		return new ModelAndView("error", HttpStatus.INTERNAL_SERVER_ERROR)
			.addObject("txError", errorModel);
	}

	public enum TransactionStatus {
		success,
		cancel,
		error,
		pending
	}

	public static class ErrorModel {
		private final String errorCode;
		private final String errorMessage;
		private final String adapterCode;
		private final String adapterMessage;

		public ErrorModel(Integer errorCode, String errorMessage, String adapterCode, String adapterMessage) {
			this.errorCode = errorCode != null ? String.valueOf(errorCode) : null;
			this.errorMessage = errorMessage;
			this.adapterCode = adapterCode;
			this.adapterMessage = adapterMessage;
		}

		public static ErrorModel from(TransactionErrorResponse error) {
			return new ErrorModel(error.getErrorCode(), error.getErrorMessage(), error.getAdapterCode(), error.getAdapterMessage());
		}
		public static ErrorModel from(StatusErrorResponse error) {
			return new ErrorModel(error.getErrorCode(), error.getErrorMessage(), error.getAdapterCode(), error.getAdapterMessage());
		}

		public String errorCode() { return errorCode; }
		public String errorMessage() { return errorMessage; }
		public String adapterCode() { return adapterCode; }
		public String adapterMessage() { return adapterMessage; }
	}
}
