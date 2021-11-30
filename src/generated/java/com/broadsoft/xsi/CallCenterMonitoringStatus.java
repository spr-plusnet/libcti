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
 *         The CallCenterMonitoringStatus maintains real-time information about the call center.
 *         
 *         Change History:
 *         19     - Modified: 
 *                   elements averageHandlingTime, expectedWaitTime, averageSpeedOfAnswer, 
 *                            longestWaitTime, numCallsInQueue
 *                    types changed from NonNegativeInt to NonNegativeIntWithSeverity        
 *       
 * 
 * <p>Java class for CallCenterMonitoringStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallCenterMonitoringStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageHandlingTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/&gt;
 *         &lt;element name="expectedWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/&gt;
 *         &lt;element name="averageSpeedOfAnswer" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/&gt;
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/&gt;
 *         &lt;element name="numCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/&gt;
 *         &lt;element name="numAgentsAssigned" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="numAgentsStaffed" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="numStaffedAgentsIdle" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="numStaffedAgentsUnavailable" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterMonitoringStatus", propOrder = {
    "averageHandlingTime",
    "expectedWaitTime",
    "averageSpeedOfAnswer",
    "longestWaitTime",
    "numCallsInQueue",
    "numAgentsAssigned",
    "numAgentsStaffed",
    "numStaffedAgentsIdle",
    "numStaffedAgentsUnavailable"
})
public class CallCenterMonitoringStatus {

    protected NonNegativeIntWithSeverity averageHandlingTime;
    protected NonNegativeIntWithSeverity expectedWaitTime;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity averageSpeedOfAnswer;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity longestWaitTime;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity numCallsInQueue;
    protected int numAgentsAssigned;
    protected int numAgentsStaffed;
    protected int numStaffedAgentsIdle;
    protected int numStaffedAgentsUnavailable;

    /**
     * Gets the value of the averageHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageHandlingTime() {
        return averageHandlingTime;
    }

    /**
     * Sets the value of the averageHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageHandlingTime(NonNegativeIntWithSeverity value) {
        this.averageHandlingTime = value;
    }

    /**
     * Gets the value of the expectedWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getExpectedWaitTime() {
        return expectedWaitTime;
    }

    /**
     * Sets the value of the expectedWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setExpectedWaitTime(NonNegativeIntWithSeverity value) {
        this.expectedWaitTime = value;
    }

    /**
     * Gets the value of the averageSpeedOfAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageSpeedOfAnswer() {
        return averageSpeedOfAnswer;
    }

    /**
     * Sets the value of the averageSpeedOfAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageSpeedOfAnswer(NonNegativeIntWithSeverity value) {
        this.averageSpeedOfAnswer = value;
    }

    /**
     * Gets the value of the longestWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getLongestWaitTime() {
        return longestWaitTime;
    }

    /**
     * Sets the value of the longestWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setLongestWaitTime(NonNegativeIntWithSeverity value) {
        this.longestWaitTime = value;
    }

    /**
     * Gets the value of the numCallsInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getNumCallsInQueue() {
        return numCallsInQueue;
    }

    /**
     * Sets the value of the numCallsInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setNumCallsInQueue(NonNegativeIntWithSeverity value) {
        this.numCallsInQueue = value;
    }

    /**
     * Gets the value of the numAgentsAssigned property.
     * 
     */
    public int getNumAgentsAssigned() {
        return numAgentsAssigned;
    }

    /**
     * Sets the value of the numAgentsAssigned property.
     * 
     */
    public void setNumAgentsAssigned(int value) {
        this.numAgentsAssigned = value;
    }

    /**
     * Gets the value of the numAgentsStaffed property.
     * 
     */
    public int getNumAgentsStaffed() {
        return numAgentsStaffed;
    }

    /**
     * Sets the value of the numAgentsStaffed property.
     * 
     */
    public void setNumAgentsStaffed(int value) {
        this.numAgentsStaffed = value;
    }

    /**
     * Gets the value of the numStaffedAgentsIdle property.
     * 
     */
    public int getNumStaffedAgentsIdle() {
        return numStaffedAgentsIdle;
    }

    /**
     * Sets the value of the numStaffedAgentsIdle property.
     * 
     */
    public void setNumStaffedAgentsIdle(int value) {
        this.numStaffedAgentsIdle = value;
    }

    /**
     * Gets the value of the numStaffedAgentsUnavailable property.
     * 
     */
    public int getNumStaffedAgentsUnavailable() {
        return numStaffedAgentsUnavailable;
    }

    /**
     * Sets the value of the numStaffedAgentsUnavailable property.
     * 
     */
    public void setNumStaffedAgentsUnavailable(int value) {
        this.numStaffedAgentsUnavailable = value;
    }

}
