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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="busyAnnouncementSelection" type="{http://schema.broadsoft.com/xsi}AnnouncementSelection" minOccurs="0"/&gt;
 *         &lt;element name="busyPersonalAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="busyPersonalVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerAnnouncementSelection" type="{http://schema.broadsoft.com/xsi}VoiceMessagingNoAnswerGreetingSelection" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerPersonalAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerPersonalVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="disableExtendedAwayMessageDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableExtendedAwayGreeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerExtendedAwayAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerExtendedAwayVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerAlternateGreeting01" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerAlternateGreeting02" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerAlternateGreeting03" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/&gt;
 *         &lt;element name="disableMessageDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="disableMessageDepositAction" type="{http://schema.broadsoft.com/xsi}VoiceMessagingDisableMessageDepositSelection" minOccurs="0"/&gt;
 *         &lt;element name="greetingOnlyForwardDestination" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
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
    "busyAnnouncementSelection",
    "busyPersonalAudioFile",
    "busyPersonalVideoFile",
    "noAnswerAnnouncementSelection",
    "noAnswerPersonalAudioFile",
    "noAnswerPersonalVideoFile",
    "disableExtendedAwayMessageDeposit",
    "enableExtendedAwayGreeting",
    "noAnswerExtendedAwayAudioFile",
    "noAnswerExtendedAwayVideoFile",
    "noAnswerAlternateGreeting01",
    "noAnswerAlternateGreeting02",
    "noAnswerAlternateGreeting03",
    "noAnswerNumberOfRings",
    "disableMessageDeposit",
    "disableMessageDepositAction",
    "greetingOnlyForwardDestination"
})
@XmlRootElement(name = "VoiceMessagingGreetings")
public class VoiceMessagingGreetings {

    @XmlSchemaType(name = "token")
    protected AnnouncementSelection busyAnnouncementSelection;
    protected LabeledMediaFileResource busyPersonalAudioFile;
    protected LabeledMediaFileResource busyPersonalVideoFile;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingNoAnswerGreetingSelection noAnswerAnnouncementSelection;
    protected LabeledMediaFileResource noAnswerPersonalAudioFile;
    protected LabeledMediaFileResource noAnswerPersonalVideoFile;
    protected Boolean disableExtendedAwayMessageDeposit;
    protected Boolean enableExtendedAwayGreeting;
    protected LabeledMediaFileResource noAnswerExtendedAwayAudioFile;
    protected LabeledMediaFileResource noAnswerExtendedAwayVideoFile;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting01;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting02;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting03;
    protected Integer noAnswerNumberOfRings;
    protected Boolean disableMessageDeposit;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingDisableMessageDepositSelection disableMessageDepositAction;
    @XmlElementRef(name = "greetingOnlyForwardDestination", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> greetingOnlyForwardDestination;

    /**
     * Gets the value of the busyAnnouncementSelection property.
     * 
     * @return
     *     possible object is
     *     {@link AnnouncementSelection }
     *     
     */
    public AnnouncementSelection getBusyAnnouncementSelection() {
        return busyAnnouncementSelection;
    }

    /**
     * Sets the value of the busyAnnouncementSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncementSelection }
     *     
     */
    public void setBusyAnnouncementSelection(AnnouncementSelection value) {
        this.busyAnnouncementSelection = value;
    }

    /**
     * Gets the value of the busyPersonalAudioFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getBusyPersonalAudioFile() {
        return busyPersonalAudioFile;
    }

    /**
     * Sets the value of the busyPersonalAudioFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setBusyPersonalAudioFile(LabeledMediaFileResource value) {
        this.busyPersonalAudioFile = value;
    }

    /**
     * Gets the value of the busyPersonalVideoFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getBusyPersonalVideoFile() {
        return busyPersonalVideoFile;
    }

    /**
     * Sets the value of the busyPersonalVideoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setBusyPersonalVideoFile(LabeledMediaFileResource value) {
        this.busyPersonalVideoFile = value;
    }

    /**
     * Gets the value of the noAnswerAnnouncementSelection property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingNoAnswerGreetingSelection }
     *     
     */
    public VoiceMessagingNoAnswerGreetingSelection getNoAnswerAnnouncementSelection() {
        return noAnswerAnnouncementSelection;
    }

    /**
     * Sets the value of the noAnswerAnnouncementSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingNoAnswerGreetingSelection }
     *     
     */
    public void setNoAnswerAnnouncementSelection(VoiceMessagingNoAnswerGreetingSelection value) {
        this.noAnswerAnnouncementSelection = value;
    }

    /**
     * Gets the value of the noAnswerPersonalAudioFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerPersonalAudioFile() {
        return noAnswerPersonalAudioFile;
    }

    /**
     * Sets the value of the noAnswerPersonalAudioFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerPersonalAudioFile(LabeledMediaFileResource value) {
        this.noAnswerPersonalAudioFile = value;
    }

    /**
     * Gets the value of the noAnswerPersonalVideoFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerPersonalVideoFile() {
        return noAnswerPersonalVideoFile;
    }

    /**
     * Sets the value of the noAnswerPersonalVideoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerPersonalVideoFile(LabeledMediaFileResource value) {
        this.noAnswerPersonalVideoFile = value;
    }

    /**
     * Gets the value of the disableExtendedAwayMessageDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableExtendedAwayMessageDeposit() {
        return disableExtendedAwayMessageDeposit;
    }

    /**
     * Sets the value of the disableExtendedAwayMessageDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableExtendedAwayMessageDeposit(Boolean value) {
        this.disableExtendedAwayMessageDeposit = value;
    }

    /**
     * Gets the value of the enableExtendedAwayGreeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExtendedAwayGreeting() {
        return enableExtendedAwayGreeting;
    }

    /**
     * Sets the value of the enableExtendedAwayGreeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExtendedAwayGreeting(Boolean value) {
        this.enableExtendedAwayGreeting = value;
    }

    /**
     * Gets the value of the noAnswerExtendedAwayAudioFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerExtendedAwayAudioFile() {
        return noAnswerExtendedAwayAudioFile;
    }

    /**
     * Sets the value of the noAnswerExtendedAwayAudioFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerExtendedAwayAudioFile(LabeledMediaFileResource value) {
        this.noAnswerExtendedAwayAudioFile = value;
    }

    /**
     * Gets the value of the noAnswerExtendedAwayVideoFile property.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerExtendedAwayVideoFile() {
        return noAnswerExtendedAwayVideoFile;
    }

    /**
     * Sets the value of the noAnswerExtendedAwayVideoFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerExtendedAwayVideoFile(LabeledMediaFileResource value) {
        this.noAnswerExtendedAwayVideoFile = value;
    }

    /**
     * Gets the value of the noAnswerAlternateGreeting01 property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting01() {
        return noAnswerAlternateGreeting01;
    }

    /**
     * Sets the value of the noAnswerAlternateGreeting01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting01(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting01 = value;
    }

    /**
     * Gets the value of the noAnswerAlternateGreeting02 property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting02() {
        return noAnswerAlternateGreeting02;
    }

    /**
     * Sets the value of the noAnswerAlternateGreeting02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting02(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting02 = value;
    }

    /**
     * Gets the value of the noAnswerAlternateGreeting03 property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting03() {
        return noAnswerAlternateGreeting03;
    }

    /**
     * Sets the value of the noAnswerAlternateGreeting03 property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting03(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting03 = value;
    }

    /**
     * Gets the value of the noAnswerNumberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoAnswerNumberOfRings() {
        return noAnswerNumberOfRings;
    }

    /**
     * Sets the value of the noAnswerNumberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoAnswerNumberOfRings(Integer value) {
        this.noAnswerNumberOfRings = value;
    }

    /**
     * Gets the value of the disableMessageDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMessageDeposit() {
        return disableMessageDeposit;
    }

    /**
     * Sets the value of the disableMessageDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMessageDeposit(Boolean value) {
        this.disableMessageDeposit = value;
    }

    /**
     * Gets the value of the disableMessageDepositAction property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingDisableMessageDepositSelection }
     *     
     */
    public VoiceMessagingDisableMessageDepositSelection getDisableMessageDepositAction() {
        return disableMessageDepositAction;
    }

    /**
     * Sets the value of the disableMessageDepositAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingDisableMessageDepositSelection }
     *     
     */
    public void setDisableMessageDepositAction(VoiceMessagingDisableMessageDepositSelection value) {
        this.disableMessageDepositAction = value;
    }

    /**
     * Gets the value of the greetingOnlyForwardDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGreetingOnlyForwardDestination() {
        return greetingOnlyForwardDestination;
    }

    /**
     * Sets the value of the greetingOnlyForwardDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGreetingOnlyForwardDestination(JAXBElement<String> value) {
        this.greetingOnlyForwardDestination = value;
    }

}
