# ixopay-api-core

IXOPAY Payment Platform

- API version: 3.0.0

IXOPAY Payment Platform


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ixopay.java-ixopay</groupId>
  <artifactId>ixopay-api-core</artifactId>
  <version>3.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ixopay.java-ixopay:ixopay-api-core:3.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/ixopay-api-core-3.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.ixopay.core.client.*;
import com.ixopay.core.model.*;
import com.ixopay.core.api.OptionsApi;

public class OptionsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
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

## Documentation for API Endpoints

All URIs are relative to *https://gateway.ixopay.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OptionsApi* | [**options**](docs/OptionsApi.md#options) | **POST** /options/{apiKey}/{optionsName} | Retrieve an options list based on given option name
*OptionsApi* | [**optionsWithHttpInfo**](docs/OptionsApi.md#optionsWithHttpInfo) | **POST** /options/{apiKey}/{optionsName} | Retrieve an options list based on given option name
*PrepareTransactionApi* | [**processPrepareDebit**](docs/PrepareTransactionApi.md#processPrepareDebit) | **POST** /transaction/{apiKey}/prepare-debit | Process a prepare Debit
*PrepareTransactionApi* | [**processPrepareDebitWithHttpInfo**](docs/PrepareTransactionApi.md#processPrepareDebitWithHttpInfo) | **POST** /transaction/{apiKey}/prepare-debit | Process a prepare Debit
*PrepareTransactionApi* | [**processPreparePreauthorize**](docs/PrepareTransactionApi.md#processPreparePreauthorize) | **POST** /transaction/{apiKey}/prepare-preauthorize | Process a prepare Preauthorize
*PrepareTransactionApi* | [**processPreparePreauthorizeWithHttpInfo**](docs/PrepareTransactionApi.md#processPreparePreauthorizeWithHttpInfo) | **POST** /transaction/{apiKey}/prepare-preauthorize | Process a prepare Preauthorize
*ScheduleApi* | [**cancelSchedule**](docs/ScheduleApi.md#cancelSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/cancel | Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**cancelScheduleWithHttpInfo**](docs/ScheduleApi.md#cancelScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/cancel | Cancel a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**continueSchedule**](docs/ScheduleApi.md#continueSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/continue | Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**continueScheduleWithHttpInfo**](docs/ScheduleApi.md#continueScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/continue | Continue a schedule which has been paused. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**getSchedule**](docs/ScheduleApi.md#getSchedule) | **GET** /schedule/{apiKey}/{scheduleId}/get | Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**getScheduleWithHttpInfo**](docs/ScheduleApi.md#getScheduleWithHttpInfo) | **GET** /schedule/{apiKey}/{scheduleId}/get | Retrieve a schedule. Requires the UUID of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**pauseSchedule**](docs/ScheduleApi.md#pauseSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/pause | Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**pauseScheduleWithHttpInfo**](docs/ScheduleApi.md#pauseScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/pause | Pause a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preuathorize-with-register
*ScheduleApi* | [**startSchedule**](docs/ScheduleApi.md#startSchedule) | **POST** /schedule/{apiKey}/start | Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register
*ScheduleApi* | [**startScheduleWithHttpInfo**](docs/ScheduleApi.md#startScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/start | Start a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register
*ScheduleApi* | [**updateSchedule**](docs/ScheduleApi.md#updateSchedule) | **POST** /schedule/{apiKey}/{scheduleId}/update | Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register
*ScheduleApi* | [**updateScheduleWithHttpInfo**](docs/ScheduleApi.md#updateScheduleWithHttpInfo) | **POST** /schedule/{apiKey}/{scheduleId}/update | Update a schedule. Requires the registrationId of an existing transaction of type Register / Debit-with-register / Preauthorize-with-register
*StatusApi* | [**transactionStatusByMerchantTransactionId**](docs/StatusApi.md#transactionStatusByMerchantTransactionId) | **GET** /status/{apiKey}/getByMerchantTransactionId/{merchantTransactionId} | Retrieve status of a transaction
*StatusApi* | [**transactionStatusByMerchantTransactionIdWithHttpInfo**](docs/StatusApi.md#transactionStatusByMerchantTransactionIdWithHttpInfo) | **GET** /status/{apiKey}/getByMerchantTransactionId/{merchantTransactionId} | Retrieve status of a transaction
*StatusApi* | [**transactionStatusByUuid**](docs/StatusApi.md#transactionStatusByUuid) | **GET** /status/{apiKey}/getByUuid/{uuid} | Retrieve status of a transaction
*StatusApi* | [**transactionStatusByUuidWithHttpInfo**](docs/StatusApi.md#transactionStatusByUuidWithHttpInfo) | **GET** /status/{apiKey}/getByUuid/{uuid} | Retrieve status of a transaction
*TransactionApi* | [**processCapture**](docs/TransactionApi.md#processCapture) | **POST** /transaction/{apiKey}/capture | Process a capture: completes a payment previously authorized through Preauthorize
*TransactionApi* | [**processCaptureWithHttpInfo**](docs/TransactionApi.md#processCaptureWithHttpInfo) | **POST** /transaction/{apiKey}/capture | Process a capture: completes a payment previously authorized through Preauthorize
*TransactionApi* | [**processDebit**](docs/TransactionApi.md#processDebit) | **POST** /transaction/{apiKey}/debit | Process a debit
*TransactionApi* | [**processDebitWithHttpInfo**](docs/TransactionApi.md#processDebitWithHttpInfo) | **POST** /transaction/{apiKey}/debit | Process a debit
*TransactionApi* | [**processDeregister**](docs/TransactionApi.md#processDeregister) | **POST** /transaction/{apiKey}/deregister | Process a deregister: deletes a previously registered payment instrument
*TransactionApi* | [**processDeregisterWithHttpInfo**](docs/TransactionApi.md#processDeregisterWithHttpInfo) | **POST** /transaction/{apiKey}/deregister | Process a deregister: deletes a previously registered payment instrument
*TransactionApi* | [**processIncrementalAuthorization**](docs/TransactionApi.md#processIncrementalAuthorization) | **POST** /transaction/{apiKey}/incrementalAuthorization | Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before)
*TransactionApi* | [**processIncrementalAuthorizationWithHttpInfo**](docs/TransactionApi.md#processIncrementalAuthorizationWithHttpInfo) | **POST** /transaction/{apiKey}/incrementalAuthorization | Increases or prolongs the authorization on a customer&#39;s payment instrument (made with Preauthorize before)
*TransactionApi* | [**processPayout**](docs/TransactionApi.md#processPayout) | **POST** /transaction/{apiKey}/payout | Process a payout
*TransactionApi* | [**processPayoutWithHttpInfo**](docs/TransactionApi.md#processPayoutWithHttpInfo) | **POST** /transaction/{apiKey}/payout | Process a payout
*TransactionApi* | [**processPreauthorize**](docs/TransactionApi.md#processPreauthorize) | **POST** /transaction/{apiKey}/preauthorize | Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument
*TransactionApi* | [**processPreauthorizeWithHttpInfo**](docs/TransactionApi.md#processPreauthorizeWithHttpInfo) | **POST** /transaction/{apiKey}/preauthorize | Process a preauthorize: reserves the payment amount on the customer&#39;s payment instrument
*TransactionApi* | [**processRefund**](docs/TransactionApi.md#processRefund) | **POST** /transaction/{apiKey}/refund | Process a refund
*TransactionApi* | [**processRefundWithHttpInfo**](docs/TransactionApi.md#processRefundWithHttpInfo) | **POST** /transaction/{apiKey}/refund | Process a refund
*TransactionApi* | [**processRegister**](docs/TransactionApi.md#processRegister) | **POST** /transaction/{apiKey}/register | Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize)
*TransactionApi* | [**processRegisterWithHttpInfo**](docs/TransactionApi.md#processRegisterWithHttpInfo) | **POST** /transaction/{apiKey}/register | Process a register: registers a customer&#39;s payment instrument for future use (Debit or Preauthorize)
*TransactionApi* | [**processVoid**](docs/TransactionApi.md#processVoid) | **POST** /transaction/{apiKey}/void | Process a void: cancels a previously authorized Preauthorize
*TransactionApi* | [**processVoidWithHttpInfo**](docs/TransactionApi.md#processVoidWithHttpInfo) | **POST** /transaction/{apiKey}/void | Process a void: cancels a previously authorized Preauthorize


## Documentation for Models

 - [Callback](docs/Callback.md)
 - [CancelSchedule](docs/CancelSchedule.md)
 - [Capture](docs/Capture.md)
 - [CardData](docs/CardData.md)
 - [CardDataAllOf](docs/CardDataAllOf.md)
 - [ChargebackData](docs/ChargebackData.md)
 - [ChargebackReversalData](docs/ChargebackReversalData.md)
 - [ContinueSchedule](docs/ContinueSchedule.md)
 - [Customer](docs/Customer.md)
 - [CustomerProfileData](docs/CustomerProfileData.md)
 - [Debit](docs/Debit.md)
 - [Deregister](docs/Deregister.md)
 - [ErrorType](docs/ErrorType.md)
 - [IbanData](docs/IbanData.md)
 - [IbanDataAllOf](docs/IbanDataAllOf.md)
 - [IbanDataIbanData](docs/IbanDataIbanData.md)
 - [IncrementalAuthorization](docs/IncrementalAuthorization.md)
 - [ItemsInner](docs/ItemsInner.md)
 - [MaybeScheduleResponse](docs/MaybeScheduleResponse.md)
 - [MaybeTransactionResponse](docs/MaybeTransactionResponse.md)
 - [ModelVoid](docs/ModelVoid.md)
 - [OptionsRequest](docs/OptionsRequest.md)
 - [OptionsResponse](docs/OptionsResponse.md)
 - [OptionsResponseOptionsInner](docs/OptionsResponseOptionsInner.md)
 - [PauseSchedule](docs/PauseSchedule.md)
 - [PaymentData](docs/PaymentData.md)
 - [Payout](docs/Payout.md)
 - [PeriodUnit](docs/PeriodUnit.md)
 - [PhoneData](docs/PhoneData.md)
 - [PhoneDataAllOf](docs/PhoneDataAllOf.md)
 - [Preauthorize](docs/Preauthorize.md)
 - [PrepareDebitRequest](docs/PrepareDebitRequest.md)
 - [PrepareDebitResponse](docs/PrepareDebitResponse.md)
 - [PreparePreauthorizeRequest](docs/PreparePreauthorizeRequest.md)
 - [PreparePreauthorizeResponse](docs/PreparePreauthorizeResponse.md)
 - [Refund](docs/Refund.md)
 - [Register](docs/Register.md)
 - [ReturnData](docs/ReturnData.md)
 - [ReturnDataType](docs/ReturnDataType.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleData](docs/ScheduleData.md)
 - [ScheduleErrorResponse](docs/ScheduleErrorResponse.md)
 - [ScheduleResponse](docs/ScheduleResponse.md)
 - [ScheduleResponseAllOf](docs/ScheduleResponseAllOf.md)
 - [ScheduleStatus](docs/ScheduleStatus.md)
 - [Split](docs/Split.md)
 - [SplitCommisionFee](docs/SplitCommisionFee.md)
 - [StartSchedule](docs/StartSchedule.md)
 - [StatusResponse](docs/StatusResponse.md)
 - [ThreeDSecureData](docs/ThreeDSecureData.md)
 - [ThreeDSecureType](docs/ThreeDSecureType.md)
 - [TransactionError](docs/TransactionError.md)
 - [TransactionErrorResponse](docs/TransactionErrorResponse.md)
 - [TransactionErrorResponseAllOf](docs/TransactionErrorResponseAllOf.md)
 - [TransactionResponse](docs/TransactionResponse.md)
 - [TransactionResponseAllOf](docs/TransactionResponseAllOf.md)
 - [TransactionResponseAllOfRiskCheckData](docs/TransactionResponseAllOfRiskCheckData.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionType](docs/TransactionType.md)
 - [UpdateSchedule](docs/UpdateSchedule.md)
 - [WalletData](docs/WalletData.md)
 - [WalletDataAllOf](docs/WalletDataAllOf.md)
 - [WalletDataWalletData](docs/WalletDataWalletData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author

support@ixopay.com
