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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RiskCheckData
 */
@JsonPropertyOrder({
  RiskCheckData.JSON_PROPERTY_RISK_CHECK_RESULT,
  RiskCheckData.JSON_PROPERTY_RISK_SCORE,
  RiskCheckData.JSON_PROPERTY_THREE_D_SECURE_REQUIRED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
public class RiskCheckData {
  /**
   * Gets or Sets riskCheckResult
   */
  public enum RiskCheckResultEnum {
    APPROVED("APPROVED"),
    
    DECLINED("DECLINED"),
    
    REVIEW("REVIEW"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    RiskCheckResultEnum(String value) {
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
    public static RiskCheckResultEnum fromValue(String value) {
      for (RiskCheckResultEnum b : RiskCheckResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_RISK_CHECK_RESULT = "riskCheckResult";
  private RiskCheckResultEnum riskCheckResult;

  public static final String JSON_PROPERTY_RISK_SCORE = "riskScore";
  private BigDecimal riskScore;

  public static final String JSON_PROPERTY_THREE_D_SECURE_REQUIRED = "threeDSecureRequired";
  private Boolean threeDSecureRequired;

  public RiskCheckData() { 
  }

  public RiskCheckData riskCheckResult(RiskCheckResultEnum riskCheckResult) {
    this.riskCheckResult = riskCheckResult;
    return this;
  }

   /**
   * Get riskCheckResult
   * @return riskCheckResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_CHECK_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RiskCheckResultEnum getRiskCheckResult() {
    return riskCheckResult;
  }


  @JsonProperty(JSON_PROPERTY_RISK_CHECK_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskCheckResult(RiskCheckResultEnum riskCheckResult) {
    this.riskCheckResult = riskCheckResult;
  }


  public RiskCheckData riskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
    return this;
  }

   /**
   * Get riskScore
   * @return riskScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRiskScore() {
    return riskScore;
  }


  @JsonProperty(JSON_PROPERTY_RISK_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }


  public RiskCheckData threeDSecureRequired(Boolean threeDSecureRequired) {
    this.threeDSecureRequired = threeDSecureRequired;
    return this;
  }

   /**
   * Get threeDSecureRequired
   * @return threeDSecureRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThreeDSecureRequired() {
    return threeDSecureRequired;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecureRequired(Boolean threeDSecureRequired) {
    this.threeDSecureRequired = threeDSecureRequired;
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
  public RiskCheckData putAdditionalProperty(String key, Object value) {
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
   * Return true if this RiskCheckData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskCheckData riskCheckData = (RiskCheckData) o;
    return Objects.equals(this.riskCheckResult, riskCheckData.riskCheckResult) &&
        Objects.equals(this.riskScore, riskCheckData.riskScore) &&
        Objects.equals(this.threeDSecureRequired, riskCheckData.threeDSecureRequired)&&
        Objects.equals(this.additionalProperties, riskCheckData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskCheckResult, riskScore, threeDSecureRequired, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskCheckData {\n");
    sb.append("    riskCheckResult: ").append(toIndentedString(riskCheckResult)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    threeDSecureRequired: ").append(toIndentedString(threeDSecureRequired)).append("\n");
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

}
