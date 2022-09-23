# PrepareTransactionApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**processPrepareDebit**](PrepareTransactionApi.md#processPrepareDebit) | **POST** /transaction/{apiKey}/prepare-debit | Process a prepare Debit |
| [**processPrepareDebitWithHttpInfo**](PrepareTransactionApi.md#processPrepareDebitWithHttpInfo) | **POST** /transaction/{apiKey}/prepare-debit | Process a prepare Debit |
| [**processPreparePreauthorize**](PrepareTransactionApi.md#processPreparePreauthorize) | **POST** /transaction/{apiKey}/prepare-preauthorize | Process a prepare Preauthorize |
| [**processPreparePreauthorizeWithHttpInfo**](PrepareTransactionApi.md#processPreparePreauthorizeWithHttpInfo) | **POST** /transaction/{apiKey}/prepare-preauthorize | Process a prepare Preauthorize |



## processPrepareDebit

> PrepareDebitResponse processPrepareDebit(apiKey, prepareDebitRequest)

Process a prepare Debit

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.PrepareTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PrepareTransactionApi apiInstance = new PrepareTransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        PrepareDebitRequest prepareDebitRequest = new PrepareDebitRequest(); // PrepareDebitRequest | Data which is required to process a Debit
        try {
            PrepareDebitResponse result = apiInstance.processPrepareDebit(apiKey, prepareDebitRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrepareTransactionApi#processPrepareDebit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| API Key of Connector | |
| **prepareDebitRequest** | [**PrepareDebitRequest**](PrepareDebitRequest.md)| Data which is required to process a Debit | [optional] |

### Return type

[**PrepareDebitResponse**](PrepareDebitResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prepare Debit response |  -  |

## processPrepareDebitWithHttpInfo

> ApiResponse<PrepareDebitResponse> processPrepareDebit processPrepareDebitWithHttpInfo(apiKey, prepareDebitRequest)

Process a prepare Debit

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.PrepareTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PrepareTransactionApi apiInstance = new PrepareTransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        PrepareDebitRequest prepareDebitRequest = new PrepareDebitRequest(); // PrepareDebitRequest | Data which is required to process a Debit
        try {
            ApiResponse<PrepareDebitResponse> response = apiInstance.processPrepareDebitWithHttpInfo(apiKey, prepareDebitRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrepareTransactionApi#processPrepareDebit");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| API Key of Connector | |
| **prepareDebitRequest** | [**PrepareDebitRequest**](PrepareDebitRequest.md)| Data which is required to process a Debit | [optional] |

### Return type

ApiResponse<[**PrepareDebitResponse**](PrepareDebitResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prepare Debit response |  -  |


## processPreparePreauthorize

> PreparePreauthorizeResponse processPreparePreauthorize(apiKey, preparePreauthorizeRequest)

Process a prepare Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.PrepareTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PrepareTransactionApi apiInstance = new PrepareTransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        PreparePreauthorizeRequest preparePreauthorizeRequest = new PreparePreauthorizeRequest(); // PreparePreauthorizeRequest | Data which is required to process a Preauthorize
        try {
            PreparePreauthorizeResponse result = apiInstance.processPreparePreauthorize(apiKey, preparePreauthorizeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrepareTransactionApi#processPreparePreauthorize");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| API Key of Connector | |
| **preparePreauthorizeRequest** | [**PreparePreauthorizeRequest**](PreparePreauthorizeRequest.md)| Data which is required to process a Preauthorize | [optional] |

### Return type

[**PreparePreauthorizeResponse**](PreparePreauthorizeResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preauthorize Debit response |  -  |

## processPreparePreauthorizeWithHttpInfo

> ApiResponse<PreparePreauthorizeResponse> processPreparePreauthorize processPreparePreauthorizeWithHttpInfo(apiKey, preparePreauthorizeRequest)

Process a prepare Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.PrepareTransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        PrepareTransactionApi apiInstance = new PrepareTransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        PreparePreauthorizeRequest preparePreauthorizeRequest = new PreparePreauthorizeRequest(); // PreparePreauthorizeRequest | Data which is required to process a Preauthorize
        try {
            ApiResponse<PreparePreauthorizeResponse> response = apiInstance.processPreparePreauthorizeWithHttpInfo(apiKey, preparePreauthorizeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PrepareTransactionApi#processPreparePreauthorize");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **apiKey** | **String**| API Key of Connector | |
| **preparePreauthorizeRequest** | [**PreparePreauthorizeRequest**](PreparePreauthorizeRequest.md)| Data which is required to process a Preauthorize | [optional] |

### Return type

ApiResponse<[**PreparePreauthorizeResponse**](PreparePreauthorizeResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Preauthorize Debit response |  -  |

