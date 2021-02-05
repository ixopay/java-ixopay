
package com.ixopay.client.model.callback;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customerDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://gateway.ixopay.com/Schema/V2/Callback}genderType" minOccurs="0"/&gt;
 *         &lt;element name="billingAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingCountry" type="{http://gateway.ixopay.com/Schema/V2/Callback}countryType" minOccurs="0"/&gt;
 *         &lt;element name="billingPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingPostcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shippingCountry" type="{http://gateway.ixopay.com/Schema/V2/Callback}countryType" minOccurs="0"/&gt;
 *         &lt;element name="shippingPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailVerified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/Callback}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerDataType", propOrder = {
    "identification",
    "firstName",
    "lastName",
    "birthDate",
    "gender",
    "billingAddress1",
    "billingAddress2",
    "billingCity",
    "billingPostcode",
    "billingState",
    "billingCountry",
    "billingPhone",
    "shippingFirstName",
    "shippingLastName",
    "shippingCompany",
    "shippingAddress1",
    "shippingAddress2",
    "shippingCity",
    "shippingPostcode",
    "shippingState",
    "shippingCountry",
    "shippingPhone",
    "company",
    "email",
    "emailVerified",
    "ipAddress",
    "nationalId",
    "extraData"
})
public class CustomerDataType {

    protected String identification;
    protected String firstName;
    protected String lastName;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "string")
    protected GenderType gender;
    protected String billingAddress1;
    protected String billingAddress2;
    protected String billingCity;
    protected String billingPostcode;
    protected String billingState;
    protected String billingCountry;
    protected String billingPhone;
    protected String shippingFirstName;
    protected String shippingLastName;
    protected String shippingCompany;
    protected String shippingAddress1;
    protected String shippingAddress2;
    protected String shippingCity;
    protected String shippingPostcode;
    protected String shippingState;
    protected String shippingCountry;
    protected String shippingPhone;
    protected String company;
    protected String email;
    protected Boolean emailVerified;
    protected String ipAddress;
    protected String nationalId;
    protected List<ExtraDataType> extraData;

    /**
     * Default no-arg constructor
     * 
     */
    public CustomerDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public CustomerDataType(final String identification, final String firstName, final String lastName, final XMLGregorianCalendar birthDate, final GenderType gender, final String billingAddress1, final String billingAddress2, final String billingCity, final String billingPostcode, final String billingState, final String billingCountry, final String billingPhone, final String shippingFirstName, final String shippingLastName, final String shippingCompany, final String shippingAddress1, final String shippingAddress2, final String shippingCity, final String shippingPostcode, final String shippingState, final String shippingCountry, final String shippingPhone, final String company, final String email, final Boolean emailVerified, final String ipAddress, final String nationalId, final List<ExtraDataType> extraData) {
        this.identification = identification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.billingAddress1 = billingAddress1;
        this.billingAddress2 = billingAddress2;
        this.billingCity = billingCity;
        this.billingPostcode = billingPostcode;
        this.billingState = billingState;
        this.billingCountry = billingCountry;
        this.billingPhone = billingPhone;
        this.shippingFirstName = shippingFirstName;
        this.shippingLastName = shippingLastName;
        this.shippingCompany = shippingCompany;
        this.shippingAddress1 = shippingAddress1;
        this.shippingAddress2 = shippingAddress2;
        this.shippingCity = shippingCity;
        this.shippingPostcode = shippingPostcode;
        this.shippingState = shippingState;
        this.shippingCountry = shippingCountry;
        this.shippingPhone = shippingPhone;
        this.company = company;
        this.email = email;
        this.emailVerified = emailVerified;
        this.ipAddress = ipAddress;
        this.nationalId = nationalId;
        this.extraData = extraData;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the billingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress1() {
        return billingAddress1;
    }

    /**
     * Sets the value of the billingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress1(String value) {
        this.billingAddress1 = value;
    }

    /**
     * Gets the value of the billingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress2() {
        return billingAddress2;
    }

    /**
     * Sets the value of the billingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress2(String value) {
        this.billingAddress2 = value;
    }

    /**
     * Gets the value of the billingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCity() {
        return billingCity;
    }

    /**
     * Sets the value of the billingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    /**
     * Gets the value of the billingPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPostcode() {
        return billingPostcode;
    }

    /**
     * Sets the value of the billingPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPostcode(String value) {
        this.billingPostcode = value;
    }

    /**
     * Gets the value of the billingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingState() {
        return billingState;
    }

    /**
     * Sets the value of the billingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingState(String value) {
        this.billingState = value;
    }

    /**
     * Gets the value of the billingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingCountry() {
        return billingCountry;
    }

    /**
     * Sets the value of the billingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

    /**
     * Gets the value of the billingPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingPhone() {
        return billingPhone;
    }

    /**
     * Sets the value of the billingPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingPhone(String value) {
        this.billingPhone = value;
    }

    /**
     * Gets the value of the shippingFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingFirstName() {
        return shippingFirstName;
    }

    /**
     * Sets the value of the shippingFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingFirstName(String value) {
        this.shippingFirstName = value;
    }

    /**
     * Gets the value of the shippingLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingLastName() {
        return shippingLastName;
    }

    /**
     * Sets the value of the shippingLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingLastName(String value) {
        this.shippingLastName = value;
    }

    /**
     * Gets the value of the shippingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCompany() {
        return shippingCompany;
    }

    /**
     * Sets the value of the shippingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCompany(String value) {
        this.shippingCompany = value;
    }

    /**
     * Gets the value of the shippingAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress1() {
        return shippingAddress1;
    }

    /**
     * Sets the value of the shippingAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress1(String value) {
        this.shippingAddress1 = value;
    }

    /**
     * Gets the value of the shippingAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingAddress2() {
        return shippingAddress2;
    }

    /**
     * Sets the value of the shippingAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingAddress2(String value) {
        this.shippingAddress2 = value;
    }

    /**
     * Gets the value of the shippingCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCity() {
        return shippingCity;
    }

    /**
     * Sets the value of the shippingCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCity(String value) {
        this.shippingCity = value;
    }

    /**
     * Gets the value of the shippingPostcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPostcode() {
        return shippingPostcode;
    }

    /**
     * Sets the value of the shippingPostcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPostcode(String value) {
        this.shippingPostcode = value;
    }

    /**
     * Gets the value of the shippingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingState() {
        return shippingState;
    }

    /**
     * Sets the value of the shippingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingState(String value) {
        this.shippingState = value;
    }

    /**
     * Gets the value of the shippingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCountry() {
        return shippingCountry;
    }

    /**
     * Sets the value of the shippingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCountry(String value) {
        this.shippingCountry = value;
    }

    /**
     * Gets the value of the shippingPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * Sets the value of the shippingPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingPhone(String value) {
        this.shippingPhone = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailVerified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailVerified() {
        return emailVerified;
    }

    /**
     * Sets the value of the emailVerified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailVerified(Boolean value) {
        this.emailVerified = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the extraData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getExtraData() {
        if (extraData == null) {
            extraData = new ArrayList<ExtraDataType>();
        }
        return this.extraData;
    }

}
