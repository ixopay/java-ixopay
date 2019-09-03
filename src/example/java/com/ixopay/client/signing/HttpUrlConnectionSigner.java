package com.ixopay.client.signing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import com.ixopay.client.signing.HttpHeaders;
import com.ixopay.client.signing.HttpRequestSigner;

public class HttpUrlConnectionSigner {

	public static void main(String[] args) throws IOException {
		final String GATEWAY_CONNECTOR_API_KEY = "YOUR_API_KEY";
		final String GATEWAY_CONNECTOR_SHARED_SECRET = "YOUR_SHARED_SECRET";

		// request setup
		String contentType = "text/xml; charset=utf-8";
		String body = "REQUEST_BODY";

		URL url = new URL("https://gateway.ixopay.com/transaction");
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setRequestProperty("X-Integration-Help", GATEWAY_CONNECTOR_SHARED_SECRET); // remove this when sending real requests, it is just for testing signing requests
		urlConnection.setRequestProperty("Content-Type", contentType);

		// copy information about the request we're about to make
		HttpRequestSigner.HttpRequestInfo requestInfo = HttpRequestSigner.requestInfo()
			.withUrl(url)
			.withMethod(urlConnection.getRequestMethod())
			.withContentTypeHeader(contentType)
			.withBody(body)
			.build();

		// sign request
		HttpRequestSigner.HttpRequestSignature signature = HttpRequestSigner.sign(GATEWAY_CONNECTOR_API_KEY, GATEWAY_CONNECTOR_SHARED_SECRET, requestInfo);
		urlConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, signature.getAuthHeader());
		urlConnection.setRequestProperty(HttpHeaders.DATE, signature.getDateHeader());

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
