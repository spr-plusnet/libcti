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
 * <p>Java class for CallRecordingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CallRecordingMode"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="always"/&gt;
 *     &lt;enumeration value="never"/&gt;
 *     &lt;enumeration value="on-demand"/&gt;
 *     &lt;enumeration value="always-pause-resume"/&gt;
 *     &lt;enumeration value="on-demand-user-start"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallRecordingMode")
@XmlEnum
public enum CallRecordingMode {

    @XmlEnumValue("always")
    ALWAYS("always"),
    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("on-demand")
    ON_DEMAND("on-demand"),
    @XmlEnumValue("always-pause-resume")
    ALWAYS_PAUSE_RESUME("always-pause-resume"),
    @XmlEnumValue("on-demand-user-start")
    ON_DEMAND_USER_START("on-demand-user-start");
    private final String value;

    CallRecordingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallRecordingMode fromValue(String v) {
        for (CallRecordingMode c: CallRecordingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
