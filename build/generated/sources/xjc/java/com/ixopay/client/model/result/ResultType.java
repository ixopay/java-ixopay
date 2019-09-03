
package com.ixopay.client.model.result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnType" type="{http://gateway.ixopay.com/Schema/V2/Result}returnType"/&gt;
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="htmlContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="returnData" type="{http://gateway.ixopay.com/Schema/V2/Result}returnDataType" minOccurs="0"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scheduleStatus" type="{http://gateway.ixopay.com/Schema/V2/Result}scheduleStatusType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledAt" type="{http://gateway.ixopay.com/Schema/V2/Result}scheduleDateTime" minOccurs="0"/&gt;
 *         &lt;element name="customerProfile" type="{http://gateway.ixopay.com/Schema/V2/Result}customerProfileDataType" minOccurs="0"/&gt;
 *         &lt;element name="riskCheckData" type="{http://gateway.ixopay.com/Schema/V2/Result}riskCheckDataType" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://gateway.ixopay.com/Schema/V2/Result}errorsType" minOccurs="0"/&gt;
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/Result}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultType", propOrder = {
    "success",
    "referenceId",
    "purchaseId",
    "registrationId",
    "returnType",
    "redirectUrl",
    "htmlContent",
    "paymentDescriptor",
    "paymentMethod",
    "returnData",
    "scheduleId",
    "scheduleStatus",
    "scheduledAt",
    "customerProfile",
    "riskCheckData",
    "errors",
    "extraData"
})
@XmlRootElement(name = "result")
public class ResultType {

    protected boolean success;
    protected String referenceId;
    protected String purchaseId;
    protected String registrationId;
    @XmlElement(required = true)
    protected ReturnType returnType;
    @XmlSchemaType(name = "anyURI")
    protected String redirectUrl;
    protected String htmlContent;
    protected String paymentDescriptor;
    protected String paymentMethod;
    protected ReturnDataType returnData;
    protected String scheduleId;
    @XmlSchemaType(name = "string")
    protected ScheduleStatusType scheduleStatus;
    protected String scheduledAt;
    protected CustomerProfileDataType customerProfile;
    protected RiskCheckDataType riskCheckData;
    protected ErrorsType errors;
    protected List<ExtraDataType> extraData;

    /**
     * Default no-arg constructor
     * 
     */
    public ResultType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ResultType(final boolean success, final String referenceId, final String purchaseId, final String registrationId, final ReturnType returnType, final String redirectUrl, final String htmlContent, final String paymentDescriptor, final String paymentMethod, final ReturnDataType returnData, final String scheduleId, final ScheduleStatusType scheduleStatus, final String scheduledAt, final CustomerProfileDataType customerProfile, final RiskCheckDataType riskCheckData, final ErrorsType errors, final List<ExtraDataType> extraData) {
        this.success = success;
        this.referenceId = referenceId;
        this.purchaseId = purchaseId;
        this.registrationId = registrationId;
        this.returnType = returnType;
        this.redirectUrl = redirectUrl;
        this.htmlContent = htmlContent;
        this.paymentDescriptor = paymentDescriptor;
        this.paymentMethod = paymentMethod;
        this.returnData = returnData;
        this.scheduleId = scheduleId;
        this.scheduleStatus = scheduleStatus;
        this.scheduledAt = scheduledAt;
        this.customerProfile = customerProfile;
        this.riskCheckData = riskCheckData;
        this.errors = errors;
        this.extraData = extraData;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
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
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnType }
     *     
     */
    public ReturnType getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnType }
     *     
     */
    public void setReturnType(ReturnType value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Gets the value of the htmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * Sets the value of the htmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlContent(String value) {
        this.htmlContent = value;
    }

    /**
     * Gets the value of the paymentDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescriptor() {
        return paymentDescriptor;
    }

    /**
     * Sets the value of the paymentDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescriptor(String value) {
        this.paymentDescriptor = value;
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
     * Gets the value of the scheduledAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledAt() {
        return scheduledAt;
    }

    /**
     * Sets the value of the scheduledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledAt(String value) {
        this.scheduledAt = value;
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
     * Gets the value of the riskCheckData property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCheckDataType }
     *     
     */
    public RiskCheckDataType getRiskCheckData() {
        return riskCheckData;
    }

    /**
     * Sets the value of the riskCheckData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCheckDataType }
     *     
     */
    public void setRiskCheckData(RiskCheckDataType value) {
        this.riskCheckData = value;
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

}
