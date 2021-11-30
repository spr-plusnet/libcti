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
 * <p>Java class for ExecutiveCallFilteringMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ExecutiveCallFilteringMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Simple"/&gt;
 *     &lt;enumeration value="Advanced"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveCallFilteringMode")
@XmlEnum
public enum ExecutiveCallFilteringMode {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced");
    private final String value;

    ExecutiveCallFilteringMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveCallFilteringMode fromValue(String v) {
        for (ExecutiveCallFilteringMode c: ExecutiveCallFilteringMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}