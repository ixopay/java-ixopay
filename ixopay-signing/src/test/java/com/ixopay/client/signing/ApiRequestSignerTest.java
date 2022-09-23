package com.ixopay.client.signing;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.junit.jupiter.api.Test;

import com.ixopay.client.signing.model.HttpRequestInfo;
import com.ixopay.client.signing.model.ApiRequestHeadersSignature;

public class ApiRequestSignerTest {

	@Test
	public void signatureShouldMatch() {
		final HttpRequestInfo requestInfo = TestData.requestInfo();

		assertEquals(TestData.EXPECTED_BODY_SHA512, requestInfo.getBodySha512());
		assertEquals(TestData.REQUEST_INFO_METHOD, requestInfo.getMethod());
		assertEquals(TestData.REQUEST_INFO_NOW, requestInfo.getNow());
		assertEquals(TestData.REQUEST_INFO_URL_PATH, requestInfo.getUrlPath());
		assertEquals(TestData.REQUEST_INFO_CONTENT_TYPE, requestInfo.getContentTypeHeader());

		final ApiRequestHeadersSignature signature = ApiRequestSigner.sign(
			TestData.API_SHARED_SECRET,
			requestInfo
		);

		assertEquals(TestData.REQUEST_INFO_NOW, signature.getDateHeader());
		assertEquals(TestData.EXPECTED_HEADER_X_SIGNATURE, signature.getXSignatureHeader());
	}

	@Test
	public void signatureChecksInput() {
		assertThrows(VerifyError.class, () -> ApiRequestSigner.sign(null, TestData.requestInfo()));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.sign(TestData.API_SHARED_SECRET, null));
		final RuntimeException invalidKey = assertThrows(RuntimeException.class, () -> ApiRequestSigner.sign("", TestData.requestInfo()));
		assertEquals("invalid HmacSHA512 key", invalidKey.getMessage(), () -> {
			final StringWriter sw = new StringWriter();
			invalidKey.printStackTrace(new PrintWriter(sw));
			return sw.toString();
		});
	}

	@Test
	public void validateTimestamp() {
		final HttpRequestInfo incomingRequestInfo = TestData.requestInfo();
		final Duration allowedTimeDelta = Duration.ofSeconds(3);
		final Instant correctNow = ZonedDateTime.parse(TestData.REQUEST_INFO_NOW, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
		final Instant lateNow = correctNow.plus(allowedTimeDelta.plusNanos(1));
		final Instant earlyNow = correctNow.minus(allowedTimeDelta.plusNanos(1));

		assertTrue(ApiRequestSigner.isTimelySignature(incomingRequestInfo, correctNow, allowedTimeDelta));
		assertFalse(ApiRequestSigner.isTimelySignature(incomingRequestInfo, lateNow, allowedTimeDelta));
		assertFalse(ApiRequestSigner.isTimelySignature(incomingRequestInfo, earlyNow, allowedTimeDelta));
	}

	@Test
	public void validateSignature() {
		final ApiRequestHeadersSignature incomingRequestCorrect = new ApiRequestHeadersSignature(TestData.EXPECTED_HEADER_X_SIGNATURE, TestData.REQUEST_INFO_NOW);
		final ApiRequestHeadersSignature incomingRequestInvalid = new ApiRequestHeadersSignature(TestData.EXPECTED_HEADER_X_SIGNATURE.replace('p', 'q'), TestData.REQUEST_INFO_NOW);
		final HttpRequestInfo incomingRequestInfo = TestData.requestInfo();
		final Duration allowedTimeDelta = Duration.ofSeconds(3);
		final Instant correctNow = ZonedDateTime.parse(TestData.REQUEST_INFO_NOW, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
		final Instant lateNow = correctNow.plus(allowedTimeDelta.plusNanos(1));
		final Instant earlyNow = correctNow.minus(allowedTimeDelta.plusNanos(1));

		assertTrue(ApiRequestSigner.isValidSignature(incomingRequestCorrect, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertFalse(ApiRequestSigner.isValidSignature(incomingRequestCorrect, incomingRequestInfo, lateNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertFalse(ApiRequestSigner.isValidSignature(incomingRequestCorrect, incomingRequestInfo, earlyNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertFalse(ApiRequestSigner.isValidSignature(incomingRequestCorrect, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET + "a"));
		assertFalse(ApiRequestSigner.isValidSignature(incomingRequestInvalid, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
	}

	@Test
	public void verifySignature() {
		final ApiRequestHeadersSignature incomingRequestCorrect = new ApiRequestHeadersSignature(TestData.EXPECTED_HEADER_X_SIGNATURE, TestData.REQUEST_INFO_NOW);
		final ApiRequestHeadersSignature incomingRequestInvalid = new ApiRequestHeadersSignature(TestData.EXPECTED_HEADER_X_SIGNATURE.replace('p', 'q'), TestData.REQUEST_INFO_NOW);
		final HttpRequestInfo incomingRequestInfo = TestData.requestInfo();
		final Duration allowedTimeDelta = Duration.ofSeconds(3);
		final Instant correctNow = ZonedDateTime.parse(TestData.REQUEST_INFO_NOW, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant();
		final Instant lateNow = correctNow.plus(allowedTimeDelta.plusNanos(1));
		final Instant earlyNow = correctNow.minus(allowedTimeDelta.plusNanos(1));

		assertDoesNotThrow(() -> ApiRequestSigner.verifySignature(incomingRequestCorrect, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.verifySignature(incomingRequestCorrect, incomingRequestInfo, lateNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.verifySignature(incomingRequestCorrect, incomingRequestInfo, earlyNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.verifySignature(incomingRequestCorrect, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET + "a"));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.verifySignature(incomingRequestInvalid, incomingRequestInfo, correctNow, allowedTimeDelta, TestData.API_SHARED_SECRET));
	}

	@Test
	public void requestInfoBuilderChecksInput() {
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withNow((String)null));
		assertThrows(DateTimeParseException.class, () -> ApiRequestSigner.requestInfo().withNow("Tue, 21 Jul 2020 13:15:03 UTC")); // RFC1123 doesn't use UTC but GMT
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withNow((ZonedDateTime)null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withNow((OffsetDateTime)null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withNow((Instant)null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withUrl(null));
		assertThrows(RuntimeException.class, () -> ApiRequestSigner.requestInfo().withUrl(new URL("https://gateway.ixopay.com/api/v3/transaction/my-api-key/debit?a=^1")));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withUri(null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withContentTypeHeader(null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withBody(TestData.REQUEST_INFO_BODY, null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo().withMethod(null));
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo()
			.withMethod(TestData.REQUEST_INFO_METHOD)
			.withBodySha512(null)
			.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
			.withNow(TestData.REQUEST_INFO_NOW)
			.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
			.build());
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo()
			.withBody(TestData.REQUEST_INFO_BODY)
			.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
			.withNow(TestData.REQUEST_INFO_NOW)
			.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
			.build());
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo()
			.withMethod(TestData.REQUEST_INFO_METHOD)
			.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
			.withNow(TestData.REQUEST_INFO_NOW)
			.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
			.build());
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo()
			.withMethod(TestData.REQUEST_INFO_METHOD)
			.withBody(TestData.REQUEST_INFO_BODY)
			.withNow(TestData.REQUEST_INFO_NOW)
			.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
			.build());
		assertThrows(VerifyError.class, () -> ApiRequestSigner.requestInfo()
			.withMethod(TestData.REQUEST_INFO_METHOD)
			.withBody(TestData.REQUEST_INFO_BODY)
			.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
			.withNow(TestData.REQUEST_INFO_NOW)
			.build());
	}

	@Test
	public void requestInfoUtilities() throws MalformedURLException {
		// body

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBodySha512(TestData.EXPECTED_BODY_SHA512)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.EXPECTED_BODY_SHA512, requestInfo.getBodySha512());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY.getBytes(StandardCharsets.UTF_8))
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.EXPECTED_BODY_SHA512, requestInfo.getBodySha512());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY, StandardCharsets.UTF_8)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.EXPECTED_BODY_SHA512, requestInfo.getBodySha512());
		}

		// now

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(ZonedDateTime.of(2020, 7, 21, 13, 15, 3, 0, ZoneOffset.UTC))
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.REQUEST_INFO_NOW, requestInfo.getNow());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(OffsetDateTime.of(2020, 7, 21, 13, 15, 3, 0, ZoneOffset.UTC))
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.REQUEST_INFO_NOW, requestInfo.getNow());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(Instant.ofEpochSecond(1595337303))
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build();
			assertEquals(TestData.REQUEST_INFO_NOW, requestInfo.getNow());
		}

		// url

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUri(URI.create("https://gateway.ixopay.com/api/v3/transaction/my-api-key/debit"))
				.build();
			assertEquals(TestData.REQUEST_INFO_URL_PATH, requestInfo.getUrlPath());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrl(new URL("https://gateway.ixopay.com/api/v3/transaction/my-api-key/debit"))
				.build();
			assertEquals(TestData.REQUEST_INFO_URL_PATH, requestInfo.getUrlPath());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrl(new URL("https://gateway.ixopay.com"))
				.build();
			assertEquals("/", requestInfo.getUrlPath());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrl(new URL("https://gateway.ixopay.com?a=b"))
				.build();
			assertEquals("/?a=b", requestInfo.getUrlPath());
		}

		{
			final HttpRequestInfo requestInfo = ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(null)
				.build();
			assertEquals("/", requestInfo.getUrlPath());
		}
	}

	@SuppressWarnings({"SimplifiableAssertion", "ConstantConditions", "EqualsWithItself"})
	@Test
	public void requestInfoEquality() {
		final HttpRequestInfo a = TestData.requestInfo();
		final HttpRequestInfo a2 = TestData.requestInfo();

		assertFalse(a.equals(null));

		assertTrue(a.equals(a));
		assertEquals(a.hashCode(), a2.hashCode());
		assertTrue(a.equals(a2));
		assertTrue(a2.equals(a));

		assertFalse(a.equals(
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD + "a")
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		));
		assertNotEquals(
			a,
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD + "a")
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		);

		assertFalse(a.equals(
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY + "a")
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		));
		assertNotEquals(
			a,
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY + "a")
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		);

		assertFalse(a.equals(
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE + "a")
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		));
		assertNotEquals(
			a,
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE + "a")
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		);

		assertFalse(a.equals(
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow("Tue, 21 Jul 2020 13:15:04 GMT")
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		));
		assertNotEquals(
			a,
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow("Tue, 21 Jul 2020 13:15:04 GMT")
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH)
				.build()
		);

		assertFalse(a.equals(
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH + "a")
				.build()
		));
		assertNotEquals(
			a,
			ApiRequestSigner.requestInfo()
				.withMethod(TestData.REQUEST_INFO_METHOD)
				.withBody(TestData.REQUEST_INFO_BODY)
				.withContentTypeHeader(TestData.REQUEST_INFO_CONTENT_TYPE)
				.withNow(TestData.REQUEST_INFO_NOW)
				.withUrlPath(TestData.REQUEST_INFO_URL_PATH + "a")
				.build()
		);
	}

	@SuppressWarnings({"SimplifiableAssertion", "ConstantConditions", "EqualsWithItself"})
	@Test
	public void signatureEquality() {
		ApiRequestHeadersSignature a = new ApiRequestHeadersSignature("a", "a");
		ApiRequestHeadersSignature b = new ApiRequestHeadersSignature("b", "a");
		ApiRequestHeadersSignature c = new ApiRequestHeadersSignature("a", "c");
		ApiRequestHeadersSignature d = new ApiRequestHeadersSignature("d", "d");

		assertFalse(a.equals(null));
		assertTrue(a.equals(a));

		assertFalse(a.equals(b));
		assertFalse(b.equals(a));
		assertNotEquals(a.hashCode(), b.hashCode());

		assertFalse(a.equals(c));
		assertFalse(c.equals(a));
		assertNotEquals(a.hashCode(), c.hashCode());

		assertFalse(a.equals(d));
		assertFalse(d.equals(a));
		assertNotEquals(a.hashCode(), d.hashCode());
	}

}
