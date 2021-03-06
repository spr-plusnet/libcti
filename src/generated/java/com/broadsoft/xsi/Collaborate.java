//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bridgeInfo" type="{http://schema.broadsoft.com/xsi}CollaborateBridgeInfo" minOccurs="0"/&gt;
 *         &lt;element name="rooms" type="{http://schema.broadsoft.com/xsi}CollaborateRoomList" minOccurs="0"/&gt;
 *         &lt;element name="commonInstantRoomSettings" type="{http://schema.broadsoft.com/xsi}CommonInstantRoomSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bridgeInfo",
    "rooms",
    "commonInstantRoomSettings"
})
@XmlRootElement(name = "Collaborate")
public class Collaborate {

    protected CollaborateBridgeInfo bridgeInfo;
    protected CollaborateRoomList rooms;
    protected CommonInstantRoomSettings commonInstantRoomSettings;

    /**
     * Gets the value of the bridgeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateBridgeInfo }
     *     
     */
    public CollaborateBridgeInfo getBridgeInfo() {
        return bridgeInfo;
    }

    /**
     * Sets the value of the bridgeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateBridgeInfo }
     *     
     */
    public void setBridgeInfo(CollaborateBridgeInfo value) {
        this.bridgeInfo = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomList }
     *     
     */
    public CollaborateRoomList getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomList }
     *     
     */
    public void setRooms(CollaborateRoomList value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the commonInstantRoomSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CommonInstantRoomSettings }
     *     
     */
    public CommonInstantRoomSettings getCommonInstantRoomSettings() {
        return commonInstantRoomSettings;
    }

    /**
     * Sets the value of the commonInstantRoomSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInstantRoomSettings }
     *     
     */
    public void setCommonInstantRoomSettings(CommonInstantRoomSettings value) {
        this.commonInstantRoomSettings = value;
    }

}
