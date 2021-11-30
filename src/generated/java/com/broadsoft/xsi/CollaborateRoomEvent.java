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
 *         This schema defines the information of a
 *         collaboration which is active.It will give current state of
 *         the collaboration
 *       
 * 
 * <p>Java class for CollaborateRoomEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaborateRoomInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomEventInfo"/&gt;
 *         &lt;element name="collaborateRoomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomEvent", propOrder = {
    "collaborateRoomInfo",
    "collaborateRoomParticipants"
})
public class CollaborateRoomEvent {

    @XmlElement(required = true)
    protected CollaborateRoomEventInfo collaborateRoomInfo;
    @XmlElement(required = true)
    protected CollaborateRoomParticipants collaborateRoomParticipants;

    /**
     * Gets the value of the collaborateRoomInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomEventInfo }
     *     
     */
    public CollaborateRoomEventInfo getCollaborateRoomInfo() {
        return collaborateRoomInfo;
    }

    /**
     * Sets the value of the collaborateRoomInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomEventInfo }
     *     
     */
    public void setCollaborateRoomInfo(CollaborateRoomEventInfo value) {
        this.collaborateRoomInfo = value;
    }

    /**
     * Gets the value of the collaborateRoomParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public CollaborateRoomParticipants getCollaborateRoomParticipants() {
        return collaborateRoomParticipants;
    }

    /**
     * Sets the value of the collaborateRoomParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public void setCollaborateRoomParticipants(CollaborateRoomParticipants value) {
        this.collaborateRoomParticipants = value;
    }

}