
package com.ixopay.client.model.transaction;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for creditCardCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="creditCardCustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}customerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issueNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creditCardCustomerType", propOrder = {
    "number",
    "expiryMonth",
    "expiryYear",
    "startMonth",
    "startYear",
    "cvv",
    "issueNumber",
    "type"
})
public class CreditCardCustomerType
    extends CustomerType
{

    protected String number;
    protected String expiryMonth;
    protected String expiryYear;
    protected String startMonth;
    protected String startYear;
    protected String cvv;
    protected String issueNumber;
    protected String type;

    /**
     * Default no-arg constructor
     * 
     */
    public CreditCardCustomerType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CreditCardCustomerType(final String identification, final String firstName, final String lastName, final XMLGregorianCalendar birthDate, final GenderType gender, final String billingAddress1, final String billingAddress2, final String billingCity, final String billingPostcode, final String billingState, final String billingCountry, final String billingPhone, final String shippingFirstName, final String shippingLastName, final String shippingCompany, final String shippingAddress1, final String shippingAddress2, final String shippingCity, final String shippingPostcode, final String shippingState, final String shippingCountry, final String shippingPhone, final String company, final String email, final Boolean emailVerified, final String ipAddress, final String nationalId, final List<ExtraDataType> extraData, final String number, final String expiryMonth, final String expiryYear, final String startMonth, final String startYear, final String cvv, final String issueNumber, final String type) {
        super(identification, firstName, lastName, birthDate, gender, billingAddress1, billingAddress2, billingCity, billingPostcode, billingState, billingCountry, billingPhone, shippingFirstName, shippingLastName, shippingCompany, shippingAddress1, shippingAddress2, shippingCity, shippingPostcode, shippingState, shippingCountry, shippingPhone, company, email, emailVerified, ipAddress, nationalId, extraData);
        this.number = number;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.startMonth = startMonth;
        this.startYear = startYear;
        this.cvv = cvv;
        this.issueNumber = issueNumber;
        this.type = type;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMonth(String value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYear(String value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
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

}
