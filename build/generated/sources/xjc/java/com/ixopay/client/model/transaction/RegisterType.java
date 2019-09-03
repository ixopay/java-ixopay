
package com.ixopay.client.model.transaction;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}baseTransactionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}offsiteGroup"/&gt;
 *         &lt;element name="startSchedule" type="{http://gateway.ixopay.com/Schema/V2/Transaction}scheduleType" minOccurs="0"/&gt;
 *         &lt;element name="addToCustomerProfile" type="{http://gateway.ixopay.com/Schema/V2/Transaction}addToCustomerProfileType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerType", propOrder = {
    "description",
    "successUrl",
    "cancelUrl",
    "errorUrl",
    "callbackUrl",
    "startSchedule",
    "addToCustomerProfile"
})
public class RegisterType
    extends BaseTransactionType
{

    protected String description;
    @XmlSchemaType(name = "anyURI")
    protected String successUrl;
    @XmlSchemaType(name = "anyURI")
    protected String cancelUrl;
    @XmlSchemaType(name = "anyURI")
    protected String errorUrl;
    @XmlSchemaType(name = "anyURI")
    protected String callbackUrl;
    protected ScheduleType startSchedule;
    protected AddToCustomerProfileType addToCustomerProfile;

    /**
     * Default no-arg constructor
     * 
     */
    public RegisterType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RegisterType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final String merchantMetaData, final RequestType request, final String description, final String successUrl, final String cancelUrl, final String errorUrl, final String callbackUrl, final ScheduleType startSchedule, final AddToCustomerProfileType addToCustomerProfile) {
        super(transactionToken, transactionId, additionalId1, additionalId2, customer, creditCardCustomer, ibanCustomer, extraData, merchantMetaData, request);
        this.description = description;
        this.successUrl = successUrl;
        this.cancelUrl = cancelUrl;
        this.errorUrl = errorUrl;
        this.callbackUrl = callbackUrl;
        this.startSchedule = startSchedule;
        this.addToCustomerProfile = addToCustomerProfile;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the successUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Sets the value of the successUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessUrl(String value) {
        this.successUrl = value;
    }

    /**
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrl(String value) {
        this.cancelUrl = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
    }

    /**
     * Gets the value of the callbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets the value of the callbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackUrl(String value) {
        this.callbackUrl = value;
    }

    /**
     * Gets the value of the startSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleType }
     *     
     */
    public ScheduleType getStartSchedule() {
        return startSchedule;
    }

    /**
     * Sets the value of the startSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleType }
     *     
     */
    public void setStartSchedule(ScheduleType value) {
        this.startSchedule = value;
    }

    /**
     * Gets the value of the addToCustomerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AddToCustomerProfileType }
     *     
     */
    public AddToCustomerProfileType getAddToCustomerProfile() {
        return addToCustomerProfile;
    }

    /**
     * Sets the value of the addToCustomerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddToCustomerProfileType }
     *     
     */
    public void setAddToCustomerProfile(AddToCustomerProfileType value) {
        this.addToCustomerProfile = value;
    }

}
