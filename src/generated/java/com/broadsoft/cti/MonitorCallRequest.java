//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.cti;

import com.broadsoft.xspxml.RequestPayload;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://schema.broadsoft.com/XspXMLInterface}RequestPayload"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="params"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="subscriberid" type="{http://schema.broadsoft.com/xsi}SubscriberId"/&gt;
 *                   &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *                   &lt;element name="location" type="{http://schema.broadsoft.com/xsi}ClickToDialLocationEnum" minOccurs="0"/&gt;
 *                   &lt;element name="locationAddress" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payload" type="{http://schema.broadsoft.com/XspXMLInterface}EmptyPayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class MonitorCallRequest
    extends RequestPayload
{


}
