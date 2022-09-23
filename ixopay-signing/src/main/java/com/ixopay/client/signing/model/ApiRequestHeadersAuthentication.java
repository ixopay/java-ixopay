package com.ixopay.client.signing.model;

import java.util.Objects;

/** These attributes must be set on the HTTP request sent to the gateway. */
public final class ApiRequestHeadersAuthentication {
	private final String authorizationHeader;

	/**
	 * Construct a new {@code HttpRequestAuthentication}.
	 *
	 * @param authorizationHeader Value the use should set for the HTTP header {@code Authorization} on gateway requests.
	 */
	public ApiRequestHeadersAuthentication(String authorizationHeader) {
		this.authorizationHeader = authorizationHeader;
	}

	/**
	 * This must be set as the HTTP {@code Authorization} header.
	 *
	 * @return The value to be set on the HTTP header.
	 */
	public String getAuthorizationHeader() {
		return authorizationHeader;
	}

	@Override public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ApiRequestHeadersAuthentication that = (ApiRequestHeadersAuthentication)o;
		return authorizationHeader.equals(that.authorizationHeader);
	}

	@Override public int hashCode() {
		return Objects.hash(authorizationHeader);
	}
}
