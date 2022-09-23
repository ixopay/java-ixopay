# TransactionApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**processCapture**](TransactionApi.md#processCapture) | **POST** /transaction/{apiKey}/capture | Process a capture: completes a payment previously authorized through Preauthorize |
| [**processCaptureWithHttpInfo**](TransactionApi.md#processCaptureWithHttpInfo) | **POST** /transaction/{apiKey}/capture | Process a capture: completes a payment previously authorized through Preauthorize |
| [**processDebit**](TransactionApi.md#processDebit) | **POST** /transaction/{apiKey}/debit | Process a debit |
| [**processDebitWithHttpInfo**](TransactionApi.md#processDebitWithHttpInfo) | **POST** /transaction/{apiKey}/debit | Process a debit |
| [**processDeregister**](TransactionApi.md#processDeregister) | **POST** /transaction/{apiKey}/deregister | Process a deregister: deletes a previously registered payment instrument |
| [**processDeregisterWithHttpInfo**](TransactionApi.md#processDeregisterWithHttpInfo) | **POST** /transaction/{apiKey}/deregister | Process a deregister: deletes a previously registered payment instrument |
| [**processIncrementalAuthorization**](TransactionApi.md#processIncrementalAuthorization) | **POST** /transaction/{apiKey}/incrementalAuthorization | Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before) |
| [**processIncrementalAuthorizationWithHttpInfo**](TransactionApi.md#processIncrementalAuthorizationWithHttpInfo) | **POST** /transaction/{apiKey}/incrementalAuthorization | Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before) |
| [**processPayout**](TransactionApi.md#processPayout) | **POST** /transaction/{apiKey}/payout | Process a payout |
| [**processPayoutWithHttpInfo**](TransactionApi.md#processPayoutWithHttpInfo) | **POST** /transaction/{apiKey}/payout | Process a payout |
| [**processPreauthorize**](TransactionApi.md#processPreauthorize) | **POST** /transaction/{apiKey}/preauthorize | Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument |
| [**processPreauthorizeWithHttpInfo**](TransactionApi.md#processPreauthorizeWithHttpInfo) | **POST** /transaction/{apiKey}/preauthorize | Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument |
| [**processRefund**](TransactionApi.md#processRefund) | **POST** /transaction/{apiKey}/refund | Process a refund |
| [**processRefundWithHttpInfo**](TransactionApi.md#processRefundWithHttpInfo) | **POST** /transaction/{apiKey}/refund | Process a refund |
| [**processRegister**](TransactionApi.md#processRegister) | **POST** /transaction/{apiKey}/register | Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize) |
| [**processRegisterWithHttpInfo**](TransactionApi.md#processRegisterWithHttpInfo) | **POST** /transaction/{apiKey}/register | Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize) |
| [**processVoid**](TransactionApi.md#processVoid) | **POST** /transaction/{apiKey}/void | Process a void: cancels a previously authorized Preauthorize |
| [**processVoidWithHttpInfo**](TransactionApi.md#processVoidWithHttpInfo) | **POST** /transaction/{apiKey}/void | Process a void: cancels a previously authorized Preauthorize |



## processCapture

> MaybeTransactionResponse processCapture(apiKey, capture)

Process a capture: completes a payment previously authorized through Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Capture capture = new Capture(); // Capture | Data which is required to process a capture
        try {
            MaybeTransactionResponse result = apiInstance.processCapture(apiKey, capture);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processCapture");
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
| **capture** | [**Capture**](Capture.md)| Data which is required to process a capture | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processCaptureWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processCapture processCaptureWithHttpInfo(apiKey, capture)

Process a capture: completes a payment previously authorized through Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Capture capture = new Capture(); // Capture | Data which is required to process a capture
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processCaptureWithHttpInfo(apiKey, capture);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processCapture");
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
| **capture** | [**Capture**](Capture.md)| Data which is required to process a capture | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processDebit

> MaybeTransactionResponse processDebit(apiKey, debit)

Process a debit

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Debit debit = new Debit(); // Debit | Data which is required to process a debit
        try {
            MaybeTransactionResponse result = apiInstance.processDebit(apiKey, debit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processDebit");
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
| **debit** | [**Debit**](Debit.md)| Data which is required to process a debit | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processDebitWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processDebit processDebitWithHttpInfo(apiKey, debit)

Process a debit

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Debit debit = new Debit(); // Debit | Data which is required to process a debit
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processDebitWithHttpInfo(apiKey, debit);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processDebit");
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
| **debit** | [**Debit**](Debit.md)| Data which is required to process a debit | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processDeregister

> MaybeTransactionResponse processDeregister(apiKey, deregister)

Process a deregister: deletes a previously registered payment instrument

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Deregister deregister = new Deregister(); // Deregister | Data which is required to process a deregister
        try {
            MaybeTransactionResponse result = apiInstance.processDeregister(apiKey, deregister);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processDeregister");
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
| **deregister** | [**Deregister**](Deregister.md)| Data which is required to process a deregister | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processDeregisterWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processDeregister processDeregisterWithHttpInfo(apiKey, deregister)

Process a deregister: deletes a previously registered payment instrument

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Deregister deregister = new Deregister(); // Deregister | Data which is required to process a deregister
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processDeregisterWithHttpInfo(apiKey, deregister);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processDeregister");
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
| **deregister** | [**Deregister**](Deregister.md)| Data which is required to process a deregister | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processIncrementalAuthorization

> MaybeTransactionResponse processIncrementalAuthorization(apiKey, incrementalAuthorization)

Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before)

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        IncrementalAuthorization incrementalAuthorization = new IncrementalAuthorization(); // IncrementalAuthorization | Data which is required to process a incremental auth
        try {
            MaybeTransactionResponse result = apiInstance.processIncrementalAuthorization(apiKey, incrementalAuthorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processIncrementalAuthorization");
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
| **incrementalAuthorization** | [**IncrementalAuthorization**](IncrementalAuthorization.md)| Data which is required to process a incremental auth | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processIncrementalAuthorizationWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processIncrementalAuthorization processIncrementalAuthorizationWithHttpInfo(apiKey, incrementalAuthorization)

Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before)

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        IncrementalAuthorization incrementalAuthorization = new IncrementalAuthorization(); // IncrementalAuthorization | Data which is required to process a incremental auth
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processIncrementalAuthorizationWithHttpInfo(apiKey, incrementalAuthorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processIncrementalAuthorization");
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
| **incrementalAuthorization** | [**IncrementalAuthorization**](IncrementalAuthorization.md)| Data which is required to process a incremental auth | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processPayout

> MaybeTransactionResponse processPayout(apiKey, payout)

Process a payout

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Payout payout = new Payout(); // Payout | Data which is required to process a payout
        try {
            MaybeTransactionResponse result = apiInstance.processPayout(apiKey, payout);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processPayout");
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
| **payout** | [**Payout**](Payout.md)| Data which is required to process a payout | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processPayoutWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processPayout processPayoutWithHttpInfo(apiKey, payout)

Process a payout

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Payout payout = new Payout(); // Payout | Data which is required to process a payout
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processPayoutWithHttpInfo(apiKey, payout);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processPayout");
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
| **payout** | [**Payout**](Payout.md)| Data which is required to process a payout | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processPreauthorize

> MaybeTransactionResponse processPreauthorize(apiKey, preauthorize)

Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Preauthorize preauthorize = new Preauthorize(); // Preauthorize | Data which is required to process a preauthorize
        try {
            MaybeTransactionResponse result = apiInstance.processPreauthorize(apiKey, preauthorize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processPreauthorize");
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
| **preauthorize** | [**Preauthorize**](Preauthorize.md)| Data which is required to process a preauthorize | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processPreauthorizeWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processPreauthorize processPreauthorizeWithHttpInfo(apiKey, preauthorize)

Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Preauthorize preauthorize = new Preauthorize(); // Preauthorize | Data which is required to process a preauthorize
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processPreauthorizeWithHttpInfo(apiKey, preauthorize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processPreauthorize");
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
| **preauthorize** | [**Preauthorize**](Preauthorize.md)| Data which is required to process a preauthorize | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processRefund

> MaybeTransactionResponse processRefund(apiKey, refund)

Process a refund

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Refund refund = new Refund(); // Refund | Data which is required to process a refund
        try {
            MaybeTransactionResponse result = apiInstance.processRefund(apiKey, refund);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processRefund");
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
| **refund** | [**Refund**](Refund.md)| Data which is required to process a refund | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processRefundWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processRefund processRefundWithHttpInfo(apiKey, refund)

Process a refund

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Refund refund = new Refund(); // Refund | Data which is required to process a refund
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processRefundWithHttpInfo(apiKey, refund);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processRefund");
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
| **refund** | [**Refund**](Refund.md)| Data which is required to process a refund | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processRegister

> MaybeTransactionResponse processRegister(apiKey, register)

Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize)

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Register register = new Register(); // Register | Data which is required to process a register
        try {
            MaybeTransactionResponse result = apiInstance.processRegister(apiKey, register);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processRegister");
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
| **register** | [**Register**](Register.md)| Data which is required to process a register | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processRegisterWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processRegister processRegisterWithHttpInfo(apiKey, register)

Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize)

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        Register register = new Register(); // Register | Data which is required to process a register
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processRegisterWithHttpInfo(apiKey, register);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processRegister");
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
| **register** | [**Register**](Register.md)| Data which is required to process a register | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |


## processVoid

> MaybeTransactionResponse processVoid(apiKey, modelVoid)

Process a void: cancels a previously authorized Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        ModelVoid modelVoid = new ModelVoid(); // ModelVoid | Data which is required to process a void
        try {
            MaybeTransactionResponse result = apiInstance.processVoid(apiKey, modelVoid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processVoid");
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
| **modelVoid** | [**ModelVoid**](ModelVoid.md)| Data which is required to process a void | |

### Return type

[**MaybeTransactionResponse**](MaybeTransactionResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

## processVoidWithHttpInfo

> ApiResponse<MaybeTransactionResponse> processVoid processVoidWithHttpInfo(apiKey, modelVoid)

Process a void: cancels a previously authorized Preauthorize

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        ModelVoid modelVoid = new ModelVoid(); // ModelVoid | Data which is required to process a void
        try {
            ApiResponse<MaybeTransactionResponse> response = apiInstance.processVoidWithHttpInfo(apiKey, modelVoid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#processVoid");
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
| **modelVoid** | [**ModelVoid**](ModelVoid.md)| Data which is required to process a void | |

### Return type

ApiResponse<[**MaybeTransactionResponse**](MaybeTransactionResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transaction response |  -  |

