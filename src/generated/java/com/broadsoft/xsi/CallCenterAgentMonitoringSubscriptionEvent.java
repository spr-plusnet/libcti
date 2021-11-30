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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The Call Center Agent Monitoring Subscription Event is the initial event.
 *         
 *       
 * 
 * <p>Java class for CallCenterAgentMonitoringSubscriptionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentMonitoringSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monitoringStatus" type="{http://schema.broadsoft.com/xsi}CallCenterAgentMonitoringStatus"/&gt;
 *         &lt;element name="alertInfo" type="{http://schema.broadsoft.com/xsi}CallCenterAgentOnCallAlertInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentMonitoringSubscriptionEvent", propOrder = {
    "monitoringStatus",
    "alertInfo"
})
public class CallCenterAgentMonitoringSubscriptionEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallCenterAgentMonitoringStatus monitoringStatus;
    protected CallCenterAgentOnCallAlertInfo alertInfo;

    /**
     * Gets the value of the monitoringStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAgentMonitoringStatus }
     *     
     */
    public CallCenterAgentMonitoringStatus getMonitoringStatus() {
        return monitoringStatus;
    }

    /**
     * Sets the value of the monitoringStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAgentMonitoringStatus }
     *     
     */
    public void setMonitoringStatus(CallCenterAgentMonitoringStatus value) {
        this.monitoringStatus = value;
    }

    /**
     * Gets the value of the alertInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAgentOnCallAlertInfo }
     *     
     */
    public CallCenterAgentOnCallAlertInfo getAlertInfo() {
        return alertInfo;
    }

    /**
     * Sets the value of the alertInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAgentOnCallAlertInfo }
     *     
     */
    public void setAlertInfo(CallCenterAgentOnCallAlertInfo value) {
        this.alertInfo = value;
    }

}
