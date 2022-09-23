package com.ixopay.client.signing.model;

import static com.ixopay.client.signing.internal.Verify.verify;
import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.regex.Pattern;

import com.ixopay.client.signing.ApiRequestSigner;

/** Contains information about the request you intend to make to the gateway. */
public class HttpRequestInfo {
	private final String now;
	private final String urlPath;
	private final String method;
	private final String contentTypeHeader;
	private final String bodySha512;

	public HttpRequestInfo(String now, String urlPath, String method, String contentTypeHeader, String requestBodySha512) {
		this.now = now;
		this.urlPath = urlPath;
		this.method = method;
		this.contentTypeHeader = contentTypeHeader;
		this.bodySha512 = requestBodySha512;
	}

	// impl

	/**
	 * @return Helper for constructing new {@link HttpRequestInfo}.
	 */
	public static Builder builder() {
		return new Builder();
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
	public String getBodySha512() { return bodySha512; }

	@Override public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		HttpRequestInfo that = (HttpRequestInfo)o;
		return Objects.equals(now, that.now) &&
			Objects.equals(urlPath, that.urlPath) &&
			Objects.equals(method, that.method) &&
			Objects.equals(contentTypeHeader, that.contentTypeHeader) &&
			Objects.equals(bodySha512, that.bodySha512);
	}

	@Override public int hashCode() {
		return Objects.hash(now, urlPath, method, contentTypeHeader, bodySha512);
	}

	// struct

	/** Helper to correctly construct {@code HttpRequestInfo} objects. */
	public static class Builder {
		private static final Pattern SHA512_PATTERN = Pattern.compile("[\\da-f]{128}", Pattern.CASE_INSENSITIVE);

		private String now = ApiRequestSigner.DATE_TIME_FORMATTER.format(ZonedDateTime.now(ZoneOffset.UTC));
		private String urlPath;
		private String method;
		private String contentTypeHeader;
		private String bodySha512;

		private Builder() { }

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 * @throws java.time.format.DateTimeParseException if {@code now} is not a valid RFC1123 date
		 */
		public Builder withNow(String now) {
			verifyNotNull(now, "now is null");
			verify(ApiRequestSigner.DATE_TIME_FORMATTER.format(ZonedDateTime.parse(now, ApiRequestSigner.DATE_TIME_FORMATTER)).equals(now), "now couldn't be parsed transitively");

			this.now = now;
			return this;
		}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public Builder withNow(ZonedDateTime now) {
			verifyNotNull(now, "now cannot be null");

			this.now = ApiRequestSigner.DATE_TIME_FORMATTER.format(now);
			return this;
		}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public Builder withNow(OffsetDateTime now) {
			verifyNotNull(now, "now is null");
			return withNow(now.toZonedDateTime());
		}

		/**
		 * Set the time the request is sent.
		 *
		 * @param now The time the request was sent.
		 * @return {@code this} to chain calls.
		 */
		public Builder withNow(Instant now) {
			verifyNotNull(now, "now is null");
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
		public Builder withUrlPath(String urlPath) {
			if(urlPath == null)
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
		public Builder withUri(URI uri) {
			verifyNotNull(uri, "uri is null");
			StringBuilder urlPath = new StringBuilder();
			if(uri.getRawPath() == null || uri.getRawPath().isEmpty())
				urlPath.append('/');
			else
				urlPath.append(uri.getRawPath());
			if(uri.getRawQuery() != null)
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
		public Builder withUrl(URL url) {
			verifyNotNull(url, "url is null");
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
		public Builder withMethod(String requestMethod) {
			verifyNotNull(requestMethod, "requestMethod is null");

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
		public Builder withContentTypeHeader(String contentTypeHeader) {
			verifyNotNull(contentTypeHeader, "contentTypeHeader cannot be null");

			this.contentTypeHeader = contentTypeHeader;
			return this;
		}

		/**
		 * Lower-case SHA-512 hash of the request body content.
		 *
		 * @param requestBodySha512 Lower-case SHA-512 hash of the request body content.
		 * @return {@code this} to chain calls.
		 */
		public Builder withBodySha512(String requestBodySha512) {
			if(requestBodySha512 == null)
				this.bodySha512 = null;
			else {
				verify(SHA512_PATTERN.matcher(requestBodySha512).matches(), "requestBodySha512 must be a valid SHA-512 hash");
				this.bodySha512 = requestBodySha512;
			}
			return this;
		}

		/**
		 * Set the SHA-512 hash of the request body content.
		 * <p>
		 * Delegates correct information to {@link #withBodySha512(String)}
		 *
		 * @param body Body of the HTTP request.
		 * @return {@code this} to chain calls.
		 * @throws RuntimeException when the SHA-512 digest could not be instantiated.
		 */
		public Builder withBody(byte[] body) {
			return withBodySha512(ApiRequestSigner.sha512RequestBody(body));
		}

		/**
		 * Set the SHA-512 hash of the request body content, assumes UTF-8 encoding.
		 * <p>
		 * Delegates correct information to {@link #withBodySha512(String)}
		 *
		 * @param body Body of the HTTP request, assumes UTF-8 encoding.
		 * @return {@code this} to chain calls.
		 * @throws RuntimeException when the SHA-512 digest could not be instantiated.
		 */
		public Builder withBody(String body) {
			return withBody(body, StandardCharsets.UTF_8);
		}

		/**
		 * Set the SHA-512 hash of the request body content.
		 * <p>
		 * Delegates correct information to {@link #withBodySha512(String)}
		 *
		 * @param body    Body of the HTTP request.
		 * @param charset Charset of the HTTP request body.
		 * @return {@code this} to chain calls.
		 * @throws RuntimeException when the SHA-512 digest could not be instantiated.
		 */
		public Builder withBody(String body, Charset charset) {
			verify(body == null || charset != null, "charset is null");
			return withBody(body != null ? body.getBytes(charset) : null);
		}

		/**
		 * Build the {@link HttpRequestInfo} for signature generation.
		 *
		 * @return The {@link HttpRequestInfo} for signature generation.
		 */
		public HttpRequestInfo build() {
			return new HttpRequestInfo(
				verifyNotNull(now, "now cannot be null"),
				verifyNotNull(urlPath, "urlPath cannot be null, set it with 'withUrlPath(String)', 'withUri(URI)' or 'withUrl(URL)' before calling 'build()'"),
				verifyNotNull(method, "requestMethod cannot be null, set it with 'withMethod' before calling 'build()'"),
				verifyNotNull(contentTypeHeader, "requestHeaderContentType cannot be null, set it with 'withContentTypeHeader(String)' before calling 'build()'"),
				verifyNotNull(bodySha512, "requestBodySha512 cannot be null, set it with 'withBodySha512(String)', 'withBody(byte[])', 'withBody(String)' or 'withBody(String,Charset)' before calling 'build()'")
			);
		}
	}

}
