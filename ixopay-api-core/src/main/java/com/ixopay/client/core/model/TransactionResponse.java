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
import com.ixopay.client.core.model.CustomerProfileData;
import com.ixopay.client.core.model.ErrorType;
import com.ixopay.client.core.model.MaybeTransactionResponse;
import com.ixopay.client.core.model.ReturnData;
import com.ixopay.client.core.model.ScheduleData;
import com.ixopay.client.core.model.TransactionErrorResponse;
import com.ixopay.client.core.model.TransactionResponse;
import com.ixopay.client.core.model.TransactionResponseAllOfDccData;
import com.ixopay.client.core.model.TransactionResponseAllOfRiskCheckData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ixopay.client.core.client.JSON;
/**
 * TransactionResponse
 */
@JsonPropertyOrder({
  TransactionResponse.JSON_PROPERTY_SUCCESS,
  TransactionResponse.JSON_PROPERTY_UUID,
  TransactionResponse.JSON_PROPERTY_PURCHASE_ID,
  TransactionResponse.JSON_PROPERTY_RETURN_TYPE,
  TransactionResponse.JSON_PROPERTY_REDIRECT_TYPE,
  TransactionResponse.JSON_PROPERTY_REDIRECT_URL,
  TransactionResponse.JSON_PROPERTY_REDIRECT_Q_R_CODE,
  TransactionResponse.JSON_PROPERTY_HTML_CONTENT,
  TransactionResponse.JSON_PROPERTY_PAYMENT_DESCRIPTOR,
  TransactionResponse.JSON_PROPERTY_PAYMENT_METHOD,
  TransactionResponse.JSON_PROPERTY_RETURN_DATA,
  TransactionResponse.JSON_PROPERTY_SCHEDULE_DATA,
  TransactionResponse.JSON_PROPERTY_CUSTOMER_PROFILE_DATA,
  TransactionResponse.JSON_PROPERTY_RISK_CHECK_DATA,
  TransactionResponse.JSON_PROPERTY_ERRORS,
  TransactionResponse.JSON_PROPERTY_ADAPTER_MESSAGE,
  TransactionResponse.JSON_PROPERTY_ADAPTER_CODE,
  TransactionResponse.JSON_PROPERTY_EXTRA_DATA,
  TransactionResponse.JSON_PROPERTY_DCC_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonIgnoreProperties(
  value = "success", // ignore manually set success, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the success to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "success", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = TransactionErrorResponse.class, name = "false"),
  @JsonSubTypes.Type(value = TransactionResponse.class, name = "true"),
})

public class TransactionResponse extends MaybeTransactionResponse {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_UUID = "uuid";
  private String uuid;

  public static final String JSON_PROPERTY_PURCHASE_ID = "purchaseId";
  private String purchaseId;

  /**
   * Gets or Sets returnType
   */
  public enum ReturnTypeEnum {
    FINISHED("FINISHED"),
    
    REDIRECT("REDIRECT"),
    
    HTML("HTML"),
    
    PENDING("PENDING"),
    
    ERROR("ERROR"),
    
    PENDING_DCC("PENDING_DCC");

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

  /**
   * Gets or Sets redirectType
   */
  public enum RedirectTypeEnum {
    IFRAME("iframe"),
    
    FULLPAGE("fullpage"),
    
    _3DS("3ds");

    private String value;

    RedirectTypeEnum(String value) {
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
    public static RedirectTypeEnum fromValue(String value) {
      for (RedirectTypeEnum b : RedirectTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REDIRECT_TYPE = "redirectType";
  private RedirectTypeEnum redirectType;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private URI redirectUrl;

  public static final String JSON_PROPERTY_REDIRECT_Q_R_CODE = "redirectQRCode";
  private String redirectQRCode;

  public static final String JSON_PROPERTY_HTML_CONTENT = "htmlContent";
  private String htmlContent;

  public static final String JSON_PROPERTY_PAYMENT_DESCRIPTOR = "paymentDescriptor";
  private String paymentDescriptor;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private String paymentMethod;

  public static final String JSON_PROPERTY_RETURN_DATA = "returnData";
  private ReturnData returnData;

  public static final String JSON_PROPERTY_SCHEDULE_DATA = "scheduleData";
  private ScheduleData scheduleData;

  public static final String JSON_PROPERTY_CUSTOMER_PROFILE_DATA = "customerProfileData";
  private CustomerProfileData customerProfileData;

  public static final String JSON_PROPERTY_RISK_CHECK_DATA = "riskCheckData";
  private TransactionResponseAllOfRiskCheckData riskCheckData;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ErrorType> errors = null;

  public static final String JSON_PROPERTY_ADAPTER_MESSAGE = "adapterMessage";
  private String adapterMessage;

  public static final String JSON_PROPERTY_ADAPTER_CODE = "adapterCode";
  private String adapterCode;

  public static final String JSON_PROPERTY_EXTRA_DATA = "extraData";
  private Map<String, String> extraData = null;

  public static final String JSON_PROPERTY_DCC_DATA = "dccData";
  private TransactionResponseAllOfDccData dccData;

  public TransactionResponse() { 
  }

  public TransactionResponse success(Boolean success) {
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


  public TransactionResponse uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public TransactionResponse purchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
    return this;
  }

   /**
   * Get purchaseId
   * @return purchaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurchaseId() {
    return purchaseId;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurchaseId(String purchaseId) {
    this.purchaseId = purchaseId;
  }


  public TransactionResponse returnType(ReturnTypeEnum returnType) {
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


  public TransactionResponse redirectType(RedirectTypeEnum redirectType) {
    this.redirectType = redirectType;
    return this;
  }

   /**
   * Get redirectType
   * @return redirectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REDIRECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RedirectTypeEnum getRedirectType() {
    return redirectType;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectType(RedirectTypeEnum redirectType) {
    this.redirectType = redirectType;
  }


  public TransactionResponse redirectUrl(URI redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getRedirectUrl() {
    return redirectUrl;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectUrl(URI redirectUrl) {
    this.redirectUrl = redirectUrl;
  }


  public TransactionResponse redirectQRCode(String redirectQRCode) {
    this.redirectQRCode = redirectQRCode;
    return this;
  }

   /**
   * DataUrl
   * @return redirectQRCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DataUrl")
  @JsonProperty(JSON_PROPERTY_REDIRECT_Q_R_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRedirectQRCode() {
    return redirectQRCode;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT_Q_R_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRedirectQRCode(String redirectQRCode) {
    this.redirectQRCode = redirectQRCode;
  }


  public TransactionResponse htmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * Get htmlContent
   * @return htmlContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtmlContent() {
    return htmlContent;
  }


  @JsonProperty(JSON_PROPERTY_HTML_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHtmlContent(String htmlContent) {
    this.htmlContent = htmlContent;
  }


  public TransactionResponse paymentDescriptor(String paymentDescriptor) {
    this.paymentDescriptor = paymentDescriptor;
    return this;
  }

   /**
   * Get paymentDescriptor
   * @return paymentDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentDescriptor() {
    return paymentDescriptor;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DESCRIPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentDescriptor(String paymentDescriptor) {
    this.paymentDescriptor = paymentDescriptor;
  }


  public TransactionResponse paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public TransactionResponse returnData(ReturnData returnData) {
    this.returnData = returnData;
    return this;
  }

   /**
   * Get returnData
   * @return returnData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReturnData getReturnData() {
    return returnData;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnData(ReturnData returnData) {
    this.returnData = returnData;
  }


  public TransactionResponse scheduleData(ScheduleData scheduleData) {
    this.scheduleData = scheduleData;
    return this;
  }

   /**
   * Get scheduleData
   * @return scheduleData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleData getScheduleData() {
    return scheduleData;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleData(ScheduleData scheduleData) {
    this.scheduleData = scheduleData;
  }


  public TransactionResponse customerProfileData(CustomerProfileData customerProfileData) {
    this.customerProfileData = customerProfileData;
    return this;
  }

   /**
   * Get customerProfileData
   * @return customerProfileData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_PROFILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerProfileData getCustomerProfileData() {
    return customerProfileData;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_PROFILE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerProfileData(CustomerProfileData customerProfileData) {
    this.customerProfileData = customerProfileData;
  }


  public TransactionResponse riskCheckData(TransactionResponseAllOfRiskCheckData riskCheckData) {
    this.riskCheckData = riskCheckData;
    return this;
  }

   /**
   * Get riskCheckData
   * @return riskCheckData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_CHECK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionResponseAllOfRiskCheckData getRiskCheckData() {
    return riskCheckData;
  }


  @JsonProperty(JSON_PROPERTY_RISK_CHECK_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskCheckData(TransactionResponseAllOfRiskCheckData riskCheckData) {
    this.riskCheckData = riskCheckData;
  }


  public TransactionResponse errors(List<ErrorType> errors) {
    this.errors = errors;
    return this;
  }

  public TransactionResponse addErrorsItem(ErrorType errorsItem) {
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


  public TransactionResponse adapterMessage(String adapterMessage) {
    this.adapterMessage = adapterMessage;
    return this;
  }

   /**
   * Get adapterMessage
   * @return adapterMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADAPTER_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdapterMessage() {
    return adapterMessage;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterMessage(String adapterMessage) {
    this.adapterMessage = adapterMessage;
  }


  public TransactionResponse adapterCode(String adapterCode) {
    this.adapterCode = adapterCode;
    return this;
  }

   /**
   * Get adapterCode
   * @return adapterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADAPTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAdapterCode() {
    return adapterCode;
  }


  @JsonProperty(JSON_PROPERTY_ADAPTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdapterCode(String adapterCode) {
    this.adapterCode = adapterCode;
  }


  public TransactionResponse extraData(Map<String, String> extraData) {
    this.extraData = extraData;
    return this;
  }

  public TransactionResponse putExtraDataItem(String key, String extraDataItem) {
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


  public TransactionResponse dccData(TransactionResponseAllOfDccData dccData) {
    this.dccData = dccData;
    return this;
  }

   /**
   * Get dccData
   * @return dccData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DCC_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionResponseAllOfDccData getDccData() {
    return dccData;
  }


  @JsonProperty(JSON_PROPERTY_DCC_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDccData(TransactionResponseAllOfDccData dccData) {
    this.dccData = dccData;
  }


  /**
   * Return true if this TransactionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResponse transactionResponse = (TransactionResponse) o;
    return Objects.equals(this.success, transactionResponse.success) &&
        Objects.equals(this.uuid, transactionResponse.uuid) &&
        Objects.equals(this.purchaseId, transactionResponse.purchaseId) &&
        Objects.equals(this.returnType, transactionResponse.returnType) &&
        Objects.equals(this.redirectType, transactionResponse.redirectType) &&
        Objects.equals(this.redirectUrl, transactionResponse.redirectUrl) &&
        Objects.equals(this.redirectQRCode, transactionResponse.redirectQRCode) &&
        Objects.equals(this.htmlContent, transactionResponse.htmlContent) &&
        Objects.equals(this.paymentDescriptor, transactionResponse.paymentDescriptor) &&
        Objects.equals(this.paymentMethod, transactionResponse.paymentMethod) &&
        Objects.equals(this.returnData, transactionResponse.returnData) &&
        Objects.equals(this.scheduleData, transactionResponse.scheduleData) &&
        Objects.equals(this.customerProfileData, transactionResponse.customerProfileData) &&
        Objects.equals(this.riskCheckData, transactionResponse.riskCheckData) &&
        Objects.equals(this.errors, transactionResponse.errors) &&
        Objects.equals(this.adapterMessage, transactionResponse.adapterMessage) &&
        Objects.equals(this.adapterCode, transactionResponse.adapterCode) &&
        Objects.equals(this.extraData, transactionResponse.extraData) &&
        Objects.equals(this.dccData, transactionResponse.dccData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, uuid, purchaseId, returnType, redirectType, redirectUrl, redirectQRCode, htmlContent, paymentDescriptor, paymentMethod, returnData, scheduleData, customerProfileData, riskCheckData, errors, adapterMessage, adapterCode, extraData, dccData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    purchaseId: ").append(toIndentedString(purchaseId)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    redirectType: ").append(toIndentedString(redirectType)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    redirectQRCode: ").append(toIndentedString(redirectQRCode)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    paymentDescriptor: ").append(toIndentedString(paymentDescriptor)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    returnData: ").append(toIndentedString(returnData)).append("\n");
    sb.append("    scheduleData: ").append(toIndentedString(scheduleData)).append("\n");
    sb.append("    customerProfileData: ").append(toIndentedString(customerProfileData)).append("\n");
    sb.append("    riskCheckData: ").append(toIndentedString(riskCheckData)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    adapterMessage: ").append(toIndentedString(adapterMessage)).append("\n");
    sb.append("    adapterCode: ").append(toIndentedString(adapterCode)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    dccData: ").append(toIndentedString(dccData)).append("\n");
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
  mappings.put("false", TransactionErrorResponse.class);
  mappings.put("true", TransactionResponse.class);
  mappings.put("TransactionResponse", TransactionResponse.class);
  JSON.registerDiscriminator(TransactionResponse.class, "success", mappings);
}
}
