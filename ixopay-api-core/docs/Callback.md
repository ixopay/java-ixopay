

# Callback


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**result** | [**ResultEnum**](#ResultEnum) |  |  [optional] |
|**uuid** | **String** |  |  [optional] |
|**merchantTransactionId** | **String** |  |  [optional] |
|**purchaseId** | **String** |  |  [optional] |
|**transactionType** | **TransactionType** |  |  [optional] |
|**paymentMethod** | **String** |  |  [optional] |
|**amount** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**surchargeAmount** | **String** |  |  [optional] |
|**totalAmount** | **String** |  |  [optional] |
|**scheduleData** | **ScheduleData** |  |  [optional] |
|**customerProfileData** | **CustomerProfileData** |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**errorCode** | **Integer** |  |  [optional] |
|**adapterMessage** | **String** |  |  [optional] |
|**adapterCode** | **String** |  |  [optional] |
|**chargebackData** | **ChargebackData** |  |  [optional] |
|**chargebackReversalData** | **ChargebackReversalData** |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**merchantMetaData** | **String** |  |  [optional] |
|**returnData** | [**ReturnData**](ReturnData.md) |  |  [optional] |
|**customer** | **CustomerData** |  |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| PENDING | &quot;PENDING&quot; |
| ERROR | &quot;ERROR&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



