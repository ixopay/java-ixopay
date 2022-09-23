package com.ixopay.client.signing;

import static com.ixopay.client.signing.internal.Verify.verify;
import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import com.ixopay.client.signing.internal.Hex;
import com.ixopay.client.signing.model.HttpRequestInfo;
import com.ixopay.client.signing.model.ApiRequestHeadersSignature;

/** Sign requests for the payment gateway. */
public final class ApiRequestSigner {
	private ApiRequestSigner() { }

	// defs

	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.RFC_1123_DATE_TIME;

	// impl

	/**
	 * Sign a HTTP request with the provided {@code apiKey} and {@code sharedSecret}.
	 *
	 * @param sharedSecret Shared secret configured in gateway.
	 * @param requestInfo  Information about the request that will be sent to the gateway.
	 * @return Signature that must be set on the request before sending it to the gateway.
	 */
	public static ApiRequestHeadersSignature sign(
		String sharedSecret,
		HttpRequestInfo requestInfo
	) {
		verifyNotNull(sharedSecret, "sharedSecret must be provided");
		verifyNotNull(requestInfo, "requestInfo must be provided");

		Mac mac = hmacSha512(sharedSecret);

		// method
		hash(mac, requestInfo.getMethod());
		hashln(mac);

		// to_lower(hex(sha512(body)))
		hash(mac, requestInfo.getBodySha512());
		hashln(mac);

		// content-type
		hash(mac, requestInfo.getContentTypeHeader());
		hashln(mac);

		// timestamp
		hash(mac, requestInfo.getNow());
		hashln(mac);

		// request uri
		hash(mac, requestInfo.getUrlPath());

		byte[] hmac = mac.doFinal();
		String signature = new String(Base64.getEncoder().encode(hmac), StandardCharsets.UTF_8);

		return new ApiRequestHeadersSignature(signature, requestInfo.getNow());
	}

	/**
	 * Validates if an incoming request was made within an allowed timeframe and with the correct signature.
	 *
	 * @param incomingSignature   Signature headers of the incoming payment gateway request (callback).
	 * @param incomingRequestInfo Incoming payment gateway request (callback).
	 * @param now                 Timestamp the request was received.
	 * @param allowedTimeDelta    Allowed age of the request (to avoid replay attacks).
	 * @param sharedSecret        Expected shared secret
	 * @throws VerifyError If the the request was not made within {@code allowedTimeDelta} or the signature didn't match.
	 */
	public static void verifySignature(
		ApiRequestHeadersSignature incomingSignature,
		HttpRequestInfo incomingRequestInfo,
		Instant now,
		Duration allowedTimeDelta,
		String sharedSecret
	) {
		verify(isValidSignature(incomingSignature, incomingRequestInfo, now, allowedTimeDelta, sharedSecret), "invalid signature");
	}

	/**
	 * Checks if an incoming request was made within an allowed timeframe and with the correct signature.
	 *
	 * @param incomingSignature   Signature headers of the incoming payment gateway request (callback).
	 * @param incomingRequestInfo Incoming payment gateway request (callback).
	 * @param now                 Timestamp the request was received.
	 * @param allowedTimeDelta    Allowed age of the request (to avoid replay attacks).
	 * @param sharedSecret        Expected shared secret
	 * @return {@code true} if the request was made within {@code allowedTimeDelta} and the signature matched.
	 */
	public static boolean isValidSignature(
		ApiRequestHeadersSignature incomingSignature,
		HttpRequestInfo incomingRequestInfo,
		Instant now,
		Duration allowedTimeDelta,
		String sharedSecret
	) {
		verifyNotNull(incomingSignature, "signature is null");
		verifyNotNull(incomingRequestInfo, "requestInfo is null");
		verifyNotNull(now, "now is null");
		verifyNotNull(allowedTimeDelta, "allowedTimeDelta is null");
		verifyNotNull(sharedSecret, "sharedSecret is null");

		final Instant requestNow = ZonedDateTime.parse(incomingRequestInfo.getNow(), DATE_TIME_FORMATTER).toInstant();
		if(!isTimelySignature(incomingRequestInfo, now, allowedTimeDelta))
			return false;

		final ApiRequestHeadersSignature calculatedSignature = sign(sharedSecret, incomingRequestInfo);
		return calculatedSignature.getXSignatureHeader().equals(incomingSignature.getXSignatureHeader()) &&
			calculatedSignature.getDateHeader().equals(incomingSignature.getDateHeader());
	}

	/**
	 * Checks if an incoming request was made within an allowed timeframe.
	 *
	 * @param incomingRequestInfo Incoming payment gateway request (callback).
	 * @param now                 Timestamp the request was received.
	 * @param allowedTimeDelta    Allowed age of the request (to avoid replay attacks).
	 * @return {@code true} if the request was made within {@code allowedTimeDelta}.
	 */
	public static boolean isTimelySignature(
		HttpRequestInfo incomingRequestInfo,
		Instant now,
		Duration allowedTimeDelta
	) {
		verifyNotNull(incomingRequestInfo, "requestInfo is null");
		verifyNotNull(now, "now is null");
		verifyNotNull(allowedTimeDelta, "allowedTimeDelta is null");

		final Instant requestNow = ZonedDateTime.parse(incomingRequestInfo.getNow(), DATE_TIME_FORMATTER).toInstant();
		final Duration timeDiff = Duration.between(requestNow, now).abs();
		return timeDiff.compareTo(allowedTimeDelta) <= 0;
	}

	/**
	 * Create request info for signing.
	 *
	 * @return Request info builder.
	 */
	public static HttpRequestInfo.Builder requestInfo() {
		return HttpRequestInfo.builder();
	}

	/**
	 * Utility for md5 hashing a request body.
	 *
	 * @param body The requests body as byte array.
	 * @return Signature string.
	 */
	public static String sha512RequestBody(byte[] body) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
		} catch( NoSuchAlgorithmException e ) {
			// should never happen since MessageDigest doc says MD5 must be on every JVM
			throw new RuntimeException("couldn't get SHA-512 digest", e);
		}
		byte[] digest = md.digest(body != null ? body : new byte[0]);
		return Hex.hex(digest);
	}

	// pimpl

	/**
	 * Create HMAC SHA512 mac hasher.
	 *
	 * @param sharedSecret Shared secret used for signature generation.
	 * @return MAC object to calculate the signature.
	 */
	private static Mac hmacSha512(String sharedSecret) {
		final String HMAC_SHA512_ALGORITHM = "HmacSHA512";

		Mac mac;
		try {
			mac = Mac.getInstance(HMAC_SHA512_ALGORITHM);
		} catch( NoSuchAlgorithmException e ) {
			throw new RuntimeException("could not get HmacSHA512 mac algorithm", e);
		}

		try {
			SecretKeySpec key = new SecretKeySpec(sharedSecret.getBytes(StandardCharsets.UTF_8), HMAC_SHA512_ALGORITHM);
			mac.init(key);
		} catch( InvalidKeyException | IllegalArgumentException e ) {
			throw new RuntimeException("invalid HmacSHA512 key", e);
		}

		return mac;
	}

	/**
	 * Append a string to the HMAC.
	 *
	 * @param mac MAC object used for signature calculation.
	 * @param s   String to append to the MAC.
	 */
	private static void hash(Mac mac, String s) {
		byte[] s_ = s.getBytes(StandardCharsets.UTF_8);
		mac.update(s_, 0, s_.length);
	}

	/**
	 * Append a newline to the HMAC.
	 *
	 * @param mac MAC objecte used for signature calculation.
	 */
	private static void hashln(Mac mac) {
		mac.update("\n".getBytes(StandardCharsets.UTF_8), 0, 1);
	}

}
