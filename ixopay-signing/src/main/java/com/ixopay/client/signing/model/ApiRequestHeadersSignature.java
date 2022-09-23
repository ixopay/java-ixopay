package com.ixopay.client.signing.model;

import java.util.Objects;

/** These attributes must be set on the HTTP request sent to the gateway. */
public class ApiRequestHeadersSignature {
	private final String xSignatureHeader;
	private final String dateHeader;

	/**
	 * Construct a new {@code HttpRequestSignature}.
	 *
	 * @param xSignatureHeader Value the use should set for the HTTP header {@code X-Signature} on gateway requests.
	 * @param dateHeader       Value the use should set for the HTTP header {@code Date} on gateway requests.
	 */
	public ApiRequestHeadersSignature(String xSignatureHeader, String dateHeader) {
		this.xSignatureHeader = xSignatureHeader;
		this.dateHeader = dateHeader;
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

	@Override public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ApiRequestHeadersSignature that = (ApiRequestHeadersSignature)o;
		return Objects.equals(xSignatureHeader, that.xSignatureHeader) &&
			Objects.equals(dateHeader, that.dateHeader);
	}

	@Override public int hashCode() {
		return Objects.hash(xSignatureHeader, dateHeader);
	}
}
