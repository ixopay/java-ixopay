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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomerProfile
 */
@JsonPropertyOrder({
  CustomerProfile.JSON_PROPERTY_PROFILE_GUID,
  CustomerProfile.JSON_PROPERTY_CUSTOMER_IDENTIFICATION,
  CustomerProfile.JSON_PROPERTY_MARK_AS_PREFERRED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
public class CustomerProfile {
  public static final String JSON_PROPERTY_PROFILE_GUID = "profileGuid";
  private String profileGuid;

  public static final String JSON_PROPERTY_CUSTOMER_IDENTIFICATION = "customerIdentification";
  private String customerIdentification;

  public static final String JSON_PROPERTY_MARK_AS_PREFERRED = "markAsPreferred";
  private Boolean markAsPreferred;

  public CustomerProfile() { 
  }

  public CustomerProfile profileGuid(String profileGuid) {
    this.profileGuid = profileGuid;
    return this;
  }

   /**
   * Get profileGuid
   * @return profileGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileGuid() {
    return profileGuid;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileGuid(String profileGuid) {
    this.profileGuid = profileGuid;
  }


  public CustomerProfile customerIdentification(String customerIdentification) {
    this.customerIdentification = customerIdentification;
    return this;
  }

   /**
   * Get customerIdentification
   * @return customerIdentification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerIdentification() {
    return customerIdentification;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerIdentification(String customerIdentification) {
    this.customerIdentification = customerIdentification;
  }


  public CustomerProfile markAsPreferred(Boolean markAsPreferred) {
    this.markAsPreferred = markAsPreferred;
    return this;
  }

   /**
   * Get markAsPreferred
   * @return markAsPreferred
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARK_AS_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarkAsPreferred() {
    return markAsPreferred;
  }


  @JsonProperty(JSON_PROPERTY_MARK_AS_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkAsPreferred(Boolean markAsPreferred) {
    this.markAsPreferred = markAsPreferred;
  }


  /**
   * Return true if this CustomerProfile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerProfile customerProfile = (CustomerProfile) o;
    return Objects.equals(this.profileGuid, customerProfile.profileGuid) &&
        Objects.equals(this.customerIdentification, customerProfile.customerIdentification) &&
        Objects.equals(this.markAsPreferred, customerProfile.markAsPreferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileGuid, customerIdentification, markAsPreferred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerProfile {\n");
    sb.append("    profileGuid: ").append(toIndentedString(profileGuid)).append("\n");
    sb.append("    customerIdentification: ").append(toIndentedString(customerIdentification)).append("\n");
    sb.append("    markAsPreferred: ").append(toIndentedString(markAsPreferred)).append("\n");
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

