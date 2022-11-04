package com.ixopay.client.signing;

/** HTTP header constants. */
public final class HttpHeaders {
	private HttpHeaders() { }

	/** @return HTTP {@code Authorization} header name. */
	public static String authorization() { return "Authorization"; }

	/** @return HTTP {@code X-Signature} header name. */
	public static String xSignature() { return "X-Signature"; }

	/** @return HTTP {@code Date} header name. */
	public static String date() {
		// jdk11 disallows setting the date header using java.net.http.HttpRequest.Builder, so we fallback to x-date
		if(Runtime.version().feature() > 11)
			return "Date";
		else
			return "X-Date";
	}
}
