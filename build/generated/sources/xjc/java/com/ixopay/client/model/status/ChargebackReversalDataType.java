
package com.ixopay.client.model.status;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chargebackReversalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargebackReversalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originalReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originalTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chargebackReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amount" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}amountType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}currencyType" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reversalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargebackReversalDataType", propOrder = {
    "originalReferenceId",
    "originalTransactionId",
    "chargebackReferenceId",
    "amount",
    "currency",
    "reason",
    "reversalDateTime"
})
public class ChargebackReversalDataType {

    protected String originalReferenceId;
    protected String originalTransactionId;
    protected String chargebackReferenceId;
    protected BigDecimal amount;
    protected String currency;
    protected String reason;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reversalDateTime;

    /**
     * Default no-arg constructor
     * 
     */
    public ChargebackReversalDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ChargebackReversalDataType(final String originalReferenceId, final String originalTransactionId, final String chargebackReferenceId, final BigDecimal amount, final String currency, final String reason, final XMLGregorianCalendar reversalDateTime) {
        this.originalReferenceId = originalReferenceId;
        this.originalTransactionId = originalTransactionId;
        this.chargebackReferenceId = chargebackReferenceId;
        this.amount = amount;
        this.currency = currency;
        this.reason = reason;
        this.reversalDateTime = reversalDateTime;
    }

    /**
     * Gets the value of the originalReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalReferenceId() {
        return originalReferenceId;
    }

    /**
     * Sets the value of the originalReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalReferenceId(String value) {
        this.originalReferenceId = value;
    }

    /**
     * Gets the value of the originalTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    /**
     * Sets the value of the originalTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalTransactionId(String value) {
        this.originalTransactionId = value;
    }

    /**
     * Gets the value of the chargebackReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargebackReferenceId() {
        return chargebackReferenceId;
    }

    /**
     * Sets the value of the chargebackReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargebackReferenceId(String value) {
        this.chargebackReferenceId = value;
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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the reversalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReversalDateTime() {
        return reversalDateTime;
    }

    /**
     * Sets the value of the reversalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReversalDateTime(XMLGregorianCalendar value) {
        this.reversalDateTime = value;
    }

}
