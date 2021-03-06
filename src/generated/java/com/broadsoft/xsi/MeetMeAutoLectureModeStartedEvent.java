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
 *         Sent whenever the automatic lecture mode starts.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java class for MeetMeAutoLectureModeStartedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeAutoLectureModeStartedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unmutedParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipants" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeAutoLectureModeStartedEvent", propOrder = {
    "unmutedParticipants"
})
public class MeetMeAutoLectureModeStartedEvent
    extends EventData
{

    protected MeetMeConferenceParticipants unmutedParticipants;

    /**
     * Gets the value of the unmutedParticipants property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public MeetMeConferenceParticipants getUnmutedParticipants() {
        return unmutedParticipants;
    }

    /**
     * Sets the value of the unmutedParticipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public void setUnmutedParticipants(MeetMeConferenceParticipants value) {
        this.unmutedParticipants = value;
    }

}
