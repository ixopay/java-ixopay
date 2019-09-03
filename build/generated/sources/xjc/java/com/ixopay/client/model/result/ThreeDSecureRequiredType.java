
package com.ixopay.client.model.result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threeDSecureRequiredType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="threeDSecureRequiredType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="OPTIONAL"/&gt;
 *     &lt;enumeration value="MANDATORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
