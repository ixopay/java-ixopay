/*
 * IXOPAY Payment Platform
 * IXOPAY Payment Platform
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: support@ixopay.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ixopay.core.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ixopay.core.model.Customer;
import com.ixopay.core.model.CustomerProfileData;
import com.ixopay.core.model.ItemsInner;
import com.ixopay.core.model.Schedule;
import com.ixopay.core.model.ThreeDSecureData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * PreparePreauthorizeRequest
 */
@JsonPropertyOrder({
  PreparePreauthorizeRequest.JSON_PROPERTY_MERCHANT_TRANSACTION_ID,
  PreparePreauthorizeRequest.JSON_PROPERTY_ADDITIONAL_ID1,
  PreparePreauthorizeRequest.JSON_PROPERTY_ADDITIONAL_ID2,
  PreparePreauthorizeRequest.JSON_PROPERTY_EXTRA_DATA,
  PreparePreauthorizeRequest.JSON_PROPERTY_MERCHANT_META_DATA,
  PreparePreauthorizeRequest.JSON_PROPERTY_REFERENCE_UUID,
  PreparePreauthorizeRequest.JSON_PROPERTY_AMOUNT,
  PreparePreauthorizeRequest.JSON_PROPERTY_CURRENCY,
  PreparePreauthorizeRequest.JSON_PROPERTY_SUCCESS_URL,
  PreparePreauthorizeRequest.JSON_PROPERTY_CANCEL_URL,
  PreparePreauthorizeRequest.JSON_PROPERTY_ERROR_URL,
  PreparePreauthorizeRequest.JSON_PROPERTY_CALLBACK_URL,
  PreparePreauthorizeRequest.JSON_PROPERTY_TRANSACTION_TOKEN,
  PreparePreauthorizeRequest.JSON_PROPERTY_DESCRIPTION,
  PreparePreauthorizeRequest.JSON_PROPERTY_ITEMS,
  PreparePreauthorizeRequest.JSON_PROPERTY_WITH_REGISTER,
  PreparePreauthorizeRequest.JSON_PROPERTY_TRANSACTION_INDICATOR,
  PreparePreauthorizeRequest.JSON_PROPERTY_CUSTOMER,
  PreparePreauthorizeRequest.JSON_PROPERTY_SCHEDULE,
  PreparePreauthorizeRequest.JSON_PROPERTY_CUSTOMER_PROFILE_DATA,
  PreparePreauthorizeRequest.JSON_PROPERTY_THREE_D_SECURE_DATA,
  PreparePreauthorizeRequest.JSON_PROPERTY_LANGUAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreparePreauthorizeRequest {
  public static final String JSON_PROPERTY_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  private String merchantTransactionId;

  public static final String JSON_PROPERTY_ADDITIONAL_ID1 = "additionalId1";
  private String additionalId1;

  public static final String JSON_PROPERTY_ADDITIONAL_ID2 = "additionalId2";
  private String additionalId2;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;

  public static final String JSON_PROPERTY_MERCHANT_META_DATA = "merchantMetaData";
  private String merchantMetaData;

  public static final String JSON_PROPERTY_REFERENCE_UUID = "referenceUuid";
  private String referenceUuid;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_SUCCESS_URL = "successUrl";
  private URI successUrl;

  public static final String JSON_PROPERTY_CANCEL_URL = "cancelUrl";
  private URI cancelUrl;

  public static final String JSON_PROPERTY_ERROR_URL = "errorUrl";
  private URI errorUrl;

  public static final String JSON_PROPERTY_CALLBACK_URL = "callbackUrl";
  private URI callbackUrl;

  public static final String JSON_PROPERTY_TRANSACTION_TOKEN = "transactionToken";
  private String transactionToken;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<ItemsInner> items = null;

  public static final String JSON_PROPERTY_WITH_REGISTER = "withRegister";
  private Boolean withRegister;

  /**
   * Gets or Sets transactionIndicator
   */
  public enum TransactionIndicatorEnum {
    SINGLE("SINGLE"),
    
    INITIAL("INITIAL"),
    
    RECURRING("RECURRING"),
    
    CARDONFILE("CARDONFILE"),
    
    CARDONFILE_MERCHANT_INITIATED("CARDONFILE-MERCHANT-INITIATED");

    private String value;

    TransactionIndicatorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionIndicatorEnum fromValue(String value) {
      for (TransactionIndicatorEnum b : TransactionIndicatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_INDICATOR = "transactionIndicator";
  private TransactionIndicatorEnum transactionIndicator;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private Schedule schedule;

  public static final String JSON_PROPERTY_CUSTOMER_PROFILE_DATA = "customerProfileData";
  private CustomerProfileData customerProfileData;

  public static final String JSON_PROPERTY_THREE_D_SECURE_DATA = "threeDSecureData";
  private ThreeDSecureData threeDSecureData;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public PreparePreauthorizeRequest() { 
  }

  public PreparePreauthorizeRequest merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * Get merchantTransactionId
   * @return merchantTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public PreparePreauthorizeRequest additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

   /**
   * Get additionalId1
   * @return additionalId1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ID1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalId1() {
    return additionalId1;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ID1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }


  public PreparePreauthorizeRequest additionalId2(String additionalId2) {
    this.additionalId2 = additionalId2;
    return this;
  }

   /**
   * Get additionalId2
   * @return additionalId2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdditionalId2() {
    return additionalId2;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ID2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalId2(String additionalId2) {
    this.additionalId2 = additionalId2;
  }


  public PreparePreauthorizeRequest extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public PreparePreauthorizeRequest putExtraDataItem(String key, String extraDataItem) {
    if (this.extraData == null) {
      this.extraData = new HashMap<>();
    }
    this.extraData.put(key, extraDataItem);
    return this;
  }

   /**
   * Get extraData
   * @return extraData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getExtraData() {
    return extraData;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtraData(Map<String, String> extraData) {
    this.extraData = extraData;
  }


  public PreparePreauthorizeRequest merchantMetaData(String merchantMetaData) {
    this.merchantMetaData = merchantMetaData;
    return this;
  }

   /**
   * Get merchantMetaData
   * @return merchantMetaData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantMetaData() {
    return merchantMetaData;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_META_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantMetaData(String merchantMetaData) {
    this.merchantMetaData = merchantMetaData;
  }


  public PreparePreauthorizeRequest referenceUuid(String referenceUuid) {
    this.referenceUuid = referenceUuid;
    return this;
  }

   /**
   * Get referenceUuid
   * @return referenceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceUuid() {
    return referenceUuid;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceUuid(String referenceUuid) {
    this.referenceUuid = referenceUuid;
  }


  public PreparePreauthorizeRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public PreparePreauthorizeRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public PreparePreauthorizeRequest successUrl(URI successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Get successUrl
   * @return successUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSuccessUrl() {
    return successUrl;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessUrl(URI successUrl) {
    this.successUrl = successUrl;
  }


  public PreparePreauthorizeRequest cancelUrl(URI cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * Get cancelUrl
   * @return cancelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CANCEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getCancelUrl() {
    return cancelUrl;
  }


  @JsonProperty(JSON_PROPERTY_CANCEL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCancelUrl(URI cancelUrl) {
    this.cancelUrl = cancelUrl;
  }


  public PreparePreauthorizeRequest errorUrl(URI errorUrl) {
    this.errorUrl = errorUrl;
    return this;
  }

   /**
   * Get errorUrl
   * @return errorUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getErrorUrl() {
    return errorUrl;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorUrl(URI errorUrl) {
    this.errorUrl = errorUrl;
  }


  public PreparePreauthorizeRequest callbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getCallbackUrl() {
    return callbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallbackUrl(URI callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public PreparePreauthorizeRequest transactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
    return this;
  }

   /**
   * Get transactionToken
   * @return transactionToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionToken() {
    return transactionToken;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionToken(String transactionToken) {
    this.transactionToken = transactionToken;
  }


  public PreparePreauthorizeRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PreparePreauthorizeRequest items(List<ItemsInner> items) {
    this.items = items;
    return this;
  }

  public PreparePreauthorizeRequest addItemsItem(ItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ItemsInner> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<ItemsInner> items) {
    this.items = items;
  }


  public PreparePreauthorizeRequest withRegister(Boolean withRegister) {
    this.withRegister = withRegister;
    return this;
  }

   /**
   * Get withRegister
   * @return withRegister
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WITH_REGISTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWithRegister() {
    return withRegister;
  }


  @JsonProperty(JSON_PROPERTY_WITH_REGISTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWithRegister(Boolean withRegister) {
    this.withRegister = withRegister;
  }


  public PreparePreauthorizeRequest transactionIndicator(TransactionIndicatorEnum transactionIndicator) {
    this.transactionIndicator = transactionIndicator;
    return this;
  }

   /**
   * Get transactionIndicator
   * @return transactionIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionIndicatorEnum getTransactionIndicator() {
    return transactionIndicator;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionIndicator(TransactionIndicatorEnum transactionIndicator) {
    this.transactionIndicator = transactionIndicator;
  }


  public PreparePreauthorizeRequest customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Customer getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }


  public PreparePreauthorizeRequest schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Schedule getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }


  public PreparePreauthorizeRequest customerProfileData(CustomerProfileData customerProfileData) {
    this.customerProfileData = customerProfileData;
    return this;
  }

   /**
   * Get customerProfileData
   * @return customerProfileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_PROFILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerProfileData getCustomerProfileData() {
    return customerProfileData;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_PROFILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerProfileData(CustomerProfileData customerProfileData) {
    this.customerProfileData = customerProfileData;
  }


  public PreparePreauthorizeRequest threeDSecureData(ThreeDSecureData threeDSecureData) {
    this.threeDSecureData = threeDSecureData;
    return this;
  }

   /**
   * Get threeDSecureData
   * @return threeDSecureData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSecureData getThreeDSecureData() {
    return threeDSecureData;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecureData(ThreeDSecureData threeDSecureData) {
    this.threeDSecureData = threeDSecureData;
  }


  public PreparePreauthorizeRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Return true if this PreparePreauthorizeRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreparePreauthorizeRequest preparePreauthorizeRequest = (PreparePreauthorizeRequest) o;
    return Objects.equals(this.merchantTransactionId, preparePreauthorizeRequest.merchantTransactionId) &&
        Objects.equals(this.additionalId1, preparePreauthorizeRequest.additionalId1) &&
        Objects.equals(this.additionalId2, preparePreauthorizeRequest.additionalId2) &&
        Objects.equals(this.extraData, preparePreauthorizeRequest.extraData) &&
        Objects.equals(this.merchantMetaData, preparePreauthorizeRequest.merchantMetaData) &&
        Objects.equals(this.referenceUuid, preparePreauthorizeRequest.referenceUuid) &&
        Objects.equals(this.amount, preparePreauthorizeRequest.amount) &&
        Objects.equals(this.currency, preparePreauthorizeRequest.currency) &&
        Objects.equals(this.successUrl, preparePreauthorizeRequest.successUrl) &&
        Objects.equals(this.cancelUrl, preparePreauthorizeRequest.cancelUrl) &&
        Objects.equals(this.errorUrl, preparePreauthorizeRequest.errorUrl) &&
        Objects.equals(this.callbackUrl, preparePreauthorizeRequest.callbackUrl) &&
        Objects.equals(this.transactionToken, preparePreauthorizeRequest.transactionToken) &&
        Objects.equals(this.description, preparePreauthorizeRequest.description) &&
        Objects.equals(this.items, preparePreauthorizeRequest.items) &&
        Objects.equals(this.withRegister, preparePreauthorizeRequest.withRegister) &&
        Objects.equals(this.transactionIndicator, preparePreauthorizeRequest.transactionIndicator) &&
        Objects.equals(this.customer, preparePreauthorizeRequest.customer) &&
        Objects.equals(this.schedule, preparePreauthorizeRequest.schedule) &&
        Objects.equals(this.customerProfileData, preparePreauthorizeRequest.customerProfileData) &&
        Objects.equals(this.threeDSecureData, preparePreauthorizeRequest.threeDSecureData) &&
        Objects.equals(this.language, preparePreauthorizeRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantTransactionId, additionalId1, additionalId2, extraData, merchantMetaData, referenceUuid, amount, currency, successUrl, cancelUrl, errorUrl, callbackUrl, transactionToken, description, items, withRegister, transactionIndicator, customer, schedule, customerProfileData, threeDSecureData, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreparePreauthorizeRequest {\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    additionalId2: ").append(toIndentedString(additionalId2)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    merchantMetaData: ").append(toIndentedString(merchantMetaData)).append("\n");
    sb.append("    referenceUuid: ").append(toIndentedString(referenceUuid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    errorUrl: ").append(toIndentedString(errorUrl)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    transactionToken: ").append(toIndentedString(transactionToken)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    withRegister: ").append(toIndentedString(withRegister)).append("\n");
    sb.append("    transactionIndicator: ").append(toIndentedString(transactionIndicator)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    customerProfileData: ").append(toIndentedString(customerProfileData)).append("\n");
    sb.append("    threeDSecureData: ").append(toIndentedString(threeDSecureData)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

