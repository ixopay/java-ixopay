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
import com.ixopay.client.core.model.PeriodUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StartSchedule
 */
@JsonPropertyOrder({
  StartSchedule.JSON_PROPERTY_REGISTRATION_UUID,
  StartSchedule.JSON_PROPERTY_AMOUNT,
  StartSchedule.JSON_PROPERTY_CURRENCY,
  StartSchedule.JSON_PROPERTY_PERIOD_LENGTH,
  StartSchedule.JSON_PROPERTY_PERIOD_UNIT,
  StartSchedule.JSON_PROPERTY_START_DATE_TIME,
  StartSchedule.JSON_PROPERTY_MERCHANT_META_DATA,
  StartSchedule.JSON_PROPERTY_CALLBACK_URL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StartSchedule {
  public static final String JSON_PROPERTY_REGISTRATION_UUID = "registrationUuid";
  private String registrationUuid;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PERIOD_LENGTH = "periodLength";
  private Integer periodLength;

  public static final String JSON_PROPERTY_PERIOD_UNIT = "periodUnit";
  private PeriodUnit periodUnit;

  public static final String JSON_PROPERTY_START_DATE_TIME = "startDateTime";
  private OffsetDateTime startDateTime;

  public static final String JSON_PROPERTY_MERCHANT_META_DATA = "merchantMetaData";
  private String merchantMetaData;

  public static final String JSON_PROPERTY_CALLBACK_URL = "callbackUrl";
  private String callbackUrl;

  public StartSchedule() { 
  }

  public StartSchedule registrationUuid(String registrationUuid) {
    this.registrationUuid = registrationUuid;
    return this;
  }

   /**
   * Get registrationUuid
   * @return registrationUuid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegistrationUuid() {
    return registrationUuid;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegistrationUuid(String registrationUuid) {
    this.registrationUuid = registrationUuid;
  }


  public StartSchedule amount(String amount) {
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


  public StartSchedule currency(String currency) {
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


  public StartSchedule periodLength(Integer periodLength) {
    this.periodLength = periodLength;
    return this;
  }

   /**
   * Get periodLength
   * minimum: 0
   * @return periodLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriodLength() {
    return periodLength;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodLength(Integer periodLength) {
    this.periodLength = periodLength;
  }


  public StartSchedule periodUnit(PeriodUnit periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodUnit getPeriodUnit() {
    return periodUnit;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodUnit(PeriodUnit periodUnit) {
    this.periodUnit = periodUnit;
  }


  public StartSchedule startDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Get startDateTime
   * @return startDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDateTime(OffsetDateTime startDateTime) {
    this.startDateTime = startDateTime;
  }


  public StartSchedule merchantMetaData(String merchantMetaData) {
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


  public StartSchedule callbackUrl(String callbackUrl) {
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

  public String getCallbackUrl() {
    return callbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  /**
   * Return true if this StartSchedule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartSchedule startSchedule = (StartSchedule) o;
    return Objects.equals(this.registrationUuid, startSchedule.registrationUuid) &&
        Objects.equals(this.amount, startSchedule.amount) &&
        Objects.equals(this.currency, startSchedule.currency) &&
        Objects.equals(this.periodLength, startSchedule.periodLength) &&
        Objects.equals(this.periodUnit, startSchedule.periodUnit) &&
        Objects.equals(this.startDateTime, startSchedule.startDateTime) &&
        Objects.equals(this.merchantMetaData, startSchedule.merchantMetaData) &&
        Objects.equals(this.callbackUrl, startSchedule.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationUuid, amount, currency, periodLength, periodUnit, startDateTime, merchantMetaData, callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSchedule {\n");
    sb.append("    registrationUuid: ").append(toIndentedString(registrationUuid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    periodLength: ").append(toIndentedString(periodLength)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    merchantMetaData: ").append(toIndentedString(merchantMetaData)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

