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
import com.ixopay.core.model.ScheduleStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ScheduleResponseAllOf
 */
@JsonPropertyOrder({
  ScheduleResponseAllOf.JSON_PROPERTY_SCHEDULE_ID,
  ScheduleResponseAllOf.JSON_PROPERTY_REGISTRATION_UUID,
  ScheduleResponseAllOf.JSON_PROPERTY_MERCHANT_META_DATA,
  ScheduleResponseAllOf.JSON_PROPERTY_OLD_STATUS,
  ScheduleResponseAllOf.JSON_PROPERTY_NEW_STATUS,
  ScheduleResponseAllOf.JSON_PROPERTY_SCHEDULED_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScheduleResponseAllOf {
  public static final String JSON_PROPERTY_SCHEDULE_ID = "scheduleId";
  private String scheduleId;

  public static final String JSON_PROPERTY_REGISTRATION_UUID = "registrationUuid";
  private String registrationUuid;

  public static final String JSON_PROPERTY_MERCHANT_META_DATA = "merchantMetaData";
  private String merchantMetaData;

  public static final String JSON_PROPERTY_OLD_STATUS = "oldStatus";
  private ScheduleStatus oldStatus;

  public static final String JSON_PROPERTY_NEW_STATUS = "newStatus";
  private ScheduleStatus newStatus;

  public static final String JSON_PROPERTY_SCHEDULED_AT = "scheduledAt";
  private OffsetDateTime scheduledAt;

  public ScheduleResponseAllOf() { 
  }

  public ScheduleResponseAllOf scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheduleId() {
    return scheduleId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }


  public ScheduleResponseAllOf registrationUuid(String registrationUuid) {
    this.registrationUuid = registrationUuid;
    return this;
  }

   /**
   * Get registrationUuid
   * @return registrationUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrationUuid() {
    return registrationUuid;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationUuid(String registrationUuid) {
    this.registrationUuid = registrationUuid;
  }


  public ScheduleResponseAllOf merchantMetaData(String merchantMetaData) {
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


  public ScheduleResponseAllOf oldStatus(ScheduleStatus oldStatus) {
    this.oldStatus = oldStatus;
    return this;
  }

   /**
   * Get oldStatus
   * @return oldStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OLD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleStatus getOldStatus() {
    return oldStatus;
  }


  @JsonProperty(JSON_PROPERTY_OLD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldStatus(ScheduleStatus oldStatus) {
    this.oldStatus = oldStatus;
  }


  public ScheduleResponseAllOf newStatus(ScheduleStatus newStatus) {
    this.newStatus = newStatus;
    return this;
  }

   /**
   * Get newStatus
   * @return newStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleStatus getNewStatus() {
    return newStatus;
  }


  @JsonProperty(JSON_PROPERTY_NEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewStatus(ScheduleStatus newStatus) {
    this.newStatus = newStatus;
  }


  public ScheduleResponseAllOf scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * Get scheduledAt
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  /**
   * Return true if this ScheduleResponse_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleResponseAllOf scheduleResponseAllOf = (ScheduleResponseAllOf) o;
    return Objects.equals(this.scheduleId, scheduleResponseAllOf.scheduleId) &&
        Objects.equals(this.registrationUuid, scheduleResponseAllOf.registrationUuid) &&
        Objects.equals(this.merchantMetaData, scheduleResponseAllOf.merchantMetaData) &&
        Objects.equals(this.oldStatus, scheduleResponseAllOf.oldStatus) &&
        Objects.equals(this.newStatus, scheduleResponseAllOf.newStatus) &&
        Objects.equals(this.scheduledAt, scheduleResponseAllOf.scheduledAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, registrationUuid, merchantMetaData, oldStatus, newStatus, scheduledAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleResponseAllOf {\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    registrationUuid: ").append(toIndentedString(registrationUuid)).append("\n");
    sb.append("    merchantMetaData: ").append(toIndentedString(merchantMetaData)).append("\n");
    sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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

