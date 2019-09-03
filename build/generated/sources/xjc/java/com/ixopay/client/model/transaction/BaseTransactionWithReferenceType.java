
package com.ixopay.client.model.transaction;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseTransactionWithReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseTransactionWithReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}baseTransactionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceId2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceId3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceId4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseTransactionWithReferenceType", propOrder = {
    "referenceTransactionId",
    "referenceCustomerId",
    "referenceId2",
    "referenceId3",
    "referenceId4"
})
@XmlSeeAlso({
    DebitType.class,
    PreauthorizeType.class,
    CaptureType.class,
    VoidType.class,
    RefundType.class,
    DeregisterType.class,
    PayoutType.class
})
public class BaseTransactionWithReferenceType
    extends BaseTransactionType
{

    protected String referenceTransactionId;
    protected String referenceCustomerId;
    protected String referenceId2;
    protected String referenceId3;
    protected String referenceId4;

    /**
     * Default no-arg constructor
     * 
     */
    public BaseTransactionWithReferenceType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public BaseTransactionWithReferenceType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final String merchantMetaData, final RequestType request, final String referenceTransactionId, final String referenceCustomerId, final String referenceId2, final String referenceId3, final String referenceId4) {
        super(transactionToken, transactionId, additionalId1, additionalId2, customer, creditCardCustomer, ibanCustomer, extraData, merchantMetaData, request);
        this.referenceTransactionId = referenceTransactionId;
        this.referenceCustomerId = referenceCustomerId;
        this.referenceId2 = referenceId2;
        this.referenceId3 = referenceId3;
        this.referenceId4 = referenceId4;
    }

    /**
     * Gets the value of the referenceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTransactionId() {
        return referenceTransactionId;
    }

    /**
     * Sets the value of the referenceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTransactionId(String value) {
        this.referenceTransactionId = value;
    }

    /**
     * Gets the value of the referenceCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceCustomerId() {
        return referenceCustomerId;
    }

    /**
     * Sets the value of the referenceCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceCustomerId(String value) {
        this.referenceCustomerId = value;
    }

    /**
     * Gets the value of the referenceId2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId2() {
        return referenceId2;
    }

    /**
     * Sets the value of the referenceId2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId2(String value) {
        this.referenceId2 = value;
    }

    /**
     * Gets the value of the referenceId3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId3() {
        return referenceId3;
    }

    /**
     * Sets the value of the referenceId3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId3(String value) {
        this.referenceId3 = value;
    }

    /**
     * Gets the value of the referenceId4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId4() {
        return referenceId4;
    }

    /**
     * Sets the value of the referenceId4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId4(String value) {
        this.referenceId4 = value;
    }

}
