
package com.ixopay.client.model.status_result;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="transactionStatus" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}transactionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="transactionUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="merchantTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionType" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}transactionMethodType" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleStatus" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}scheduleStatusType" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}errorsType" minOccurs="0"/&gt;
 *         &lt;element name="chargebackData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}chargebackDataType" minOccurs="0"/&gt;
 *         &lt;element name="chargebackReversalData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}chargebackReversalDataType" minOccurs="0"/&gt;
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="merchantMetaData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}merchantMetaDataType" minOccurs="0"/&gt;
 *         &lt;element name="returnData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}returnDataType" minOccurs="0"/&gt;
 *         &lt;element name="customerData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}customerDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusResultType", propOrder = {
    "operationSuccess",
    "transactionStatus",
    "transactionUuid",
    "merchantTransactionId",
    "purchaseId",
    "transactionType",
    "paymentMethod",
    "amount",
    "currency",
    "scheduleId",
    "scheduleStatus",
    "errors",
    "chargebackData",
    "chargebackReversalData",
    "extraData",
    "merchantMetaData",
    "returnData",
    "customerData"
})
@XmlRootElement(name = "statusResult")
public class StatusResultType {

    protected boolean operationSuccess;
    @XmlSchemaType(name = "string")
    protected TransactionStatusType transactionStatus;
    protected String transactionUuid;
    protected String merchantTransactionId;
    protected String purchaseId;
    @XmlSchemaType(name = "string")
    protected TransactionMethodType transactionType;
    protected String paymentMethod;
    protected BigDecimal amount;
    protected String currency;
    protected String scheduleId;
    @XmlSchemaType(name = "string")
    protected ScheduleStatusType scheduleStatus;
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
    public StatusResultType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StatusResultType(final boolean operationSuccess, final TransactionStatusType transactionStatus, final String transactionUuid, final String merchantTransactionId, final String purchaseId, final TransactionMethodType transactionType, final String paymentMethod, final BigDecimal amount, final String currency, final String scheduleId, final ScheduleStatusType scheduleStatus, final ErrorsType errors, final ChargebackDataType chargebackData, final ChargebackReversalDataType chargebackReversalData, final List<ExtraDataType> extraData, final String merchantMetaData, final ReturnDataType returnData, final CustomerDataType customerData) {
        this.operationSuccess = operationSuccess;
        this.transactionStatus = transactionStatus;
        this.transactionUuid = transactionUuid;
        this.merchantTransactionId = merchantTransactionId;
        this.purchaseId = purchaseId;
        this.transactionType = transactionType;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.currency = currency;
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.errors = errors;
        this.chargebackData = chargebackData;
        this.chargebackReversalData = chargebackReversalData;
        this.extraData = extraData;
        this.merchantMetaData = merchantMetaData;
        this.returnData = returnData;
        this.customerData = customerData;
    }

    /**
     * Gets the value of the operationSuccess property.
     * 
     */
    public boolean isOperationSuccess() {
        return operationSuccess;
    }

    /**
     * Sets the value of the operationSuccess property.
     * 
     */
    public void setOperationSuccess(boolean value) {
        this.operationSuccess = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setTransactionStatus(TransactionStatusType value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the transactionUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionUuid() {
        return transactionUuid;
    }

    /**
     * Sets the value of the transactionUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionUuid(String value) {
        this.transactionUuid = value;
    }

    /**
     * Gets the value of the merchantTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantTransactionId() {
        return merchantTransactionId;
    }

    /**
     * Sets the value of the merchantTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantTransactionId(String value) {
        this.merchantTransactionId = value;
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
