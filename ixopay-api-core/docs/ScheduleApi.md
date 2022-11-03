# ScheduleApi

All URIs are relative to *https://gateway.ixopay.com/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSchedule**](ScheduleApi.md#cancelSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/cancel | Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**cancelScheduleWithHttpInfo**](ScheduleApi.md#cancelScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/cancel | Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**continueSchedule**](ScheduleApi.md#continueSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/continue | Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**continueScheduleWithHttpInfo**](ScheduleApi.md#continueScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/continue | Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**getSchedule**](ScheduleApi.md#getSchedule) | **GET** /schedule/{apiKey}/{scheduleId}/get | Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**getScheduleWithHttpInfo**](ScheduleApi.md#getScheduleWithHttpInfo) | **GET** /schedule/{apiKey}/{scheduleId}/get | Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**pauseSchedule**](ScheduleApi.md#pauseSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/pause | Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**pauseScheduleWithHttpInfo**](ScheduleApi.md#pauseScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/pause | Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register |
| [**startSchedule**](ScheduleApi.md#startSchedule) | **POST** /schedule/{apiKey}/start | Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register |
| [**startScheduleWithHttpInfo**](ScheduleApi.md#startScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/start | Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register |
| [**updateSchedule**](ScheduleApi.md#updateSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/update | Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register |
| [**updateScheduleWithHttpInfo**](ScheduleApi.md#updateScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/update | Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register |



## cancelSchedule

> MaybeScheduleResponse cancelSchedule(apiKey, scheduleId, cancelSchedule)

Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        CancelSchedule cancelSchedule = new HashMap(); // CancelSchedule | Cancel a schedule
        try {
            MaybeScheduleResponse result = apiInstance.cancelSchedule(apiKey, scheduleId, cancelSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#cancelSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **cancelSchedule** | [**CancelSchedule**](CancelSchedule.md)| Cancel a schedule | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## cancelScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> cancelSchedule cancelScheduleWithHttpInfo(apiKey, scheduleId, cancelSchedule)

Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        CancelSchedule cancelSchedule = new HashMap(); // CancelSchedule | Cancel a schedule
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.cancelScheduleWithHttpInfo(apiKey, scheduleId, cancelSchedule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#cancelSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **cancelSchedule** | [**CancelSchedule**](CancelSchedule.md)| Cancel a schedule | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |


## continueSchedule

> MaybeScheduleResponse continueSchedule(apiKey, scheduleId, continueSchedule)

Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        ContinueSchedule continueSchedule = new ContinueSchedule(); // ContinueSchedule | Continue a given schedule on given date and time
        try {
            MaybeScheduleResponse result = apiInstance.continueSchedule(apiKey, scheduleId, continueSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#continueSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **continueSchedule** | [**ContinueSchedule**](ContinueSchedule.md)| Continue a given schedule on given date and time | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## continueScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> continueSchedule continueScheduleWithHttpInfo(apiKey, scheduleId, continueSchedule)

Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        ContinueSchedule continueSchedule = new ContinueSchedule(); // ContinueSchedule | Continue a given schedule on given date and time
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.continueScheduleWithHttpInfo(apiKey, scheduleId, continueSchedule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#continueSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **continueSchedule** | [**ContinueSchedule**](ContinueSchedule.md)| Continue a given schedule on given date and time | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |


## getSchedule

> MaybeScheduleResponse getSchedule(apiKey, scheduleId)

Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        try {
            MaybeScheduleResponse result = apiInstance.getSchedule(apiKey, scheduleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#getSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## getScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> getSchedule getScheduleWithHttpInfo(apiKey, scheduleId)

Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.getScheduleWithHttpInfo(apiKey, scheduleId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#getSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |


## pauseSchedule

> MaybeScheduleResponse pauseSchedule(apiKey, scheduleId, pauseSchedule)

Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        PauseSchedule pauseSchedule = new HashMap(); // PauseSchedule | Pause a schedule
        try {
            MaybeScheduleResponse result = apiInstance.pauseSchedule(apiKey, scheduleId, pauseSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#pauseSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **pauseSchedule** | [**PauseSchedule**](PauseSchedule.md)| Pause a schedule | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## pauseScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> pauseSchedule pauseScheduleWithHttpInfo(apiKey, scheduleId, pauseSchedule)

Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        PauseSchedule pauseSchedule = new HashMap(); // PauseSchedule | Pause a schedule
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.pauseScheduleWithHttpInfo(apiKey, scheduleId, pauseSchedule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#pauseSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **pauseSchedule** | [**PauseSchedule**](PauseSchedule.md)| Pause a schedule | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |


## startSchedule

> MaybeScheduleResponse startSchedule(apiKey, startSchedule)

Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        StartSchedule startSchedule = new StartSchedule(); // StartSchedule | Start a schedule on the given registration transaction
        try {
            MaybeScheduleResponse result = apiInstance.startSchedule(apiKey, startSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#startSchedule");
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
| **startSchedule** | [**StartSchedule**](StartSchedule.md)| Start a schedule on the given registration transaction | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## startScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> startSchedule startScheduleWithHttpInfo(apiKey, startSchedule)

Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        StartSchedule startSchedule = new StartSchedule(); // StartSchedule | Start a schedule on the given registration transaction
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.startScheduleWithHttpInfo(apiKey, startSchedule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#startSchedule");
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
| **startSchedule** | [**StartSchedule**](StartSchedule.md)| Start a schedule on the given registration transaction | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |


## updateSchedule

> MaybeScheduleResponse updateSchedule(apiKey, scheduleId, updateSchedule)

Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        UpdateSchedule updateSchedule = new UpdateSchedule(); // UpdateSchedule | Update a schedule with given parameters
        try {
            MaybeScheduleResponse result = apiInstance.updateSchedule(apiKey, scheduleId, updateSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#updateSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **updateSchedule** | [**UpdateSchedule**](UpdateSchedule.md)| Update a schedule with given parameters | |

### Return type

[**MaybeScheduleResponse**](MaybeScheduleResponse.md)


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

## updateScheduleWithHttpInfo

> ApiResponse<MaybeScheduleResponse> updateSchedule updateScheduleWithHttpInfo(apiKey, scheduleId, updateSchedule)

Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register

### Example

```java
// Import classes:
import com.ixopay.core.client.ApiClient;
import com.ixopay.core.client.ApiException;
import com.ixopay.core.client.ApiResponse;
import com.ixopay.core.client.Configuration;
import com.ixopay.core.client.auth.*;
import com.ixopay.core.client.models.*;
import com.ixopay.core.api.ScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ixopay.com/api/v3");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");


        ScheduleApi apiInstance = new ScheduleApi(defaultClient);
        String apiKey = "apiKey_example"; // String | API Key of Connector
        String scheduleId = "scheduleId_example"; // String | ID of the schedule
        UpdateSchedule updateSchedule = new UpdateSchedule(); // UpdateSchedule | Update a schedule with given parameters
        try {
            ApiResponse<MaybeScheduleResponse> response = apiInstance.updateScheduleWithHttpInfo(apiKey, scheduleId, updateSchedule);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApi#updateSchedule");
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
| **scheduleId** | **String**| ID of the schedule | |
| **updateSchedule** | [**UpdateSchedule**](UpdateSchedule.md)| Update a schedule with given parameters | |

### Return type

ApiResponse<[**MaybeScheduleResponse**](MaybeScheduleResponse.md)>


### Authorization

[basicAuth](../README.md#basicAuth), [signature](../README.md#signature)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Schedule response |  -  |

