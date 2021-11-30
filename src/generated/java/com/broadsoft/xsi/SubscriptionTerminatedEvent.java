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
 *         SubscriptionTerminatedEvent is a generic event used to report that the specified subscription
 *         has been terminated.
 *         Note that there are multiple ways a subscription can be terminated such
 *         as:
 *         -Application requests termination of Subscription
 *         - Subscription expiration
 *         - Change in the Privacy settings of the targetId for a subscription
 *         - Manual deletion by an administrator.
 *             
 * 
 * <p>Java class for SubscriptionTerminatedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionTerminatedEvent")
public class SubscriptionTerminatedEvent
    extends EventData
{


}