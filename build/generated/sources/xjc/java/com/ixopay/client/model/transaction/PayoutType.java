
package com.ixopay.client.model.transaction;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payoutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payoutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gateway.ixopay.com/Schema/V2/Transaction}baseTransactionWithReferenceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}amountableGroup"/&gt;
 *         &lt;group ref="{http://gateway.ixopay.com/Schema/V2/Transaction}offsiteGroup"/&gt;
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
@XmlType(name = "payoutType", propOrder = {
    "amount",
    "currency",
    "description",
    "successUrl",
    "cancelUrl",
    "errorUrl",
    "callbackUrl",
    "items"
})
public class PayoutType
    extends BaseTransactionWithReferenceType
{

    protected BigDecimal amount;
    protected String currency;
    protected String description;
    @XmlSchemaType(name = "anyURI")
    protected String successUrl;
    @XmlSchemaType(name = "anyURI")
    protected String cancelUrl;
    @XmlSchemaType(name = "anyURI")
    protected String errorUrl;
    @XmlSchemaType(name = "anyURI")
    protected String callbackUrl;
    protected ItemsType items;

    /**
     * Default no-arg constructor
     * 
     */
    public PayoutType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public PayoutType(final String transactionToken, final String transactionId, final String additionalId1, final String additionalId2, final CustomerType customer, final CreditCardCustomerType creditCardCustomer, final IbanCustomerType ibanCustomer, final List<ExtraDataType> extraData, final String merchantMetaData, final RequestType request, final String referenceTransactionId, final String referenceCustomerId, final String referenceId2, final String referenceId3, final String referenceId4, final BigDecimal amount, final String currency, final String description, final String successUrl, final String cancelUrl, final String errorUrl, final String callbackUrl, final ItemsType items) {
        super(transactionToken, transactionId, additionalId1, additionalId2, customer, creditCardCustomer, ibanCustomer, extraData, merchantMetaData, request, referenceTransactionId, referenceCustomerId, referenceId2, referenceId3, referenceId4);
        this.amount = amount;
        this.currency = currency;
        this.description = description;
        this.successUrl = successUrl;
        this.cancelUrl = cancelUrl;
        this.errorUrl = errorUrl;
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
     * Gets the value of the successUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Sets the value of the successUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessUrl(String value) {
        this.successUrl = value;
    }

    /**
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelUrl(String value) {
        this.cancelUrl = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
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
