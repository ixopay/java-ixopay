
package com.ixopay.client.model.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addToCustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addToCustomerProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="profileGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="customerIdentification" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="markAsPreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addToCustomerProfileType", propOrder = {
    "profileGuid",
    "customerIdentification",
    "markAsPreferred"
})
public class AddToCustomerProfileType {

    protected String profileGuid;
    protected String customerIdentification;
    protected Boolean markAsPreferred;

    /**
     * Default no-arg constructor
     * 
     */
    public AddToCustomerProfileType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public AddToCustomerProfileType(final String profileGuid, final String customerIdentification, final Boolean markAsPreferred) {
        this.profileGuid = profileGuid;
        this.customerIdentification = customerIdentification;
        this.markAsPreferred = markAsPreferred;
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

    /**
     * Gets the value of the markAsPreferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkAsPreferred() {
        return markAsPreferred;
    }

    /**
     * Sets the value of the markAsPreferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkAsPreferred(Boolean value) {
        this.markAsPreferred = value;
    }

}
