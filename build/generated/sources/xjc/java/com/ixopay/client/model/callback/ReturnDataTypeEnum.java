
package com.ixopay.client.model.callback;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="returnDataTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="creditcardData"/&gt;
 *     &lt;enumeration value="phoneData"/&gt;
 *     &lt;enumeration value="ibanData"/&gt;
 *     &lt;enumeration value="walletData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "returnDataTypeEnum")
@XmlEnum
public enum ReturnDataTypeEnum {

    @XmlEnumValue("creditcardData")
    CREDITCARD_DATA("creditcardData"),
    @XmlEnumValue("phoneData")
    PHONE_DATA("phoneData"),
    @XmlEnumValue("ibanData")
    IBAN_DATA("ibanData"),
    @XmlEnumValue("walletData")
    WALLET_DATA("walletData");
    private final String value;

    ReturnDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnDataTypeEnum fromValue(String v) {
        for (ReturnDataTypeEnum c: ReturnDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
