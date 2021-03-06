//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateAddressTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AlternateAddressTypeEnum"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="DNIS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlternateAddressTypeEnum")
@XmlEnum
public enum AlternateAddressTypeEnum {


    /**
     * 
     *             Fax Messaging address.
     *           
     * 
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * 
     *             DNIS address.
     *           
     * 
     */
    DNIS("DNIS");
    private final String value;

    AlternateAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateAddressTypeEnum fromValue(String v) {
        for (AlternateAddressTypeEnum c: AlternateAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
