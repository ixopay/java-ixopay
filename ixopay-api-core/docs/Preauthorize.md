

# Preauthorize


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
|**items** | [**List&lt;ItemsInner&gt;**](ItemsInner.md) |  |  [optional] |
|**splits** | [**List&lt;Split&gt;**](Split.md) |  |  [optional] |
|**withRegister** | **Boolean** |  |  [optional] |
|**transactionIndicator** | [**TransactionIndicatorEnum**](#TransactionIndicatorEnum) |  |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**schedule** | [**Schedule**](Schedule.md) |  |  [optional] |
|**customerProfileData** | [**CustomerProfileData**](CustomerProfileData.md) |  |  [optional] |
|**threeDSecureData** | [**ThreeDSecureData**](ThreeDSecureData.md) |  |  [optional] |
|**payByLink** | [**PayByLink**](PayByLink.md) |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**requestDcc** | **Boolean** |  |  [optional] |
|**dccData** | [**DccData**](DccData.md) |  |  [optional] |
|**l2l3Data** | [**L2L3Data**](L2L3Data.md) |  |  [optional] |



## Enum: TransactionIndicatorEnum

| Name | Value |
|---- | -----|
| SINGLE | &quot;SINGLE&quot; |
| INITIAL | &quot;INITIAL&quot; |
| RECURRING | &quot;RECURRING&quot; |
| FIRST_CARDONFILE | &quot;FIRST-CARDONFILE&quot; |
| CARDONFILE | &quot;CARDONFILE&quot; |
| CARDONFILE_MERCHANT_INITIATED | &quot;CARDONFILE-MERCHANT-INITIATED&quot; |
| MOTO | &quot;MOTO&quot; |



