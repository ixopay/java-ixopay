
package com.ixopay.client.model.transaction;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ibanCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ibanCustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}customerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mandateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mandateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ibanCustomerType", propOrder = {
    "iban",
    "bic",
    "mandateId",
    "mandateDate"
})
public class IbanCustomerType
    extends CustomerType
{

    protected String iban;
    protected String bic;
    protected String mandateId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mandateDate;

    /**
     * Default no-arg constructor
     * 
     */
    public IbanCustomerType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public IbanCustomerType(final String identification, final String firstName, final String lastName, final XMLGregorianCalendar birthDate, final GenderType gender, final String billingAddress1, final String billingAddress2, final String billingCity, final String billingPostcode, final String billingState, final String billingCountry, final String billingPhone, final String shippingFirstName, final String shippingLastName, final String shippingCompany, final String shippingAddress1, final String shippingAddress2, final String shippingCity, final String shippingPostcode, final String shippingState, final String shippingCountry, final String shippingPhone, final String company, final String email, final Boolean emailVerified, final String ipAddress, final String nationalId, final List<ExtraDataType> extraData, final String iban, final String bic, final String mandateId, final XMLGregorianCalendar mandateDate) {
        super(identification, firstName, lastName, birthDate, gender, billingAddress1, billingAddress2, billingCity, billingPostcode, billingState, billingCountry, billingPhone, shippingFirstName, shippingLastName, shippingCompany, shippingAddress1, shippingAddress2, shippingCity, shippingPostcode, shippingState, shippingCountry, shippingPhone, company, email, emailVerified, ipAddress, nationalId, extraData);
        this.iban = iban;
        this.bic = bic;
        this.mandateId = mandateId;
        this.mandateDate = mandateDate;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBic() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the mandateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandateId() {
        return mandateId;
    }

    /**
     * Sets the value of the mandateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandateId(String value) {
        this.mandateId = value;
    }

    /**
     * Gets the value of the mandateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMandateDate() {
        return mandateDate;
    }

    /**
     * Sets the value of the mandateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMandateDate(XMLGregorianCalendar value) {
        this.mandateDate = value;
    }

}
