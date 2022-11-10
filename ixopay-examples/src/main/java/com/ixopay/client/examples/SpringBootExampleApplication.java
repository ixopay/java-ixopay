package com.ixopay.client.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ixopay.client.core.api.StatusApi;
import com.ixopay.client.core.api.TransactionApi;
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.examples.springboot.GatewayProperties;
import com.ixopay.client.signing.model.ApiUser;

@SpringBootApplication
@EnableConfigurationProperties(GatewayProperties.class)
public class SpringBootExampleApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}

	private final GatewayProperties gatewayProperties;

	@ConstructorBinding
	public SpringBootExampleApplication(GatewayProperties gatewayProperties) {
		this.gatewayProperties = gatewayProperties;
	}

	@Bean
	public ApiUser apiUser(ApplicationContext context) {
		return new ApiUser(gatewayProperties.apiUserUsername(), gatewayProperties.apiUserPassword());
	}

	@Bean
	public ApiClient apiClient(ApiUser apiUser) {
		final ApiClient apiClient = new ApiClient(apiUser);
		if(gatewayProperties.gatewayHost() != null && !gatewayProperties.gatewayHost().isBlank())
			apiClient.updateBaseUri(String.format("https://%s/api/v3", gatewayProperties.gatewayHost()));
		return apiClient;
	}

	@Bean
	public TransactionApi transactionApi(ApiClient apiClient) {
		return new TransactionApi(apiClient);
	}

	@Bean
	public static StatusApi statusApi(ApiClient apiClient) {
		return new StatusApi(apiClient);
	}

}
