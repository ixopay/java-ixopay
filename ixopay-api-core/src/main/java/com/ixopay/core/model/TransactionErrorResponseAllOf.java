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
import com.ixopay.core.model.ErrorType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TransactionErrorResponseAllOf
 */
@JsonPropertyOrder({
  TransactionErrorResponseAllOf.JSON_PROPERTY_SUCCESS,
  TransactionErrorResponseAllOf.JSON_PROPERTY_RETURN_TYPE,
  TransactionErrorResponseAllOf.JSON_PROPERTY_ERRORS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TransactionErrorResponseAllOf {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  /**
   * Gets or Sets returnType
   */
  public enum ReturnTypeEnum {
    ERROR("ERROR");

    private String value;

    ReturnTypeEnum(String value) {
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
    public static ReturnTypeEnum fromValue(String value) {
      for (ReturnTypeEnum b : ReturnTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RETURN_TYPE = "returnType";
  private ReturnTypeEnum returnType;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ErrorType> errors = null;

  public TransactionErrorResponseAllOf() { 
  }

  public TransactionErrorResponseAllOf success(Boolean success) {
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


  public TransactionErrorResponseAllOf returnType(ReturnTypeEnum returnType) {
    this.returnType = returnType;
    return this;
  }

   /**
   * Get returnType
   * @return returnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnTypeEnum getReturnType() {
    return returnType;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnType(ReturnTypeEnum returnType) {
    this.returnType = returnType;
  }


  public TransactionErrorResponseAllOf errors(List<ErrorType> errors) {
    this.errors = errors;
    return this;
  }

  public TransactionErrorResponseAllOf addErrorsItem(ErrorType errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorType> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<ErrorType> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this TransactionErrorResponse_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionErrorResponseAllOf transactionErrorResponseAllOf = (TransactionErrorResponseAllOf) o;
    return Objects.equals(this.success, transactionErrorResponseAllOf.success) &&
        Objects.equals(this.returnType, transactionErrorResponseAllOf.returnType) &&
        Objects.equals(this.errors, transactionErrorResponseAllOf.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, returnType, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionErrorResponseAllOf {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

