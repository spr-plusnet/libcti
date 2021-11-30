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
 * <p>Java class for AgentEscalation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AgentEscalation"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentEscalation")
@XmlEnum
public enum AgentEscalation {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency");
    private final String value;

    AgentEscalation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentEscalation fromValue(String v) {
        for (AgentEscalation c: AgentEscalation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
