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
 * <p>Java class for ConferenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConferenceType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Barge-In"/&gt;
 *     &lt;enumeration value="Silently Monitored"/&gt;
 *     &lt;enumeration value="Supervisor Coached"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConferenceType")
@XmlEnum
public enum ConferenceType {

    @XmlEnumValue("Barge-In")
    BARGE_IN("Barge-In"),
    @XmlEnumValue("Silently Monitored")
    SILENTLY_MONITORED("Silently Monitored"),
    @XmlEnumValue("Supervisor Coached")
    SUPERVISOR_COACHED("Supervisor Coached");
    private final String value;

    ConferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConferenceType fromValue(String v) {
        for (ConferenceType c: ConferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
