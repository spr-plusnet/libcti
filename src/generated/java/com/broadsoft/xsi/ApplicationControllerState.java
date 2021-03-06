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
 * <p>Java class for ApplicationControllerState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ApplicationControllerState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="ready"/&gt;
 *     &lt;enumeration value="not ready"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ApplicationControllerState")
@XmlEnum
public enum ApplicationControllerState {

    @XmlEnumValue("ready")
    READY("ready"),
    @XmlEnumValue("not ready")
    NOT_READY("not ready");
    private final String value;

    ApplicationControllerState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApplicationControllerState fromValue(String v) {
        for (ApplicationControllerState c: ApplicationControllerState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
