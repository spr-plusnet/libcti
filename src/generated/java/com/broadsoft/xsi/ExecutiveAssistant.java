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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for a user assigned the Executive Assistant Service.
 *         Contains the executive assistant setting and a table of executives this assistant has been assigned to.
 *         Change History:
 *         R20.0 – Added.
 *         R22.0 - Changed enableDivert and executives to be optional for PUT,
 *                 and divertToPhoneNumber to be nillable for PUT.
 *       
 * 
 * <p>Java class for ExecutiveAssistant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAssistant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableDivert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="divertToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="executives" type="{http://schema.broadsoft.com/xsi}ExecutiveDetailsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAssistant", propOrder = {
    "enableDivert",
    "divertToPhoneNumber",
    "executives"
})
public class ExecutiveAssistant {

    protected Boolean enableDivert;
    @XmlElementRef(name = "divertToPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> divertToPhoneNumber;
    protected ExecutiveDetailsList executives;

    /**
     * Gets the value of the enableDivert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDivert() {
        return enableDivert;
    }

    /**
     * Sets the value of the enableDivert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDivert(Boolean value) {
        this.enableDivert = value;
    }

    /**
     * Gets the value of the divertToPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivertToPhoneNumber() {
        return divertToPhoneNumber;
    }

    /**
     * Sets the value of the divertToPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivertToPhoneNumber(JAXBElement<String> value) {
        this.divertToPhoneNumber = value;
    }

    /**
     * Gets the value of the executives property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public ExecutiveDetailsList getExecutives() {
        return executives;
    }

    /**
     * Sets the value of the executives property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public void setExecutives(ExecutiveDetailsList value) {
        this.executives = value;
    }

}
