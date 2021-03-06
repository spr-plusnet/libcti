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
 *         Sent when one or more participants leave a conference.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java class for MeetMeParticipantLeftEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeParticipantLeftEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callIds" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceCallIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeParticipantLeftEvent", propOrder = {
    "callIds"
})
public class MeetMeParticipantLeftEvent
    extends EventData
{

    protected MeetMeConferenceCallIdList callIds;

    /**
     * Gets the value of the callIds property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceCallIdList }
     *     
     */
    public MeetMeConferenceCallIdList getCallIds() {
        return callIds;
    }

    /**
     * Sets the value of the callIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceCallIdList }
     *     
     */
    public void setCallIds(MeetMeConferenceCallIdList value) {
        this.callIds = value;
    }

}
