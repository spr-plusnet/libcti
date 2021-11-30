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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Defines the details of an instance of an active MeetMe 
 *         Conference. This will nto have the information of a participants
 *         in the conference.   
 *         Release Added:  R17.sp3
 *         Release Modified R19.0
 *         Change History:
 *         20.0 - Added clientSessionInfo element
 *       
 * 
 * <p>Java class for MeetMeConferenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lectureMode" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="automaticLectureMode" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="lock" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="recordingState" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceRecordingState"/&gt;
 *         &lt;element name="securityClassification" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/&gt;
 *         &lt;element name="clientSessionInfo" type="{http://schema.broadsoft.com/xsi}ClientSessionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceInfo", propOrder = {
    "lectureMode",
    "automaticLectureMode",
    "lock",
    "recordingState",
    "securityClassification",
    "clientSessionInfo"
})
public class MeetMeConferenceInfo {

    protected EmptyContent lectureMode;
    protected EmptyContent automaticLectureMode;
    protected EmptyContent lock;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MeetMeConferenceRecordingState recordingState;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityClassification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientSessionInfo;

    /**
     * Gets the value of the lectureMode property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getLectureMode() {
        return lectureMode;
    }

    /**
     * Sets the value of the lectureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setLectureMode(EmptyContent value) {
        this.lectureMode = value;
    }

    /**
     * Gets the value of the automaticLectureMode property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getAutomaticLectureMode() {
        return automaticLectureMode;
    }

    /**
     * Sets the value of the automaticLectureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setAutomaticLectureMode(EmptyContent value) {
        this.automaticLectureMode = value;
    }

    /**
     * Gets the value of the lock property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getLock() {
        return lock;
    }

    /**
     * Sets the value of the lock property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setLock(EmptyContent value) {
        this.lock = value;
    }

    /**
     * Gets the value of the recordingState property.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceRecordingState }
     *     
     */
    public MeetMeConferenceRecordingState getRecordingState() {
        return recordingState;
    }

    /**
     * Sets the value of the recordingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceRecordingState }
     *     
     */
    public void setRecordingState(MeetMeConferenceRecordingState value) {
        this.recordingState = value;
    }

    /**
     * Gets the value of the securityClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Sets the value of the securityClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassification(String value) {
        this.securityClassification = value;
    }

    /**
     * Gets the value of the clientSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionInfo() {
        return clientSessionInfo;
    }

    /**
     * Sets the value of the clientSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionInfo(String value) {
        this.clientSessionInfo = value;
    }

}
