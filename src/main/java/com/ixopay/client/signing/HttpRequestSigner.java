package com.ixopay.client.signing;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/** Sign requests for the payment gateway. */
public final class HttpRequestSigner {
	private HttpRequestSigner() {}

	// defs

	private static final String HTTP_AUTHENTICATION_SCHEME = "Gateway";
	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.RFC_1123_DATE_TIME;

	// impl

	/**
	 * Sign a HTTP request with the provided {@code apiKey} and {@code sharedSecret}.
	 *
	 * @param apiKey       API key configured in gateway.
	 * @param sharedSecret Shared secret configured in gateway.
	 * @param requestInfo  Information about the request that will be sent to the gateway.
	 * @return Signature that must be set on the request before sending it to the gateway.
	 */
	public static HttpRequestSignature sign(
		String apiKey,
		String sharedSecret,
		HttpRequestInfo requestInfo
	) {
		verifyNotNull(apiKey, "apiKey must be provided");
		verifyNotNull(sharedSecret, "sharedSecret must be provided");
		verifyNotNull(requestInfo, "requestInfo must be provided");

		Mac mac = hmacSha512(sharedSecret);

		// method
		hash(mac, requestInfo.method);
		hashln(mac);

		// to_lower(hex(md5(body)))
		hash(mac, requestInfo.bodyMd5);
		hashln(mac);

		// content-type
		hash(mac, requestInfo.contentTypeHeader.toLowerCase(Locale.ENGLISH));
		hashln(mac);

		// timestamp
		hash(mac, requestInfo.now);
		hashln(mac);

		// custom headers (none)
		hashln(mac);

		// request uri
		hash(mac, requestInfo.urlPath);

		byte[] hmac = mac.doFinal();
		String authorization = new String(Base64.getEncoder().encode(hmac), StandardCharsets.UTF_8);

		return new HttpRequestSignature(String.format("%s %s:%s", HTTP_AUTHENTICATION_SCHEME, apiKey, authorization), requestInfo.now);
	}

	/**
	 * Create request info for signing.
	 *
	 * @return Request info builder.
	 */
	public static HttpRequestInfoBuilder requestInfo() {
		return new HttpRequestInfoBuilder();
	}

	/**
	 * Utility for md5 hashing a request body.
	 *
	 * @param body The requests body as byte array.
	 * @return Signature string.
	 */
	public static String md5DigestRequestBody( byte[] body ) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch( NoSuchAlgorithmException e ) {
			// should never happen since MessageDigest doc says MD5 must be on every JVM
			throw new RuntimeException("couldn't get MD5 digest", e);
		}
		byte[] digest = md.digest(body != null ? body : new byte[0]);
		return Hex.hex(digest);
	}

	/**
	 * Utility for getting the required parts of an URL of a request.
	 *
	 * @param url URL to extract the path from.
	 * @return Path part of the URL.
	 */
	public static String urlPath( URL url ) {
		try {
			return urlPath(url.toURI());
		} catch( URISyntaxException e ) {
			throw new RuntimeException("cannot convert URL to URI", e);
		}
	}

	/**
	 * Utility for getting the required parts of an URI of a request.
	 *
	 * @param uri URI to extract the path part from.
	 * @return Path part of the URI.
	 */
	public static String urlPath( URI uri ) {
		if( uri == null )
			return "/";
		String rawPath = uri.getRawPath();
		if( rawPath == null )
			return "/";
		return rawPath;
	}

	// pimpl

	/**
	 * Create HMAC SHA512 mac hasher.
	 *
	 * @param sharedSecret Shared secret used for signature generation.
	 * @return MAC object to calculate the signature.
	 */
	private static Mac hmacSha512( String sharedSecret ) {
		final String HMAC_SHA512_ALGORITHM = "HmacSHA512";

		Mac mac;
		try {
			mac = Mac.getInstance(HMAC_SHA512_ALGORITHM);
		} catch( NoSuchAlgorithmException e ) {
			throw new RuntimeException("could not get HmacSHA512 mac algorithm", e);
		}

		SecretKeySpec key = new SecretKeySpec(sharedSecret.getBytes(StandardCharsets.UTF_8), HMAC_SHA512_ALGORITHM);
		try {
			mac.init(key);
		} catch( InvalidKeyException e ) {
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
	private static void hash( Mac mac, String s ) {
		byte[] s_ = s.getBytes(StandardCharsets.UTF_8);
		mac.update(s_, 0, s_.length);
	}

	/**
	 * Append a newline to the HMAC.
	 *
	 * @param mac MAC objecte used for signature calculation.
	 */
	private static void hashln( Mac mac ) {
		mac.update("\n".getBytes(StandardCharsets.UTF_8), 0, 1);
	}

	private static <T> T verifyNotNull( T v, String message, Object... args ) {
		if( v == null )
			throw new VerifyError(String.format(message, args));
		return v;
	}

	private static void verify( boolean c, String message, Object... args ) {
		if( !c )
			throw new VerifyError(String.format(message, args));
	}

	// struct

	/** Contains information about the request you intend to make to the gateway. */
	public static class HttpRequestInfo {
		private final String now;
		private final String urlPath;
		private final String method;
		private final String contentTypeHeader;
		private final String bodyMd5;

		private HttpRequestInfo( String now, String urlPath, String method, String contentTypeHeader, String requestBodyMd5 ) {
			this.now = now;
			this.urlPath = urlPath;
			this.method = method;
			this.contentTypeHeader = contentTypeHeader;
			this.bodyMd5 = requestBodyMd5;
		}

		/** @return Now timestamp of the request. */
		public String getNow() { return now; }
		/** @return Path part of the URL in the request. */
		public String getUrlPath() { return urlPath; }
		/** @return HTTP method of the request. */
		public String getMethod() { return method; }
		/** @return HTTP header {@code Content-Type} of the request. */
		public String getContentTypeHeader() { return contentTypeHeader; }
		/** @return MD5 hash of the request body. */
		public String getBodyMd5() { return bodyMd5; }

		@Override public boolean equals( Object o ) {
			if( this == o ) return true;
			if( o == null || getClass() != o.getClass() ) return false;
			HttpRequestInfo that = (HttpRequestInfo)o;
			return Objects.equals(now, that.now) &&
				Objects.equals(urlPath, that.urlPath) &&
				Objects.equals(method, that.method) &&
				Objects.equals(contentTypeHeader, that.contentTypeHeader) &&
				Objects.equals(bodyMd5, that.bodyMd5);
		}

		@Override public int hashCode() {
			return Objects.hash(now, urlPath, method, contentTypeHeader, bodyMd5);
		}
	}

	/** These attributes must be set on the HTTP request sent to the gateway. */
	public static class HttpRequestSignature {
		private final String authHeader;
		private final String dateHeader;

		/**
		 * Construct a new {@code HttpRequestSignature}.
		 *
		 * @param authHeader Value the use should set for the HTTP header {@code Authentication} on gateway requests.
		 * @param dateHeader Value the use should set for the HTTP header {@code Date} on gateway requests.
		 */
		public HttpRequestSignature( String authHeader, String dateHeader ) {
			this.authHeader = authHeader;
			this.dateHeader = dateHeader;
		}

		/**
		 * This must be set as HTTP {@code Authorization} header.
		 *
		 * @return The value to be set on the HTTP header.
		 */
		public String getAuthHeader() { return authHeader; }
		/**
		 * This must be set as HTTP {@code Date} header.
		 *
		 * @return The value to be set on the HTTP header.
		 */
		public String getDateHeader() { return dateHeader; }

		@Override public boolean equals( Object o ) {
			if( this == o ) return true;
			if( o == null || getClass() != o.getClass() ) return false;
			HttpRequestSignature that = (HttpRequestSignature)o;
			return Objects.equals(authHeader, that.authHeader) &&
				Objects.equals(dateHeader, that.dateHeader);
		}

		@Override public int hashCode() {
			return Objects.hash(authHeader, dateHeader);
		}
	}

	/** Helper to correctly construct {@code HttpRequestInfo} objects. */
	public static class HttpRequestInfoBuilder {
		private static final Pattern MD5_PATTERN = Pattern.compile("[\\da-f]{32}", Pattern.CASE_INSENSITIVE);

		private String now = DATE_TIME_FORMATTER.format(ZonedDateTime.now(ZoneOffset.UTC));
		private String urlPath;
		private String method;
		private String contentTypeHeader;
		private String bodyMd5;

		private HttpRequestInfoBuilder() {}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withNow( ZonedDateTime now ) {
			verifyNotNull(now, "now cannot be null");

			this.now = DATE_TIME_FORMATTER.format(now);
			return this;
		}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withNow( OffsetDateTime now ) {
			return withNow(now.toZonedDateTime());
		}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withNow( Instant now ) {
			return withNow(now.atZone(ZoneOffset.UTC));
		}

		/**
		 * Path and query part of the URL.
		 * <p>
		 * i.e. if {@code http://host/path?query} then {@code /path?query}, if {@code http://host} or {@code null} then {@code /}
		 *
		 * @param urlPath Path and query part of the URL.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withUrlPath( String urlPath ) {
			if( urlPath == null )
				this.urlPath = "/";
			else
				this.urlPath = urlPath;
			return this;
		}

		/**
		 * Set the urlPath part.
		 * <p>
		 * Delegates correct information to {@link #withUrlPath(String)}
		 *
		 * @param uri URI to extract path and query part from.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withUri( URI uri ) {
			StringBuilder urlPath = new StringBuilder();
			if( uri.getRawPath() == null )
				urlPath.append('/');
			else
				urlPath.append(uri.getRawPath());
			if( uri.getRawQuery() != null )
				urlPath.append("?").append(uri.getRawQuery());
			return withUrlPath(urlPath.toString());
		}

		/**
		 * Set the urlPath part.
		 * <p>
		 * Delegates correct information to {@link #withUrlPath(String)}
		 *
		 * @param url URL to extract path and query part from.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withUrl( URL url ) {
			try {
				return withUri(url.toURI());
			} catch( URISyntaxException e ) {
				throw new RuntimeException("cannot convert URL to URI", e);
			}
		}

		/**
		 * Set the method of the request.
		 * <p>
		 * e.g. POST, GET, etc.
		 *
		 * @param requestMethod HTTP request method.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withMethod( String requestMethod ) {
			this.method = requestMethod;
			return this;
		}

		/**
		 * HTTP {@code Content-Type} header that will be sent.
		 * <p>
		 * e.g. {@code text/xml; charset=utf-8}
		 *
		 * @param contentTypeHeader HTTP {@code Content-Type} header.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withContentTypeHeader( String contentTypeHeader ) {
			verifyNotNull(contentTypeHeader, "contentTypeHeader cannot be null");

			this.contentTypeHeader = contentTypeHeader;
			return this;
		}

		/**
		 * Lower-case MD5 hash of the request body content.
		 *
		 * @param requestBodyMd5 Lower-case MD5 hash of the request body content.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withBodyMd5( String requestBodyMd5 ) {
			if( requestBodyMd5 == null )
				this.bodyMd5 = null;
			else {
				verify(MD5_PATTERN.matcher(requestBodyMd5).matches(), "requestBodyMd5 must be a valid MD5 hash");
				this.bodyMd5 = requestBodyMd5;
			}
			return this;
		}

		/**
		 * Set the MD5 hash of the request body content.
		 * <p>
		 * Delegates correct information to {@link #withBodyMd5(String)}
		 *
		 * @param body Body of the HTTP request.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withBody( byte[] body ) {
			return withBodyMd5(md5DigestRequestBody(body));
		}

		/**
		 * Set the MD5 hash of the request body content, assumes UTF-8 encoding.
		 * <p>
		 * Delegates correct information to {@link #withBodyMd5(String)}
		 *
		 * @param body Body of the HTTP request, assumes UTF-8 encoding.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withBody( String body ) {
			return withBody(body, StandardCharsets.UTF_8);
		}

		/**
		 * Set the MD5 hash of the request body content.
		 * <p>
		 * Delegates correct information to {@link #withBodyMd5(String)}
		 *
		 * @param body Body of the HTTP request.
		 * @param charset Charset of the HTTP request body.
		 * @return {@code this} to chain calls.
		 */
		public HttpRequestInfoBuilder withBody( String body, Charset charset ) {
			return withBody(body != null ? body.getBytes(charset) : null);
		}

		/**
		 * Build the {@link HttpRequestInfo} for signature generation.
		 *
		 * @return The {@link HttpRequestInfo} for signature generation.
		 */
		public HttpRequestInfo build() {
			return new HttpRequestInfo(
				verifyNotNull(
					now,
					"now cannot be null"
				),
				verifyNotNull(
					urlPath,
					"urlPath cannot be null, set it with 'withUrlPath(String)', 'withUri(URI)' or 'withUrl(URL)' before calling 'build()'"
				),
				verifyNotNull(
					method,
					"requestMethod cannot be null, set it with 'withMethod' before calling 'build()'"
				),
				verifyNotNull(
					contentTypeHeader,
					"requestHeaderContentType cannot be null, set it with 'withContentTypeHeader(String)' before calling 'build()'"
				),
				verifyNotNull(
					bodyMd5,
					"requestBodyMd5 cannot be null, set it with 'withBodyMd5(String)', 'withBody(byte[])', 'withBody(String)' or 'withBody(String,Charset)' before calling 'build()'"
				)
			);
		}
	}

}
