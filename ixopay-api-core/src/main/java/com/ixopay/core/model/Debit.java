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
import com.ixopay.core.model.Split;
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
 * Debit
 */
@JsonPropertyOrder({
  Debit.JSON_PROPERTY_MERCHANT_TRANSACTION_ID,
  Debit.JSON_PROPERTY_ADDITIONAL_ID1,
  Debit.JSON_PROPERTY_ADDITIONAL_ID2,
  Debit.JSON_PROPERTY_EXTRA_DATA,
  Debit.JSON_PROPERTY_MERCHANT_META_DATA,
  Debit.JSON_PROPERTY_REFERENCE_UUID,
  Debit.JSON_PROPERTY_AMOUNT,
  Debit.JSON_PROPERTY_CURRENCY,
  Debit.JSON_PROPERTY_SUCCESS_URL,
  Debit.JSON_PROPERTY_CANCEL_URL,
  Debit.JSON_PROPERTY_ERROR_URL,
  Debit.JSON_PROPERTY_CALLBACK_URL,
  Debit.JSON_PROPERTY_TRANSACTION_TOKEN,
  Debit.JSON_PROPERTY_DESCRIPTION,
  Debit.JSON_PROPERTY_ITEMS,
  Debit.JSON_PROPERTY_SPLITS,
  Debit.JSON_PROPERTY_WITH_REGISTER,
  Debit.JSON_PROPERTY_TRANSACTION_INDICATOR,
  Debit.JSON_PROPERTY_CUSTOMER,
  Debit.JSON_PROPERTY_SCHEDULE,
  Debit.JSON_PROPERTY_CUSTOMER_PROFILE_DATA,
  Debit.JSON_PROPERTY_THREE_D_SECURE_DATA,
  Debit.JSON_PROPERTY_LANGUAGE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Debit {
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

  public static final String JSON_PROPERTY_SPLITS = "splits";
  private List<Split> splits = null;

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
    
    CARDONFILE_MERCHANT_INITIATED("CARDONFILE-MERCHANT-INITIATED"),
    
    MOTO("MOTO");

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

  public Debit() { 
  }

  public Debit merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * Get merchantTransactionId
   * @return merchantTransactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MERCHANT_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  public Debit additionalId1(String additionalId1) {
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


  public Debit additionalId2(String additionalId2) {
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


  public Debit extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public Debit putExtraDataItem(String key, String extraDataItem) {
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


  public Debit merchantMetaData(String merchantMetaData) {
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


  public Debit referenceUuid(String referenceUuid) {
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


  public Debit amount(String amount) {
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


  public Debit currency(String currency) {
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


  public Debit successUrl(URI successUrl) {
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


  public Debit cancelUrl(URI cancelUrl) {
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


  public Debit errorUrl(URI errorUrl) {
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


  public Debit callbackUrl(URI callbackUrl) {
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


  public Debit transactionToken(String transactionToken) {
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


  public Debit description(String description) {
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


  public Debit items(List<ItemsInner> items) {
    this.items = items;
    return this;
  }

  public Debit addItemsItem(ItemsInner itemsItem) {
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


  public Debit splits(List<Split> splits) {
    this.splits = splits;
    return this;
  }

  public Debit addSplitsItem(Split splitsItem) {
    if (this.splits == null) {
      this.splits = new ArrayList<>();
    }
    this.splits.add(splitsItem);
    return this;
  }

   /**
   * Get splits
   * @return splits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Split> getSplits() {
    return splits;
  }


  @JsonProperty(JSON_PROPERTY_SPLITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSplits(List<Split> splits) {
    this.splits = splits;
  }


  public Debit withRegister(Boolean withRegister) {
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


  public Debit transactionIndicator(TransactionIndicatorEnum transactionIndicator) {
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


  public Debit customer(Customer customer) {
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


  public Debit schedule(Schedule schedule) {
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


  public Debit customerProfileData(CustomerProfileData customerProfileData) {
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


  public Debit threeDSecureData(ThreeDSecureData threeDSecureData) {
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


  public Debit language(String language) {
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
   * Return true if this Debit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Debit debit = (Debit) o;
    return Objects.equals(this.merchantTransactionId, debit.merchantTransactionId) &&
        Objects.equals(this.additionalId1, debit.additionalId1) &&
        Objects.equals(this.additionalId2, debit.additionalId2) &&
        Objects.equals(this.extraData, debit.extraData) &&
        Objects.equals(this.merchantMetaData, debit.merchantMetaData) &&
        Objects.equals(this.referenceUuid, debit.referenceUuid) &&
        Objects.equals(this.amount, debit.amount) &&
        Objects.equals(this.currency, debit.currency) &&
        Objects.equals(this.successUrl, debit.successUrl) &&
        Objects.equals(this.cancelUrl, debit.cancelUrl) &&
        Objects.equals(this.errorUrl, debit.errorUrl) &&
        Objects.equals(this.callbackUrl, debit.callbackUrl) &&
        Objects.equals(this.transactionToken, debit.transactionToken) &&
        Objects.equals(this.description, debit.description) &&
        Objects.equals(this.items, debit.items) &&
        Objects.equals(this.splits, debit.splits) &&
        Objects.equals(this.withRegister, debit.withRegister) &&
        Objects.equals(this.transactionIndicator, debit.transactionIndicator) &&
        Objects.equals(this.customer, debit.customer) &&
        Objects.equals(this.schedule, debit.schedule) &&
        Objects.equals(this.customerProfileData, debit.customerProfileData) &&
        Objects.equals(this.threeDSecureData, debit.threeDSecureData) &&
        Objects.equals(this.language, debit.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantTransactionId, additionalId1, additionalId2, extraData, merchantMetaData, referenceUuid, amount, currency, successUrl, cancelUrl, errorUrl, callbackUrl, transactionToken, description, items, splits, withRegister, transactionIndicator, customer, schedule, customerProfileData, threeDSecureData, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Debit {\n");
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
    sb.append("    splits: ").append(toIndentedString(splits)).append("\n");
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
