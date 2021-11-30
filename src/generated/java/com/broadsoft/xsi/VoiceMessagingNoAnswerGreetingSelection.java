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
 * <p>Java class for VoiceMessagingNoAnswerGreetingSelection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="VoiceMessagingNoAnswerGreetingSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Alternate01"/&gt;
 *     &lt;enumeration value="Alternate02"/&gt;
 *     &lt;enumeration value="Alternate03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoiceMessagingNoAnswerGreetingSelection")
@XmlEnum
public enum VoiceMessagingNoAnswerGreetingSelection {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Alternate01")
    ALTERNATE_01("Alternate01"),
    @XmlEnumValue("Alternate02")
    ALTERNATE_02("Alternate02"),
    @XmlEnumValue("Alternate03")
    ALTERNATE_03("Alternate03");
    private final String value;

    VoiceMessagingNoAnswerGreetingSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoiceMessagingNoAnswerGreetingSelection fromValue(String v) {
        for (VoiceMessagingNoAnswerGreetingSelection c: VoiceMessagingNoAnswerGreetingSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}