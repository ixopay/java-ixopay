
package com.ixopay.client.model.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for returnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="returnType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://gateway.ixopay.com/Schema/V2/Result&gt;returnTypeValues"&gt;
 *       &lt;attribute name="redirectType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="iframe"/&gt;
 *             &lt;enumeration value="fullpage"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnType", propOrder = {
    "value"
})
public class ReturnType {

    @XmlValue
    protected ReturnTypeValues value;
    @XmlAttribute(name = "redirectType")
    protected String redirectType;

    /**
     * Default no-arg constructor
     * 
     */
    public ReturnType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public ReturnType(final ReturnTypeValues value, final String redirectType) {
        this.value = value;
        this.redirectType = redirectType;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnTypeValues }
     *     
     */
    public ReturnTypeValues getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnTypeValues }
     *     
     */
    public void setValue(ReturnTypeValues value) {
        this.value = value;
    }

    /**
     * Gets the value of the redirectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectType() {
        return redirectType;
    }

    /**
     * Sets the value of the redirectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectType(String value) {
        this.redirectType = value;
    }

}
