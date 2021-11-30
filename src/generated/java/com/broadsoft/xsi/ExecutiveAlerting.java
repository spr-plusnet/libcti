//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Get the alerting setting of an executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java class for ExecutiveAlerting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAlerting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertingMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingMode" minOccurs="0"/&gt;
 *         &lt;element name="alertingCallingLineIdNameMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCallingLineIdNameMode" minOccurs="0"/&gt;
 *         &lt;element name="alertingCustomCallingLineIdName" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCustomCallingLineIdName" minOccurs="0"/&gt;
 *         &lt;element name="unicodeAlertingCustomCallingLineIdName" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCustomCallingLineIdName" minOccurs="0"/&gt;
 *         &lt;element name="alertingCallingLineIdPhoneNumberMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCallingLineIdPhoneNumberMode" minOccurs="0"/&gt;
 *         &lt;element name="alertingCustomCallingLineIdPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *         &lt;element name="callPushRecallNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/&gt;
 *         &lt;element name="nextAssistantNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/&gt;
 *         &lt;element name="enableRollover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="rolloverWaitTimeSeconds" type="{http://schema.broadsoft.com/xsi}ExecutiveRolloverWaitTimeSeconds" minOccurs="0"/&gt;
 *         &lt;element name="rolloverAction" type="{http://schema.broadsoft.com/xsi}ExecutiveRolloverActionType" minOccurs="0"/&gt;
 *         &lt;element name="rolloverForwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAlerting", propOrder = {
    "alertingMode",
    "alertingCallingLineIdNameMode",
    "alertingCustomCallingLineIdName",
    "unicodeAlertingCustomCallingLineIdName",
    "alertingCallingLineIdPhoneNumberMode",
    "alertingCustomCallingLineIdPhoneNumber",
    "callPushRecallNumberOfRings",
    "nextAssistantNumberOfRings",
    "enableRollover",
    "rolloverWaitTimeSeconds",
    "rolloverAction",
    "rolloverForwardToPhoneNumber"
})
public class ExecutiveAlerting {

    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingMode alertingMode;
    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingCallingLineIdNameMode alertingCallingLineIdNameMode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alertingCustomCallingLineIdName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unicodeAlertingCustomCallingLineIdName;
    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingCallingLineIdPhoneNumberMode alertingCallingLineIdPhoneNumberMode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alertingCustomCallingLineIdPhoneNumber;
    protected Integer callPushRecallNumberOfRings;
    protected Integer nextAssistantNumberOfRings;
    protected Boolean enableRollover;
    protected Integer rolloverWaitTimeSeconds;
    @XmlSchemaType(name = "token")
    protected ExecutiveRolloverActionType rolloverAction;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rolloverForwardToPhoneNumber;

    /**
     * Gets the value of the alertingMode property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingMode }
     *     
     */
    public ExecutiveAlertingMode getAlertingMode() {
        return alertingMode;
    }

    /**
     * Sets the value of the alertingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingMode }
     *     
     */
    public void setAlertingMode(ExecutiveAlertingMode value) {
        this.alertingMode = value;
    }

    /**
     * Gets the value of the alertingCallingLineIdNameMode property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingCallingLineIdNameMode }
     *     
     */
    public ExecutiveAlertingCallingLineIdNameMode getAlertingCallingLineIdNameMode() {
        return alertingCallingLineIdNameMode;
    }

    /**
     * Sets the value of the alertingCallingLineIdNameMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingCallingLineIdNameMode }
     *     
     */
    public void setAlertingCallingLineIdNameMode(ExecutiveAlertingCallingLineIdNameMode value) {
        this.alertingCallingLineIdNameMode = value;
    }

    /**
     * Gets the value of the alertingCustomCallingLineIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingCustomCallingLineIdName() {
        return alertingCustomCallingLineIdName;
    }

    /**
     * Sets the value of the alertingCustomCallingLineIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingCustomCallingLineIdName(String value) {
        this.alertingCustomCallingLineIdName = value;
    }

    /**
     * Gets the value of the unicodeAlertingCustomCallingLineIdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnicodeAlertingCustomCallingLineIdName() {
        return unicodeAlertingCustomCallingLineIdName;
    }

    /**
     * Sets the value of the unicodeAlertingCustomCallingLineIdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnicodeAlertingCustomCallingLineIdName(String value) {
        this.unicodeAlertingCustomCallingLineIdName = value;
    }

    /**
     * Gets the value of the alertingCallingLineIdPhoneNumberMode property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingCallingLineIdPhoneNumberMode }
     *     
     */
    public ExecutiveAlertingCallingLineIdPhoneNumberMode getAlertingCallingLineIdPhoneNumberMode() {
        return alertingCallingLineIdPhoneNumberMode;
    }

    /**
     * Sets the value of the alertingCallingLineIdPhoneNumberMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingCallingLineIdPhoneNumberMode }
     *     
     */
    public void setAlertingCallingLineIdPhoneNumberMode(ExecutiveAlertingCallingLineIdPhoneNumberMode value) {
        this.alertingCallingLineIdPhoneNumberMode = value;
    }

    /**
     * Gets the value of the alertingCustomCallingLineIdPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingCustomCallingLineIdPhoneNumber() {
        return alertingCustomCallingLineIdPhoneNumber;
    }

    /**
     * Sets the value of the alertingCustomCallingLineIdPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingCustomCallingLineIdPhoneNumber(String value) {
        this.alertingCustomCallingLineIdPhoneNumber = value;
    }

    /**
     * Gets the value of the callPushRecallNumberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallPushRecallNumberOfRings() {
        return callPushRecallNumberOfRings;
    }

    /**
     * Sets the value of the callPushRecallNumberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallPushRecallNumberOfRings(Integer value) {
        this.callPushRecallNumberOfRings = value;
    }

    /**
     * Gets the value of the nextAssistantNumberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextAssistantNumberOfRings() {
        return nextAssistantNumberOfRings;
    }

    /**
     * Sets the value of the nextAssistantNumberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextAssistantNumberOfRings(Integer value) {
        this.nextAssistantNumberOfRings = value;
    }

    /**
     * Gets the value of the enableRollover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRollover() {
        return enableRollover;
    }

    /**
     * Sets the value of the enableRollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRollover(Boolean value) {
        this.enableRollover = value;
    }

    /**
     * Gets the value of the rolloverWaitTimeSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRolloverWaitTimeSeconds() {
        return rolloverWaitTimeSeconds;
    }

    /**
     * Sets the value of the rolloverWaitTimeSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRolloverWaitTimeSeconds(Integer value) {
        this.rolloverWaitTimeSeconds = value;
    }

    /**
     * Gets the value of the rolloverAction property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveRolloverActionType }
     *     
     */
    public ExecutiveRolloverActionType getRolloverAction() {
        return rolloverAction;
    }

    /**
     * Sets the value of the rolloverAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveRolloverActionType }
     *     
     */
    public void setRolloverAction(ExecutiveRolloverActionType value) {
        this.rolloverAction = value;
    }

    /**
     * Gets the value of the rolloverForwardToPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloverForwardToPhoneNumber() {
        return rolloverForwardToPhoneNumber;
    }

    /**
     * Sets the value of the rolloverForwardToPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloverForwardToPhoneNumber(String value) {
        this.rolloverForwardToPhoneNumber = value;
    }

}