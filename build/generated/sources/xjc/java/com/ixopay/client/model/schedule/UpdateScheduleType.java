
package com.ixopay.client.model.schedule;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="registrationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://gateway.ixopay.com/Schema/V2/Schedule}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://gateway.ixopay.com/Schema/V2/Schedule}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="periodLength" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="periodUnit" type="{http://gateway.ixopay.com/Schema/V2/Schedule}periodUnitType" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{http://gateway.ixopay.com/Schema/V2/Schedule}scheduleDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateScheduleType", propOrder = {
    "scheduleId",
    "registrationId",
    "amount",
    "currency",
    "periodLength",
    "periodUnit",
    "startDateTime"
})
public class UpdateScheduleType {

    @XmlElement(required = true)
    protected String scheduleId;
    protected String registrationId;
    protected BigDecimal amount;
    protected String currency;
    @XmlSchemaType(name = "unsignedInt")
    protected Long periodLength;
    @XmlSchemaType(name = "string")
    protected PeriodUnitType periodUnit;
    protected String startDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public UpdateScheduleType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UpdateScheduleType(final String scheduleId, final String registrationId, final BigDecimal amount, final String currency, final Long periodLength, final PeriodUnitType periodUnit, final String startDateTime) {
        this.scheduleId = scheduleId;
        this.registrationId = registrationId;
        this.amount = amount;
        this.currency = currency;
        this.periodLength = periodLength;
        this.periodUnit = periodUnit;
        this.startDateTime = startDateTime;
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
     * Gets the value of the periodLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodLength() {
        return periodLength;
    }

    /**
     * Sets the value of the periodLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodLength(Long value) {
        this.periodLength = value;
    }

    /**
     * Gets the value of the periodUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodUnitType }
     *     
     */
    public PeriodUnitType getPeriodUnit() {
        return periodUnit;
    }

    /**
     * Sets the value of the periodUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodUnitType }
     *     
     */
    public void setPeriodUnit(PeriodUnitType value) {
        this.periodUnit = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

}
