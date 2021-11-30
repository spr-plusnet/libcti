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
 *         A RoutePointQueueEntry provides information about each call
 *         maintained in a route point queue.
 *             
 * 
 * <p>Java class for RoutePointQueueEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointQueueEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/&gt;
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/&gt;
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/&gt;
 *         &lt;element name="addTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="removeTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="bounced" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="routePointName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/&gt;
 *         &lt;element name="routePointNumber" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="playCollectInfo" type="{http://schema.broadsoft.com/xsi}PlayCollectInfo" minOccurs="0"/&gt;
 *         &lt;element name="outgoingCall" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="outgoingCallAnswerTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="answeringUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/&gt;
 *         &lt;element name="answeringCallId" type="{http://schema.broadsoft.com/xsi}CallId" minOccurs="0"/&gt;
 *         &lt;element name="answeringNetworkCallId" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointQueueEntry", propOrder = {
    "callId",
    "extTrackingId",
    "remoteParty",
    "addTime",
    "removeTime",
    "bounced",
    "routePointName",
    "routePointNumber",
    "playCollectInfo",
    "outgoingCall",
    "outgoingCallAnswerTime",
    "answeringUserId",
    "answeringCallId",
    "answeringNetworkCallId"
})
public class RoutePointQueueEntry {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extTrackingId;
    @XmlElement(required = true)
    protected PartyInformation remoteParty;
    protected Long addTime;
    protected Long removeTime;
    protected EmptyContent bounced;
    @XmlElement(required = true)
    protected String routePointName;
    @XmlElement(required = true)
    protected Address routePointNumber;
    protected PlayCollectInfo playCollectInfo;
    protected EmptyContent outgoingCall;
    protected Long outgoingCallAnswerTime;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringCallId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringNetworkCallId;

    /**
     * Gets the value of the callId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Sets the value of the callId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Gets the value of the extTrackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTrackingId() {
        return extTrackingId;
    }

    /**
     * Sets the value of the extTrackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTrackingId(String value) {
        this.extTrackingId = value;
    }

    /**
     * Gets the value of the remoteParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getRemoteParty() {
        return remoteParty;
    }

    /**
     * Sets the value of the remoteParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setRemoteParty(PartyInformation value) {
        this.remoteParty = value;
    }

    /**
     * Gets the value of the addTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddTime() {
        return addTime;
    }

    /**
     * Sets the value of the addTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddTime(Long value) {
        this.addTime = value;
    }

    /**
     * Gets the value of the removeTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemoveTime() {
        return removeTime;
    }

    /**
     * Sets the value of the removeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemoveTime(Long value) {
        this.removeTime = value;
    }

    /**
     * Gets the value of the bounced property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getBounced() {
        return bounced;
    }

    /**
     * Sets the value of the bounced property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setBounced(EmptyContent value) {
        this.bounced = value;
    }

    /**
     * Gets the value of the routePointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePointName() {
        return routePointName;
    }

    /**
     * Sets the value of the routePointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePointName(String value) {
        this.routePointName = value;
    }

    /**
     * Gets the value of the routePointNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRoutePointNumber() {
        return routePointNumber;
    }

    /**
     * Sets the value of the routePointNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRoutePointNumber(Address value) {
        this.routePointNumber = value;
    }

    /**
     * Gets the value of the playCollectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlayCollectInfo }
     *     
     */
    public PlayCollectInfo getPlayCollectInfo() {
        return playCollectInfo;
    }

    /**
     * Sets the value of the playCollectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayCollectInfo }
     *     
     */
    public void setPlayCollectInfo(PlayCollectInfo value) {
        this.playCollectInfo = value;
    }

    /**
     * Gets the value of the outgoingCall property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getOutgoingCall() {
        return outgoingCall;
    }

    /**
     * Sets the value of the outgoingCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setOutgoingCall(EmptyContent value) {
        this.outgoingCall = value;
    }

    /**
     * Gets the value of the outgoingCallAnswerTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutgoingCallAnswerTime() {
        return outgoingCallAnswerTime;
    }

    /**
     * Sets the value of the outgoingCallAnswerTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutgoingCallAnswerTime(Long value) {
        this.outgoingCallAnswerTime = value;
    }

    /**
     * Gets the value of the answeringUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringUserId() {
        return answeringUserId;
    }

    /**
     * Sets the value of the answeringUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringUserId(String value) {
        this.answeringUserId = value;
    }

    /**
     * Gets the value of the answeringCallId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringCallId() {
        return answeringCallId;
    }

    /**
     * Sets the value of the answeringCallId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringCallId(String value) {
        this.answeringCallId = value;
    }

    /**
     * Gets the value of the answeringNetworkCallId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringNetworkCallId() {
        return answeringNetworkCallId;
    }

    /**
     * Sets the value of the answeringNetworkCallId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringNetworkCallId(String value) {
        this.answeringNetworkCallId = value;
    }

}
