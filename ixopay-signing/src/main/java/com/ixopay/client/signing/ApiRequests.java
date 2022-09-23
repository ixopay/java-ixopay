package com.ixopay.client.signing;

import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.ApiRequestHeadersAuthentication;
import com.ixopay.client.signing.model.ApiRequestHeaders;
import com.ixopay.client.signing.model.HttpRequestInfo;
import com.ixopay.client.signing.model.ApiRequestHeadersSignature;

public final class ApiRequests {
	private ApiRequests() { }

	public static ApiRequestHeaders authenticateAndSign(
		ApiUser apiUser,
		String sharedSecret,
		HttpRequestInfo requestInfo
	) {
		ApiRequestHeadersAuthentication authentication = ApiRequestAuthenticator.authenticate(apiUser);
		ApiRequestHeadersSignature signature = ApiRequestSigner.sign(sharedSecret, requestInfo);

		return new ApiRequestHeaders(
			authentication.getAuthorizationHeader(),
			signature.getXSignatureHeader(),
			signature.getDateHeader()
		);
	}

}
