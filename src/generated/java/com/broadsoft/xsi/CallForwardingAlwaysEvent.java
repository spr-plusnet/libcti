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
 *         Notification with the current configuration status for the Call Forwarding
 *         Always service.
 *             
 * 
 * <p>Java class for CallForwardingAlwaysEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallForwardingAlwaysEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ServiceEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" type="{http://schema.broadsoft.com/xsi}CallForwardingAlways" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwardingAlwaysEvent", propOrder = {
    "info"
})
public class CallForwardingAlwaysEvent
    extends ServiceEvent
{

    protected CallForwardingAlways info;

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link CallForwardingAlways }
     *     
     */
    public CallForwardingAlways getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallForwardingAlways }
     *     
     */
    public void setInfo(CallForwardingAlways value) {
        this.info = value;
    }

}