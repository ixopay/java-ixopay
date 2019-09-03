
package com.ixopay.client.model.transaction;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionIndicatorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SINGLE"/&gt;
 *     &lt;enumeration value="INITIAL"/&gt;
 *     &lt;enumeration value="RECURRING"/&gt;
 *     &lt;enumeration value="CARDONFILE"/&gt;
 *     &lt;enumeration value="CARDONFILE-MERCHANT-INITIATED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionIndicatorType")
@XmlEnum
public enum TransactionIndicatorType {

    SINGLE("SINGLE"),
    INITIAL("INITIAL"),
    RECURRING("RECURRING"),
    CARDONFILE("CARDONFILE"),
    @XmlEnumValue("CARDONFILE-MERCHANT-INITIATED")
    CARDONFILE_MERCHANT_INITIATED("CARDONFILE-MERCHANT-INITIATED");
    private final String value;

    TransactionIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionIndicatorType fromValue(String v) {
        for (TransactionIndicatorType c: TransactionIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
