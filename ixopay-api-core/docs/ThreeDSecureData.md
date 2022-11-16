

# ThreeDSecureData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_3dsecure** | **ThreeDSecureType** |  |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) |  |  [optional] |
|**authenticationIndicator** | [**AuthenticationIndicatorEnum**](#AuthenticationIndicatorEnum) |  |  [optional] |
|**cardholderAuthenticationMethod** | [**CardholderAuthenticationMethodEnum**](#CardholderAuthenticationMethodEnum) |  |  [optional] |
|**cardholderAuthenticationDateTime** | **OffsetDateTime** |  |  [optional] |
|**cardHolderAuthenticationData** | **String** |  |  [optional] |
|**challengeIndicator** | [**ChallengeIndicatorEnum**](#ChallengeIndicatorEnum) |  |  [optional] |
|**priorReference** | **String** |  |  [optional] |
|**priorAuthenticationMethod** | [**PriorAuthenticationMethodEnum**](#PriorAuthenticationMethodEnum) |  |  [optional] |
|**priorAuthenticationDateTime** | **OffsetDateTime** |  |  [optional] |
|**priorAuthenticationData** | **String** |  |  [optional] |
|**cardholderAccountType** | [**CardholderAccountTypeEnum**](#CardholderAccountTypeEnum) |  |  [optional] |
|**cardholderAccountAgeIndicator** | [**CardholderAccountAgeIndicatorEnum**](#CardholderAccountAgeIndicatorEnum) |  |  [optional] |
|**cardholderAccountDate** | **LocalDate** |  |  [optional] |
|**cardholderAccountChangeIndicator** | [**CardholderAccountChangeIndicatorEnum**](#CardholderAccountChangeIndicatorEnum) |  |  [optional] |
|**cardholderAccountLastChange** | **LocalDate** |  |  [optional] |
|**cardholderAccountPasswordChangeIndicator** | [**CardholderAccountPasswordChangeIndicatorEnum**](#CardholderAccountPasswordChangeIndicatorEnum) |  |  [optional] |
|**cardholderAccountLastPasswordChange** | **LocalDate** |  |  [optional] |
|**shippingAddressUsageIndicator** | [**ShippingAddressUsageIndicatorEnum**](#ShippingAddressUsageIndicatorEnum) |  |  [optional] |
|**shippingAddressFirstUsage** | **LocalDate** |  |  [optional] |
|**transactionActivityDay** | **BigDecimal** |  |  [optional] |
|**transactionActivityYear** | **BigDecimal** |  |  [optional] |
|**addCardAttemptsDay** | **BigDecimal** |  |  [optional] |
|**purchaseCountSixMonths** | **BigDecimal** |  |  [optional] |
|**suspiciousAccountActivityIndicator** | [**SuspiciousAccountActivityIndicatorEnum**](#SuspiciousAccountActivityIndicatorEnum) |  |  [optional] |
|**shippingNameEqualIndicator** | [**ShippingNameEqualIndicatorEnum**](#ShippingNameEqualIndicatorEnum) |  |  [optional] |
|**paymentAccountAgeIndicator** | [**PaymentAccountAgeIndicatorEnum**](#PaymentAccountAgeIndicatorEnum) |  |  [optional] |
|**paymentAccountAgeDate** | **LocalDate** |  |  [optional] |
|**billingAddressLine3** | **String** |  |  [optional] |
|**shippingAddressLine3** | **String** |  |  [optional] |
|**billingShippingAddressMatch** | [**BillingShippingAddressMatchEnum**](#BillingShippingAddressMatchEnum) |  |  [optional] |
|**homePhoneCountryPrefix** | **String** |  |  [optional] |
|**homePhoneNumber** | **String** |  |  [optional] |
|**mobilePhoneCountryPrefix** | **String** |  |  [optional] |
|**mobilePhoneNumber** | **String** |  |  [optional] |
|**workPhoneCountryPrefix** | **String** |  |  [optional] |
|**workPhoneNumber** | **String** |  |  [optional] |
|**purchaseInstalData** | **BigDecimal** |  |  [optional] |
|**shipIndicator** | [**ShipIndicatorEnum**](#ShipIndicatorEnum) |  |  [optional] |
|**deliveryTimeframe** | [**DeliveryTimeframeEnum**](#DeliveryTimeframeEnum) |  |  [optional] |
|**deliveryEmailAddress** | **String** |  |  [optional] |
|**reorderItemsIndicator** | [**ReorderItemsIndicatorEnum**](#ReorderItemsIndicatorEnum) |  |  [optional] |
|**preOrderPurchaseIndicator** | [**PreOrderPurchaseIndicatorEnum**](#PreOrderPurchaseIndicatorEnum) |  |  [optional] |
|**preOrderDate** | **LocalDate** |  |  [optional] |
|**giftCardAmount** | **BigDecimal** |  |  [optional] |
|**giftCardCurrency** | **String** |  |  [optional] |
|**giftCardCount** | **BigDecimal** |  |  [optional] |
|**purchaseDate** | **OffsetDateTime** |  |  [optional] |
|**recurringExpiry** | **LocalDate** |  |  [optional] |
|**recurringFrequency** | **BigDecimal** |  |  [optional] |
|**transType** | [**TransTypeEnum**](#TransTypeEnum) |  |  [optional] |
|**exemptionIndicator** | [**ExemptionIndicatorEnum**](#ExemptionIndicatorEnum) |  |  [optional] |
|**threeRIIndicator** | [**ThreeRIIndicatorEnum**](#ThreeRIIndicatorEnum) |  |  [optional] |
|**browserChallengeWindowSize** | [**BrowserChallengeWindowSizeEnum**](#BrowserChallengeWindowSizeEnum) |  |  [optional] |
|**browserAcceptHeader** | **String** |  |  [optional] |
|**browserIpAddress** | **String** |  |  [optional] |
|**browserJavaEnabled** | **Boolean** |  |  [optional] |
|**browserLanguage** | **String** |  |  [optional] |
|**browserColorDepth** | [**BrowserColorDepthEnum**](#BrowserColorDepthEnum) |  |  [optional] |
|**browserScreenHeight** | **BigDecimal** |  |  [optional] |
|**browserScreenWidth** | **BigDecimal** |  |  [optional] |
|**browserTimezone** | **BigDecimal** |  |  [optional] |
|**browserUserAgent** | **String** |  |  [optional] |
|**browserPlatform** | **String** |  |  [optional] |
|**sdkInterface** | [**SdkInterfaceEnum**](#SdkInterfaceEnum) |  |  [optional] |
|**sdkUiType** | **String** |  |  [optional] |
|**sdkAppID** | **String** |  |  [optional] |
|**sdkEncData** | **String** |  |  [optional] |
|**sdkEphemPubKey** | **String** |  |  [optional] |
|**sdkMaxTimeout** | **BigDecimal** |  |  [optional] |
|**sdkReferenceNumber** | **String** |  |  [optional] |
|**sdkTransID** | **String** |  |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: AuthenticationIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardholderAuthenticationMethodEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ChallengeIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: PriorAuthenticationMethodEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardholderAccountTypeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardholderAccountAgeIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardholderAccountChangeIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: CardholderAccountPasswordChangeIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ShippingAddressUsageIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SuspiciousAccountActivityIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ShippingNameEqualIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: PaymentAccountAgeIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: BillingShippingAddressMatchEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ShipIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: DeliveryTimeframeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ReorderItemsIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: PreOrderPurchaseIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TransTypeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _03 | &quot;03&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _28 | &quot;28&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ExemptionIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ThreeRIIndicatorEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| _06 | &quot;06&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _09 | &quot;09&quot; |
| _10 | &quot;10&quot; |
| _11 | &quot;11&quot; |
| _12 | &quot;12&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: BrowserChallengeWindowSizeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| _04 | &quot;04&quot; |
| _05 | &quot;05&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: BrowserColorDepthEnum

| Name | Value |
|---- | -----|
| _1 | &quot;1&quot; |
| _4 | &quot;4&quot; |
| _8 | &quot;8&quot; |
| _15 | &quot;15&quot; |
| _16 | &quot;16&quot; |
| _24 | &quot;24&quot; |
| _30 | &quot;30&quot; |
| _32 | &quot;32&quot; |
| _48 | &quot;48&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SdkInterfaceEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



