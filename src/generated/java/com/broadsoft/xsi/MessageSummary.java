//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the message summary details for a service. 
 *       
 * 
 * <p>Java class for MessageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="oldMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="newUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="oldUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSummary", propOrder = {
    "newMessages",
    "oldMessages",
    "newUrgentMessages",
    "oldUrgentMessages"
})
public class MessageSummary {

    protected Integer newMessages;
    protected Integer oldMessages;
    protected Integer newUrgentMessages;
    protected Integer oldUrgentMessages;

    /**
     * Gets the value of the newMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMessages() {
        return newMessages;
    }

    /**
     * Sets the value of the newMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMessages(Integer value) {
        this.newMessages = value;
    }

    /**
     * Gets the value of the oldMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldMessages() {
        return oldMessages;
    }

    /**
     * Sets the value of the oldMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldMessages(Integer value) {
        this.oldMessages = value;
    }

    /**
     * Gets the value of the newUrgentMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewUrgentMessages() {
        return newUrgentMessages;
    }

    /**
     * Sets the value of the newUrgentMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewUrgentMessages(Integer value) {
        this.newUrgentMessages = value;
    }

    /**
     * Gets the value of the oldUrgentMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldUrgentMessages() {
        return oldUrgentMessages;
    }

    /**
     * Sets the value of the oldUrgentMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldUrgentMessages(Integer value) {
        this.oldUrgentMessages = value;
    }

}