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
 * <p>Java class for RecordingControls.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RecordingControls"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="record"/&gt;
 *     &lt;enumeration value="pause"/&gt;
 *     &lt;enumeration value="pause-stop"/&gt;
 *     &lt;enumeration value="resume"/&gt;
 *     &lt;enumeration value="resume-stop"/&gt;
 *     &lt;enumeration value="stop"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecordingControls")
@XmlEnum
public enum RecordingControls {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("pause")
    PAUSE("pause"),
    @XmlEnumValue("pause-stop")
    PAUSE_STOP("pause-stop"),
    @XmlEnumValue("resume")
    RESUME("resume"),
    @XmlEnumValue("resume-stop")
    RESUME_STOP("resume-stop"),
    @XmlEnumValue("stop")
    STOP("stop");
    private final String value;

    RecordingControls(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingControls fromValue(String v) {
        for (RecordingControls c: RecordingControls.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
