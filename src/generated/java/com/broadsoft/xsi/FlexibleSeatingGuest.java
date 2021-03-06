//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *   User Flexible Seating Guest properties. Flexible Seating Guest allows a user to associate their service profile with a Flexible Seating Host user. This allows the guest user to use the host's device with the guest user's service profile. This is useful for transient employees. The Xsi provides for association of a Flexible Seating Host user to a Flexible Seating Guest, as well as control of Flexible Seating Guest settings.
 *     The following elements are read-only 
 *       hostLastName
 *       hostFirstName
 *       hostAssociationDateTime
 *       hostEnforcesAssociationLimit
 *       hostAssociationLimitHours
 *         Change History:
 *         R20.0 – Added. 
 *    
 * 
 * <p>Java class for FlexibleSeatingGuest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexibleSeatingGuest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="associationLimitHours" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingAssociationLimitHours" minOccurs="0"/&gt;
 *         &lt;element name="unlockPhonePINCode" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingGuestUnlockPhonePINCode" minOccurs="0"/&gt;
 *         &lt;element name="accessDevice" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingGuestAccessDevice" minOccurs="0"/&gt;
 *         &lt;element name="hostUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/&gt;
 *         &lt;element name="hostLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/&gt;
 *         &lt;element name="hostFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/&gt;
 *         &lt;element name="hostAssociationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hostEnforcesAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hostAssociationLimitHours" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingAssociationLimitHours" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleSeatingGuest", propOrder = {
    "enableAssociationLimit",
    "associationLimitHours",
    "unlockPhonePINCode",
    "accessDevice",
    "hostUserId",
    "hostLastName",
    "hostFirstName",
    "hostAssociationDateTime",
    "hostEnforcesAssociationLimit",
    "hostAssociationLimitHours"
})
public class FlexibleSeatingGuest
    extends ActivatableServiceInfo
{

    protected Boolean enableAssociationLimit;
    protected Integer associationLimitHours;
    @XmlElementRef(name = "unlockPhonePINCode", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unlockPhonePINCode;
    protected FlexibleSeatingGuestAccessDevice accessDevice;
    @XmlElementRef(name = "hostUserId", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostFirstName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hostAssociationDateTime;
    protected Boolean hostEnforcesAssociationLimit;
    protected Integer hostAssociationLimitHours;

    /**
     * Gets the value of the enableAssociationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAssociationLimit() {
        return enableAssociationLimit;
    }

    /**
     * Sets the value of the enableAssociationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAssociationLimit(Boolean value) {
        this.enableAssociationLimit = value;
    }

    /**
     * Gets the value of the associationLimitHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssociationLimitHours() {
        return associationLimitHours;
    }

    /**
     * Sets the value of the associationLimitHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssociationLimitHours(Integer value) {
        this.associationLimitHours = value;
    }

    /**
     * Gets the value of the unlockPhonePINCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnlockPhonePINCode() {
        return unlockPhonePINCode;
    }

    /**
     * Sets the value of the unlockPhonePINCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnlockPhonePINCode(JAXBElement<String> value) {
        this.unlockPhonePINCode = value;
    }

    /**
     * Gets the value of the accessDevice property.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleSeatingGuestAccessDevice }
     *     
     */
    public FlexibleSeatingGuestAccessDevice getAccessDevice() {
        return accessDevice;
    }

    /**
     * Sets the value of the accessDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleSeatingGuestAccessDevice }
     *     
     */
    public void setAccessDevice(FlexibleSeatingGuestAccessDevice value) {
        this.accessDevice = value;
    }

    /**
     * Gets the value of the hostUserId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostUserId() {
        return hostUserId;
    }

    /**
     * Sets the value of the hostUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostUserId(JAXBElement<String> value) {
        this.hostUserId = value;
    }

    /**
     * Gets the value of the hostLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostLastName() {
        return hostLastName;
    }

    /**
     * Sets the value of the hostLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostLastName(String value) {
        this.hostLastName = value;
    }

    /**
     * Gets the value of the hostFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostFirstName() {
        return hostFirstName;
    }

    /**
     * Sets the value of the hostFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostFirstName(String value) {
        this.hostFirstName = value;
    }

    /**
     * Gets the value of the hostAssociationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHostAssociationDateTime() {
        return hostAssociationDateTime;
    }

    /**
     * Sets the value of the hostAssociationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHostAssociationDateTime(XMLGregorianCalendar value) {
        this.hostAssociationDateTime = value;
    }

    /**
     * Gets the value of the hostEnforcesAssociationLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostEnforcesAssociationLimit() {
        return hostEnforcesAssociationLimit;
    }

    /**
     * Sets the value of the hostEnforcesAssociationLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostEnforcesAssociationLimit(Boolean value) {
        this.hostEnforcesAssociationLimit = value;
    }

    /**
     * Gets the value of the hostAssociationLimitHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostAssociationLimitHours() {
        return hostAssociationLimitHours;
    }

    /**
     * Sets the value of the hostAssociationLimitHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostAssociationLimitHours(Integer value) {
        this.hostAssociationLimitHours = value;
    }

}
