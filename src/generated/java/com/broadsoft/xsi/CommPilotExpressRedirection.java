//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         CommPilot Express type to transfer to voice Mail or forward to a
 *         number used in the context.
 *         
 *         Change History:
 *         R19.0 - forwardingAddress element made nillable.
 *       
 * 
 * <p>Java class for CommPilotExpressRedirection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressRedirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionAction" minOccurs="0"/&gt;
 *         &lt;element name="forwardingAddress" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressRedirection", propOrder = {
    "action",
    "forwardingAddress"
})
public class CommPilotExpressRedirection {

    @XmlSchemaType(name = "token")
    protected CommPilotExpressRedirectionAction action;
    @XmlElementRef(name = "forwardingAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> forwardingAddress;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirectionAction }
     *     
     */
    public CommPilotExpressRedirectionAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirectionAction }
     *     
     */
    public void setAction(CommPilotExpressRedirectionAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the forwardingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getForwardingAddress() {
        return forwardingAddress;
    }

    /**
     * Sets the value of the forwardingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setForwardingAddress(JAXBElement<Address> value) {
        this.forwardingAddress = value;
    }

}
