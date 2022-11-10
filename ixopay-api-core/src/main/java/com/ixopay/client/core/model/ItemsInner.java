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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ItemsInner
 */
@JsonPropertyOrder({
  ItemsInner.JSON_PROPERTY_IDENTIFICATION,
  ItemsInner.JSON_PROPERTY_NAME,
  ItemsInner.JSON_PROPERTY_DESCRIPTION,
  ItemsInner.JSON_PROPERTY_QUANTITY,
  ItemsInner.JSON_PROPERTY_PRICE,
  ItemsInner.JSON_PROPERTY_CURRENCY,
  ItemsInner.JSON_PROPERTY_UNIT,
  ItemsInner.JSON_PROPERTY_UNIT_PRICE,
  ItemsInner.JSON_PROPERTY_DISCOUNT,
  ItemsInner.JSON_PROPERTY_SHIPPING_AMOUNT,
  ItemsInner.JSON_PROPERTY_TAX_AMOUNT,
  ItemsInner.JSON_PROPERTY_TAX_RATE,
  ItemsInner.JSON_PROPERTY_COMMODITY_CODE,
  ItemsInner.JSON_PROPERTY_EXTRA_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemsInner {
  public static final String JSON_PROPERTY_IDENTIFICATION = "identification";
  private String identification;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private BigDecimal quantity;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public static final String JSON_PROPERTY_UNIT_PRICE = "unitPrice";
  private String unitPrice;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private String discount;

  public static final String JSON_PROPERTY_SHIPPING_AMOUNT = "shippingAmount";
  private String shippingAmount;

  public static final String JSON_PROPERTY_TAX_AMOUNT = "taxAmount";
  private String taxAmount;

  public static final String JSON_PROPERTY_TAX_RATE = "taxRate";
  private String taxRate;

  public static final String JSON_PROPERTY_COMMODITY_CODE = "commodityCode";
  private String commodityCode;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;

  public ItemsInner() { 
  }

  public ItemsInner identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentification() {
    return identification;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentification(String identification) {
    this.identification = identification;
  }


  public ItemsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ItemsInner description(String description) {
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


  public ItemsInner quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public ItemsInner price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ItemsInner currency(String currency) {
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


  public ItemsInner unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  public ItemsInner unitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Get unitPrice
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnitPrice() {
    return unitPrice;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitPrice(String unitPrice) {
    this.unitPrice = unitPrice;
  }


  public ItemsInner discount(String discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public ItemsInner shippingAmount(String shippingAmount) {
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * Get shippingAmount
   * @return shippingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingAmount() {
    return shippingAmount;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAmount(String shippingAmount) {
    this.shippingAmount = shippingAmount;
  }


  public ItemsInner taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxAmount() {
    return taxAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }


  public ItemsInner taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxRate() {
    return taxRate;
  }


  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }


  public ItemsInner commodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * Get commodityCode
   * @return commodityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMODITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommodityCode() {
    return commodityCode;
  }


  @JsonProperty(JSON_PROPERTY_COMMODITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommodityCode(String commodityCode) {
    this.commodityCode = commodityCode;
  }


  public ItemsInner extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public ItemsInner putExtraDataItem(String key, String extraDataItem) {
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


  /**
   * Return true if this Items_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsInner itemsInner = (ItemsInner) o;
    return Objects.equals(this.identification, itemsInner.identification) &&
        Objects.equals(this.name, itemsInner.name) &&
        Objects.equals(this.description, itemsInner.description) &&
        Objects.equals(this.quantity, itemsInner.quantity) &&
        Objects.equals(this.price, itemsInner.price) &&
        Objects.equals(this.currency, itemsInner.currency) &&
        Objects.equals(this.unit, itemsInner.unit) &&
        Objects.equals(this.unitPrice, itemsInner.unitPrice) &&
        Objects.equals(this.discount, itemsInner.discount) &&
        Objects.equals(this.shippingAmount, itemsInner.shippingAmount) &&
        Objects.equals(this.taxAmount, itemsInner.taxAmount) &&
        Objects.equals(this.taxRate, itemsInner.taxRate) &&
        Objects.equals(this.commodityCode, itemsInner.commodityCode) &&
        Objects.equals(this.extraData, itemsInner.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, description, quantity, price, currency, unit, unitPrice, discount, shippingAmount, taxAmount, taxRate, commodityCode, extraData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsInner {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
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

