package com.ixopay.client.signing.model;

import static com.ixopay.client.signing.internal.Verify.verifyNotNull;

import java.util.Objects;

/**
 * Data from the {@link ApiUser} is used to authenticate requests to the payment gateway.
 */
public final class ApiUser {
	private final String username;
	private final String password;


	/**
	 * @param username API user username.
	 * @param password API user password.
	 */
	public ApiUser(String username, String password) {
		this.username = verifyNotNull(username, "username is null");
		this.password = verifyNotNull(password, "password is null");
	}

	/** @return API user username. */
	public String getUsername() {
		return username;
	}
	/** @return API user password. */
	public String getPassword() {
		return password;
	}

	@Override public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		ApiUser that = (ApiUser)o;
		return username.equals(that.username) && password.equals(that.password);
	}
	@Override public int hashCode() {
		return Objects.hash(username, password);
	}
}
