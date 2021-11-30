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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Information about a ACD an agent belongs to and may be joined to.
 *       
 * 
 * <p>Java class for ACDAgentJoinInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDAgentJoinInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acdUserId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *         &lt;element name="joined" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="skillLevel" type="{http://schema.broadsoft.com/xsi}SkillLevel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAgentJoinInfo", propOrder = {
    "acdUserId",
    "joined",
    "skillLevel"
})
public class ACDAgentJoinInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acdUserId;
    protected EmptyContent joined;
    protected Integer skillLevel;

    /**
     * Gets the value of the acdUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdUserId() {
        return acdUserId;
    }

    /**
     * Sets the value of the acdUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdUserId(String value) {
        this.acdUserId = value;
    }

    /**
     * Gets the value of the joined property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getJoined() {
        return joined;
    }

    /**
     * Sets the value of the joined property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setJoined(EmptyContent value) {
        this.joined = value;
    }

    /**
     * Gets the value of the skillLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkillLevel() {
        return skillLevel;
    }

    /**
     * Sets the value of the skillLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkillLevel(Integer value) {
        this.skillLevel = value;
    }

}