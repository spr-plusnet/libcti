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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="mailServerSelection" type="{http://schema.broadsoft.com/xsi}VoiceMessagingUserMailServerSelection" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerUserId" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerUserId" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerPassword" type="{http://schema.broadsoft.com/xsi}Password" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="useGroupDefaultMailServerFullMailboxLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="groupMailServerFullMailboxLimit" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailboxLengthMinutes"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="personalMailServerNetAddress" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerProtocol" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerProtocol" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerRealDeleteForImap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerUserId" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerUserId" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerPassword" type="{http://schema.broadsoft.com/xsi}Password" minOccurs="0"/&gt;
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
    "mailServerSelection",
    "groupMailServerEmailAddress",
    "groupMailServerUserId",
    "groupMailServerPassword",
    "useGroupDefaultMailServerFullMailboxLimit",
    "groupMailServerFullMailboxLimit",
    "personalMailServerNetAddress",
    "personalMailServerProtocol",
    "personalMailServerRealDeleteForImap",
    "personalMailServerEmailAddress",
    "personalMailServerUserId",
    "personalMailServerPassword"
})
@XmlRootElement(name = "VoiceMessagingMailServer")
public class VoiceMessagingMailServer {

    @XmlSchemaType(name = "token")
    protected VoiceMessagingUserMailServerSelection mailServerSelection;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerEmailAddress;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerPassword;
    protected Boolean useGroupDefaultMailServerFullMailboxLimit;
    protected Integer groupMailServerFullMailboxLimit;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerNetAddress;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingMailServerProtocol personalMailServerProtocol;
    protected Boolean personalMailServerRealDeleteForImap;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerEmailAddress;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerPassword;

    /**
     * Gets the value of the mailServerSelection property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingUserMailServerSelection }
     *     
     */
    public VoiceMessagingUserMailServerSelection getMailServerSelection() {
        return mailServerSelection;
    }

    /**
     * Sets the value of the mailServerSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingUserMailServerSelection }
     *     
     */
    public void setMailServerSelection(VoiceMessagingUserMailServerSelection value) {
        this.mailServerSelection = value;
    }

    /**
     * Gets the value of the groupMailServerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerEmailAddress() {
        return groupMailServerEmailAddress;
    }

    /**
     * Sets the value of the groupMailServerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerEmailAddress(String value) {
        this.groupMailServerEmailAddress = value;
    }

    /**
     * Gets the value of the groupMailServerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerUserId() {
        return groupMailServerUserId;
    }

    /**
     * Sets the value of the groupMailServerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerUserId(String value) {
        this.groupMailServerUserId = value;
    }

    /**
     * Gets the value of the groupMailServerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerPassword() {
        return groupMailServerPassword;
    }

    /**
     * Sets the value of the groupMailServerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerPassword(String value) {
        this.groupMailServerPassword = value;
    }

    /**
     * Gets the value of the useGroupDefaultMailServerFullMailboxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseGroupDefaultMailServerFullMailboxLimit() {
        return useGroupDefaultMailServerFullMailboxLimit;
    }

    /**
     * Sets the value of the useGroupDefaultMailServerFullMailboxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGroupDefaultMailServerFullMailboxLimit(Boolean value) {
        this.useGroupDefaultMailServerFullMailboxLimit = value;
    }

    /**
     * Gets the value of the groupMailServerFullMailboxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupMailServerFullMailboxLimit() {
        return groupMailServerFullMailboxLimit;
    }

    /**
     * Sets the value of the groupMailServerFullMailboxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupMailServerFullMailboxLimit(Integer value) {
        this.groupMailServerFullMailboxLimit = value;
    }

    /**
     * Gets the value of the personalMailServerNetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerNetAddress() {
        return personalMailServerNetAddress;
    }

    /**
     * Sets the value of the personalMailServerNetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerNetAddress(String value) {
        this.personalMailServerNetAddress = value;
    }

    /**
     * Gets the value of the personalMailServerProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingMailServerProtocol }
     *     
     */
    public VoiceMessagingMailServerProtocol getPersonalMailServerProtocol() {
        return personalMailServerProtocol;
    }

    /**
     * Sets the value of the personalMailServerProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingMailServerProtocol }
     *     
     */
    public void setPersonalMailServerProtocol(VoiceMessagingMailServerProtocol value) {
        this.personalMailServerProtocol = value;
    }

    /**
     * Gets the value of the personalMailServerRealDeleteForImap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalMailServerRealDeleteForImap() {
        return personalMailServerRealDeleteForImap;
    }

    /**
     * Sets the value of the personalMailServerRealDeleteForImap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalMailServerRealDeleteForImap(Boolean value) {
        this.personalMailServerRealDeleteForImap = value;
    }

    /**
     * Gets the value of the personalMailServerEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerEmailAddress() {
        return personalMailServerEmailAddress;
    }

    /**
     * Sets the value of the personalMailServerEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerEmailAddress(String value) {
        this.personalMailServerEmailAddress = value;
    }

    /**
     * Gets the value of the personalMailServerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerUserId() {
        return personalMailServerUserId;
    }

    /**
     * Sets the value of the personalMailServerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerUserId(String value) {
        this.personalMailServerUserId = value;
    }

    /**
     * Gets the value of the personalMailServerPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerPassword() {
        return personalMailServerPassword;
    }

    /**
     * Sets the value of the personalMailServerPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerPassword(String value) {
        this.personalMailServerPassword = value;
    }

}
