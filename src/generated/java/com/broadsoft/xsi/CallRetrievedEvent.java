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
 *         The Call Retrieved event is generated when the subscriber or
 *         remote party retrieves a held call.The event indicates whether
 *         the call was retrieved by the subscriber or remote party. The
 *         call state is Active. Remote party call retrieve is only
 *         reported for group/enterprise calls in a standalone application.
 *         Also, if the call is already held locally, then the remote party
 *         call retrieved is not reported.
 *             
 * 
 * <p>Java class for CallRetrievedEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallRetrievedEvent"&gt;
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
@XmlType(name = "CallRetrievedEvent")
public class CallRetrievedEvent
    extends CallEvent
{


}
