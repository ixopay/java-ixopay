
package com.ixopay.client.model.result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riskCheckResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="riskCheckResultType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPROVED"/&gt;
 *     &lt;enumeration value="DECLINED"/&gt;
 *     &lt;enumeration value="REVIEW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "riskCheckResultType")
@XmlEnum
public enum RiskCheckResultType {

    APPROVED,
    DECLINED,
    REVIEW;

    public String value() {
        return name();
    }

    public static RiskCheckResultType fromValue(String v) {
        return valueOf(v);
    }

}
