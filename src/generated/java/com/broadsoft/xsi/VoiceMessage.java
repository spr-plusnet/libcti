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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="messageInfo" type="{http://schema.broadsoft.com/xsi}MessageInfo"/&gt;
 *         &lt;element name="messageMediaContent" type="{http://schema.broadsoft.com/xsi}MessageMediaContent"/&gt;
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
    "messageInfo",
    "messageMediaContent"
})
@XmlRootElement(name = "VoiceMessage")
public class VoiceMessage {

    @XmlElement(required = true)
    protected MessageInfo messageInfo;
    @XmlElement(required = true)
    protected MessageMediaContent messageMediaContent;

    /**
     * Gets the value of the messageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Sets the value of the messageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessageInfo(MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Gets the value of the messageMediaContent property.
     * 
     * @return
     *     possible object is
     *     {@link MessageMediaContent }
     *     
     */
    public MessageMediaContent getMessageMediaContent() {
        return messageMediaContent;
    }

    /**
     * Sets the value of the messageMediaContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMediaContent }
     *     
     */
    public void setMessageMediaContent(MessageMediaContent value) {
        this.messageMediaContent = value;
    }

}