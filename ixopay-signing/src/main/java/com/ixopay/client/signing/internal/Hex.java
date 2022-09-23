package com.ixopay.client.signing.internal;

import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

/** Hex conversion utilities. */
public final class Hex {
	private Hex() {}

	private static final char[] HEX_CODE = "0123456789abcdef".toCharArray();

	/**
	 * Convert {@code byte[]} to lower-case hex representation.
	 *
	 * @param data {@code byte[]} to convert to hex representation.
	 * @return Lower-case hex representation of {@code data}.
	 */
	public static String hex( byte[] data ) {
		verifyNotNull(data, "data is null");
		StringBuilder r = new StringBuilder(data.length * 2);
		for( byte b : data ) {
			r.append(HEX_CODE[(b >> 4) & 0xF]);
			r.append(HEX_CODE[(b & 0xF)]);
		}
		return r.toString();
	}

}
