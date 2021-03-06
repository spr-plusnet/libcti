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
 *         The Route Point Call Released event is sent in two cases:
 *         i)following a Route Point Release Call request,
 *         ii)when an outgoing call is released during call setup in which case the
 *         CPD result is provided (if available).
 * 
 *         The removeTime is set to the time the call was released.
 * 
 *       
 * 
 * <p>Java class for RoutePointCallReleasedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallReleasedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="releaseReason" type="{http://schema.broadsoft.com/xsi}RoutePointCallReleaseReason"/&gt;
 *         &lt;element name="outgoingCallReleaseCause" type="{http://schema.broadsoft.com/xsi}ReleaseCause" minOccurs="0"/&gt;
 *         &lt;element name="cpdResult" type="{http://schema.broadsoft.com/xsi}CPDResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallReleasedEvent", propOrder = {
    "releaseReason",
    "outgoingCallReleaseCause",
    "cpdResult"
})
public class RoutePointCallReleasedEvent
    extends RoutePointEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RoutePointCallReleaseReason releaseReason;
    protected ReleaseCause outgoingCallReleaseCause;
    @XmlSchemaType(name = "token")
    protected CPDResult cpdResult;

    /**
     * Gets the value of the releaseReason property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointCallReleaseReason }
     *     
     */
    public RoutePointCallReleaseReason getReleaseReason() {
        return releaseReason;
    }

    /**
     * Sets the value of the releaseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointCallReleaseReason }
     *     
     */
    public void setReleaseReason(RoutePointCallReleaseReason value) {
        this.releaseReason = value;
    }

    /**
     * Gets the value of the outgoingCallReleaseCause property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseCause }
     *     
     */
    public ReleaseCause getOutgoingCallReleaseCause() {
        return outgoingCallReleaseCause;
    }

    /**
     * Sets the value of the outgoingCallReleaseCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseCause }
     *     
     */
    public void setOutgoingCallReleaseCause(ReleaseCause value) {
        this.outgoingCallReleaseCause = value;
    }

    /**
     * Gets the value of the cpdResult property.
     * 
     * @return
     *     possible object is
     *     {@link CPDResult }
     *     
     */
    public CPDResult getCpdResult() {
        return cpdResult;
    }

    /**
     * Sets the value of the cpdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPDResult }
     *     
     */
    public void setCpdResult(CPDResult value) {
        this.cpdResult = value;
    }

}
