//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.21 at 03:44:38 PM CEST 
//


package com.ixopay.client.model.status;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scheduleStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="CREATE-PENDING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "scheduleStatusType")
@XmlEnum
public enum ScheduleStatusType {

    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    CANCELLED("CANCELLED"),
    ERROR("ERROR"),
    @XmlEnumValue("CREATE-PENDING")
    CREATE_PENDING("CREATE-PENDING");
    private final String value;

    ScheduleStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScheduleStatusType fromValue(String v) {
        for (ScheduleStatusType c: ScheduleStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}