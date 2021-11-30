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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the details for a redirect.
 *       
 * 
 * <p>Java class for Redirect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Redirect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RedirectReason"/&gt;
 *         &lt;element name="redirectTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Redirect", propOrder = {
    "address",
    "reason",
    "redirectTime"
})
public class Redirect {

    protected Address address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RedirectReason reason;
    protected long redirectTime;

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

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectReason }
     *     
     */
    public RedirectReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectReason }
     *     
     */
    public void setReason(RedirectReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the redirectTime property.
     * 
     */
    public long getRedirectTime() {
        return redirectTime;
    }

    /**
     * Sets the value of the redirectTime property.
     * 
     */
    public void setRedirectTime(long value) {
        this.redirectTime = value;
    }

}
