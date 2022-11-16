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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ixopay.client.core.model.ScheduleErrorResponse;
import com.ixopay.client.core.model.ScheduleResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ixopay.client.core.client.JSON;
/**
 * MaybeScheduleResponse
 */
@JsonPropertyOrder({
  MaybeScheduleResponse.JSON_PROPERTY_SUCCESS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
@JsonIgnoreProperties(
  value = "success", // ignore manually set success, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the success to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "success", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ScheduleErrorResponse.class, name = "ScheduleErrorResponse"),
  @JsonSubTypes.Type(value = ScheduleResponse.class, name = "ScheduleResponse"),
  @JsonSubTypes.Type(value = ScheduleErrorResponse.class, name = "false"),
  @JsonSubTypes.Type(value = ScheduleResponse.class, name = "true"),
})

public class MaybeScheduleResponse {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public MaybeScheduleResponse() { 
  }

  public MaybeScheduleResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   * @param key the name of the property
   * @param value the value value of the property
   * @return self reference
   */
  @JsonAnySetter
  public MaybeScheduleResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) properties.
   * @return the additional (undeclared) properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   * @param key the name of the property
   * @return the additional (undeclared) property with the specified name
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this MaybeScheduleResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaybeScheduleResponse maybeScheduleResponse = (MaybeScheduleResponse) o;
    return Objects.equals(this.success, maybeScheduleResponse.success)&&
        Objects.equals(this.additionalProperties, maybeScheduleResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaybeScheduleResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

static {
  // Initialize and register the discriminator mappings.
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("ScheduleErrorResponse", ScheduleErrorResponse.class);
  mappings.put("ScheduleResponse", ScheduleResponse.class);
  mappings.put("false", ScheduleErrorResponse.class);
  mappings.put("true", ScheduleResponse.class);
  mappings.put("MaybeScheduleResponse", MaybeScheduleResponse.class);
  JSON.registerDiscriminator(MaybeScheduleResponse.class, "success", mappings);
}
}

