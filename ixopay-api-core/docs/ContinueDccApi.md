# ContinueDccApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**processContinueDcc**](ContinueDccApi.md#processContinueDcc) | **POST** /transaction/{apiKey}/continue-dcc | Continue a DCC transaction |
| [**processContinueDccWithHttpInfo**](ContinueDccApi.md#processContinueDccWithHttpInfo) | **POST** /transaction/{apiKey}/continue-dcc | Continue a DCC transaction |



## processContinueDcc

> MaybeTransactionResponse processContinueDcc(apiKey, continueDcc)

Continue a DCC transaction

### Example

```java
// Import classes:
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.client.ApiException;
import com.ixopay.client.core.client.Configuration;
import com.ixopay.client.core.client.auth.*;
import com.ixopay.client.core.client.models.*;
import com.ixopay.client.core.api.ContinueDccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ContinueDccApi apiInstance = new ContinueDccApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        ContinueDcc continueDcc = new ContinueDcc(); // ContinueDcc | Data which is required to continue a pending DCC transaction.
        try {
            MaybeTransactionResponse result = apiInstance.processContinueDcc(apiKey, continueDcc);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContinueDccApi#processContinueDcc");
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
| **continueDcc** | [**ContinueDcc**](ContinueDcc.md)| Data which is required to continue a pending DCC transaction. | [optional] |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processContinueDccWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processContinueDcc processContinueDccWithHttpInfo(apiKey, continueDcc)

Continue a DCC transaction

### Example

```java
// Import classes:
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.client.ApiException;
import com.ixopay.client.core.client.ApiResponse;
import com.ixopay.client.core.client.Configuration;
import com.ixopay.client.core.client.auth.*;
import com.ixopay.client.core.client.models.*;
import com.ixopay.client.core.api.ContinueDccApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ContinueDccApi apiInstance = new ContinueDccApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        ContinueDcc continueDcc = new ContinueDcc(); // ContinueDcc | Data which is required to continue a pending DCC transaction.
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processContinueDccWithHttpInfo(apiKey, continueDcc);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContinueDccApi#processContinueDcc");
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
| **continueDcc** | [**ContinueDcc**](ContinueDcc.md)| Data which is required to continue a pending DCC transaction. | [optional] |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

