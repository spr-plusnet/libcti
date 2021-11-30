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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentId" type="{http://schema.broadsoft.com/xsi}SubscriberId"/&gt;
 *         &lt;element name="callingLineIdNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="callingLineIdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
 *         &lt;element name="timeInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="whisperMessageAudioUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyURI" minOccurs="0"/&gt;
 *         &lt;element name="whisperMessageVideoUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agentId",
    "callingLineIdNumber",
    "callingLineIdName",
    "timeInQueue",
    "numberOfCallsInQueue",
    "longestWaitTime",
    "whisperMessageAudioUrl",
    "whisperMessageVideoUrl"
})
@XmlRootElement(name = "RoutePointDistribute")
public class RoutePointDistribute {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agentId;
    protected Address callingLineIdNumber;
    protected String callingLineIdName;
    protected Integer timeInQueue;
    protected Integer numberOfCallsInQueue;
    protected Integer longestWaitTime;
    @XmlSchemaType(name = "anyURI")
    protected String whisperMessageAudioUrl;
    protected String whisperMessageVideoUrl;

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the callingLineIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCallingLineIdNumber() {
        return callingLineIdNumber;
    }

    /**
     * Sets the value of the callingLineIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCallingLineIdNumber(Address value) {
        this.callingLineIdNumber = value;
    }

    /**
     * Gets the value of the callingLineIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdName() {
        return callingLineIdName;
    }

    /**
     * Sets the value of the callingLineIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdName(String value) {
        this.callingLineIdName = value;
    }

    /**
     * Gets the value of the timeInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeInQueue() {
        return timeInQueue;
    }

    /**
     * Sets the value of the timeInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeInQueue(Integer value) {
        this.timeInQueue = value;
    }

    /**
     * Gets the value of the numberOfCallsInQueue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCallsInQueue() {
        return numberOfCallsInQueue;
    }

    /**
     * Sets the value of the numberOfCallsInQueue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCallsInQueue(Integer value) {
        this.numberOfCallsInQueue = value;
    }

    /**
     * Gets the value of the longestWaitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongestWaitTime() {
        return longestWaitTime;
    }

    /**
     * Sets the value of the longestWaitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongestWaitTime(Integer value) {
        this.longestWaitTime = value;
    }

    /**
     * Gets the value of the whisperMessageAudioUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperMessageAudioUrl() {
        return whisperMessageAudioUrl;
    }

    /**
     * Sets the value of the whisperMessageAudioUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperMessageAudioUrl(String value) {
        this.whisperMessageAudioUrl = value;
    }

    /**
     * Gets the value of the whisperMessageVideoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperMessageVideoUrl() {
        return whisperMessageVideoUrl;
    }

    /**
     * Sets the value of the whisperMessageVideoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperMessageVideoUrl(String value) {
        this.whisperMessageVideoUrl = value;
    }

}