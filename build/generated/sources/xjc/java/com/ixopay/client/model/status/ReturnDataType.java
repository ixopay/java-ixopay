
package com.ixopay.client.model.status;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="creditcardData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}creditcardDataType"/&gt;
 *         &lt;element name="phoneData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}phoneDataType"/&gt;
 *         &lt;element name="ibanData" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}ibanDataType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="type" use="required" type="{http://gateway.ixopay.com/Schema/V2/StatusResult}returnDataTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnDataType", propOrder = {
    "creditcardData",
    "phoneData",
    "ibanData"
})
public class ReturnDataType {

    protected CreditcardDataType creditcardData;
    protected PhoneDataType phoneData;
    protected IbanDataType ibanData;
    @XmlAttribute(name = "type", required = true)
    protected ReturnDataTypeEnum type;

    /**
     * Default no-arg constructor
     * 
     */
    public ReturnDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReturnDataType(final CreditcardDataType creditcardData, final PhoneDataType phoneData, final IbanDataType ibanData, final ReturnDataTypeEnum type) {
        this.creditcardData = creditcardData;
        this.phoneData = phoneData;
        this.ibanData = ibanData;
        this.type = type;
    }

    /**
     * Gets the value of the creditcardData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditcardDataType }
     *     
     */
    public CreditcardDataType getCreditcardData() {
        return creditcardData;
    }

    /**
     * Sets the value of the creditcardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditcardDataType }
     *     
     */
    public void setCreditcardData(CreditcardDataType value) {
        this.creditcardData = value;
    }

    /**
     * Gets the value of the phoneData property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneDataType }
     *     
     */
    public PhoneDataType getPhoneData() {
        return phoneData;
    }

    /**
     * Sets the value of the phoneData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneDataType }
     *     
     */
    public void setPhoneData(PhoneDataType value) {
        this.phoneData = value;
    }

    /**
     * Gets the value of the ibanData property.
     * 
     * @return
     *     possible object is
     *     {@link IbanDataType }
     *     
     */
    public IbanDataType getIbanData() {
        return ibanData;
    }

    /**
     * Sets the value of the ibanData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IbanDataType }
     *     
     */
    public void setIbanData(IbanDataType value) {
        this.ibanData = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnDataTypeEnum }
     *     
     */
    public ReturnDataTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnDataTypeEnum }
     *     
     */
    public void setType(ReturnDataTypeEnum value) {
        this.type = value;
    }

}
