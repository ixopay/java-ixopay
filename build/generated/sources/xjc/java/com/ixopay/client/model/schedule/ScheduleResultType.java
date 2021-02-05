
package com.ixopay.client.model.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operationSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldStatus" type="{http://gateway.ixopay.com/Schema/V2/ScheduleResult}scheduleStatusType" minOccurs="0"/&gt;
 *         &lt;element name="newStatus" type="{http://gateway.ixopay.com/Schema/V2/ScheduleResult}scheduleStatusType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledAt" type="{http://gateway.ixopay.com/Schema/V2/ScheduleResult}scheduleDateTime" minOccurs="0"/&gt;
 *         &lt;element name="errors" type="{http://gateway.ixopay.com/Schema/V2/ScheduleResult}errorsType" minOccurs="0"/&gt;
 *         &lt;element name="merchantMetaData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleResultType", namespace = "http://gateway.ixopay.com/Schema/V2/ScheduleResult", propOrder = {
    "operationSuccess",
    "scheduleId",
    "registrationId",
    "oldStatus",
    "newStatus",
    "scheduledAt",
    "errors",
    "merchantMetaData"
})
@XmlRootElement(name = "schedule")
public class ScheduleResultType {

    protected boolean operationSuccess;
    protected String scheduleId;
    protected String registrationId;
    @XmlSchemaType(name = "string")
    protected ScheduleStatusType oldStatus;
    @XmlSchemaType(name = "string")
    protected ScheduleStatusType newStatus;
    protected String scheduledAt;
    protected ErrorsType errors;
    protected String merchantMetaData;

    /**
     * Default no-arg constructor
     * 
     */
    public ScheduleResultType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScheduleResultType(final boolean operationSuccess, final String scheduleId, final String registrationId, final ScheduleStatusType oldStatus, final ScheduleStatusType newStatus, final String scheduledAt, final ErrorsType errors, final String merchantMetaData) {
        this.operationSuccess = operationSuccess;
        this.scheduleId = scheduleId;
        this.registrationId = registrationId;
        this.oldStatus = oldStatus;
        this.newStatus = newStatus;
        this.scheduledAt = scheduledAt;
        this.errors = errors;
        this.merchantMetaData = merchantMetaData;
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
     * Gets the value of the oldStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleStatusType }
     *     
     */
    public ScheduleStatusType getOldStatus() {
        return oldStatus;
    }

    /**
     * Sets the value of the oldStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleStatusType }
     *     
     */
    public void setOldStatus(ScheduleStatusType value) {
        this.oldStatus = value;
    }

    /**
     * Gets the value of the newStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleStatusType }
     *     
     */
    public ScheduleStatusType getNewStatus() {
        return newStatus;
    }

    /**
     * Sets the value of the newStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleStatusType }
     *     
     */
    public void setNewStatus(ScheduleStatusType value) {
        this.newStatus = value;
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

}
