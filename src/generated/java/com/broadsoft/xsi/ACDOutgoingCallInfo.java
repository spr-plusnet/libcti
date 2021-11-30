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
 *         Contains the details of a ACD outgoing call.
 *       
 * 
 * <p>Java class for ACDOutgoingCallInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDOutgoingCallInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acdUserId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *         &lt;element name="acdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/&gt;
 *         &lt;element name="acdNumber" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="routePoint" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="dispositionCode" type="{http://schema.broadsoft.com/xsi}AgentDispositionCode" minOccurs="0"/&gt;
 *         &lt;element name="postCallAgentState" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDOutgoingCallInfo", propOrder = {
    "acdUserId",
    "acdName",
    "acdNumber",
    "routePoint",
    "dispositionCode",
    "postCallAgentState"
})
public class ACDOutgoingCallInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acdUserId;
    @XmlElement(required = true)
    protected String acdName;
    @XmlElement(required = true)
    protected Address acdNumber;
    protected EmptyContent routePoint;
    protected String dispositionCode;
    protected String postCallAgentState;

    /**
     * Gets the value of the acdUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdUserId() {
        return acdUserId;
    }

    /**
     * Sets the value of the acdUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdUserId(String value) {
        this.acdUserId = value;
    }

    /**
     * Gets the value of the acdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdName() {
        return acdName;
    }

    /**
     * Sets the value of the acdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdName(String value) {
        this.acdName = value;
    }

    /**
     * Gets the value of the acdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAcdNumber() {
        return acdNumber;
    }

    /**
     * Sets the value of the acdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAcdNumber(Address value) {
        this.acdNumber = value;
    }

    /**
     * Gets the value of the routePoint property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getRoutePoint() {
        return routePoint;
    }

    /**
     * Sets the value of the routePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setRoutePoint(EmptyContent value) {
        this.routePoint = value;
    }

    /**
     * Gets the value of the dispositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Sets the value of the dispositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionCode(String value) {
        this.dispositionCode = value;
    }

    /**
     * Gets the value of the postCallAgentState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCallAgentState() {
        return postCallAgentState;
    }

    /**
     * Sets the value of the postCallAgentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCallAgentState(String value) {
        this.postCallAgentState = value;
    }

}