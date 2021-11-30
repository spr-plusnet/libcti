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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         This event is used to report that the specified channel has been
 *         terminated. 
 *       
 * 
 * <p>Java class for ChannelTerminatedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChannelTerminatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}BaseEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelId" type="{http://schema.broadsoft.com/xsi}ChannelId"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}ChannelTerminatedReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTerminatedEvent", propOrder = {
    "channelId",
    "reason"
})
public class ChannelTerminatedEvent
    extends BaseEvent
{

    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected ChannelTerminatedReason reason;

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelTerminatedReason }
     *     
     */
    public ChannelTerminatedReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTerminatedReason }
     *     
     */
    public void setReason(ChannelTerminatedReason value) {
        this.reason = value;
    }

}
