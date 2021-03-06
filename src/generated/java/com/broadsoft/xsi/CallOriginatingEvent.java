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
 *         The Call Originating event is generated when a dial request is accepted
 *         by BroadWorks and an attempt is made to alert the subscriber's
 *         endpoint(s). The callId and externalTrackingId are generated at
 *         this point and included in the event. The call state is Alerting
 *         and the personality is click-to-dial. The address parameter of
 *         the remoteParty is set to the dialed phone number.
 *       
 * 
 * <p>Java class for CallOriginatingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallOriginatingEvent"&gt;
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
@XmlType(name = "CallOriginatingEvent")
public class CallOriginatingEvent
    extends CallEvent
{


}
