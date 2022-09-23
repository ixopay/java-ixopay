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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IbanDataAllOf
 */
@JsonPropertyOrder({
  IbanDataAllOf.JSON_PROPERTY_ACCOUNT_OWNER,
  IbanDataAllOf.JSON_PROPERTY_IBAN,
  IbanDataAllOf.JSON_PROPERTY_BIC,
  IbanDataAllOf.JSON_PROPERTY_MANDATE_ID,
  IbanDataAllOf.JSON_PROPERTY_MANDATE_DATE,
  IbanDataAllOf.JSON_PROPERTY_BANK_NAME,
  IbanDataAllOf.JSON_PROPERTY_BANK_BRANCH_NAME,
  IbanDataAllOf.JSON_PROPERTY_COUNTRY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IbanDataAllOf {
  public static final String JSON_PROPERTY_ACCOUNT_OWNER = "accountOwner";
  private String accountOwner;

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_BIC = "bic";
  private String bic;

  public static final String JSON_PROPERTY_MANDATE_ID = "mandateId";
  private String mandateId;

  public static final String JSON_PROPERTY_MANDATE_DATE = "mandateDate";
  private LocalDate mandateDate;

  public static final String JSON_PROPERTY_BANK_NAME = "bankName";
  private String bankName;

  public static final String JSON_PROPERTY_BANK_BRANCH_NAME = "bankBranchName";
  private String bankBranchName;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public IbanDataAllOf() { 
  }

  public IbanDataAllOf accountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Get accountOwner
   * @return accountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountOwner() {
    return accountOwner;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }


  public IbanDataAllOf iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(String iban) {
    this.iban = iban;
  }


  public IbanDataAllOf bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }


  public IbanDataAllOf mandateId(String mandateId) {
    this.mandateId = mandateId;
    return this;
  }

   /**
   * Get mandateId
   * @return mandateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMandateId() {
    return mandateId;
  }


  @JsonProperty(JSON_PROPERTY_MANDATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandateId(String mandateId) {
    this.mandateId = mandateId;
  }


  public IbanDataAllOf mandateDate(LocalDate mandateDate) {
    this.mandateDate = mandateDate;
    return this;
  }

   /**
   * Get mandateDate
   * @return mandateDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMandateDate() {
    return mandateDate;
  }


  @JsonProperty(JSON_PROPERTY_MANDATE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandateDate(LocalDate mandateDate) {
    this.mandateDate = mandateDate;
  }


  public IbanDataAllOf bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankName() {
    return bankName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public IbanDataAllOf bankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
    return this;
  }

   /**
   * Get bankBranchName
   * @return bankBranchName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BANK_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankBranchName() {
    return bankBranchName;
  }


  @JsonProperty(JSON_PROPERTY_BANK_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
  }


  public IbanDataAllOf country(String country) {
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


  /**
   * Return true if this ibanData_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbanDataAllOf ibanDataAllOf = (IbanDataAllOf) o;
    return Objects.equals(this.accountOwner, ibanDataAllOf.accountOwner) &&
        Objects.equals(this.iban, ibanDataAllOf.iban) &&
        Objects.equals(this.bic, ibanDataAllOf.bic) &&
        Objects.equals(this.mandateId, ibanDataAllOf.mandateId) &&
        Objects.equals(this.mandateDate, ibanDataAllOf.mandateDate) &&
        Objects.equals(this.bankName, ibanDataAllOf.bankName) &&
        Objects.equals(this.bankBranchName, ibanDataAllOf.bankBranchName) &&
        Objects.equals(this.country, ibanDataAllOf.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountOwner, iban, bic, mandateId, mandateDate, bankName, bankBranchName, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbanDataAllOf {\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    mandateDate: ").append(toIndentedString(mandateDate)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBranchName: ").append(toIndentedString(bankBranchName)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
