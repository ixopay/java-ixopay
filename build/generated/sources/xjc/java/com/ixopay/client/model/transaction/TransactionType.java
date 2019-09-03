
package com.ixopay.client.model.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="language" type="{http://gateway.ixopay.com/Schema/V2/Transaction}languageType" minOccurs="0"/&gt;
 *         &lt;element name="testMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="debit" type="{http://gateway.ixopay.com/Schema/V2/Transaction}debitType"/&gt;
 *           &lt;element name="completeDebit" type="{http://gateway.ixopay.com/Schema/V2/Transaction}debitType"/&gt;
 *           &lt;element name="capture" type="{http://gateway.ixopay.com/Schema/V2/Transaction}captureType"/&gt;
 *           &lt;element name="deregister" type="{http://gateway.ixopay.com/Schema/V2/Transaction}deregisterType"/&gt;
 *           &lt;element name="preauthorize" type="{http://gateway.ixopay.com/Schema/V2/Transaction}preauthorizeType"/&gt;
 *           &lt;element name="completePreauthorize" type="{http://gateway.ixopay.com/Schema/V2/Transaction}preauthorizeType"/&gt;
 *           &lt;element name="refund" type="{http://gateway.ixopay.com/Schema/V2/Transaction}refundType"/&gt;
 *           &lt;element name="register" type="{http://gateway.ixopay.com/Schema/V2/Transaction}registerType"/&gt;
 *           &lt;element name="completeRegister" type="{http://gateway.ixopay.com/Schema/V2/Transaction}registerType"/&gt;
 *           &lt;element name="void" type="{http://gateway.ixopay.com/Schema/V2/Transaction}voidType"/&gt;
 *           &lt;element name="payout" type="{http://gateway.ixopay.com/Schema/V2/Transaction}payoutType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionType", propOrder = {
    "username",
    "password",
    "language",
    "testMode",
    "debit",
    "completeDebit",
    "capture",
    "deregister",
    "preauthorize",
    "completePreauthorize",
    "refund",
    "register",
    "completeRegister",
    "_void",
    "payout"
})
@XmlRootElement(name = "transaction")
public class TransactionType {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    protected String language;
    protected Boolean testMode;
    protected DebitType debit;
    protected DebitType completeDebit;
    protected CaptureType capture;
    protected DeregisterType deregister;
    protected PreauthorizeType preauthorize;
    protected PreauthorizeType completePreauthorize;
    protected RefundType refund;
    protected RegisterType register;
    protected RegisterType completeRegister;
    @XmlElement(name = "void")
    protected VoidType _void;
    protected PayoutType payout;

    /**
     * Default no-arg constructor
     * 
     */
    public TransactionType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public TransactionType(final String username, final String password, final String language, final Boolean testMode, final DebitType debit, final DebitType completeDebit, final CaptureType capture, final DeregisterType deregister, final PreauthorizeType preauthorize, final PreauthorizeType completePreauthorize, final RefundType refund, final RegisterType register, final RegisterType completeRegister, final VoidType _void, final PayoutType payout) {
        this.username = username;
        this.password = password;
        this.language = language;
        this.testMode = testMode;
        this.debit = debit;
        this.completeDebit = completeDebit;
        this.capture = capture;
        this.deregister = deregister;
        this.preauthorize = preauthorize;
        this.completePreauthorize = completePreauthorize;
        this.refund = refund;
        this.register = register;
        this.completeRegister = completeRegister;
        this._void = _void;
        this.payout = payout;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestMode(Boolean value) {
        this.testMode = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link DebitType }
     *     
     */
    public DebitType getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitType }
     *     
     */
    public void setDebit(DebitType value) {
        this.debit = value;
    }

    /**
     * Gets the value of the completeDebit property.
     * 
     * @return
     *     possible object is
     *     {@link DebitType }
     *     
     */
    public DebitType getCompleteDebit() {
        return completeDebit;
    }

    /**
     * Sets the value of the completeDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitType }
     *     
     */
    public void setCompleteDebit(DebitType value) {
        this.completeDebit = value;
    }

    /**
     * Gets the value of the capture property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureType }
     *     
     */
    public CaptureType getCapture() {
        return capture;
    }

    /**
     * Sets the value of the capture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureType }
     *     
     */
    public void setCapture(CaptureType value) {
        this.capture = value;
    }

    /**
     * Gets the value of the deregister property.
     * 
     * @return
     *     possible object is
     *     {@link DeregisterType }
     *     
     */
    public DeregisterType getDeregister() {
        return deregister;
    }

    /**
     * Sets the value of the deregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeregisterType }
     *     
     */
    public void setDeregister(DeregisterType value) {
        this.deregister = value;
    }

    /**
     * Gets the value of the preauthorize property.
     * 
     * @return
     *     possible object is
     *     {@link PreauthorizeType }
     *     
     */
    public PreauthorizeType getPreauthorize() {
        return preauthorize;
    }

    /**
     * Sets the value of the preauthorize property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreauthorizeType }
     *     
     */
    public void setPreauthorize(PreauthorizeType value) {
        this.preauthorize = value;
    }

    /**
     * Gets the value of the completePreauthorize property.
     * 
     * @return
     *     possible object is
     *     {@link PreauthorizeType }
     *     
     */
    public PreauthorizeType getCompletePreauthorize() {
        return completePreauthorize;
    }

    /**
     * Sets the value of the completePreauthorize property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreauthorizeType }
     *     
     */
    public void setCompletePreauthorize(PreauthorizeType value) {
        this.completePreauthorize = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterType }
     *     
     */
    public RegisterType getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterType }
     *     
     */
    public void setRegister(RegisterType value) {
        this.register = value;
    }

    /**
     * Gets the value of the completeRegister property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterType }
     *     
     */
    public RegisterType getCompleteRegister() {
        return completeRegister;
    }

    /**
     * Sets the value of the completeRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterType }
     *     
     */
    public void setCompleteRegister(RegisterType value) {
        this.completeRegister = value;
    }

    /**
     * Gets the value of the void property.
     * 
     * @return
     *     possible object is
     *     {@link VoidType }
     *     
     */
    public VoidType getVoid() {
        return _void;
    }

    /**
     * Sets the value of the void property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoidType }
     *     
     */
    public void setVoid(VoidType value) {
        this._void = value;
    }

    /**
     * Gets the value of the payout property.
     * 
     * @return
     *     possible object is
     *     {@link PayoutType }
     *     
     */
    public PayoutType getPayout() {
        return payout;
    }

    /**
     * Sets the value of the payout property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayoutType }
     *     
     */
    public void setPayout(PayoutType value) {
        this.payout = value;
    }

}
