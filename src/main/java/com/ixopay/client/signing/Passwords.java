package com.ixopay.client.signing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/** Password utilities. */
public final class Passwords {
	private Passwords() {}

	private static final int ROUNDS = 10;

	/**
	 *  Hash password for use with the gateway.
	 *
	 * @param rawPassword Raw, unhashed password.
	 * @return Hashed password.
	 */
	public static String hash( String rawPassword ) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-1");
		} catch( NoSuchAlgorithmException e ) {
			// should never happen since MessageDigest doc says SHA-1 must be on every JVM
			throw new RuntimeException("couldn't get SHA-1 digest", e);
		}
		byte[] digest = rawPassword.getBytes(StandardCharsets.UTF_8);
		for( int i = 0; i < ROUNDS; i++ ) {
			md.reset();
			// php sha1 function returns string and then hashes the resulting hex string
			digest = Hex.hex(md.digest(digest)).getBytes(StandardCharsets.UTF_8);
		}
		return new String(digest, StandardCharsets.UTF_8);
	}

}
