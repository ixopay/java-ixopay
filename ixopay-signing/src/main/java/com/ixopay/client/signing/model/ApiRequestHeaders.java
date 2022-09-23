package com.ixopay.client.signing.model;

import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

import java.util.Objects;

/** These attributes must be set on the HTTP request sent to the gateway. */
public final class ApiRequestHeaders {
	private final String authorizationHeader;
	private final String xSignatureHeader;
	private final String dateHeader;

	/**
	 * Construct a new {@code HttpRequestHeaders}.
	 *
	 * @param authorizationHeader Value the use should set for the HTTP header {@code Authorization} on gateway requests.
	 * @param xSignatureHeader    Value the use should set for the HTTP header {@code X-Signature} on gateway requests.
	 * @param dateHeader          Value the use should set for the HTTP header {@code Date} on gateway requests.
	 */
	public ApiRequestHeaders(String authorizationHeader, String xSignatureHeader, String dateHeader) {
		this.authorizationHeader = authorizationHeader;
		this.xSignatureHeader = xSignatureHeader;
		this.dateHeader = dateHeader;
	}

	public ApiRequestHeaders(ApiRequestHeadersAuthentication authentication, ApiRequestHeadersSignature signature) {
		this(verifyNotNull(authentication, "authentication is null").getAuthorizationHeader(), verifyNotNull(signature, "signature is null").getXSignatureHeader(), signature.getDateHeader());
	}

	/**
	 * This must be set as the HTTP {@code Authorization} header.
	 *
	 * @return The value to be set on the HTTP header.
	 */
	public String getAuthorizationHeader() {
		return authorizationHeader;
	}

	/**
	 * This must be set as HTTP {@code X-Signature} header.
	 *
	 * @return The value to be set on the HTTP header.
	 */
	public String getXSignatureHeader() { return xSignatureHeader; }

	/**
	 * This must be set as HTTP {@code Date} header.
	 *
	 * @return The value to be set on the HTTP header.
	 */
	public String getDateHeader() { return dateHeader; }

	/**
	 * @return converted to {@link ApiRequestHeadersAuthentication}
	 */
	public ApiRequestHeadersAuthentication httpRequestHeadersAuthentication() {
		return new ApiRequestHeadersAuthentication(authorizationHeader);
	}

	/**
	 * @return converted to {@link ApiRequestHeadersSignature}
	 */
	public ApiRequestHeadersSignature httpRequestHeadersSignature() {
		return new ApiRequestHeadersSignature(xSignatureHeader, dateHeader);
	}

	@Override public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ApiRequestHeaders that = (ApiRequestHeaders)o;
		return Objects.equals(authorizationHeader, that.authorizationHeader) &&
			Objects.equals(xSignatureHeader, that.xSignatureHeader) &&
			Objects.equals(dateHeader, that.dateHeader);
	}

	@Override public int hashCode() {
		return Objects.hash(authorizationHeader, xSignatureHeader, dateHeader);
	}
}
