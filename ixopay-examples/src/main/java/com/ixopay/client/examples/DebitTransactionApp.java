package com.ixopay.client.examples;

import java.io.Console;
import java.util.Optional;
import java.util.UUID;

import com.ixopay.client.core.api.StatusApi;
import com.ixopay.client.core.api.TransactionApi;
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.model.Debit;
import com.ixopay.client.core.model.MaybeTransactionResponse;
import com.ixopay.client.core.model.StatusResponse;
import com.ixopay.client.core.model.TransactionErrorResponse;
import com.ixopay.client.core.model.TransactionResponse;
import com.ixopay.client.signing.model.ApiUser;

public class DebitTransactionApp {

	public static void main(String[] args) throws InterruptedException {
		final String IXOPAY_GATEWAY_HOST = Optional.ofNullable(System.getenv("IXOPAY_GATEWAY_HOST")).orElse("gateway.ixopay.com");
		final String IXOPAY_API_USER_USERNAME = Optional.ofNullable(System.getenv("IXOPAY_API_USER_USERNAME")).orElse("YOUR_API_USER");
		final String IXOPAY_API_USER_PASSWORD = Optional.ofNullable(System.getenv("IXOPAY_API_USER_PASSWORD")).orElse("YOUR_API_PASSWORD");

		final String IXOPAY_API_KEY = Optional.ofNullable(System.getenv("IXOPAY_API_KEY")).orElse("YOUR_API_KEY");
		final String IXOPAY_SHARED_SECRET = Optional.ofNullable(System.getenv("IXOPAY_SHARED_SECRET")).orElse("YOUR_SHARED_SECRET");

		final ApiUser apiUser = new ApiUser(IXOPAY_API_USER_USERNAME, IXOPAY_API_USER_PASSWORD);
		final ApiClient apiClient = new ApiClient(apiUser);
		apiClient.updateBaseUri(String.format("https://%s/api/v3", IXOPAY_GATEWAY_HOST));

		final TransactionApi transactionApi = new TransactionApi(apiClient);

		final MaybeTransactionResponse response = transactionApi.processDebit(
			IXOPAY_SHARED_SECRET,
			IXOPAY_API_KEY,
			new Debit()
				.merchantTransactionId(UUID.randomUUID().toString())
				.amount("1")
				.currency("USD")
		);

		if(!response.getSuccess()) {
			TransactionErrorResponse error = (TransactionErrorResponse)response;

			System.err.printf("Transaction was not successful: [%d] %s%n", error.getErrorCode(), error.getErrorMessage());
			System.exit(1);
		}

		final TransactionResponse transaction = (TransactionResponse)response;

		System.out.printf("Transaction successful: %s%n", transaction);

		if(transaction.getReturnType() != TransactionResponse.ReturnTypeEnum.REDIRECT) {
			System.err.println("Our example assumes a redirect (which might not always be the case), aborting.");
			System.exit(1);
		}

		System.out.printf("Open this link in your browser: %s%n", transaction.getRedirectUrl());

		waitForTransactionCompletion();

		final StatusApi statusApi = new StatusApi(apiClient);

		final StatusResponse status = statusApi.transactionStatusByUuid(IXOPAY_SHARED_SECRET, IXOPAY_API_KEY, transaction.getUuid());
		if(Boolean.FALSE.equals(status.getSuccess())) {
			System.err.printf("Status call was not successful: %s%n", status);
			System.exit(1);
		}

		System.out.printf("Status successful: %s%n", status);
		System.out.printf("Transaction is now in state: %s%n", status.getTransactionStatus());
	}

	private static void waitForTransactionCompletion() throws InterruptedException {
		final Console console = System.console();
		if(console != null) {
			console.readLine("Press return once you have completed the payment flow in the browser...");
		} else {
			final int SECONDS = 30;
			final String TIMER_OUT = "    continuing in %d seconds ...";
			System.out.printf(TIMER_OUT, SECONDS);
			for( int i = 0; i < SECONDS; i++ ) {
				System.out.printf("\r" + TIMER_OUT, SECONDS - i);
				Thread.sleep(1000L);
			}
			System.out.println();
		}
	}

}
