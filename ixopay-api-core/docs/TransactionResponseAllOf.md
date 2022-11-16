

# TransactionResponseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** |  |  |
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
|**scheduleData** | **ScheduleData** |  |  [optional] |
|**customerProfileData** | **CustomerProfileData** |  |  [optional] |
|**riskCheckData** | **RiskCheckData** |  |  [optional] |
|**errors** | **List&lt;ErrorType&gt;** |  |  [optional] |
|**adapterMessage** | **String** |  |  [optional] |
|**adapterCode** | **String** |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**dccData** | **TransactionDccData** |  |  [optional] |



## Enum: ReturnTypeEnum

| Name | Value |
|---- | -----|
| FINISHED | &quot;FINISHED&quot; |
| REDIRECT | &quot;REDIRECT&quot; |
| HTML | &quot;HTML&quot; |
| PENDING | &quot;PENDING&quot; |
| ERROR | &quot;ERROR&quot; |
| PENDING_DCC | &quot;PENDING_DCC&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: RedirectTypeEnum

| Name | Value |
|---- | -----|
| IFRAME | &quot;iframe&quot; |
| FULLPAGE | &quot;fullpage&quot; |
| _3DS | &quot;3ds&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



