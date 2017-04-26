package com.ixopay.client.signing;

final class Hex {
	private Hex() {}

	private static final char[] HEX_CODE = "0123456789abcdef".toCharArray();

	/** Convert {@code byte[]} to lower-case hex representation. */
	static String hex(byte[] data) {
		StringBuilder r = new StringBuilder(data.length * 2);
		for( byte b : data ) {
			r.append(HEX_CODE[(b >> 4) & 0xF]);
			r.append(HEX_CODE[(b & 0xF)]);
		}
		return r.toString();
	}

}
