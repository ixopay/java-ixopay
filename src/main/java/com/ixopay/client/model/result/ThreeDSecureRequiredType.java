//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.ixopay.client.model.result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threeDSecureRequiredType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="threeDSecureRequiredType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="OPTIONAL"/>
 *     &lt;enumeration value="MANDATORY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "threeDSecureRequiredType")
@XmlEnum
public enum ThreeDSecureRequiredType {

    NONE,
    OPTIONAL,
    MANDATORY;

    public String value() {
        return name();
    }

    public static ThreeDSecureRequiredType fromValue(String v) {
        return valueOf(v);
    }

}
