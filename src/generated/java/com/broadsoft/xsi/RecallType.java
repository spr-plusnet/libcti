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
 * <p>Java class for RecallType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RecallType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Busy Camp On Callback"/&gt;
 *     &lt;enumeration value="Call Transfer Recall"/&gt;
 *     &lt;enumeration value="Call Park Recall"/&gt;
 *     &lt;enumeration value="Automatic Hold/Retrieve Recall"/&gt;
 *     &lt;enumeration value="Executive-Assistant Call Push Recall"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecallType")
@XmlEnum
public enum RecallType {


    /**
     * 
     *             The callback was performed because the
     *             camp-on call remained
     *             unanswered beyond the configurable
     *             period.
     * 	  
     * 
     */
    @XmlEnumValue("Busy Camp On Callback")
    BUSY_CAMP_ON_CALLBACK("Busy Camp On Callback"),

    /**
     * 
     *             The callback was performed because the
     *             transferred call failed
     *             to reach the destination.
     *           
     * 
     */
    @XmlEnumValue("Call Transfer Recall")
    CALL_TRANSFER_RECALL("Call Transfer Recall"),

    /**
     * 
     *             The callback was performed because the
     *             parked call was not
     *             retrieved within the configurable
     *             period.
     *           
     * 
     */
    @XmlEnumValue("Call Park Recall")
    CALL_PARK_RECALL("Call Park Recall"),

    /**
     * 
     *             The callback was performed because the held
     *             call was not
     *             retrieved within the configurable
     *             period.
     *           
     * 
     */
    @XmlEnumValue("Automatic Hold/Retrieve Recall")
    AUTOMATIC_HOLD_RETRIEVE_RECALL("Automatic Hold/Retrieve Recall"),

    /**
     * 
     *             The callback was performed because the call initiated by 
     *             the executive assistant was not answered by the executive.
     *           
     * 
     */
    @XmlEnumValue("Executive-Assistant Call Push Recall")
    EXECUTIVE_ASSISTANT_CALL_PUSH_RECALL("Executive-Assistant Call Push Recall");
    private final String value;

    RecallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecallType fromValue(String v) {
        for (RecallType c: RecallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}