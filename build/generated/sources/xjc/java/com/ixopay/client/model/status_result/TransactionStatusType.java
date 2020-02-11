
package com.ixopay.client.model.status_result;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="PENDING"/&gt;
 *     &lt;enumeration value="REDIRECT"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "transactionStatusType")
@XmlEnum
public enum TransactionStatusType {

    SUCCESS,
    PENDING,
    REDIRECT,
    CANCELLED,
    ERROR;

    public String value() {
        return name();
    }

    public static TransactionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
