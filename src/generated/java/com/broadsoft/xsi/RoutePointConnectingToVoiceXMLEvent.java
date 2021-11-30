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
 *         The Route Point Connecting To VoiceXML event is sent when the remote application
 *         performs a Route Point Connect to VoiceXML against a call queued to
 *         a VoiceXML virtual subscriber. This event indicates that the call is offered to the
 *         VoiceXML virtual subscriber but remains in the queue.
 *       
 * 
 * <p>Java class for RoutePointConnectingToVoiceXMLEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointConnectingToVoiceXMLEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointConnectingToVoiceXMLEvent")
public class RoutePointConnectingToVoiceXMLEvent
    extends RoutePointEvent
{


}