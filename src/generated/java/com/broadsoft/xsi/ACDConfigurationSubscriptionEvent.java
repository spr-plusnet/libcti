//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Initial event sent for the CallCenterConfiguration event package.
 *         Change History:
 *         R17.sp3 - Added forceNightService element. 
 *       
 * 
 * <p>Java class for ACDConfigurationSubscriptionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDConfigurationSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forcedForwarding" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="holidayService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="nightService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="forceNightService" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDConfigurationSubscriptionEvent", propOrder = {
    "forcedForwarding",
    "holidayService",
    "nightService",
    "forceNightService"
})
public class ACDConfigurationSubscriptionEvent
    extends EventData
{

    protected ActivatableServiceInfo forcedForwarding;
    protected ActivatableServiceInfo holidayService;
    protected ActivatableServiceInfo nightService;
    protected EmptyContent forceNightService;

    /**
     * Gets the value of the forcedForwarding property.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getForcedForwarding() {
        return forcedForwarding;
    }

    /**
     * Sets the value of the forcedForwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setForcedForwarding(ActivatableServiceInfo value) {
        this.forcedForwarding = value;
    }

    /**
     * Gets the value of the holidayService property.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getHolidayService() {
        return holidayService;
    }

    /**
     * Sets the value of the holidayService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setHolidayService(ActivatableServiceInfo value) {
        this.holidayService = value;
    }

    /**
     * Gets the value of the nightService property.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getNightService() {
        return nightService;
    }

    /**
     * Sets the value of the nightService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setNightService(ActivatableServiceInfo value) {
        this.nightService = value;
    }

    /**
     * Gets the value of the forceNightService property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getForceNightService() {
        return forceNightService;
    }

    /**
     * Sets the value of the forceNightService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setForceNightService(EmptyContent value) {
        this.forceNightService = value;
    }

}
