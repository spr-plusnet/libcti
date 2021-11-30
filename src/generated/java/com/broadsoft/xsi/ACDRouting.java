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
 * <p>Java class for ACDRouting.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ACDRouting"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Priority Based"/&gt;
 *     &lt;enumeration value="Skill Based"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ACDRouting")
@XmlEnum
public enum ACDRouting {

    @XmlEnumValue("Priority Based")
    PRIORITY_BASED("Priority Based"),
    @XmlEnumValue("Skill Based")
    SKILL_BASED("Skill Based");
    private final String value;

    ACDRouting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACDRouting fromValue(String v) {
        for (ACDRouting c: ACDRouting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
