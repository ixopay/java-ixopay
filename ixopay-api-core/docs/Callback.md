

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
|**scheduleData** | [**ScheduleData**](ScheduleData.md) |  |  [optional] |
|**customerProfileData** | [**CustomerProfileData**](CustomerProfileData.md) |  |  [optional] |
|**errorMessage** | **String** |  |  [optional] |
|**errorCode** | **Integer** |  |  [optional] |
|**adapterMessage** | **String** |  |  [optional] |
|**adapterCode** | **String** |  |  [optional] |
|**chargebackData** | [**ChargebackData**](ChargebackData.md) |  |  [optional] |
|**chargebackReversalData** | [**ChargebackReversalData**](ChargebackReversalData.md) |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**merchantMetaData** | **String** |  |  [optional] |
|**returnData** | [**ReturnData**](ReturnData.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| OK | &quot;OK&quot; |
| PENDING | &quot;PENDING&quot; |
| ERROR | &quot;ERROR&quot; |



