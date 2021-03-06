//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceNetAddress" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/&gt;
 *         &lt;element name="servicePort" type="{http://schema.broadsoft.com/xsi}Port" minOccurs="0"/&gt;
 *         &lt;element name="impUserId" type="{http://schema.broadsoft.com/xsi}IMPUserId" minOccurs="0"/&gt;
 *         &lt;element name="boshURL" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceNetAddress",
    "servicePort",
    "impUserId",
    "boshURL"
})
@XmlRootElement(name = "IMPProfile")
public class IMPProfile {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceNetAddress;
    protected Integer servicePort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String impUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boshURL;

    /**
     * Gets the value of the serviceNetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNetAddress() {
        return serviceNetAddress;
    }

    /**
     * Sets the value of the serviceNetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNetAddress(String value) {
        this.serviceNetAddress = value;
    }

    /**
     * Gets the value of the servicePort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicePort() {
        return servicePort;
    }

    /**
     * Sets the value of the servicePort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicePort(Integer value) {
        this.servicePort = value;
    }

    /**
     * Gets the value of the impUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpUserId() {
        return impUserId;
    }

    /**
     * Sets the value of the impUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpUserId(String value) {
        this.impUserId = value;
    }

    /**
     * Gets the value of the boshURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoshURL() {
        return boshURL;
    }

    /**
     * Sets the value of the boshURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoshURL(String value) {
        this.boshURL = value;
    }

}
