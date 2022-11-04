# OptionsApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**options**](OptionsApi.md#options) | **POST** /options/{apiKey}/{optionsName} | Retrieve an options list based on given option name |
| [**optionsWithHttpInfo**](OptionsApi.md#optionsWithHttpInfo) | **POST** /options/{apiKey}/{optionsName} | Retrieve an options list based on given option name |



## options

> OptionsResponse options(apiKey, optionsName, optionsRequest)

Retrieve an options list based on given option name

### Example

```java
// Import classes:
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.client.ApiException;
import com.ixopay.client.core.client.Configuration;
import com.ixopay.client.core.client.models.*;
import com.ixopay.client.core.api.OptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");

        OptionsApi apiInstance = new OptionsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String optionsName = "optionsName_example"; // String | Options identifier of the appropriate adapter
        OptionsRequest optionsRequest = new OptionsRequest(); // OptionsRequest | Parameters may be required dependent on the adapter
        try {
            OptionsResponse result = apiInstance.options(apiKey, optionsName, optionsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionsApi#options");
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
| **optionsName** | **String**| Options identifier of the appropriate adapter | |
| **optionsRequest** | [**OptionsRequest**](OptionsRequest.md)| Parameters may be required dependent on the adapter | |

### Return type

[**OptionsResponse**](OptionsResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options response |  -  |

## optionsWithHttpInfo

> ApiResponse<OptionsResponse> options optionsWithHttpInfo(apiKey, optionsName, optionsRequest)

Retrieve an options list based on given option name

### Example

```java
// Import classes:
import com.ixopay.client.core.client.ApiClient;
import com.ixopay.client.core.client.ApiException;
import com.ixopay.client.core.client.ApiResponse;
import com.ixopay.client.core.client.Configuration;
import com.ixopay.client.core.client.models.*;
import com.ixopay.client.core.api.OptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");

        OptionsApi apiInstance = new OptionsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String optionsName = "optionsName_example"; // String | Options identifier of the appropriate adapter
        OptionsRequest optionsRequest = new OptionsRequest(); // OptionsRequest | Parameters may be required dependent on the adapter
        try {
            ApiResponse<OptionsResponse> response = apiInstance.optionsWithHttpInfo(apiKey, optionsName, optionsRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionsApi#options");
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
| **optionsName** | **String**| Options identifier of the appropriate adapter | |
| **optionsRequest** | [**OptionsRequest**](OptionsRequest.md)| Parameters may be required dependent on the adapter | |

### Return type

ApiResponse<[**OptionsResponse**](OptionsResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options response |  -  |

