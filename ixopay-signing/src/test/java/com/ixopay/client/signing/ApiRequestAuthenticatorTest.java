package com.ixopay.client.signing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.ApiRequestHeadersAuthentication;

public class ApiRequestAuthenticatorTest {

	@Test
	public void authenticationShouldMatch() {
		final ApiRequestHeadersAuthentication authentication = ApiRequestAuthenticator.authenticate(TestData.API_USER);

		assertEquals(TestData.EXPECTED_HEADER_AUTHORIZATION, authentication.getAuthorizationHeader());
	}

	@Test
	public void authenticationChecksInput() {
		assertThrows(VerifyError.class, () -> ApiRequestAuthenticator.authenticate(null));
		assertThrows(VerifyError.class, () -> new ApiUser(TestData.API_USER_USERNAME, null));
		assertThrows(VerifyError.class, () -> new ApiUser(null, TestData.API_USER_PASSWORD));
	}

	@SuppressWarnings({"SimplifiableAssertion", "ConstantConditions", "EqualsWithItself"})
	@Test
	public void authenticationEquality() {
		ApiRequestHeadersAuthentication a = new ApiRequestHeadersAuthentication("a");
		ApiRequestHeadersAuthentication a2 = new ApiRequestHeadersAuthentication("a");
		ApiRequestHeadersAuthentication b = new ApiRequestHeadersAuthentication("b");

		assertFalse(a.equals(null));

		assertTrue(a.equals(a));
		assertEquals(a.hashCode(), a2.hashCode());

		assertTrue(a.equals(a2));
		assertTrue(a2.equals(a));
		assertEquals(a.hashCode(), a2.hashCode());

		assertFalse(a.equals(b));
		assertFalse(b.equals(a));
		assertNotEquals(a.hashCode(), b.hashCode());
	}

}
