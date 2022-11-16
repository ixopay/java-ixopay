

# Payout


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantTransactionId** | **String** |  |  |
|**additionalId1** | **String** |  |  [optional] |
|**additionalId2** | **String** |  |  [optional] |
|**extraData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**pspPassthroughData** | **Map&lt;String, String&gt;** |  |  [optional] |
|**merchantMetaData** | **String** |  |  [optional] |
|**referenceUuid** | **String** |  |  [optional] |
|**amount** | **String** |  |  |
|**currency** | **String** |  |  |
|**successUrl** | **URI** |  |  [optional] |
|**cancelUrl** | **URI** |  |  [optional] |
|**errorUrl** | **URI** |  |  [optional] |
|**callbackUrl** | **URI** |  |  [optional] |
|**transactionToken** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) |  |  [optional] |
|**splits** | [**List&lt;Split&gt;**](Split.md) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**payByLink** | [**PayByLink**](PayByLink.md) |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**transactionIndicator** | [**TransactionIndicatorEnum**](#TransactionIndicatorEnum) |  |  [optional] |
|**l2l3Data** | [**L2L3Data**](L2L3Data.md) |  |  [optional] |



## Enum: TransactionIndicatorEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;SINGLE&quot; |
| INITIAL | &quot;INITIAL&quot; |
| RECURRING | &quot;RECURRING&quot; |
| CARDONFILE | &quot;CARDONFILE&quot; |
| CARDONFILE_MERCHANT_INITIATED | &quot;CARDONFILE-MERCHANT-INITIATED&quot; |
| MOTO | &quot;MOTO&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



