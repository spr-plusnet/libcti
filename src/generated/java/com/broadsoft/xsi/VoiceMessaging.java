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
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processing" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMessageProcessing" minOccurs="0"/&gt;
 *         &lt;element name="voiceMessageDeliveryEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="usePhoneMessageWaitingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sendVoiceMessageNotifyEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voiceMessageNotifyEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="sendCarbonCopyVoiceMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voiceMessageCarbonCopyEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="transferOnZeroToPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="transferPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDN" minOccurs="0"/&gt;
 *         &lt;element name="alwaysRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="busyRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outOfPrimaryZoneRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processing",
    "voiceMessageDeliveryEmailAddress",
    "usePhoneMessageWaitingIndicator",
    "sendVoiceMessageNotifyEmail",
    "voiceMessageNotifyEmailAddress",
    "sendCarbonCopyVoiceMessage",
    "voiceMessageCarbonCopyEmailAddress",
    "transferOnZeroToPhoneNumber",
    "transferPhoneNumber",
    "alwaysRedirectToVoiceMail",
    "busyRedirectToVoiceMail",
    "noAnswerRedirectToVoiceMail",
    "outOfPrimaryZoneRedirectToVoiceMail"
})
@XmlRootElement(name = "VoiceMessaging")
public class VoiceMessaging
    extends ActivatableServiceInfo
{

    @XmlSchemaType(name = "token")
    protected VoiceMessagingMessageProcessing processing;
    @XmlElementRef(name = "voiceMessageDeliveryEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageDeliveryEmailAddress;
    protected Boolean usePhoneMessageWaitingIndicator;
    protected Boolean sendVoiceMessageNotifyEmail;
    @XmlElementRef(name = "voiceMessageNotifyEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageNotifyEmailAddress;
    protected Boolean sendCarbonCopyVoiceMessage;
    @XmlElementRef(name = "voiceMessageCarbonCopyEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageCarbonCopyEmailAddress;
    protected Boolean transferOnZeroToPhoneNumber;
    @XmlElementRef(name = "transferPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferPhoneNumber;
    protected Boolean alwaysRedirectToVoiceMail;
    protected Boolean busyRedirectToVoiceMail;
    protected Boolean noAnswerRedirectToVoiceMail;
    protected Boolean outOfPrimaryZoneRedirectToVoiceMail;

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingMessageProcessing }
     *     
     */
    public VoiceMessagingMessageProcessing getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingMessageProcessing }
     *     
     */
    public void setProcessing(VoiceMessagingMessageProcessing value) {
        this.processing = value;
    }

    /**
     * Gets the value of the voiceMessageDeliveryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageDeliveryEmailAddress() {
        return voiceMessageDeliveryEmailAddress;
    }

    /**
     * Sets the value of the voiceMessageDeliveryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageDeliveryEmailAddress(JAXBElement<String> value) {
        this.voiceMessageDeliveryEmailAddress = value;
    }

    /**
     * Gets the value of the usePhoneMessageWaitingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePhoneMessageWaitingIndicator() {
        return usePhoneMessageWaitingIndicator;
    }

    /**
     * Sets the value of the usePhoneMessageWaitingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePhoneMessageWaitingIndicator(Boolean value) {
        this.usePhoneMessageWaitingIndicator = value;
    }

    /**
     * Gets the value of the sendVoiceMessageNotifyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendVoiceMessageNotifyEmail() {
        return sendVoiceMessageNotifyEmail;
    }

    /**
     * Sets the value of the sendVoiceMessageNotifyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendVoiceMessageNotifyEmail(Boolean value) {
        this.sendVoiceMessageNotifyEmail = value;
    }

    /**
     * Gets the value of the voiceMessageNotifyEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageNotifyEmailAddress() {
        return voiceMessageNotifyEmailAddress;
    }

    /**
     * Sets the value of the voiceMessageNotifyEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageNotifyEmailAddress(JAXBElement<String> value) {
        this.voiceMessageNotifyEmailAddress = value;
    }

    /**
     * Gets the value of the sendCarbonCopyVoiceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendCarbonCopyVoiceMessage() {
        return sendCarbonCopyVoiceMessage;
    }

    /**
     * Sets the value of the sendCarbonCopyVoiceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendCarbonCopyVoiceMessage(Boolean value) {
        this.sendCarbonCopyVoiceMessage = value;
    }

    /**
     * Gets the value of the voiceMessageCarbonCopyEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageCarbonCopyEmailAddress() {
        return voiceMessageCarbonCopyEmailAddress;
    }

    /**
     * Sets the value of the voiceMessageCarbonCopyEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageCarbonCopyEmailAddress(JAXBElement<String> value) {
        this.voiceMessageCarbonCopyEmailAddress = value;
    }

    /**
     * Gets the value of the transferOnZeroToPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferOnZeroToPhoneNumber() {
        return transferOnZeroToPhoneNumber;
    }

    /**
     * Sets the value of the transferOnZeroToPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferOnZeroToPhoneNumber(Boolean value) {
        this.transferOnZeroToPhoneNumber = value;
    }

    /**
     * Gets the value of the transferPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferPhoneNumber() {
        return transferPhoneNumber;
    }

    /**
     * Sets the value of the transferPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferPhoneNumber(JAXBElement<String> value) {
        this.transferPhoneNumber = value;
    }

    /**
     * Gets the value of the alwaysRedirectToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysRedirectToVoiceMail() {
        return alwaysRedirectToVoiceMail;
    }

    /**
     * Sets the value of the alwaysRedirectToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysRedirectToVoiceMail(Boolean value) {
        this.alwaysRedirectToVoiceMail = value;
    }

    /**
     * Gets the value of the busyRedirectToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusyRedirectToVoiceMail() {
        return busyRedirectToVoiceMail;
    }

    /**
     * Sets the value of the busyRedirectToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusyRedirectToVoiceMail(Boolean value) {
        this.busyRedirectToVoiceMail = value;
    }

    /**
     * Gets the value of the noAnswerRedirectToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAnswerRedirectToVoiceMail() {
        return noAnswerRedirectToVoiceMail;
    }

    /**
     * Sets the value of the noAnswerRedirectToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAnswerRedirectToVoiceMail(Boolean value) {
        this.noAnswerRedirectToVoiceMail = value;
    }

    /**
     * Gets the value of the outOfPrimaryZoneRedirectToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfPrimaryZoneRedirectToVoiceMail() {
        return outOfPrimaryZoneRedirectToVoiceMail;
    }

    /**
     * Sets the value of the outOfPrimaryZoneRedirectToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfPrimaryZoneRedirectToVoiceMail(Boolean value) {
        this.outOfPrimaryZoneRedirectToVoiceMail = value;
    }

}