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
 *         &lt;element name="details" type="{http://schema.broadsoft.com/xsi}UserDetails"/&gt;
 *         &lt;element name="additionalDetails" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetails"/&gt;
 *         &lt;element name="passwordExpiresDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fac" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="registrations" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="scheduleList" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="portalPasswordChange" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://schema.broadsoft.com/xsi}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="nationalPrefix" type="{http://schema.broadsoft.com/xsi}NationalPrefix" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://schema.broadsoft.com/xsi}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="timeZoneDisplayName" type="{http://schema.broadsoft.com/xsi}TimeZoneDisplayName" minOccurs="0"/&gt;
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
    "details",
    "additionalDetails",
    "passwordExpiresDays",
    "fac",
    "registrations",
    "scheduleList",
    "portalPasswordChange",
    "countryCode",
    "nationalPrefix",
    "timeZone",
    "timeZoneDisplayName"
})
@XmlRootElement(name = "Profile")
public class Profile {

    @XmlElement(required = true)
    protected UserDetails details;
    @XmlElement(required = true)
    protected UserAdditionalDetails additionalDetails;
    protected Integer passwordExpiresDays;
    @XmlSchemaType(name = "anyURI")
    protected String fac;
    @XmlSchemaType(name = "anyURI")
    protected String registrations;
    @XmlSchemaType(name = "anyURI")
    protected String scheduleList;
    @XmlSchemaType(name = "anyURI")
    protected String portalPasswordChange;
    protected Integer countryCode;
    protected Integer nationalPrefix;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZone;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneDisplayName;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link UserDetails }
     *     
     */
    public UserDetails getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetails }
     *     
     */
    public void setDetails(UserDetails value) {
        this.details = value;
    }

    /**
     * Gets the value of the additionalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public UserAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Sets the value of the additionalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public void setAdditionalDetails(UserAdditionalDetails value) {
        this.additionalDetails = value;
    }

    /**
     * Gets the value of the passwordExpiresDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordExpiresDays() {
        return passwordExpiresDays;
    }

    /**
     * Sets the value of the passwordExpiresDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordExpiresDays(Integer value) {
        this.passwordExpiresDays = value;
    }

    /**
     * Gets the value of the fac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFac() {
        return fac;
    }

    /**
     * Sets the value of the fac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFac(String value) {
        this.fac = value;
    }

    /**
     * Gets the value of the registrations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrations() {
        return registrations;
    }

    /**
     * Sets the value of the registrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrations(String value) {
        this.registrations = value;
    }

    /**
     * Gets the value of the scheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleList() {
        return scheduleList;
    }

    /**
     * Sets the value of the scheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleList(String value) {
        this.scheduleList = value;
    }

    /**
     * Gets the value of the portalPasswordChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalPasswordChange() {
        return portalPasswordChange;
    }

    /**
     * Sets the value of the portalPasswordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalPasswordChange(String value) {
        this.portalPasswordChange = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryCode(Integer value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the nationalPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Sets the value of the nationalPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalPrefix(Integer value) {
        this.nationalPrefix = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDisplayName() {
        return timeZoneDisplayName;
    }

    /**
     * Sets the value of the timeZoneDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDisplayName(String value) {
        this.timeZoneDisplayName = value;
    }

}
