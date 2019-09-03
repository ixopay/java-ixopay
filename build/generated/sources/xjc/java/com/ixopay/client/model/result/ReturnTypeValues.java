
package com.ixopay.client.model.result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="returnTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FINISHED"/&gt;
 *     &lt;enumeration value="REDIRECT"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "returnTypeValues")
@XmlEnum
public enum ReturnTypeValues {

    FINISHED,
    REDIRECT,
    HTML,
    PENDING,
    ERROR;

    public String value() {
        return name();
    }

    public static ReturnTypeValues fromValue(String v) {
        return valueOf(v);
    }

}
