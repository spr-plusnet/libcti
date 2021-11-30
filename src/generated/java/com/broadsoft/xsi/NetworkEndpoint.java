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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the details related to an endpoint for
 *         a network device. A network device is a device that the
 *         AS uses for routing to/from the general network
 *         as opposed to/from an access device
 *         for a specific address of record. Services such
 *         as BroadWorks Anywhere and Remote
 *         Office use a network device
 *         instead of an access device.
 *       
 * 
 * <p>Java class for NetworkEndpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkEndpoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Endpoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEndpoint", propOrder = {
    "address"
})
@XmlSeeAlso({
    BroadWorksAnywhereEndpoint.class,
    RemoteOfficeEndpoint.class,
    BroadWorksMobilityEndpoint.class,
    ExecutiveAssistantEndpoint.class
})
public abstract class NetworkEndpoint
    extends Endpoint
{

    @XmlElement(required = true)
    protected Address address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
