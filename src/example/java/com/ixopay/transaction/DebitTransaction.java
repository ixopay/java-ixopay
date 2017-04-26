package com.ixopay.transaction;

import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

import javax.xml.bind.JAXBException;
import javax.xml.transform.stream.StreamSource;

import com.ixopay.client.model.GatewayModelContext;
import com.ixopay.client.model.result.ErrorType;
import com.ixopay.client.model.result.ResultType;
import com.ixopay.client.model.transaction.CreditCardCustomerType;
import com.ixopay.client.model.transaction.DebitType;
import com.ixopay.client.model.transaction.TransactionType;
import com.ixopay.client.signing.HttpHeaders;
import com.ixopay.client.signing.HttpRequestSigner;
import com.ixopay.client.signing.Passwords;

public class DebitTransaction {

	public static void main(String[] args) throws IOException, JAXBException {
		final String GATEWAY_USERNAME = "YOUR_USERNAME";
		final String GATEWAY_PASSWORD = "YOUR_PASSWORD";
		final String GATEWAY_CONNECTOR_API_KEY = "YOUR_API_KEY";
		final String GATEWAY_CONNECTOR_SHARED_SECRET = "YOUR_SHARED_SECRET";

		// setup transaction
		TransactionType transaction;
		{
			CreditCardCustomerType customer = new CreditCardCustomerType();
			customer.setIdentification("customer-id");
			customer.setFirstName("first-name");
			customer.setLastName("last-name");
			customer.setBillingAddress1("billing-address-1");
			customer.setBillingCity("billing-city");
			customer.setBillingPostcode("billing-post-code");
			customer.setBillingCountry("AT");
			customer.setBillingPhone("billing-phone");
			customer.setEmail("customer-email@ixopay.com");
			customer.setExpiryMonth("04");
			customer.setExpiryYear("2050");
			customer.setIssueNumber("5105105105105100");
			customer.setCvv("123");

			DebitType debitTransaction = new DebitType();
			debitTransaction.setTransactionId(UUID.randomUUID().toString()); // the random UUID should be stored in a real system and used to correlate callbacks
			debitTransaction.setCreditCardCustomer(customer);
			debitTransaction.setAmount(new BigDecimal("10.00"));
			debitTransaction.setCurrency("EUR");
			debitTransaction.setDescription("my-description");
			debitTransaction.setSuccessUrl("https://MY_SERVER/MY_SUCCESS_HANDLER");
			debitTransaction.setCancelUrl("https://MY_SERVER/MY_CANCEL_HANDLER");
			debitTransaction.setErrorUrl("https://MY_SERVER/MY_ERROR_HANDLER");
			debitTransaction.setCallbackUrl("https://MY_SERVER/MY_CALLBACK_HANDLER");

			transaction = new TransactionType();
			transaction.setTestMode(true); // set to false for real transaction
			transaction.setUsername(GATEWAY_USERNAME);
			transaction.setPassword(Passwords.hash(GATEWAY_PASSWORD)); // password MUST be SHA-1 hashed
			transaction.setDebit(debitTransaction);
		}

		// perform transaction
		HttpURLConnection response = transactionRequest(GATEWAY_CONNECTOR_API_KEY, GATEWAY_CONNECTOR_SHARED_SECRET, transaction);

		// basic error handling
		int responseCode = response.getResponseCode();
		if( responseCode != 200 ) {
			System.out.printf("Request failed (%s).%n", response.getResponseCode());

			// convert result to Java model
			ResultType result = GatewayModelContext.unmarshaller().unmarshal(new StreamSource(response.getErrorStream()), ResultType.class).getValue();

			System.out.printf("success: %s%n", result.isSuccess());
			System.out.printf("return-type: %s (%s)%n", result.getReturnType().getValue(), result.getReturnType().getRedirectType());
			System.out.println("errors:");
			for( ErrorType errorType : result.getErrors().getError() ) {
				System.out.printf("  - code: %s%n", errorType.getCode());
				System.out.printf("    message: %s%n", errorType.getMessage());
				System.out.printf("    adapter-code: %s%n", errorType.getAdapterCode());
				System.out.printf("    adapter-message: %s%n", errorType.getAdapterMessage());
			}

			return;
		}

		// convert result to Java model
		ResultType result = GatewayModelContext.unmarshaller().unmarshal(new StreamSource(response.getInputStream()), ResultType.class).getValue();

		// work with result

		System.out.printf("success: %s%n", result.isSuccess());
		System.out.printf("return-type: %s (%s)%n", result.getReturnType().getValue(), result.getReturnType().getRedirectType());
		// ...
	}

	private static HttpURLConnection transactionRequest(String apiKey, String sharedSecret, TransactionType transaction) throws IOException {
		final String CONTENT_TYPE = "text/xml; charset=utf-8";
		final String body = transactionRequestContent(transaction); // marshall transaction as request body

		System.out.println("sending body:");
		System.out.println(body);
		System.out.println();

		URL url = new URL("https://gateway.ixopay.com/transaction");
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setRequestProperty("Content-Type", CONTENT_TYPE);

		// copy information about the request we're about to make
		HttpRequestSigner.HttpRequestInfo requestInfo = HttpRequestSigner.requestInfo()
			.withUrl(url)
			.withMethod(urlConnection.getRequestMethod())
			.withContentTypeHeader(CONTENT_TYPE)
			.withBody(body)
			.build();

		// sign request
		HttpRequestSigner.HttpRequestSignature signature = HttpRequestSigner.sign(apiKey, sharedSecret, requestInfo);
		urlConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, signature.getAuthHeader());
		urlConnection.setRequestProperty(HttpHeaders.DATE, signature.getDateHeader());

		// now the request is signed and we can send it
		urlConnection.connect();
		try( PrintStream out = new PrintStream(urlConnection.getOutputStream(), false, StandardCharsets.UTF_8.name()) ) {
			out.print(body);
			out.flush();
		}

		return urlConnection;
	}

	private static String transactionRequestContent(TransactionType transaction) {
		StringWriter writer = new StringWriter();
		try {
			GatewayModelContext.marshaller().marshal(transaction, writer);
		} catch( JAXBException e ) {
			throw new RuntimeException(e);
		}
		return writer.toString();
	}

}
