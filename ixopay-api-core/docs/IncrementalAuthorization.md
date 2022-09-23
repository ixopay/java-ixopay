

# IncrementalAuthorization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantTransactionId** | **String** |  |  |
|**referenceUuid** | **String** |  |  |
|**additionalId1** | **String** |  |  [optional] |
|**additionalId2** | **String** |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**merchantMetaData** | **String** |  |  [optional] |
|**amount** | **String** |  |  |
|**currency** | **String** |  |  |
|**successUrl** | **URI** |  |  [optional] |
|**cancelUrl** | **URI** |  |  [optional] |
|**errorUrl** | **URI** |  |  [optional] |
|**callbackUrl** | **URI** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**items** | [**List&lt;ItemsInner&gt;**](ItemsInner.md) |  |  [optional] |
|**transactionIndicator** | [**TransactionIndicatorEnum**](#TransactionIndicatorEnum) |  |  [optional] |
|**language** | **String** |  |  [optional] |



## Enum: TransactionIndicatorEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;SINGLE&quot; |
| INITIAL | &quot;INITIAL&quot; |
| RECURRING | &quot;RECURRING&quot; |
| CARDONFILE | &quot;CARDONFILE&quot; |
| CARDONFILE_MERCHANT_INITIATED | &quot;CARDONFILE-MERCHANT-INITIATED&quot; |
| MOTO | &quot;MOTO&quot; |



