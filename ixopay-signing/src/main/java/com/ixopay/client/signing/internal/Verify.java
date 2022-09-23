package com.ixopay.client.signing.internal;

public final class Verify {
	private Verify() {}

	public static <T> T verifyNotNull( T v, String message, Object... args ) {
		if( v == null )
			throw new VerifyError(String.format(message, args));
		return v;
	}

	public static void verify( boolean c, String message, Object... args ) {
		if( !c )
			throw new VerifyError(String.format(message, args));
	}
}
