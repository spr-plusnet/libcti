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
 *         The Call Originated event is generated when a call is being originated
 *         by the subscriber. This can happen in two cases:
 * 
 *         1. When the calling subscriber manually initiates a call by dialing a
 *         destination on its device. In this case a new callId and the
 *         externalTrackingId are generated by BroadWorks.
 * 
 *         2. When the remote application has initiated a call through a dial
 *         request. In this case, first a Call Originating event is
 *         generated when the system has accepted the request. Once the
 *         subscriber has accepted the dial attempt (by going off-hook),
 *         then the call personality changes from "Click-to-Dial" to
 *         "Originator" and a Call Originated event is issued. Both the
 *         Call Originating and Call Originated event have the same CallId
 *         and external-tracking-id. In both cases, the call state is
 *         Alerting and the personality is originator. 
 *       
 * 
 * <p>Java class for CallOriginatedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallOriginatedEvent"&gt;
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
@XmlType(name = "CallOriginatedEvent")
public class CallOriginatedEvent
    extends CallEvent
{


}
