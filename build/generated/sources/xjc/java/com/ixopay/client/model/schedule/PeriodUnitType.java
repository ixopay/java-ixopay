
package com.ixopay.client.model.schedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for periodUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="periodUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAY"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="MONTH"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "periodUnitType")
@XmlEnum
public enum PeriodUnitType {

    DAY,
    WEEK,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static PeriodUnitType fromValue(String v) {
        return valueOf(v);
    }

}
