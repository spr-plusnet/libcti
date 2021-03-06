//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the CommPilot Express service configuration data.
 *       
 * 
 * <p>Java class for CommPilotExpress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profile" type="{http://schema.broadsoft.com/xsi}CommPilotExpressProfile" minOccurs="0"/&gt;
 *         &lt;element name="availableInOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableInOffice" minOccurs="0"/&gt;
 *         &lt;element name="availableOutOfOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableOutOfOffice" minOccurs="0"/&gt;
 *         &lt;element name="busy" type="{http://schema.broadsoft.com/xsi}CommPilotExpressBusy" minOccurs="0"/&gt;
 *         &lt;element name="unavailable" type="{http://schema.broadsoft.com/xsi}CommPilotExpressUnavailable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpress", propOrder = {
    "profile",
    "availableInOffice",
    "availableOutOfOffice",
    "busy",
    "unavailable"
})
public class CommPilotExpress {

    @XmlElementRef(name = "profile", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CommPilotExpressProfile> profile;
    protected CommPilotExpressAvailableInOffice availableInOffice;
    protected CommPilotExpressAvailableOutOfOffice availableOutOfOffice;
    protected CommPilotExpressBusy busy;
    protected CommPilotExpressUnavailable unavailable;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommPilotExpressProfile }{@code >}
     *     
     */
    public JAXBElement<CommPilotExpressProfile> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommPilotExpressProfile }{@code >}
     *     
     */
    public void setProfile(JAXBElement<CommPilotExpressProfile> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the availableInOffice property.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressAvailableInOffice }
     *     
     */
    public CommPilotExpressAvailableInOffice getAvailableInOffice() {
        return availableInOffice;
    }

    /**
     * Sets the value of the availableInOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressAvailableInOffice }
     *     
     */
    public void setAvailableInOffice(CommPilotExpressAvailableInOffice value) {
        this.availableInOffice = value;
    }

    /**
     * Gets the value of the availableOutOfOffice property.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressAvailableOutOfOffice }
     *     
     */
    public CommPilotExpressAvailableOutOfOffice getAvailableOutOfOffice() {
        return availableOutOfOffice;
    }

    /**
     * Sets the value of the availableOutOfOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressAvailableOutOfOffice }
     *     
     */
    public void setAvailableOutOfOffice(CommPilotExpressAvailableOutOfOffice value) {
        this.availableOutOfOffice = value;
    }

    /**
     * Gets the value of the busy property.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressBusy }
     *     
     */
    public CommPilotExpressBusy getBusy() {
        return busy;
    }

    /**
     * Sets the value of the busy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressBusy }
     *     
     */
    public void setBusy(CommPilotExpressBusy value) {
        this.busy = value;
    }

    /**
     * Gets the value of the unavailable property.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressUnavailable }
     *     
     */
    public CommPilotExpressUnavailable getUnavailable() {
        return unavailable;
    }

    /**
     * Sets the value of the unavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressUnavailable }
     *     
     */
    public void setUnavailable(CommPilotExpressUnavailable value) {
        this.unavailable = value;
    }

}
