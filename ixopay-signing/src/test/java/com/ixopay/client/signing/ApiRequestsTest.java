package com.ixopay.client.signing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ixopay.client.signing.model.ApiRequestHeaders;
import com.ixopay.client.signing.model.HttpRequestInfo;

class ApiRequestsTest {

	@Test
	public void authenticateAndSignShouldMatch() {
		final HttpRequestInfo requestInfo = TestData.requestInfo();

		final ApiRequestHeaders headers = ApiRequests.authenticateAndSign(
			TestData.API_USER,
			TestData.API_SHARED_SECRET,
			requestInfo
		);

		assertEquals(TestData.EXPECTED_HEADER_AUTHORIZATION, headers.getAuthorizationHeader());
		assertEquals(TestData.REQUEST_INFO_NOW, headers.getDateHeader());
		assertEquals(TestData.EXPECTED_HEADER_X_SIGNATURE, headers.getXSignatureHeader());

		assertEquals(TestData.EXPECTED_HEADER_AUTHORIZATION, headers.httpRequestHeadersAuthentication().getAuthorizationHeader());

		assertEquals(TestData.REQUEST_INFO_NOW, headers.httpRequestHeadersSignature().getDateHeader());
		assertEquals(TestData.EXPECTED_HEADER_X_SIGNATURE, headers.httpRequestHeadersSignature().getXSignatureHeader());
	}

	@Test
	public void authenticateAndSignChecksInput() {
		assertThrows(VerifyError.class, () -> ApiRequests.authenticateAndSign(TestData.API_USER, TestData.API_SHARED_SECRET, null));
		assertThrows(VerifyError.class, () -> ApiRequests.authenticateAndSign(TestData.API_USER, null, TestData.requestInfo()));
		assertThrows(VerifyError.class, () -> ApiRequests.authenticateAndSign(null, TestData.API_SHARED_SECRET, TestData.requestInfo()));
	}

	@SuppressWarnings({"SimplifiableAssertion", "ConstantConditions", "EqualsWithItself"})
	@Test
	public void requestHeadersEquality() {
		ApiRequestHeaders a = new ApiRequestHeaders("a", "a", "a");
		ApiRequestHeaders a2 = new ApiRequestHeaders("a", "a", "a");
		ApiRequestHeaders b = new ApiRequestHeaders("a", "b", "a");
		ApiRequestHeaders c = new ApiRequestHeaders("a", "a", "c");
		ApiRequestHeaders d = new ApiRequestHeaders("d", "d", "a");
		ApiRequestHeaders e = new ApiRequestHeaders("a", "e", "e");
		ApiRequestHeaders f = new ApiRequestHeaders("f", "a", "f");
		ApiRequestHeaders g = new ApiRequestHeaders("g", "g", "g");

		assertFalse(a.equals(null));
		assertTrue(a.equals(a));

		assertTrue(a.equals(a2));
		assertTrue(a2.equals(a));
		assertEquals(a.hashCode(), a2.hashCode());

		assertFalse(a.equals(b));
		assertFalse(b.equals(a));
		assertNotEquals(a.hashCode(), b.hashCode());

		assertFalse(a.equals(c));
		assertFalse(c.equals(a));
		assertNotEquals(a.hashCode(), c.hashCode());

		assertFalse(a.equals(d));
		assertFalse(d.equals(a));
		assertNotEquals(a.hashCode(), d.hashCode());

		assertFalse(a.equals(e));
		assertFalse(e.equals(a));
		assertNotEquals(a.hashCode(), e.hashCode());

		assertFalse(a.equals(f));
		assertFalse(f.equals(a));
		assertNotEquals(a.hashCode(), f.hashCode());

		assertFalse(a.equals(g));
		assertFalse(g.equals(a));
		assertNotEquals(a.hashCode(), g.hashCode());
	}

}