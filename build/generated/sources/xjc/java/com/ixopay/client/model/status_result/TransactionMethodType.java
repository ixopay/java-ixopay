
package com.ixopay.client.model.status_result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionMethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBIT"/&gt;
 *     &lt;enumeration value="CAPTURE"/&gt;
 *     &lt;enumeration value="DEREGISTER"/&gt;
 *     &lt;enumeration value="PREAUTHORIZE"/&gt;
 *     &lt;enumeration value="REFUND"/&gt;
 *     &lt;enumeration value="REGISTER"/&gt;
 *     &lt;enumeration value="VOID"/&gt;
 *     &lt;enumeration value="CHARGEBACK"/&gt;
 *     &lt;enumeration value="CHARGEBACK-REVERSAL"/&gt;
 *     &lt;enumeration value="PAYOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionMethodType")
@XmlEnum
public enum TransactionMethodType {

    DEBIT("DEBIT"),
    CAPTURE("CAPTURE"),
    DEREGISTER("DEREGISTER"),
    PREAUTHORIZE("PREAUTHORIZE"),
    REFUND("REFUND"),
    REGISTER("REGISTER"),
    VOID("VOID"),
    CHARGEBACK("CHARGEBACK"),
    @XmlEnumValue("CHARGEBACK-REVERSAL")
    CHARGEBACK_REVERSAL("CHARGEBACK-REVERSAL"),
    PAYOUT("PAYOUT");
    private final String value;

    TransactionMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionMethodType fromValue(String v) {
        for (TransactionMethodType c: TransactionMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
