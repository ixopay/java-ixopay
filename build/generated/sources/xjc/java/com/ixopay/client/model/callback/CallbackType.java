
package com.ixopay.client.model.callback;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callbackType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://gateway.ixopay.com/Schema/V2/Callback}resultType"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionType" type="{http://gateway.ixopay.com/Schema/V2/Callback}transactionMethodType" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleStatus" type="{http://gateway.ixopay.com/Schema/V2/Callback}scheduleStatusType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleMerchantMetaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerProfile" type="{http://gateway.ixopay.com/Schema/V2/Callback}customerProfileDataType" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://gateway.ixopay.com/Schema/V2/Callback}errorsType" minOccurs="0"/&gt;
 *         &lt;element name="chargebackData" type="{http://gateway.ixopay.com/Schema/V2/Callback}chargebackDataType" minOccurs="0"/&gt;
 *         &lt;element name="chargebackReversalData" type="{http://gateway.ixopay.com/Schema/V2/Callback}chargebackReversalDataType" minOccurs="0"/&gt;
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/Callback}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="merchantMetaData" type="{http://gateway.ixopay.com/Schema/V2/Callback}merchantMetaDataType" minOccurs="0"/&gt;
 *         &lt;element name="returnData" type="{http://gateway.ixopay.com/Schema/V2/Callback}returnDataType" minOccurs="0"/&gt;
 *         &lt;element name="customerData" type="{http://gateway.ixopay.com/Schema/V2/Callback}customerDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callbackType", propOrder = {
    "result",
    "referenceId",
    "transactionId",
    "purchaseId",
    "transactionType",
    "paymentMethod",
    "amount",
    "currency",
    "scheduleId",
    "scheduleStatus",
    "scheduleMerchantMetaData",
    "customerProfile",
    "errors",
    "chargebackData",
    "chargebackReversalData",
    "extraData",
    "merchantMetaData",
    "returnData",
    "customerData"
})
@XmlRootElement(name = "callback")
public class CallbackType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ResultType result;
    protected String referenceId;
    protected String transactionId;
    protected String purchaseId;
    @XmlSchemaType(name = "string")
    protected TransactionMethodType transactionType;
    protected String paymentMethod;
    protected BigDecimal amount;
    protected String currency;
    protected String scheduleId;
    @XmlSchemaType(name = "string")
    protected ScheduleStatusType scheduleStatus;
    protected String scheduleMerchantMetaData;
    protected CustomerProfileDataType customerProfile;
    protected ErrorsType errors;
    protected ChargebackDataType chargebackData;
    protected ChargebackReversalDataType chargebackReversalData;
    protected List<ExtraDataType> extraData;
    protected String merchantMetaData;
    protected ReturnDataType returnData;
    protected CustomerDataType customerData;

    /**
     * Default no-arg constructor
     * 
     */
    public CallbackType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CallbackType(final ResultType result, final String referenceId, final String transactionId, final String purchaseId, final TransactionMethodType transactionType, final String paymentMethod, final BigDecimal amount, final String currency, final String scheduleId, final ScheduleStatusType scheduleStatus, final String scheduleMerchantMetaData, final CustomerProfileDataType customerProfile, final ErrorsType errors, final ChargebackDataType chargebackData, final ChargebackReversalDataType chargebackReversalData, final List<ExtraDataType> extraData, final String merchantMetaData, final ReturnDataType returnData, final CustomerDataType customerData) {
        this.result = result;
        this.referenceId = referenceId;
        this.transactionId = transactionId;
        this.purchaseId = purchaseId;
        this.transactionType = transactionType;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.currency = currency;
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.scheduleMerchantMetaData = scheduleMerchantMetaData;
        this.customerProfile = customerProfile;
        this.errors = errors;
        this.chargebackData = chargebackData;
        this.chargebackReversalData = chargebackReversalData;
        this.extraData = extraData;
        this.merchantMetaData = merchantMetaData;
        this.returnData = returnData;
        this.customerData = customerData;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     * Sets the value of the purchaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseId(String value) {
        this.purchaseId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMethodType }
     *     
     */
    public TransactionMethodType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMethodType }
     *     
     */
    public void setTransactionType(TransactionMethodType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the scheduleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Sets the value of the scheduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * Gets the value of the scheduleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleStatusType }
     *     
     */
    public ScheduleStatusType getScheduleStatus() {
        return scheduleStatus;
    }

    /**
     * Sets the value of the scheduleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleStatusType }
     *     
     */
    public void setScheduleStatus(ScheduleStatusType value) {
        this.scheduleStatus = value;
    }

    /**
     * Gets the value of the scheduleMerchantMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleMerchantMetaData() {
        return scheduleMerchantMetaData;
    }

    /**
     * Sets the value of the scheduleMerchantMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleMerchantMetaData(String value) {
        this.scheduleMerchantMetaData = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileDataType }
     *     
     */
    public CustomerProfileDataType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileDataType }
     *     
     */
    public void setCustomerProfile(CustomerProfileDataType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the chargebackData property.
     * 
     * @return
     *     possible object is
     *     {@link ChargebackDataType }
     *     
     */
    public ChargebackDataType getChargebackData() {
        return chargebackData;
    }

    /**
     * Sets the value of the chargebackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargebackDataType }
     *     
     */
    public void setChargebackData(ChargebackDataType value) {
        this.chargebackData = value;
    }

    /**
     * Gets the value of the chargebackReversalData property.
     * 
     * @return
     *     possible object is
     *     {@link ChargebackReversalDataType }
     *     
     */
    public ChargebackReversalDataType getChargebackReversalData() {
        return chargebackReversalData;
    }

    /**
     * Sets the value of the chargebackReversalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargebackReversalDataType }
     *     
     */
    public void setChargebackReversalData(ChargebackReversalDataType value) {
        this.chargebackReversalData = value;
    }

    /**
     * Gets the value of the extraData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getExtraData() {
        if (extraData == null) {
            extraData = new ArrayList<ExtraDataType>();
        }
        return this.extraData;
    }

    /**
     * Gets the value of the merchantMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantMetaData() {
        return merchantMetaData;
    }

    /**
     * Sets the value of the merchantMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantMetaData(String value) {
        this.merchantMetaData = value;
    }

    /**
     * Gets the value of the returnData property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnDataType }
     *     
     */
    public ReturnDataType getReturnData() {
        return returnData;
    }

    /**
     * Sets the value of the returnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnDataType }
     *     
     */
    public void setReturnData(ReturnDataType value) {
        this.returnData = value;
    }

    /**
     * Gets the value of the customerData property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataType }
     *     
     */
    public CustomerDataType getCustomerData() {
        return customerData;
    }

    /**
     * Sets the value of the customerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataType }
     *     
     */
    public void setCustomerData(CustomerDataType value) {
        this.customerData = value;
    }

}
