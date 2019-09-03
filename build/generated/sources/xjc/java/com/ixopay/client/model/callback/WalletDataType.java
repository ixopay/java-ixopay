
package com.ixopay.client.model.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for walletDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="walletDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="walletReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="walletOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="walletType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "walletDataType", propOrder = {
    "walletReferenceId",
    "walletOwner",
    "walletType"
})
public class WalletDataType {

    protected String walletReferenceId;
    protected String walletOwner;
    protected String walletType;

    /**
     * Default no-arg constructor
     * 
     */
    public WalletDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WalletDataType(final String walletReferenceId, final String walletOwner, final String walletType) {
        this.walletReferenceId = walletReferenceId;
        this.walletOwner = walletOwner;
        this.walletType = walletType;
    }

    /**
     * Gets the value of the walletReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletReferenceId() {
        return walletReferenceId;
    }

    /**
     * Sets the value of the walletReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletReferenceId(String value) {
        this.walletReferenceId = value;
    }

    /**
     * Gets the value of the walletOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletOwner() {
        return walletOwner;
    }

    /**
     * Sets the value of the walletOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletOwner(String value) {
        this.walletOwner = value;
    }

    /**
     * Gets the value of the walletType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletType() {
        return walletType;
    }

    /**
     * Sets the value of the walletType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletType(String value) {
        this.walletType = value;
    }

}
