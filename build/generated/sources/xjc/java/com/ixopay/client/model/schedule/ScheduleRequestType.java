
package com.ixopay.client.model.schedule;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="startSchedule" type="{http://gateway.ixopay.com/Schema/V2/Schedule}startScheduleType"/&gt;
 *           &lt;element name="showSchedule" type="{http://gateway.ixopay.com/Schema/V2/Schedule}showScheduleType"/&gt;
 *           &lt;element name="pauseSchedule" type="{http://gateway.ixopay.com/Schema/V2/Schedule}pauseScheduleType"/&gt;
 *           &lt;element name="continueSchedule" type="{http://gateway.ixopay.com/Schema/V2/Schedule}continueScheduleType"/&gt;
 *           &lt;element name="cancelSchedule" type="{http://gateway.ixopay.com/Schema/V2/Schedule}cancelScheduleType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleRequestType", propOrder = {
    "username",
    "password",
    "startSchedule",
    "showSchedule",
    "pauseSchedule",
    "continueSchedule",
    "cancelSchedule"
})
@XmlRootElement(name = "schedule")
public class ScheduleRequestType {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    protected StartScheduleType startSchedule;
    protected ShowScheduleType showSchedule;
    protected PauseScheduleType pauseSchedule;
    protected ContinueScheduleType continueSchedule;
    protected CancelScheduleType cancelSchedule;

    /**
     * Default no-arg constructor
     * 
     */
    public ScheduleRequestType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ScheduleRequestType(final String username, final String password, final StartScheduleType startSchedule, final ShowScheduleType showSchedule, final PauseScheduleType pauseSchedule, final ContinueScheduleType continueSchedule, final CancelScheduleType cancelSchedule) {
        this.username = username;
        this.password = password;
        this.startSchedule = startSchedule;
        this.showSchedule = showSchedule;
        this.pauseSchedule = pauseSchedule;
        this.continueSchedule = continueSchedule;
        this.cancelSchedule = cancelSchedule;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the startSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link StartScheduleType }
     *     
     */
    public StartScheduleType getStartSchedule() {
        return startSchedule;
    }

    /**
     * Sets the value of the startSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartScheduleType }
     *     
     */
    public void setStartSchedule(StartScheduleType value) {
        this.startSchedule = value;
    }

    /**
     * Gets the value of the showSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ShowScheduleType }
     *     
     */
    public ShowScheduleType getShowSchedule() {
        return showSchedule;
    }

    /**
     * Sets the value of the showSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowScheduleType }
     *     
     */
    public void setShowSchedule(ShowScheduleType value) {
        this.showSchedule = value;
    }

    /**
     * Gets the value of the pauseSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link PauseScheduleType }
     *     
     */
    public PauseScheduleType getPauseSchedule() {
        return pauseSchedule;
    }

    /**
     * Sets the value of the pauseSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PauseScheduleType }
     *     
     */
    public void setPauseSchedule(PauseScheduleType value) {
        this.pauseSchedule = value;
    }

    /**
     * Gets the value of the continueSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ContinueScheduleType }
     *     
     */
    public ContinueScheduleType getContinueSchedule() {
        return continueSchedule;
    }

    /**
     * Sets the value of the continueSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinueScheduleType }
     *     
     */
    public void setContinueSchedule(ContinueScheduleType value) {
        this.continueSchedule = value;
    }

    /**
     * Gets the value of the cancelSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link CancelScheduleType }
     *     
     */
    public CancelScheduleType getCancelSchedule() {
        return cancelSchedule;
    }

    /**
     * Sets the value of the cancelSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelScheduleType }
     *     
     */
    public void setCancelSchedule(CancelScheduleType value) {
        this.cancelSchedule = value;
    }

}
