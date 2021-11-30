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
 *         User Connected Line Identification Restriction properties. Connected
 *         Line Identification
 *         Restriction allows you to block your number from being shown when receiving a
 *         call. Members of
 *         your group can still see your number when they call you. You have the
 *         choice of turning it on or
 *         off for all calls and then selectively turning it right back on or off
 *         using the feature access
 *         codes.
 *    
 * 
 * <p>Java class for ConnectedLineIdentificationRestriction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectedLineIdentificationRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedLineIdentificationRestriction")
public class ConnectedLineIdentificationRestriction
    extends ActivatableServiceInfo
{


}
