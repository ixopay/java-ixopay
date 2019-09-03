
package com.ixopay.client.model.result;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskCheckDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riskCheckDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="result" type="{http://gateway.ixopay.com/Schema/V2/Result}riskCheckResultType"/&gt;
 *         &lt;element name="riskScore" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="threeDSecureRequired" type="{http://gateway.ixopay.com/Schema/V2/Result}threeDSecureRequiredType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riskCheckDataType", propOrder = {
    "result",
    "riskScore",
    "threeDSecureRequired"
})
public class RiskCheckDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RiskCheckResultType result;
    protected BigInteger riskScore;
    @XmlSchemaType(name = "string")
    protected ThreeDSecureRequiredType threeDSecureRequired;

    /**
     * Default no-arg constructor
     * 
     */
    public RiskCheckDataType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public RiskCheckDataType(final RiskCheckResultType result, final BigInteger riskScore, final ThreeDSecureRequiredType threeDSecureRequired) {
        this.result = result;
        this.riskScore = riskScore;
        this.threeDSecureRequired = threeDSecureRequired;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link RiskCheckResultType }
     *     
     */
    public RiskCheckResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskCheckResultType }
     *     
     */
    public void setResult(RiskCheckResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the riskScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRiskScore() {
        return riskScore;
    }

    /**
     * Sets the value of the riskScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRiskScore(BigInteger value) {
        this.riskScore = value;
    }

    /**
     * Gets the value of the threeDSecureRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureRequiredType }
     *     
     */
    public ThreeDSecureRequiredType getThreeDSecureRequired() {
        return threeDSecureRequired;
    }

    /**
     * Sets the value of the threeDSecureRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureRequiredType }
     *     
     */
    public void setThreeDSecureRequired(ThreeDSecureRequiredType value) {
        this.threeDSecureRequired = value;
    }

}
