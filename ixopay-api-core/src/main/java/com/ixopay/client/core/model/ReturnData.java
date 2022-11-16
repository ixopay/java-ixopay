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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ixopay.client.core.model.CardData;
import com.ixopay.client.core.model.IbanData;
import com.ixopay.client.core.model.PhoneData;
import com.ixopay.client.core.model.ReturnDataType;
import com.ixopay.client.core.model.WalletData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ixopay.client.core.client.JSON;
/**
 * ReturnData
 */
@JsonPropertyOrder({
  ReturnData.JSON_PROPERTY_T_Y_P_E
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
@JsonIgnoreProperties(
  value = "_TYPE", // ignore manually set _TYPE, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the _TYPE to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "_TYPE", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CardData.class, name = "cardData"),
  @JsonSubTypes.Type(value = IbanData.class, name = "ibanData"),
  @JsonSubTypes.Type(value = PhoneData.class, name = "phoneData"),
  @JsonSubTypes.Type(value = WalletData.class, name = "walletData"),
})

public class ReturnData {
  public static final String JSON_PROPERTY_T_Y_P_E = "_TYPE";
  private ReturnDataType _TYPE;

  public ReturnData() { 
  }

  public ReturnData _TYPE(ReturnDataType _TYPE) {
    this._TYPE = _TYPE;
    return this;
  }

   /**
   * Get _TYPE
   * @return _TYPE
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_T_Y_P_E)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ReturnDataType getTYPE() {
    return _TYPE;
  }


  @JsonProperty(JSON_PROPERTY_T_Y_P_E)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTYPE(ReturnDataType _TYPE) {
    this._TYPE = _TYPE;
  }


  /**
   * Return true if this ReturnData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnData returnData = (ReturnData) o;
    return Objects.equals(this._TYPE, returnData._TYPE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_TYPE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnData {\n");
    sb.append("    _TYPE: ").append(toIndentedString(_TYPE)).append("\n");
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
  mappings.put("cardData", CardData.class);
  mappings.put("ibanData", IbanData.class);
  mappings.put("phoneData", PhoneData.class);
  mappings.put("walletData", WalletData.class);
  mappings.put("ReturnData", ReturnData.class);
  JSON.registerDiscriminator(ReturnData.class, "_TYPE", mappings);
}
}

