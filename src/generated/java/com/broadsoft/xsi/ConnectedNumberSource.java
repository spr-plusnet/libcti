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
 * <p>Java class for ConnectedNumberSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConnectedNumberSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Configurable CLID"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Department"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectedNumberSource")
@XmlEnum
public enum ConnectedNumberSource {

    @XmlEnumValue("Configurable CLID")
    CONFIGURABLE_CLID("Configurable CLID"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department");
    private final String value;

    ConnectedNumberSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectedNumberSource fromValue(String v) {
        for (ConnectedNumberSource c: ConnectedNumberSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}