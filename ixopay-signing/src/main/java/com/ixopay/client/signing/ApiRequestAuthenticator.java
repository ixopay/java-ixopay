package com.ixopay.client.signing;

import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.ApiRequestHeadersAuthentication;

/** Authenticate requests to the payment gateway */
public final class ApiRequestAuthenticator {
	private ApiRequestAuthenticator() { }

	// defs

	private static final String HTTP_AUTHENTICATION_SCHEME = "Basic";

	// impl

	public static ApiRequestHeadersAuthentication authenticate(
		ApiUser apiUser
	) {
		verifyNotNull(apiUser, "apiUser is null");

		String base = apiUser.getUsername() + ":" + apiUser.getPassword();
		String encoded = new String(Base64.getEncoder().encode(base.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);

		return new ApiRequestHeadersAuthentication(HTTP_AUTHENTICATION_SCHEME + " " + encoded);
	}

}
