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
 * <p>Java class for CollaborateRoomType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CollaborateRoomType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="MyRoom"/&gt;
 *     &lt;enumeration value="InstantRoom"/&gt;
 *     &lt;enumeration value="ProjectRoom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollaborateRoomType")
@XmlEnum
public enum CollaborateRoomType {

    @XmlEnumValue("MyRoom")
    MY_ROOM("MyRoom"),
    @XmlEnumValue("InstantRoom")
    INSTANT_ROOM("InstantRoom"),
    @XmlEnumValue("ProjectRoom")
    PROJECT_ROOM("ProjectRoom");
    private final String value;

    CollaborateRoomType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollaborateRoomType fromValue(String v) {
        for (CollaborateRoomType c: CollaborateRoomType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
