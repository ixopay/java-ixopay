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
import com.ixopay.client.core.model.PaymentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomerData
 */
@JsonPropertyOrder({
  CustomerData.JSON_PROPERTY_IDENTIFICATION,
  CustomerData.JSON_PROPERTY_FIRST_NAME,
  CustomerData.JSON_PROPERTY_LAST_NAME,
  CustomerData.JSON_PROPERTY_BIRTH_DATE,
  CustomerData.JSON_PROPERTY_GENDER,
  CustomerData.JSON_PROPERTY_BILLING_ADDRESS1,
  CustomerData.JSON_PROPERTY_BILLING_ADDRESS2,
  CustomerData.JSON_PROPERTY_BILLING_CITY,
  CustomerData.JSON_PROPERTY_BILLING_POSTCODE,
  CustomerData.JSON_PROPERTY_BILLING_STATE,
  CustomerData.JSON_PROPERTY_BILLING_COUNTRY,
  CustomerData.JSON_PROPERTY_BILLING_PHONE,
  CustomerData.JSON_PROPERTY_SHIPPING_FIRST_NAME,
  CustomerData.JSON_PROPERTY_SHIPPING_LAST_NAME,
  CustomerData.JSON_PROPERTY_SHIPPING_COMPANY,
  CustomerData.JSON_PROPERTY_SHIPPING_ADDRESS1,
  CustomerData.JSON_PROPERTY_SHIPPING_ADDRESS2,
  CustomerData.JSON_PROPERTY_SHIPPING_CITY,
  CustomerData.JSON_PROPERTY_SHIPPING_POSTCODE,
  CustomerData.JSON_PROPERTY_SHIPPING_STATE,
  CustomerData.JSON_PROPERTY_SHIPPING_COUNTRY,
  CustomerData.JSON_PROPERTY_SHIPPING_PHONE,
  CustomerData.JSON_PROPERTY_COMPANY,
  CustomerData.JSON_PROPERTY_EMAIL,
  CustomerData.JSON_PROPERTY_EMAIL_VERIFIED,
  CustomerData.JSON_PROPERTY_IP_ADDRESS,
  CustomerData.JSON_PROPERTY_NATIONAL_ID,
  CustomerData.JSON_PROPERTY_EXTRA_DATA,
  CustomerData.JSON_PROPERTY_PAYMENT_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegenWithComposedSchema")
public class CustomerData {
  public static final String JSON_PROPERTY_IDENTIFICATION = "identification";
  private String identification;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_BIRTH_DATE = "birthDate";
  private LocalDate birthDate;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    M("M"),
    
    F("F"),
    
    UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return UNKNOWN_DEFAULT_OPEN_API;
    }
  }

  public static final String JSON_PROPERTY_GENDER = "gender";
  private GenderEnum gender;

  public static final String JSON_PROPERTY_BILLING_ADDRESS1 = "billingAddress1";
  private String billingAddress1;

  public static final String JSON_PROPERTY_BILLING_ADDRESS2 = "billingAddress2";
  private String billingAddress2;

  public static final String JSON_PROPERTY_BILLING_CITY = "billingCity";
  private String billingCity;

  public static final String JSON_PROPERTY_BILLING_POSTCODE = "billingPostcode";
  private String billingPostcode;

  public static final String JSON_PROPERTY_BILLING_STATE = "billingState";
  private String billingState;

  public static final String JSON_PROPERTY_BILLING_COUNTRY = "billingCountry";
  private String billingCountry;

  public static final String JSON_PROPERTY_BILLING_PHONE = "billingPhone";
  private String billingPhone;

  public static final String JSON_PROPERTY_SHIPPING_FIRST_NAME = "shippingFirstName";
  private String shippingFirstName;

  public static final String JSON_PROPERTY_SHIPPING_LAST_NAME = "shippingLastName";
  private String shippingLastName;

  public static final String JSON_PROPERTY_SHIPPING_COMPANY = "shippingCompany";
  private String shippingCompany;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS1 = "shippingAddress1";
  private String shippingAddress1;

  public static final String JSON_PROPERTY_SHIPPING_ADDRESS2 = "shippingAddress2";
  private String shippingAddress2;

  public static final String JSON_PROPERTY_SHIPPING_CITY = "shippingCity";
  private String shippingCity;

  public static final String JSON_PROPERTY_SHIPPING_POSTCODE = "shippingPostcode";
  private String shippingPostcode;

  public static final String JSON_PROPERTY_SHIPPING_STATE = "shippingState";
  private String shippingState;

  public static final String JSON_PROPERTY_SHIPPING_COUNTRY = "shippingCountry";
  private String shippingCountry;

  public static final String JSON_PROPERTY_SHIPPING_PHONE = "shippingPhone";
  private String shippingPhone;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_EMAIL_VERIFIED = "emailVerified";
  private Boolean emailVerified;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_NATIONAL_ID = "nationalId";
  private String nationalId;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private PaymentData paymentData;

  public CustomerData() { 
  }

  public CustomerData identification(String identification) {
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


  public CustomerData firstName(String firstName) {
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


  public CustomerData lastName(String lastName) {
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


  public CustomerData birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getBirthDate() {
    return birthDate;
  }


  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public CustomerData gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GenderEnum getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  public CustomerData billingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
    return this;
  }

   /**
   * Get billingAddress1
   * @return billingAddress1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingAddress1() {
    return billingAddress1;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress1(String billingAddress1) {
    this.billingAddress1 = billingAddress1;
  }


  public CustomerData billingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
    return this;
  }

   /**
   * Get billingAddress2
   * @return billingAddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingAddress2() {
    return billingAddress2;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress2(String billingAddress2) {
    this.billingAddress2 = billingAddress2;
  }


  public CustomerData billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * Get billingCity
   * @return billingCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCity() {
    return billingCity;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }


  public CustomerData billingPostcode(String billingPostcode) {
    this.billingPostcode = billingPostcode;
    return this;
  }

   /**
   * Get billingPostcode
   * @return billingPostcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingPostcode() {
    return billingPostcode;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingPostcode(String billingPostcode) {
    this.billingPostcode = billingPostcode;
  }


  public CustomerData billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * Get billingState
   * @return billingState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingState() {
    return billingState;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }


  public CustomerData billingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
    return this;
  }

   /**
   * Get billingCountry
   * @return billingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingCountry() {
    return billingCountry;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingCountry(String billingCountry) {
    this.billingCountry = billingCountry;
  }


  public CustomerData billingPhone(String billingPhone) {
    this.billingPhone = billingPhone;
    return this;
  }

   /**
   * Get billingPhone
   * @return billingPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingPhone() {
    return billingPhone;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingPhone(String billingPhone) {
    this.billingPhone = billingPhone;
  }


  public CustomerData shippingFirstName(String shippingFirstName) {
    this.shippingFirstName = shippingFirstName;
    return this;
  }

   /**
   * Get shippingFirstName
   * @return shippingFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingFirstName() {
    return shippingFirstName;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingFirstName(String shippingFirstName) {
    this.shippingFirstName = shippingFirstName;
  }


  public CustomerData shippingLastName(String shippingLastName) {
    this.shippingLastName = shippingLastName;
    return this;
  }

   /**
   * Get shippingLastName
   * @return shippingLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingLastName() {
    return shippingLastName;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingLastName(String shippingLastName) {
    this.shippingLastName = shippingLastName;
  }


  public CustomerData shippingCompany(String shippingCompany) {
    this.shippingCompany = shippingCompany;
    return this;
  }

   /**
   * Get shippingCompany
   * @return shippingCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingCompany() {
    return shippingCompany;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingCompany(String shippingCompany) {
    this.shippingCompany = shippingCompany;
  }


  public CustomerData shippingAddress1(String shippingAddress1) {
    this.shippingAddress1 = shippingAddress1;
    return this;
  }

   /**
   * Get shippingAddress1
   * @return shippingAddress1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingAddress1() {
    return shippingAddress1;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress1(String shippingAddress1) {
    this.shippingAddress1 = shippingAddress1;
  }


  public CustomerData shippingAddress2(String shippingAddress2) {
    this.shippingAddress2 = shippingAddress2;
    return this;
  }

   /**
   * Get shippingAddress2
   * @return shippingAddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingAddress2() {
    return shippingAddress2;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_ADDRESS2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingAddress2(String shippingAddress2) {
    this.shippingAddress2 = shippingAddress2;
  }


  public CustomerData shippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
    return this;
  }

   /**
   * Get shippingCity
   * @return shippingCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingCity() {
    return shippingCity;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingCity(String shippingCity) {
    this.shippingCity = shippingCity;
  }


  public CustomerData shippingPostcode(String shippingPostcode) {
    this.shippingPostcode = shippingPostcode;
    return this;
  }

   /**
   * Get shippingPostcode
   * @return shippingPostcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingPostcode() {
    return shippingPostcode;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_POSTCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingPostcode(String shippingPostcode) {
    this.shippingPostcode = shippingPostcode;
  }


  public CustomerData shippingState(String shippingState) {
    this.shippingState = shippingState;
    return this;
  }

   /**
   * Get shippingState
   * @return shippingState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingState() {
    return shippingState;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingState(String shippingState) {
    this.shippingState = shippingState;
  }


  public CustomerData shippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
    return this;
  }

   /**
   * Get shippingCountry
   * @return shippingCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingCountry() {
    return shippingCountry;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingCountry(String shippingCountry) {
    this.shippingCountry = shippingCountry;
  }


  public CustomerData shippingPhone(String shippingPhone) {
    this.shippingPhone = shippingPhone;
    return this;
  }

   /**
   * Get shippingPhone
   * @return shippingPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShippingPhone() {
    return shippingPhone;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingPhone(String shippingPhone) {
    this.shippingPhone = shippingPhone;
  }


  public CustomerData company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public CustomerData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerData emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * Get emailVerified
   * @return emailVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmailVerified() {
    return emailVerified;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  public CustomerData ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public CustomerData nationalId(String nationalId) {
    this.nationalId = nationalId;
    return this;
  }

   /**
   * Get nationalId
   * @return nationalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNationalId() {
    return nationalId;
  }


  @JsonProperty(JSON_PROPERTY_NATIONAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }


  public CustomerData extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public CustomerData putExtraDataItem(String key, String extraDataItem) {
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


  public CustomerData paymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Get paymentData
   * @return paymentData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentData getPaymentData() {
    return paymentData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(PaymentData paymentData) {
    this.paymentData = paymentData;
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
  public CustomerData putAdditionalProperty(String key, Object value) {
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
   * Return true if this CustomerData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerData customerData = (CustomerData) o;
    return Objects.equals(this.identification, customerData.identification) &&
        Objects.equals(this.firstName, customerData.firstName) &&
        Objects.equals(this.lastName, customerData.lastName) &&
        Objects.equals(this.birthDate, customerData.birthDate) &&
        Objects.equals(this.gender, customerData.gender) &&
        Objects.equals(this.billingAddress1, customerData.billingAddress1) &&
        Objects.equals(this.billingAddress2, customerData.billingAddress2) &&
        Objects.equals(this.billingCity, customerData.billingCity) &&
        Objects.equals(this.billingPostcode, customerData.billingPostcode) &&
        Objects.equals(this.billingState, customerData.billingState) &&
        Objects.equals(this.billingCountry, customerData.billingCountry) &&
        Objects.equals(this.billingPhone, customerData.billingPhone) &&
        Objects.equals(this.shippingFirstName, customerData.shippingFirstName) &&
        Objects.equals(this.shippingLastName, customerData.shippingLastName) &&
        Objects.equals(this.shippingCompany, customerData.shippingCompany) &&
        Objects.equals(this.shippingAddress1, customerData.shippingAddress1) &&
        Objects.equals(this.shippingAddress2, customerData.shippingAddress2) &&
        Objects.equals(this.shippingCity, customerData.shippingCity) &&
        Objects.equals(this.shippingPostcode, customerData.shippingPostcode) &&
        Objects.equals(this.shippingState, customerData.shippingState) &&
        Objects.equals(this.shippingCountry, customerData.shippingCountry) &&
        Objects.equals(this.shippingPhone, customerData.shippingPhone) &&
        Objects.equals(this.company, customerData.company) &&
        Objects.equals(this.email, customerData.email) &&
        Objects.equals(this.emailVerified, customerData.emailVerified) &&
        Objects.equals(this.ipAddress, customerData.ipAddress) &&
        Objects.equals(this.nationalId, customerData.nationalId) &&
        Objects.equals(this.extraData, customerData.extraData) &&
        Objects.equals(this.paymentData, customerData.paymentData)&&
        Objects.equals(this.additionalProperties, customerData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, firstName, lastName, birthDate, gender, billingAddress1, billingAddress2, billingCity, billingPostcode, billingState, billingCountry, billingPhone, shippingFirstName, shippingLastName, shippingCompany, shippingAddress1, shippingAddress2, shippingCity, shippingPostcode, shippingState, shippingCountry, shippingPhone, company, email, emailVerified, ipAddress, nationalId, extraData, paymentData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerData {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    billingAddress1: ").append(toIndentedString(billingAddress1)).append("\n");
    sb.append("    billingAddress2: ").append(toIndentedString(billingAddress2)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingPostcode: ").append(toIndentedString(billingPostcode)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingCountry: ").append(toIndentedString(billingCountry)).append("\n");
    sb.append("    billingPhone: ").append(toIndentedString(billingPhone)).append("\n");
    sb.append("    shippingFirstName: ").append(toIndentedString(shippingFirstName)).append("\n");
    sb.append("    shippingLastName: ").append(toIndentedString(shippingLastName)).append("\n");
    sb.append("    shippingCompany: ").append(toIndentedString(shippingCompany)).append("\n");
    sb.append("    shippingAddress1: ").append(toIndentedString(shippingAddress1)).append("\n");
    sb.append("    shippingAddress2: ").append(toIndentedString(shippingAddress2)).append("\n");
    sb.append("    shippingCity: ").append(toIndentedString(shippingCity)).append("\n");
    sb.append("    shippingPostcode: ").append(toIndentedString(shippingPostcode)).append("\n");
    sb.append("    shippingState: ").append(toIndentedString(shippingState)).append("\n");
    sb.append("    shippingCountry: ").append(toIndentedString(shippingCountry)).append("\n");
    sb.append("    shippingPhone: ").append(toIndentedString(shippingPhone)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    nationalId: ").append(toIndentedString(nationalId)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
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

