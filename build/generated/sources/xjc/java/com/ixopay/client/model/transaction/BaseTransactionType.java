
package com.ixopay.client.model.transaction;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transactionToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://gateway.ixopay.com/Schema/V2/Transaction}mandatatoryIdType"/&gt;
 *         &lt;element name="additionalId1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="customer" type="{http://gateway.ixopay.com/Schema/V2/Transaction}customerType" minOccurs="0"/&gt;
 *           &lt;element name="creditCardCustomer" type="{http://gateway.ixopay.com/Schema/V2/Transaction}creditCardCustomerType" minOccurs="0"/&gt;
 *           &lt;element name="ibanCustomer" type="{http://gateway.ixopay.com/Schema/V2/Transaction}ibanCustomerType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/Transaction}extraDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="merchantMetaData" type="{http://gateway.ixopay.com/Schema/V2/Transaction}merchantMetaDataType" minOccurs="0"/&gt;
 *         &lt;element name="request" type="{http://gateway.ixopay.com/Schema/V2/Transaction}requestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseTransactionType", propOrder = {
    "transactionToken",
    "transactionId",
    "additionalId1",
    "additionalId2",
    "customer",
    "creditCardCustomer",
    "ibanCustomer",
    "extraData",
    "merchantMetaData",
    "request"
})
@XmlSeeAlso({
    RegisterType.class,
    BaseTransactionWithReferenceType.class
})
public class BaseTransactionType {

    protected String transactionToken;
    @XmlElement(required = true)
    protected String transactionId;
    protected String additionalId1;
    protected String additionalId2;
    protected CustomerType customer;
    protected CreditCardCustomerType creditCardCustomer;
    protected IbanCustomerType ibanCustomer;
    protected List<ExtraDataType> extraData;
    protected String merchantMetaData;
    protected RequestType request;

    /**
     * Default no-arg constructor
     * 
     */
    public BaseTransactionType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BaseTransactionType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final String merchantMetaData, final RequestType request) {
        this.transactionToken = transactionToken;
        this.transactionId = transactionId;
        this.additionalId1 = additionalId1;
        this.additionalId2 = additionalId2;
        this.customer = customer;
        this.creditCardCustomer = creditCardCustomer;
        this.ibanCustomer = ibanCustomer;
        this.extraData = extraData;
        this.merchantMetaData = merchantMetaData;
        this.request = request;
    }

    /**
     * Gets the value of the transactionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * Sets the value of the transactionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionToken(String value) {
        this.transactionToken = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the additionalId1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalId1() {
        return additionalId1;
    }

    /**
     * Sets the value of the additionalId1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalId1(String value) {
        this.additionalId1 = value;
    }

    /**
     * Gets the value of the additionalId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalId2() {
        return additionalId2;
    }

    /**
     * Sets the value of the additionalId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalId2(String value) {
        this.additionalId2 = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the creditCardCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardCustomerType }
     *     
     */
    public CreditCardCustomerType getCreditCardCustomer() {
        return creditCardCustomer;
    }

    /**
     * Sets the value of the creditCardCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardCustomerType }
     *     
     */
    public void setCreditCardCustomer(CreditCardCustomerType value) {
        this.creditCardCustomer = value;
    }

    /**
     * Gets the value of the ibanCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link IbanCustomerType }
     *     
     */
    public IbanCustomerType getIbanCustomer() {
        return ibanCustomer;
    }

    /**
     * Sets the value of the ibanCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbanCustomerType }
     *     
     */
    public void setIbanCustomer(IbanCustomerType value) {
        this.ibanCustomer = value;
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

    /**
     * Gets the value of the merchantMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantMetaData() {
        return merchantMetaData;
    }

    /**
     * Sets the value of the merchantMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantMetaData(String value) {
        this.merchantMetaData = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

}
