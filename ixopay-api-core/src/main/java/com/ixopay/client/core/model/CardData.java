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
import com.ixopay.client.core.model.ReturnData;
import com.ixopay.client.core.model.ReturnDataType;
import com.ixopay.client.core.model.ThreeDSecureType;
import com.ixopay.client.core.model.WalletData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ixopay.client.core.client.JSON;
/**
 * CardData
 */
@JsonPropertyOrder({
  CardData.JSON_PROPERTY_TYPE,
  CardData.JSON_PROPERTY_FIRST_NAME,
  CardData.JSON_PROPERTY_LAST_NAME,
  CardData.JSON_PROPERTY_COUNTRY,
  CardData.JSON_PROPERTY_CARD_HOLDER,
  CardData.JSON_PROPERTY_EXPIRY_MONTH,
  CardData.JSON_PROPERTY_EXPIRY_YEAR,
  CardData.JSON_PROPERTY_BIN_DIGITS,
  CardData.JSON_PROPERTY_FIRST_SIX_DIGITS,
  CardData.JSON_PROPERTY_LAST_FOUR_DIGITS,
  CardData.JSON_PROPERTY_FINGERPRINT,
  CardData.JSON_PROPERTY_BIN_BRAND,
  CardData.JSON_PROPERTY_BIN_BANK,
  CardData.JSON_PROPERTY_BIN_TYPE,
  CardData.JSON_PROPERTY_BIN_LEVEL,
  CardData.JSON_PROPERTY_BIN_COUNTRY,
  CardData.JSON_PROPERTY_THREE_D_SECURE,
  CardData.JSON_PROPERTY_ECI
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

public class CardData extends ReturnData {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_CARD_HOLDER = "cardHolder";
  private String cardHolder;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private String expiryMonth;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private String expiryYear;

  public static final String JSON_PROPERTY_BIN_DIGITS = "binDigits";
  private String binDigits;

  public static final String JSON_PROPERTY_FIRST_SIX_DIGITS = "firstSixDigits";
  private String firstSixDigits;

  public static final String JSON_PROPERTY_LAST_FOUR_DIGITS = "lastFourDigits";
  private String lastFourDigits;

  public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
  private String fingerprint;

  public static final String JSON_PROPERTY_BIN_BRAND = "binBrand";
  private String binBrand;

  public static final String JSON_PROPERTY_BIN_BANK = "binBank";
  private String binBank;

  public static final String JSON_PROPERTY_BIN_TYPE = "binType";
  private String binType;

  public static final String JSON_PROPERTY_BIN_LEVEL = "binLevel";
  private String binLevel;

  public static final String JSON_PROPERTY_BIN_COUNTRY = "binCountry";
  private String binCountry;

  public static final String JSON_PROPERTY_THREE_D_SECURE = "threeDSecure";
  private ThreeDSecureType threeDSecure;

  public static final String JSON_PROPERTY_ECI = "eci";
  private String eci;

  public CardData() { 
  }

  public CardData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public CardData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public CardData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public CardData country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public CardData cardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

   /**
   * Get cardHolder
   * @return cardHolder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardHolder() {
    return cardHolder;
  }


  @JsonProperty(JSON_PROPERTY_CARD_HOLDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }


  public CardData expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * Get expiryMonth
   * @return expiryMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryMonth() {
    return expiryMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public CardData expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * Get expiryYear
   * @return expiryYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryYear() {
    return expiryYear;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public CardData binDigits(String binDigits) {
    this.binDigits = binDigits;
    return this;
  }

   /**
   * Get binDigits
   * @return binDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinDigits() {
    return binDigits;
  }


  @JsonProperty(JSON_PROPERTY_BIN_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinDigits(String binDigits) {
    this.binDigits = binDigits;
  }


  public CardData firstSixDigits(String firstSixDigits) {
    this.firstSixDigits = firstSixDigits;
    return this;
  }

   /**
   * Get firstSixDigits
   * @return firstSixDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_SIX_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstSixDigits() {
    return firstSixDigits;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_SIX_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstSixDigits(String firstSixDigits) {
    this.firstSixDigits = firstSixDigits;
  }


  public CardData lastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
    return this;
  }

   /**
   * Get lastFourDigits
   * @return lastFourDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_FOUR_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastFourDigits() {
    return lastFourDigits;
  }


  @JsonProperty(JSON_PROPERTY_LAST_FOUR_DIGITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastFourDigits(String lastFourDigits) {
    this.lastFourDigits = lastFourDigits;
  }


  public CardData fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFingerprint() {
    return fingerprint;
  }


  @JsonProperty(JSON_PROPERTY_FINGERPRINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  public CardData binBrand(String binBrand) {
    this.binBrand = binBrand;
    return this;
  }

   /**
   * Get binBrand
   * @return binBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinBrand() {
    return binBrand;
  }


  @JsonProperty(JSON_PROPERTY_BIN_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinBrand(String binBrand) {
    this.binBrand = binBrand;
  }


  public CardData binBank(String binBank) {
    this.binBank = binBank;
    return this;
  }

   /**
   * Get binBank
   * @return binBank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinBank() {
    return binBank;
  }


  @JsonProperty(JSON_PROPERTY_BIN_BANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinBank(String binBank) {
    this.binBank = binBank;
  }


  public CardData binType(String binType) {
    this.binType = binType;
    return this;
  }

   /**
   * Get binType
   * @return binType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinType() {
    return binType;
  }


  @JsonProperty(JSON_PROPERTY_BIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinType(String binType) {
    this.binType = binType;
  }


  public CardData binLevel(String binLevel) {
    this.binLevel = binLevel;
    return this;
  }

   /**
   * Get binLevel
   * @return binLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinLevel() {
    return binLevel;
  }


  @JsonProperty(JSON_PROPERTY_BIN_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinLevel(String binLevel) {
    this.binLevel = binLevel;
  }


  public CardData binCountry(String binCountry) {
    this.binCountry = binCountry;
    return this;
  }

   /**
   * Get binCountry
   * @return binCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinCountry() {
    return binCountry;
  }


  @JsonProperty(JSON_PROPERTY_BIN_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinCountry(String binCountry) {
    this.binCountry = binCountry;
  }


  public CardData threeDSecure(ThreeDSecureType threeDSecure) {
    this.threeDSecure = threeDSecure;
    return this;
  }

   /**
   * Get threeDSecure
   * @return threeDSecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ThreeDSecureType getThreeDSecure() {
    return threeDSecure;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecure(ThreeDSecureType threeDSecure) {
    this.threeDSecure = threeDSecure;
  }


  public CardData eci(String eci) {
    this.eci = eci;
    return this;
  }

   /**
   * Get eci
   * @return eci
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEci() {
    return eci;
  }


  @JsonProperty(JSON_PROPERTY_ECI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEci(String eci) {
    this.eci = eci;
  }


  /**
   * Return true if this cardData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardData cardData = (CardData) o;
    return Objects.equals(this.type, cardData.type) &&
        Objects.equals(this.firstName, cardData.firstName) &&
        Objects.equals(this.lastName, cardData.lastName) &&
        Objects.equals(this.country, cardData.country) &&
        Objects.equals(this.cardHolder, cardData.cardHolder) &&
        Objects.equals(this.expiryMonth, cardData.expiryMonth) &&
        Objects.equals(this.expiryYear, cardData.expiryYear) &&
        Objects.equals(this.binDigits, cardData.binDigits) &&
        Objects.equals(this.firstSixDigits, cardData.firstSixDigits) &&
        Objects.equals(this.lastFourDigits, cardData.lastFourDigits) &&
        Objects.equals(this.fingerprint, cardData.fingerprint) &&
        Objects.equals(this.binBrand, cardData.binBrand) &&
        Objects.equals(this.binBank, cardData.binBank) &&
        Objects.equals(this.binType, cardData.binType) &&
        Objects.equals(this.binLevel, cardData.binLevel) &&
        Objects.equals(this.binCountry, cardData.binCountry) &&
        Objects.equals(this.threeDSecure, cardData.threeDSecure) &&
        Objects.equals(this.eci, cardData.eci) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, firstName, lastName, country, cardHolder, expiryMonth, expiryYear, binDigits, firstSixDigits, lastFourDigits, fingerprint, binBrand, binBank, binType, binLevel, binCountry, threeDSecure, eci, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardData {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    binDigits: ").append(toIndentedString(binDigits)).append("\n");
    sb.append("    firstSixDigits: ").append(toIndentedString(firstSixDigits)).append("\n");
    sb.append("    lastFourDigits: ").append(toIndentedString(lastFourDigits)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    binBrand: ").append(toIndentedString(binBrand)).append("\n");
    sb.append("    binBank: ").append(toIndentedString(binBank)).append("\n");
    sb.append("    binType: ").append(toIndentedString(binType)).append("\n");
    sb.append("    binLevel: ").append(toIndentedString(binLevel)).append("\n");
    sb.append("    binCountry: ").append(toIndentedString(binCountry)).append("\n");
    sb.append("    threeDSecure: ").append(toIndentedString(threeDSecure)).append("\n");
    sb.append("    eci: ").append(toIndentedString(eci)).append("\n");
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
  mappings.put("cardData", CardData.class);
  JSON.registerDiscriminator(CardData.class, "_TYPE", mappings);
}
}

