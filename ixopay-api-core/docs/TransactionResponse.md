

# TransactionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** |  |  [optional] |
|**purchaseId** | **String** |  |  [optional] |
|**returnType** | [**ReturnTypeEnum**](#ReturnTypeEnum) |  |  [optional] |
|**redirectType** | [**RedirectTypeEnum**](#RedirectTypeEnum) |  |  [optional] |
|**redirectUrl** | **URI** |  |  [optional] |
|**redirectQRCode** | **String** | DataUrl |  [optional] |
|**htmlContent** | **String** |  |  [optional] |
|**paymentDescriptor** | **String** |  |  [optional] |
|**paymentMethod** | **String** |  |  [optional] |
|**returnData** | [**ReturnData**](ReturnData.md) |  |  [optional] |
|**scheduleData** | [**ScheduleData**](ScheduleData.md) |  |  [optional] |
|**customerProfileData** | [**CustomerProfileData**](CustomerProfileData.md) |  |  [optional] |
|**riskCheckData** | [**TransactionResponseAllOfRiskCheckData**](TransactionResponseAllOfRiskCheckData.md) |  |  [optional] |
|**errors** | [**List&lt;ErrorType&gt;**](ErrorType.md) |  |  [optional] |
|**adapterMessage** | **String** |  |  [optional] |
|**adapterCode** | **String** |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: ReturnTypeEnum

| Name | Value |
|---- | -----|
| FINISHED | &quot;FINISHED&quot; |
| REDIRECT | &quot;REDIRECT&quot; |
| HTML | &quot;HTML&quot; |
| PENDING | &quot;PENDING&quot; |
| ERROR | &quot;ERROR&quot; |



## Enum: RedirectTypeEnum

| Name | Value |
|---- | -----|
| IFRAME | &quot;iframe&quot; |
| FULLPAGE | &quot;fullpage&quot; |
| _3DS | &quot;3ds&quot; |



