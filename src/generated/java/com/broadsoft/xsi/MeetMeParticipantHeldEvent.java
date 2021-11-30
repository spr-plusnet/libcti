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
 *         Sent when one or more participants are held in a conference.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java class for MeetMeParticipantHeldEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeParticipantHeldEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipants"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeParticipantHeldEvent", propOrder = {
    "conferenceParticipants"
})
public class MeetMeParticipantHeldEvent
    extends EventData
{

    @XmlElement(required = true)
    protected MeetMeConferenceParticipants conferenceParticipants;

    /**
     * Gets the value of the conferenceParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public MeetMeConferenceParticipants getConferenceParticipants() {
        return conferenceParticipants;
    }

    /**
     * Sets the value of the conferenceParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public void setConferenceParticipants(MeetMeConferenceParticipants value) {
        this.conferenceParticipants = value;
    }

}
