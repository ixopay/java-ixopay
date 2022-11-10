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


package com.ixopay.client.core.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ixopay.client.core.model.ChargebackData;
import com.ixopay.client.core.model.ChargebackReversalData;
import com.ixopay.client.core.model.Customer;
import com.ixopay.client.core.model.CustomerProfileData;
import com.ixopay.client.core.model.ReturnData;
import com.ixopay.client.core.model.ScheduleData;
import com.ixopay.client.core.model.TransactionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Callback
 */
@JsonPropertyOrder({
  Callback.JSON_PROPERTY_RESULT,
  Callback.JSON_PROPERTY_UUID,
  Callback.JSON_PROPERTY_MERCHANT_TRANSACTION_ID,
  Callback.JSON_PROPERTY_PURCHASE_ID,
  Callback.JSON_PROPERTY_TRANSACTION_TYPE,
  Callback.JSON_PROPERTY_PAYMENT_METHOD,
  Callback.JSON_PROPERTY_AMOUNT,
  Callback.JSON_PROPERTY_CURRENCY,
  Callback.JSON_PROPERTY_SURCHARGE_AMOUNT,
  Callback.JSON_PROPERTY_TOTAL_AMOUNT,
  Callback.JSON_PROPERTY_SCHEDULE_DATA,
  Callback.JSON_PROPERTY_CUSTOMER_PROFILE_DATA,
  Callback.JSON_PROPERTY_ERROR_MESSAGE,
  Callback.JSON_PROPERTY_ERROR_CODE,
  Callback.JSON_PROPERTY_ADAPTER_MESSAGE,
  Callback.JSON_PROPERTY_ADAPTER_CODE,
  Callback.JSON_PROPERTY_CHARGEBACK_DATA,
  Callback.JSON_PROPERTY_CHARGEBACK_REVERSAL_DATA,
  Callback.JSON_PROPERTY_EXTRA_DATA,
  Callback.JSON_PROPERTY_MERCHANT_META_DATA,
  Callback.JSON_PROPERTY_RETURN_DATA,
  Callback.JSON_PROPERTY_CUSTOMER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Callback {
  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    OK("OK"),
    
    PENDING("PENDING"),
    
    ERROR("ERROR");

    private String value;

    ResultEnum(String value) {
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
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT = "result";
  private ResultEnum result;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  private String merchantTransactionId;

  public static final String JSON_PROPERTY_PURCHASE_ID = "purchaseId";
  private String purchaseId;

  public static final String JSON_PROPERTY_TRANSACTION_TYPE = "transactionType";
  private TransactionType transactionType;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_SURCHARGE_AMOUNT = "surchargeAmount";
  private String surchargeAmount;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "totalAmount";
  private String totalAmount;

  public static final String JSON_PROPERTY_SCHEDULE_DATA = "scheduleData";
  private ScheduleData scheduleData;

  public static final String JSON_PROPERTY_CUSTOMER_PROFILE_DATA = "customerProfileData";
  private CustomerProfileData customerProfileData;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private Integer errorCode;

  public static final String JSON_PROPERTY_ADAPTER_MESSAGE = "adapterMessage";
  private String adapterMessage;

  public static final String JSON_PROPERTY_ADAPTER_CODE = "adapterCode";
  private String adapterCode;

  public static final String JSON_PROPERTY_CHARGEBACK_DATA = "chargebackData";
  private ChargebackData chargebackData;

  public static final String JSON_PROPERTY_CHARGEBACK_REVERSAL_DATA = "chargebackReversalData";
  private ChargebackReversalData chargebackReversalData;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;

  public static final String JSON_PROPERTY_MERCHANT_META_DATA = "merchantMetaData";
  private String merchantMetaData;

  public static final String JSON_PROPERTY_RETURN_DATA = "returnData";
  private ReturnData returnData;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private Customer customer;

  public Callback() { 
  }

  public Callback result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultEnum getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  public Callback uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public Callback merchantTransactionId(String merchantTransactionId) {
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


  public Callback purchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
    return this;
  }

   /**
   * Get purchaseId
   * @return purchaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurchaseId() {
    return purchaseId;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }


  public Callback transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionType getTransactionType() {
    return transactionType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }


  public Callback paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public Callback amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Callback currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Callback surchargeAmount(String surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
    return this;
  }

   /**
   * Get surchargeAmount
   * @return surchargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSurchargeAmount() {
    return surchargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_SURCHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSurchargeAmount(String surchargeAmount) {
    this.surchargeAmount = surchargeAmount;
  }


  public Callback totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Callback scheduleData(ScheduleData scheduleData) {
    this.scheduleData = scheduleData;
    return this;
  }

   /**
   * Get scheduleData
   * @return scheduleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleData getScheduleData() {
    return scheduleData;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleData(ScheduleData scheduleData) {
    this.scheduleData = scheduleData;
  }


  public Callback customerProfileData(CustomerProfileData customerProfileData) {
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


  public Callback errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public Callback errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  public Callback adapterMessage(String adapterMessage) {
    this.adapterMessage = adapterMessage;
    return this;
  }

   /**
   * Get adapterMessage
   * @return adapterMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADAPTER_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdapterMessage() {
    return adapterMessage;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterMessage(String adapterMessage) {
    this.adapterMessage = adapterMessage;
  }


  public Callback adapterCode(String adapterCode) {
    this.adapterCode = adapterCode;
    return this;
  }

   /**
   * Get adapterCode
   * @return adapterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADAPTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdapterCode() {
    return adapterCode;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterCode(String adapterCode) {
    this.adapterCode = adapterCode;
  }


  public Callback chargebackData(ChargebackData chargebackData) {
    this.chargebackData = chargebackData;
    return this;
  }

   /**
   * Get chargebackData
   * @return chargebackData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARGEBACK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargebackData getChargebackData() {
    return chargebackData;
  }


  @JsonProperty(JSON_PROPERTY_CHARGEBACK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargebackData(ChargebackData chargebackData) {
    this.chargebackData = chargebackData;
  }


  public Callback chargebackReversalData(ChargebackReversalData chargebackReversalData) {
    this.chargebackReversalData = chargebackReversalData;
    return this;
  }

   /**
   * Get chargebackReversalData
   * @return chargebackReversalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARGEBACK_REVERSAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChargebackReversalData getChargebackReversalData() {
    return chargebackReversalData;
  }


  @JsonProperty(JSON_PROPERTY_CHARGEBACK_REVERSAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChargebackReversalData(ChargebackReversalData chargebackReversalData) {
    this.chargebackReversalData = chargebackReversalData;
  }


  public Callback extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public Callback putExtraDataItem(String key, String extraDataItem) {
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


  public Callback merchantMetaData(String merchantMetaData) {
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


  public Callback returnData(ReturnData returnData) {
    this.returnData = returnData;
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnData getReturnData() {
    return returnData;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnData(ReturnData returnData) {
    this.returnData = returnData;
  }


  public Callback customer(Customer customer) {
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


  /**
   * Return true if this Callback object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Callback callback = (Callback) o;
    return Objects.equals(this.result, callback.result) &&
        Objects.equals(this.uuid, callback.uuid) &&
        Objects.equals(this.merchantTransactionId, callback.merchantTransactionId) &&
        Objects.equals(this.purchaseId, callback.purchaseId) &&
        Objects.equals(this.transactionType, callback.transactionType) &&
        Objects.equals(this.paymentMethod, callback.paymentMethod) &&
        Objects.equals(this.amount, callback.amount) &&
        Objects.equals(this.currency, callback.currency) &&
        Objects.equals(this.surchargeAmount, callback.surchargeAmount) &&
        Objects.equals(this.totalAmount, callback.totalAmount) &&
        Objects.equals(this.scheduleData, callback.scheduleData) &&
        Objects.equals(this.customerProfileData, callback.customerProfileData) &&
        Objects.equals(this.errorMessage, callback.errorMessage) &&
        Objects.equals(this.errorCode, callback.errorCode) &&
        Objects.equals(this.adapterMessage, callback.adapterMessage) &&
        Objects.equals(this.adapterCode, callback.adapterCode) &&
        Objects.equals(this.chargebackData, callback.chargebackData) &&
        Objects.equals(this.chargebackReversalData, callback.chargebackReversalData) &&
        Objects.equals(this.extraData, callback.extraData) &&
        Objects.equals(this.merchantMetaData, callback.merchantMetaData) &&
        Objects.equals(this.returnData, callback.returnData) &&
        Objects.equals(this.customer, callback.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, uuid, merchantTransactionId, purchaseId, transactionType, paymentMethod, amount, currency, surchargeAmount, totalAmount, scheduleData, customerProfileData, errorMessage, errorCode, adapterMessage, adapterCode, chargebackData, chargebackReversalData, extraData, merchantMetaData, returnData, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Callback {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    surchargeAmount: ").append(toIndentedString(surchargeAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    scheduleData: ").append(toIndentedString(scheduleData)).append("\n");
    sb.append("    customerProfileData: ").append(toIndentedString(customerProfileData)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    adapterMessage: ").append(toIndentedString(adapterMessage)).append("\n");
    sb.append("    adapterCode: ").append(toIndentedString(adapterCode)).append("\n");
    sb.append("    chargebackData: ").append(toIndentedString(chargebackData)).append("\n");
    sb.append("    chargebackReversalData: ").append(toIndentedString(chargebackReversalData)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    merchantMetaData: ").append(toIndentedString(merchantMetaData)).append("\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

