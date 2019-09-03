
package com.ixopay.client.model.schedule;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scheduleStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="scheduleStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="PAUSED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="CREATE-PENDING"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "scheduleStatusType", namespace = "http://gateway.ixopay.com/Schema/V2/ScheduleResult")
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
