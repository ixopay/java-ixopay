
package com.ixopay.client.model.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="transactionUuid" type="{http://gateway.ixopay.com/Schema/V2/Status}mandatatoryIdType"/&gt;
 *           &lt;element name="merchantTransactionId" type="{http://gateway.ixopay.com/Schema/V2/Status}mandatatoryIdType"/&gt;
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
@XmlType(name = "statusType", namespace = "http://gateway.ixopay.com/Schema/V2/Status", propOrder = {
    "username",
    "password",
    "transactionUuid",
    "merchantTransactionId"
})
@XmlRootElement(name = "status")
public class StatusType {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    protected String transactionUuid;
    protected String merchantTransactionId;

    /**
     * Default no-arg constructor
     * 
     */
    public StatusType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public StatusType(final String username, final String password, final String transactionUuid, final String merchantTransactionId) {
        this.username = username;
        this.password = password;
        this.transactionUuid = transactionUuid;
        this.merchantTransactionId = merchantTransactionId;
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

}
