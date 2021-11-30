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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="dnisDisplaySetting" type="{http://schema.broadsoft.com/xsi}ACDDNISDisplaySetting" minOccurs="0"/&gt;
 *         &lt;element name="dnisPrioritySetting" type="{http://schema.broadsoft.com/xsi}ACDDNISPrioritySetting" minOccurs="0"/&gt;
 *         &lt;element name="dnisInfoList" type="{http://schema.broadsoft.com/xsi}ACDDNISInfoList" minOccurs="0"/&gt;
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
    "dnisDisplaySetting",
    "dnisPrioritySetting",
    "dnisInfoList"
})
@XmlRootElement(name = "ACDDNIS")
public class ACDDNIS {

    protected ACDDNISDisplaySetting dnisDisplaySetting;
    protected ACDDNISPrioritySetting dnisPrioritySetting;
    protected ACDDNISInfoList dnisInfoList;

    /**
     * Gets the value of the dnisDisplaySetting property.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISDisplaySetting }
     *     
     */
    public ACDDNISDisplaySetting getDnisDisplaySetting() {
        return dnisDisplaySetting;
    }

    /**
     * Sets the value of the dnisDisplaySetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISDisplaySetting }
     *     
     */
    public void setDnisDisplaySetting(ACDDNISDisplaySetting value) {
        this.dnisDisplaySetting = value;
    }

    /**
     * Gets the value of the dnisPrioritySetting property.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISPrioritySetting }
     *     
     */
    public ACDDNISPrioritySetting getDnisPrioritySetting() {
        return dnisPrioritySetting;
    }

    /**
     * Sets the value of the dnisPrioritySetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISPrioritySetting }
     *     
     */
    public void setDnisPrioritySetting(ACDDNISPrioritySetting value) {
        this.dnisPrioritySetting = value;
    }

    /**
     * Gets the value of the dnisInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISInfoList }
     *     
     */
    public ACDDNISInfoList getDnisInfoList() {
        return dnisInfoList;
    }

    /**
     * Sets the value of the dnisInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISInfoList }
     *     
     */
    public void setDnisInfoList(ACDDNISInfoList value) {
        this.dnisInfoList = value;
    }

}
