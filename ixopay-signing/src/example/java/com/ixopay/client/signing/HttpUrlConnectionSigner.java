package com.ixopay.client.signing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.ApiRequestHeaders;
import com.ixopay.client.signing.model.HttpRequestInfo;

public class HttpUrlConnectionSigner {

	public static void main(String[] args) throws IOException {
		final ApiUser GATEWAY_CONNECTOR_API_USER = new ApiUser("YOUR_API_USER", "YOUR_API_PASSWORD");
		final String GATEWAY_CONNECTOR_API_KEY = "YOUR_API_KEY";
		final String GATEWAY_CONNECTOR_SHARED_SECRET = "YOUR_SHARED_SECRET";

		// request setup
		String contentType = "application/json; charset=utf-8";
		String body = "REQUEST_BODY";

		URL url = new URL(String.format("https://gateway.ixopay.com/api/v3/transaction/%s/debit", GATEWAY_CONNECTOR_API_KEY));
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setRequestProperty("X-Integration-Help", GATEWAY_CONNECTOR_SHARED_SECRET); // remove this when sending real requests, it is just for testing signing requests
		urlConnection.setRequestProperty("Content-Type", contentType);

		// copy information about the request we're about to make
		HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
			.withUrl(url)
			.withMethod(urlConnection.getRequestMethod())
			.withContentTypeHeader(contentType)
			.withBody(body)
			.build();

		// sign request
		ApiRequestHeaders headers = ApiRequests.authenticateAndSign(
			GATEWAY_CONNECTOR_API_USER,
			GATEWAY_CONNECTOR_SHARED_SECRET,
			requestInfo
		);
		urlConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, headers.getAuthorizationHeader());
		urlConnection.setRequestProperty(HttpHeaders.X_SIGNATURE, headers.getXSignatureHeader());
		urlConnection.setRequestProperty(HttpHeaders.DATE, headers.getDateHeader());

		// now the request is signed and we can send it
		urlConnection.connect();
		try( PrintStream out = new PrintStream(urlConnection.getOutputStream(), false, StandardCharsets.UTF_8.name()) ) {
			out.print(body);
			out.flush();
		}

		// read response
		if( (urlConnection.getResponseCode() / 100) > 2 ) {
			System.out.printf("Request failed (%s).%n", urlConnection.getResponseCode());
			return;
		}

		urlConnection.getHeaderFields().forEach((k, v) -> {
			String value = v.stream().collect(Collectors.joining(", "));

			if( k == null )
				System.out.println(value);
			else
				System.out.printf("%s: %s%n", k, value);
		});

		System.out.println();

		try( BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), StandardCharsets.UTF_8)) ) {
			for( String line = in.readLine(); line != null; line = in.readLine() ) {
				System.out.println(line);
			}
		}
	}

}
