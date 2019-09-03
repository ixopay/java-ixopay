
package com.ixopay.client.model.status;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="adapterMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adapterCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorType", propOrder = {
    "message",
    "code",
    "adapterMessage",
    "adapterCode"
})
public class ErrorType {

    protected String message;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger code;
    protected String adapterMessage;
    protected String adapterCode;

    /**
     * Default no-arg constructor
     * 
     */
    public ErrorType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ErrorType(final String message, final BigInteger code, final String adapterMessage, final String adapterCode) {
        this.message = message;
        this.code = code;
        this.adapterMessage = adapterMessage;
        this.adapterCode = adapterCode;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the adapterMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapterMessage() {
        return adapterMessage;
    }

    /**
     * Sets the value of the adapterMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapterMessage(String value) {
        this.adapterMessage = value;
    }

    /**
     * Gets the value of the adapterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdapterCode() {
        return adapterCode;
    }

    /**
     * Sets the value of the adapterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdapterCode(String value) {
        this.adapterCode = value;
    }

}
