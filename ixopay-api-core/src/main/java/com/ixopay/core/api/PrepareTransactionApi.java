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

package com.ixopay.core.api;

import com.ixopay.client.signing.HttpHeaders;
import com.ixopay.client.signing.ApiRequestAuthenticator;
import com.ixopay.client.signing.ApiRequestSigner;
import com.ixopay.client.signing.model.ApiRequestHeadersAuthentication;
import com.ixopay.client.signing.model.ApiRequestHeadersSignature;
import com.ixopay.client.signing.model.ApiUser;
import com.ixopay.client.signing.model.HttpRequestInfo;
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Pair;

import com.ixopay.core.model.PrepareDebitRequest;
import com.ixopay.core.model.PrepareDebitResponse;
import com.ixopay.core.model.PreparePreauthorizeRequest;
import com.ixopay.core.model.PreparePreauthorizeResponse;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PrepareTransactionApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final ApiUser memberVarApiUser;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public PrepareTransactionApi(ApiUser apiUser) {
    this(new ApiClient(apiUser));
  }

  public PrepareTransactionApi(ApiClient apiClient) {
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
   * Process a prepare Debit
   * 
   * @param apiKey API Key of Connector (required)
   * @param prepareDebitRequest Data which is required to process a Debit (optional)
   * @return PrepareDebitResponse
   * @throws ApiException if fails to make API call
   */
  public PrepareDebitResponse processPrepareDebit(String apiKey, PrepareDebitRequest prepareDebitRequest) throws ApiException {
    return  processPrepareDebit(null, apiKey, prepareDebitRequest);
  }

  /**
   * Process a prepare Debit
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param prepareDebitRequest Data which is required to process a Debit (optional)
   * @return PrepareDebitResponse
   * @throws ApiException if fails to make API call
   */
  public PrepareDebitResponse processPrepareDebit(@Nullable String sharedSecret, String apiKey, PrepareDebitRequest prepareDebitRequest) throws ApiException {
    ApiResponse<PrepareDebitResponse> localVarResponse = processPrepareDebitWithHttpInfo(sharedSecret, apiKey, prepareDebitRequest);
    return localVarResponse.getData();
  }

  /**
   * Process a prepare Debit
   * 
   * @param apiKey API Key of Connector (required)
   * @param prepareDebitRequest Data which is required to process a Debit (optional)
   * @return ApiResponse&lt;PrepareDebitResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrepareDebitResponse> processPrepareDebitWithHttpInfo(String apiKey, PrepareDebitRequest prepareDebitRequest) throws ApiException {
    return processPrepareDebitWithHttpInfo(null, apiKey, prepareDebitRequest);
  }

  /**
   * Process a prepare Debit
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param prepareDebitRequest Data which is required to process a Debit (optional)
   * @return ApiResponse&lt;PrepareDebitResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PrepareDebitResponse> processPrepareDebitWithHttpInfo(@Nullable String sharedSecret, String apiKey, PrepareDebitRequest prepareDebitRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = processPrepareDebitRequestBuilder(sharedSecret, apiKey, prepareDebitRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        return new ApiResponse<PrepareDebitResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PrepareDebitResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder processPrepareDebitRequestBuilder(@Nullable String sharedSecret, String apiKey, PrepareDebitRequest prepareDebitRequest) throws ApiException {
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling processPrepareDebit");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/transaction/{apiKey}/prepare-debit"
        .replace("{apiKey}", ApiClient.urlEncode(apiKey.toString()));

    ApiRequestHeadersAuthentication authentication = ApiRequestAuthenticator.authenticate(memberVarApiUser);
    localVarRequestBuilder.header(HttpHeaders.AUTHORIZATION, authentication.getAuthorizationHeader());

    URI localVarUri = URI.create(memberVarBaseUri + localVarPath);
    localVarRequestBuilder.uri(localVarUri);

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    byte[] localVarSignatureBody;
    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(prepareDebitRequest);
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
    localVarRequestBuilder.header(HttpHeaders.DATE, localVarRequestInfo.getNow());
    if(sharedSecret != null && localVarSignatureBody != null) {
      ApiRequestHeadersSignature signature = ApiRequestSigner.sign(sharedSecret, localVarRequestInfo);

      localVarRequestBuilder.header(HttpHeaders.X_SIGNATURE, signature.getXSignatureHeader());
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Process a prepare Preauthorize
   * 
   * @param apiKey API Key of Connector (required)
   * @param preparePreauthorizeRequest Data which is required to process a Preauthorize (optional)
   * @return PreparePreauthorizeResponse
   * @throws ApiException if fails to make API call
   */
  public PreparePreauthorizeResponse processPreparePreauthorize(String apiKey, PreparePreauthorizeRequest preparePreauthorizeRequest) throws ApiException {
    return  processPreparePreauthorize(null, apiKey, preparePreauthorizeRequest);
  }

  /**
   * Process a prepare Preauthorize
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param preparePreauthorizeRequest Data which is required to process a Preauthorize (optional)
   * @return PreparePreauthorizeResponse
   * @throws ApiException if fails to make API call
   */
  public PreparePreauthorizeResponse processPreparePreauthorize(@Nullable String sharedSecret, String apiKey, PreparePreauthorizeRequest preparePreauthorizeRequest) throws ApiException {
    ApiResponse<PreparePreauthorizeResponse> localVarResponse = processPreparePreauthorizeWithHttpInfo(sharedSecret, apiKey, preparePreauthorizeRequest);
    return localVarResponse.getData();
  }

  /**
   * Process a prepare Preauthorize
   * 
   * @param apiKey API Key of Connector (required)
   * @param preparePreauthorizeRequest Data which is required to process a Preauthorize (optional)
   * @return ApiResponse&lt;PreparePreauthorizeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PreparePreauthorizeResponse> processPreparePreauthorizeWithHttpInfo(String apiKey, PreparePreauthorizeRequest preparePreauthorizeRequest) throws ApiException {
    return processPreparePreauthorizeWithHttpInfo(null, apiKey, preparePreauthorizeRequest);
  }

  /**
   * Process a prepare Preauthorize
   * 
   * @param sharedSecret optional shared secret for signing requests (can be {@code null}).
   * @param apiKey API Key of Connector (required)
   * @param preparePreauthorizeRequest Data which is required to process a Preauthorize (optional)
   * @return ApiResponse&lt;PreparePreauthorizeResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<PreparePreauthorizeResponse> processPreparePreauthorizeWithHttpInfo(@Nullable String sharedSecret, String apiKey, PreparePreauthorizeRequest preparePreauthorizeRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = processPreparePreauthorizeRequestBuilder(sharedSecret, apiKey, preparePreauthorizeRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        return new ApiResponse<PreparePreauthorizeResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<PreparePreauthorizeResponse>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder processPreparePreauthorizeRequestBuilder(@Nullable String sharedSecret, String apiKey, PreparePreauthorizeRequest preparePreauthorizeRequest) throws ApiException {
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling processPreparePreauthorize");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/transaction/{apiKey}/prepare-preauthorize"
        .replace("{apiKey}", ApiClient.urlEncode(apiKey.toString()));

    ApiRequestHeadersAuthentication authentication = ApiRequestAuthenticator.authenticate(memberVarApiUser);
    localVarRequestBuilder.header(HttpHeaders.AUTHORIZATION, authentication.getAuthorizationHeader());

    URI localVarUri = URI.create(memberVarBaseUri + localVarPath);
    localVarRequestBuilder.uri(localVarUri);

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    byte[] localVarSignatureBody;
    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(preparePreauthorizeRequest);
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
    localVarRequestBuilder.header(HttpHeaders.DATE, localVarRequestInfo.getNow());
    if(sharedSecret != null && localVarSignatureBody != null) {
      ApiRequestHeadersSignature signature = ApiRequestSigner.sign(sharedSecret, localVarRequestInfo);

      localVarRequestBuilder.header(HttpHeaders.X_SIGNATURE, signature.getXSignatureHeader());
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}