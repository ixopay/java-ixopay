
package com.ixopay.client.model.status;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for creditcardDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditcardDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}countryType" minOccurs="0"/&gt;
 *         &lt;element name="cardHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryMonth" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="expiryYear" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *               &lt;fractionDigits value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="firstSixDigits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lastFourDigits" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fingerprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="binCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="threeDSecure" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}threeDSecureType" minOccurs="0"/&gt;
 *         &lt;element name="eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditcardDataType", propOrder = {
    "type",
    "country",
    "cardHolder",
    "expiryMonth",
    "expiryYear",
    "firstSixDigits",
    "lastFourDigits",
    "fingerprint",
    "binBrand",
    "binBank",
    "binType",
    "binLevel",
    "binCountry",
    "threeDSecure",
    "eci"
})
public class CreditcardDataType {

    protected String type;
    protected String country;
    protected String cardHolder;
    protected Integer expiryMonth;
    protected BigInteger expiryYear;
    protected String firstSixDigits;
    protected String lastFourDigits;
    protected String fingerprint;
    protected String binBrand;
    protected String binBank;
    protected String binType;
    protected String binLevel;
    protected String binCountry;
    @XmlSchemaType(name = "string")
    protected ThreeDSecureType threeDSecure;
    protected String eci;

    /**
     * Default no-arg constructor
     * 
     */
    public CreditcardDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CreditcardDataType(final String type, final String country, final String cardHolder, final Integer expiryMonth, final BigInteger expiryYear, final String firstSixDigits, final String lastFourDigits, final String fingerprint, final String binBrand, final String binBank, final String binType, final String binLevel, final String binCountry, final ThreeDSecureType threeDSecure, final String eci) {
        this.type = type;
        this.country = country;
        this.cardHolder = cardHolder;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstSixDigits = firstSixDigits;
        this.lastFourDigits = lastFourDigits;
        this.fingerprint = fingerprint;
        this.binBrand = binBrand;
        this.binBank = binBank;
        this.binType = binType;
        this.binLevel = binLevel;
        this.binCountry = binCountry;
        this.threeDSecure = threeDSecure;
        this.eci = eci;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the cardHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolder() {
        return cardHolder;
    }

    /**
     * Sets the value of the cardHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolder(String value) {
        this.cardHolder = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiryMonth(Integer value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpiryYear(BigInteger value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the firstSixDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstSixDigits() {
        return firstSixDigits;
    }

    /**
     * Sets the value of the firstSixDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstSixDigits(String value) {
        this.firstSixDigits = value;
    }

    /**
     * Gets the value of the lastFourDigits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFourDigits() {
        return lastFourDigits;
    }

    /**
     * Sets the value of the lastFourDigits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFourDigits(String value) {
        this.lastFourDigits = value;
    }

    /**
     * Gets the value of the fingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * Sets the value of the fingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFingerprint(String value) {
        this.fingerprint = value;
    }

    /**
     * Gets the value of the binBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinBrand() {
        return binBrand;
    }

    /**
     * Sets the value of the binBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinBrand(String value) {
        this.binBrand = value;
    }

    /**
     * Gets the value of the binBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinBank() {
        return binBank;
    }

    /**
     * Sets the value of the binBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinBank(String value) {
        this.binBank = value;
    }

    /**
     * Gets the value of the binType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinType() {
        return binType;
    }

    /**
     * Sets the value of the binType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinType(String value) {
        this.binType = value;
    }

    /**
     * Gets the value of the binLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinLevel() {
        return binLevel;
    }

    /**
     * Sets the value of the binLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinLevel(String value) {
        this.binLevel = value;
    }

    /**
     * Gets the value of the binCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinCountry() {
        return binCountry;
    }

    /**
     * Sets the value of the binCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinCountry(String value) {
        this.binCountry = value;
    }

    /**
     * Gets the value of the threeDSecure property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureType }
     *     
     */
    public ThreeDSecureType getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Sets the value of the threeDSecure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureType }
     *     
     */
    public void setThreeDSecure(ThreeDSecureType value) {
        this.threeDSecure = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

}
