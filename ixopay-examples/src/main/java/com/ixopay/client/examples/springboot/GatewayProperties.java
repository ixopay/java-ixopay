package com.ixopay.client.examples.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.Nullable;

@ConfigurationProperties(prefix = "com.ixopay")
public class GatewayProperties {
	@Nullable
	private String gatewayHost;
	private String apiUserUsername;
	private String apiUserPassword;
	private String apiKey;
	@Nullable private String sharedSecret;
	@Nullable private String callbackBaseUrl;

	public String gatewayHost() { return gatewayHost; }
	public void setGatewayHost(String gatewayHost) { this.gatewayHost = gatewayHost; }

	public String apiUserUsername() { return apiUserUsername; }
	public void setApiUserUsername(String apiUserUsername) { this.apiUserUsername = apiUserUsername; }

	public String apiUserPassword() { return apiUserPassword; }
	public void setApiUserPassword(String apiUserPassword) { this.apiUserPassword = apiUserPassword; }

	public String apiKey() { return apiKey; }
	public void setApiKey(String apiKey) { this.apiKey = apiKey; }

	@Nullable public String sharedSecret() { return sharedSecret; }
	public void setSharedSecret(@Nullable String sharedSecret) { this.sharedSecret = sharedSecret; }

	@Nullable public String callbackBaseUrl() { return callbackBaseUrl; }
	public void setCallbackBaseUrl(@Nullable String callbackBaseUrl) { this.callbackBaseUrl = callbackBaseUrl; }
}
