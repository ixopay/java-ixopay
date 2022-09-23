package com.ixopay.client.signing;

import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.HttpRequestInfo;

public final class TestData {
	private TestData() {}

	public static final String API_USER_USERNAME = "anyApiUser";
	public static final String API_USER_PASSWORD = "myPassword";
	public static final ApiUser API_USER = new ApiUser(API_USER_USERNAME, API_USER_PASSWORD);
	public static final String API_SHARED_SECRET = "my-shared-secret";

	public static final String REQUEST_INFO_METHOD = "POST";
	public static final String REQUEST_INFO_BODY = "{\"merchantTransactionId\":\"2019-09-02-0004\",\"amount\":\"9.99\",\"currency\":\"EUR\"}";
	public static final String REQUEST_INFO_NOW = "Tue, 21 Jul 2020 13:15:03 GMT";
	public static final String REQUEST_INFO_CONTENT_TYPE = "application/json; charset=utf-8";
	public static final String REQUEST_INFO_URL_PATH = "/api/v3/transaction/my-api-key/debit";

	public static final String EXPECTED_BODY_SHA512 = "efe0b7cd39d6904dc90924b1a89629b14f11082ed2178cff562364ca0172318e1535bb8766fbe66e8cc44d311eba806349bfe185607eca12d9d0f377a03ee617";
	public static final String EXPECTED_HEADER_AUTHORIZATION = "Basic YW55QXBpVXNlcjpteVBhc3N3b3Jk";
	public static final String EXPECTED_HEADER_X_SIGNATURE = "pJUnPq6NQFmpPEG0VmnwspAVeTA7uC+pFP0nYYwua3Diw7GuW+brdk4UR6ma70EstDs8mrxWfqh1KU0xfNC69g==";

	public static HttpRequestInfo requestInfo() {
		return ApiRequestSigner.requestInfo()
			.withMethod(REQUEST_INFO_METHOD)
			.withBody(REQUEST_INFO_BODY)
			.withContentTypeHeader(REQUEST_INFO_CONTENT_TYPE)
			.withNow(REQUEST_INFO_NOW)
			.withUrlPath(REQUEST_INFO_URL_PATH)
			.build();
	}
}
