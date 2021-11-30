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
 *          DNIS Priority Configuration.
 *       
 * 
 * <p>Java class for ACDDNISPrioritySetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDDNISPrioritySetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promoteCallsFromPriority1to0" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority1to0Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *         &lt;element name="promoteCallsFromPriority2to1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority2to1Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *         &lt;element name="promoteCallsFromPriority3to2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority3to2Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDDNISPrioritySetting", propOrder = {
    "promoteCallsFromPriority1To0",
    "promoteCallsFromPriority1To0Seconds",
    "promoteCallsFromPriority2To1",
    "promoteCallsFromPriority2To1Seconds",
    "promoteCallsFromPriority3To2",
    "promoteCallsFromPriority3To2Seconds"
})
public class ACDDNISPrioritySetting {

    @XmlElement(name = "promoteCallsFromPriority1to0")
    protected boolean promoteCallsFromPriority1To0;
    @XmlElement(name = "promoteCallsFromPriority1to0Seconds")
    protected int promoteCallsFromPriority1To0Seconds;
    @XmlElement(name = "promoteCallsFromPriority2to1")
    protected boolean promoteCallsFromPriority2To1;
    @XmlElement(name = "promoteCallsFromPriority2to1Seconds")
    protected int promoteCallsFromPriority2To1Seconds;
    @XmlElement(name = "promoteCallsFromPriority3to2")
    protected boolean promoteCallsFromPriority3To2;
    @XmlElement(name = "promoteCallsFromPriority3to2Seconds")
    protected int promoteCallsFromPriority3To2Seconds;

    /**
     * Gets the value of the promoteCallsFromPriority1To0 property.
     * 
     */
    public boolean isPromoteCallsFromPriority1To0() {
        return promoteCallsFromPriority1To0;
    }

    /**
     * Sets the value of the promoteCallsFromPriority1To0 property.
     * 
     */
    public void setPromoteCallsFromPriority1To0(boolean value) {
        this.promoteCallsFromPriority1To0 = value;
    }

    /**
     * Gets the value of the promoteCallsFromPriority1To0Seconds property.
     * 
     */
    public int getPromoteCallsFromPriority1To0Seconds() {
        return promoteCallsFromPriority1To0Seconds;
    }

    /**
     * Sets the value of the promoteCallsFromPriority1To0Seconds property.
     * 
     */
    public void setPromoteCallsFromPriority1To0Seconds(int value) {
        this.promoteCallsFromPriority1To0Seconds = value;
    }

    /**
     * Gets the value of the promoteCallsFromPriority2To1 property.
     * 
     */
    public boolean isPromoteCallsFromPriority2To1() {
        return promoteCallsFromPriority2To1;
    }

    /**
     * Sets the value of the promoteCallsFromPriority2To1 property.
     * 
     */
    public void setPromoteCallsFromPriority2To1(boolean value) {
        this.promoteCallsFromPriority2To1 = value;
    }

    /**
     * Gets the value of the promoteCallsFromPriority2To1Seconds property.
     * 
     */
    public int getPromoteCallsFromPriority2To1Seconds() {
        return promoteCallsFromPriority2To1Seconds;
    }

    /**
     * Sets the value of the promoteCallsFromPriority2To1Seconds property.
     * 
     */
    public void setPromoteCallsFromPriority2To1Seconds(int value) {
        this.promoteCallsFromPriority2To1Seconds = value;
    }

    /**
     * Gets the value of the promoteCallsFromPriority3To2 property.
     * 
     */
    public boolean isPromoteCallsFromPriority3To2() {
        return promoteCallsFromPriority3To2;
    }

    /**
     * Sets the value of the promoteCallsFromPriority3To2 property.
     * 
     */
    public void setPromoteCallsFromPriority3To2(boolean value) {
        this.promoteCallsFromPriority3To2 = value;
    }

    /**
     * Gets the value of the promoteCallsFromPriority3To2Seconds property.
     * 
     */
    public int getPromoteCallsFromPriority3To2Seconds() {
        return promoteCallsFromPriority3To2Seconds;
    }

    /**
     * Sets the value of the promoteCallsFromPriority3To2Seconds property.
     * 
     */
    public void setPromoteCallsFromPriority3To2Seconds(int value) {
        this.promoteCallsFromPriority3To2Seconds = value;
    }

}