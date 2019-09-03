
package com.ixopay.client.model.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerProfileDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerProfileDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profileGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerProfileDataType", propOrder = {
    "profileGuid",
    "customerIdentification"
})
public class CustomerProfileDataType {

    @XmlElement(required = true)
    protected String profileGuid;
    @XmlElement(required = true)
    protected String customerIdentification;

    /**
     * Default no-arg constructor
     * 
     */
    public CustomerProfileDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CustomerProfileDataType(final String profileGuid, final String customerIdentification) {
        this.profileGuid = profileGuid;
        this.customerIdentification = customerIdentification;
    }

    /**
     * Gets the value of the profileGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileGuid() {
        return profileGuid;
    }

    /**
     * Sets the value of the profileGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileGuid(String value) {
        this.profileGuid = value;
    }

    /**
     * Gets the value of the customerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentification() {
        return customerIdentification;
    }

    /**
     * Sets the value of the customerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentification(String value) {
        this.customerIdentification = value;
    }

}
