
package com.ixopay.client.model.status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for threeDSecureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="threeDSecureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="OPTIONAL"/&gt;
 *     &lt;enumeration value="MANDATORY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "threeDSecureType")
@XmlEnum
public enum ThreeDSecureType {

    OFF,
    OPTIONAL,
    MANDATORY;

    public String value() {
        return name();
    }

    public static ThreeDSecureType fromValue(String v) {
        return valueOf(v);
    }

}
