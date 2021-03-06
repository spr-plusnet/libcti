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
 * <p>Java class for CallCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CallCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Local"/&gt;
 *     &lt;enumeration value="National"/&gt;
 *     &lt;enumeration value="Interlata"/&gt;
 *     &lt;enumeration value="Intralata"/&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallCategory")
@XmlEnum
public enum CallCategory {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Interlata")
    INTERLATA("Interlata"),
    @XmlEnumValue("Intralata")
    INTRALATA("Intralata"),
    @XmlEnumValue("International")
    INTERNATIONAL("International"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CallCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallCategory fromValue(String v) {
        for (CallCategory c: CallCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
