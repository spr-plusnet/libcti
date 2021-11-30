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
 * <p>Java class for CallCenterManualNightServiceAnnouncementMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CallCenterManualNightServiceAnnouncementMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Normal Announcement"/&gt;
 *     &lt;enumeration value="Manual Announcement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallCenterManualNightServiceAnnouncementMode")
@XmlEnum
public enum CallCenterManualNightServiceAnnouncementMode {

    @XmlEnumValue("Normal Announcement")
    NORMAL_ANNOUNCEMENT("Normal Announcement"),
    @XmlEnumValue("Manual Announcement")
    MANUAL_ANNOUNCEMENT("Manual Announcement");
    private final String value;

    CallCenterManualNightServiceAnnouncementMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallCenterManualNightServiceAnnouncementMode fromValue(String v) {
        for (CallCenterManualNightServiceAnnouncementMode c: CallCenterManualNightServiceAnnouncementMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}