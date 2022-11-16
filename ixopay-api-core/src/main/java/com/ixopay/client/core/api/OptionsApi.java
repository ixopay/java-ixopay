/*
 * IXOPAY Payment Platform
 * IXOPAY Payment Platform
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: support@ixopay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.ixopay.client.core.api;

import com.ixopay.client.signing.HttpHeaders;
import com.ixopay.client.signing.ApiRequestAuthenticator;
import com.ixopay.client.signing.ApiRequestSigner;
import com.ixopay.client.signing.model.ApiRequestHeadersAuthentication;
import com.ixopay.client.signing.model.ApiRequestHeadersSignature;
import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.HttpRequestInfo;
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.client.ApiException;
import com.ixopay.client.core.client.ApiResponse;
import com.ixopay.client.core.client.Pair;

import com.ixopay.client.core.model.OptionsRequest;
import com.ixopay.client.core.model.OptionsResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

import javax.annotation.Nullable;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
public class OptionsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final ApiUser memberVarApiUser;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OptionsApi(ApiUser apiUser) {
    this(new ApiClient(apiUser));
  }

  public OptionsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarApiUser = apiClient.getApiUser();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Retrieve an options list based on given option name
   * 
   * @param apiKey API Key of Connector (required)
   * @param optionsName Options identifier of the appropriate adapter (required)
   * @param optionsRequest Parameters may be required dependent on the adapter (required)
   * @return OptionsResponse
   * @throws ApiException if fails to make API call
   */
  public OptionsResponse options(String apiKey, String optionsName, OptionsRequest optionsRequest) throws ApiException {
    return  options(null, apiKey, optionsName, optionsRequest);
  }

  /**
   * Retrieve an options list based on given option name
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param optionsName Options identifier of the appropriate adapter (required)
   * @param optionsRequest Parameters may be required dependent on the adapter (required)
   * @return OptionsResponse
   * @throws ApiException if fails to make API call
   */
  public OptionsResponse options(@Nullable String sharedSecret, String apiKey, String optionsName, OptionsRequest optionsRequest) throws ApiException {
    ApiResponse<OptionsResponse> localVarResponse = optionsWithHttpInfo(sharedSecret, apiKey, optionsName, optionsRequest);
    return localVarResponse.getData();
  }

  /**
   * Retrieve an options list based on given option name
   * 
   * @param apiKey API Key of Connector (required)
   * @param optionsName Options identifier of the appropriate adapter (required)
   * @param optionsRequest Parameters may be required dependent on the adapter (required)
   * @return ApiResponse&lt;OptionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OptionsResponse> optionsWithHttpInfo(String apiKey, String optionsName, OptionsRequest optionsRequest) throws ApiException {
    return optionsWithHttpInfo(null, apiKey, optionsName, optionsRequest);
  }

  /**
   * Retrieve an options list based on given option name
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param optionsName Options identifier of the appropriate adapter (required)
   * @param optionsRequest Parameters may be required dependent on the adapter (required)
   * @return ApiResponse&lt;OptionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<OptionsResponse> optionsWithHttpInfo(@Nullable String sharedSecret, String apiKey, String optionsName, OptionsRequest optionsRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = optionsRequestBuilder(sharedSecret, apiKey, optionsName, optionsRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        return new ApiResponse<OptionsResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<OptionsResponse>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder optionsRequestBuilder(@Nullable String sharedSecret, String apiKey, String optionsName, OptionsRequest optionsRequest) throws ApiException {
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling options");
    }
    // verify the required parameter 'optionsName' is set
    if (optionsName == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsName' when calling options");
    }
    // verify the required parameter 'optionsRequest' is set
    if (optionsRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'optionsRequest' when calling options");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/options/{apiKey}/{optionsName}"
        .replace("{apiKey}", ApiClient.urlEncode(apiKey.toString()))
        .replace("{optionsName}", ApiClient.urlEncode(optionsName.toString()));

    ApiRequestHeadersAuthentication authentication = ApiRequestAuthenticator.authenticate(memberVarApiUser);
    localVarRequestBuilder.header(HttpHeaders.authorization(), authentication.getAuthorizationHeader());

    URI localVarUri = URI.create(memberVarBaseUri + localVarPath);
    localVarRequestBuilder.uri(localVarUri);

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");
    localVarRequestBuilder.header("User-Agent", "ixopay-java-sdk 3.0.0");

    byte[] localVarSignatureBody;
    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(optionsRequest);
      localVarSignatureBody = localVarPostBody;
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }

    HttpRequestInfo localVarRequestInfo = ApiRequestSigner.requestInfo()
      .withUri(localVarUri)
      .withMethod("POST")
      .withContentTypeHeader("application/json")
      .withBody(localVarSignatureBody)
      .build();
    localVarRequestBuilder.header(HttpHeaders.date(), localVarRequestInfo.getNow());
    if(sharedSecret != null && localVarSignatureBody != null) {
      ApiRequestHeadersSignature signature = ApiRequestSigner.sign(sharedSecret, localVarRequestInfo);

      localVarRequestBuilder.header(HttpHeaders.xSignature(), signature.getXSignatureHeader());
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
