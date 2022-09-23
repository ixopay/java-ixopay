# StatusApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionStatusByMerchantTransactionId**](StatusApi.md#transactionStatusByMerchantTransactionId) | **GET** /status/{apiKey}/getByMerchantTransactionId/{merchantTransactionId} | Retrieve status of a transaction |
| [**transactionStatusByMerchantTransactionIdWithHttpInfo**](StatusApi.md#transactionStatusByMerchantTransactionIdWithHttpInfo) | **GET** /status/{apiKey}/getByMerchantTransactionId/{merchantTransactionId} | Retrieve status of a transaction |
| [**transactionStatusByUuid**](StatusApi.md#transactionStatusByUuid) | **GET** /status/{apiKey}/getByUuid/{uuid} | Retrieve status of a transaction |
| [**transactionStatusByUuidWithHttpInfo**](StatusApi.md#transactionStatusByUuidWithHttpInfo) | **GET** /status/{apiKey}/getByUuid/{uuid} | Retrieve status of a transaction |



## transactionStatusByMerchantTransactionId

> StatusResponse transactionStatusByMerchantTransactionId(apiKey, merchantTransactionId)

Retrieve status of a transaction

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String merchantTransactionId = "merchantTransactionId_example"; // String | ID of merchant transaction
        try {
            StatusResponse result = apiInstance.transactionStatusByMerchantTransactionId(apiKey, merchantTransactionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#transactionStatusByMerchantTransactionId");
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
| **merchantTransactionId** | **String**| ID of merchant transaction | |

### Return type

[**StatusResponse**](StatusResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status response |  -  |

## transactionStatusByMerchantTransactionIdWithHttpInfo

> ApiResponse<StatusResponse> transactionStatusByMerchantTransactionId transactionStatusByMerchantTransactionIdWithHttpInfo(apiKey, merchantTransactionId)

Retrieve status of a transaction

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String merchantTransactionId = "merchantTransactionId_example"; // String | ID of merchant transaction
        try {
            ApiResponse<StatusResponse> response = apiInstance.transactionStatusByMerchantTransactionIdWithHttpInfo(apiKey, merchantTransactionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#transactionStatusByMerchantTransactionId");
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
| **merchantTransactionId** | **String**| ID of merchant transaction | |

### Return type

ApiResponse<[**StatusResponse**](StatusResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status response |  -  |


## transactionStatusByUuid

> StatusResponse transactionStatusByUuid(apiKey, uuid)

Retrieve status of a transaction

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String uuid = "uuid_example"; // String | UUID of transaction
        try {
            StatusResponse result = apiInstance.transactionStatusByUuid(apiKey, uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#transactionStatusByUuid");
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
| **uuid** | **String**| UUID of transaction | |

### Return type

[**StatusResponse**](StatusResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status response |  -  |

## transactionStatusByUuidWithHttpInfo

> ApiResponse<StatusResponse> transactionStatusByUuid transactionStatusByUuidWithHttpInfo(apiKey, uuid)

Retrieve status of a transaction

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String uuid = "uuid_example"; // String | UUID of transaction
        try {
            ApiResponse<StatusResponse> response = apiInstance.transactionStatusByUuidWithHttpInfo(apiKey, uuid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#transactionStatusByUuid");
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
| **uuid** | **String**| UUID of transaction | |

### Return type

ApiResponse<[**StatusResponse**](StatusResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status response |  -  |
