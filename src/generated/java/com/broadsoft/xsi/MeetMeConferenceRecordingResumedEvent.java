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
 *         Sent sent when a conference's recording service is resumed.
 * 
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java class for MeetMeConferenceRecordingResumedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceRecordingResumedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceParticipant" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceRecordingResumedEvent", propOrder = {
    "conferenceParticipant"
})
public class MeetMeConferenceRecordingResumedEvent
    extends EventData
{

    protected MeetMeConferenceParticipant conferenceParticipant;

    /**
     * Gets the value of the conferenceParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceParticipant }
     *     
     */
    public MeetMeConferenceParticipant getConferenceParticipant() {
        return conferenceParticipant;
    }

    /**
     * Sets the value of the conferenceParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceParticipant }
     *     
     */
    public void setConferenceParticipant(MeetMeConferenceParticipant value) {
        this.conferenceParticipant = value;
    }

}
