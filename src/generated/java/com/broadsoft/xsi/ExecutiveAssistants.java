//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for the list of assistants assigned to the executive.
 *       
 * 
 * <p>Java class for ExecutiveAssistants complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAssistants"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowOptInOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="assignedUsers" type="{http://schema.broadsoft.com/xsi}ExecutiveAssistantDetailsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAssistants", propOrder = {
    "allowOptInOut",
    "assignedUsers"
})
public class ExecutiveAssistants {

    protected boolean allowOptInOut;
    @XmlElement(required = true)
    protected ExecutiveAssistantDetailsList assignedUsers;

    /**
     * Gets the value of the allowOptInOut property.
     * 
     */
    public boolean isAllowOptInOut() {
        return allowOptInOut;
    }

    /**
     * Sets the value of the allowOptInOut property.
     * 
     */
    public void setAllowOptInOut(boolean value) {
        this.allowOptInOut = value;
    }

    /**
     * Gets the value of the assignedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAssistantDetailsList }
     *     
     */
    public ExecutiveAssistantDetailsList getAssignedUsers() {
        return assignedUsers;
    }

    /**
     * Sets the value of the assignedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAssistantDetailsList }
     *     
     */
    public void setAssignedUsers(ExecutiveAssistantDetailsList value) {
        this.assignedUsers = value;
    }

}