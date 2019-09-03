
package com.ixopay.client.model.transaction;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for refundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}baseTransactionWithReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}amountableGroup"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callbackUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}itemsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundType", propOrder = {
    "amount",
    "currency",
    "description",
    "callbackUrl",
    "items"
})
public class RefundType
    extends BaseTransactionWithReferenceType
{

    protected BigDecimal amount;
    protected String currency;
    protected String description;
    @XmlSchemaType(name = "anyURI")
    protected String callbackUrl;
    protected ItemsType items;

    /**
     * Default no-arg constructor
     * 
     */
    public RefundType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RefundType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final String merchantMetaData, final RequestType request, final String referenceTransactionId, final String referenceCustomerId, final String referenceId2, final String referenceId3, final String referenceId4, final BigDecimal amount, final String currency, final String description, final String callbackUrl, final ItemsType items) {
        super(transactionToken, transactionId, additionalId1, additionalId2, customer, creditCardCustomer, ibanCustomer, extraData, merchantMetaData, request, referenceTransactionId, referenceCustomerId, referenceId2, referenceId3, referenceId4);
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.callbackUrl = callbackUrl;
        this.items = items;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the callbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Sets the value of the callbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackUrl(String value) {
        this.callbackUrl = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ItemsType }
     *     
     */
    public ItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemsType }
     *     
     */
    public void setItems(ItemsType value) {
        this.items = value;
    }

}
