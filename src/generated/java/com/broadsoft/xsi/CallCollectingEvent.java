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
 * 
 *         The Call Collecting event is generated when BroadWorks needs to collect
 *         information by interacting with a subscriber. This event
 *         generated in two types of situation:
 * 
 *         i) When programming a service through a Feature Access Code. This
 *         happens for instance when a subscriber activates Call Forward
 *         Always.
 *         ii)When BroadWorks requires some information before calling the remote
 *         party. This happens for instance when a subscriber invoke the
 *         Calling Line ID Blocking service before dialing. This can also
 *         happen when BroadWorks require an authentication or accounting
 *         code before calling the remote party. Note that in these cases,
 *         the Call Collecting event is not generated if the service
 *         activation precedes the setup of a call and the destination is
 *         already known from the dialed digits.
 * 
 * 
 *         The callId and externalTrackingId is generated when the call is
 *         established with BroadWorks and included in the event. The call
 *         state is Active and the personality is originator. The address
 *         parameter of the remoteParty is set to the dialed digits.
 * 
 *       
 * 
 * <p>Java class for CallCollectingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallCollectingEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCollectingEvent")
public class CallCollectingEvent
    extends CallEvent
{


}