
package com.ixopay.client.model.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for continueScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="continueScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="continueDateTime" type="{http://gateway.ixopay.com/Schema/V2/Schedule}scheduleDateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "continueScheduleType", propOrder = {
    "scheduleId",
    "continueDateTime"
})
public class ContinueScheduleType {

    @XmlElement(required = true)
    protected String scheduleId;
    @XmlElement(required = true)
    protected String continueDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public ContinueScheduleType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ContinueScheduleType(final String scheduleId, final String continueDateTime) {
        this.scheduleId = scheduleId;
        this.continueDateTime = continueDateTime;
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
     * Gets the value of the continueDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinueDateTime() {
        return continueDateTime;
    }

    /**
     * Sets the value of the continueDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinueDateTime(String value) {
        this.continueDateTime = value;
    }

}
