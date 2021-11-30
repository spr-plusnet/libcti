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
 *         Contains the Sequential Ring service configuration data.
 *         Sequential Ring allows you to sequentially ring up to 5 locations in addition
 *         to the base location for a
 *         specified number of rings. The 5 locations can be either a phone number or a
 *         SIP-URI. The feature applies to calls matching your pre-defined
 *         criteria. Use this service to ring calls from your manager, a family member, 
 *         or an important customer on your cell phone, alternate business phone, 
 *         or home phone. If the criteria do not match, the call continues as if 
 *         this service was not turned on. Via the XSI, the ability to create/edit 
 *         criteria is not provided. Only the ability to retrieve the
 *         list of criteria, defined by their name, and whether each criteria is
 *         active or not, is provided at this time.
 *       
 * 
 * <p>Java class for SequentialRing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequentialRing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ringBaseLocationFirst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="baseLocationNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/&gt;
 *         &lt;element name="continueIfBaseLocationIsBusy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callerMayStopSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="location1" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/&gt;
 *         &lt;element name="location2" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/&gt;
 *         &lt;element name="location3" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/&gt;
 *         &lt;element name="location4" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/&gt;
 *         &lt;element name="location5" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivationList" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequentialRing", propOrder = {
    "ringBaseLocationFirst",
    "baseLocationNumberOfRings",
    "continueIfBaseLocationIsBusy",
    "callerMayStopSearch",
    "location1",
    "location2",
    "location3",
    "location4",
    "location5",
    "criteriaActivationList"
})
public class SequentialRing {

    protected Boolean ringBaseLocationFirst;
    protected Integer baseLocationNumberOfRings;
    protected Boolean continueIfBaseLocationIsBusy;
    protected Boolean callerMayStopSearch;
    protected SequentialRingLocation location1;
    protected SequentialRingLocation location2;
    protected SequentialRingLocation location3;
    protected SequentialRingLocation location4;
    protected SequentialRingLocation location5;
    protected CriteriaActivationList criteriaActivationList;

    /**
     * Gets the value of the ringBaseLocationFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingBaseLocationFirst() {
        return ringBaseLocationFirst;
    }

    /**
     * Sets the value of the ringBaseLocationFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingBaseLocationFirst(Boolean value) {
        this.ringBaseLocationFirst = value;
    }

    /**
     * Gets the value of the baseLocationNumberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseLocationNumberOfRings() {
        return baseLocationNumberOfRings;
    }

    /**
     * Sets the value of the baseLocationNumberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseLocationNumberOfRings(Integer value) {
        this.baseLocationNumberOfRings = value;
    }

    /**
     * Gets the value of the continueIfBaseLocationIsBusy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinueIfBaseLocationIsBusy() {
        return continueIfBaseLocationIsBusy;
    }

    /**
     * Sets the value of the continueIfBaseLocationIsBusy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinueIfBaseLocationIsBusy(Boolean value) {
        this.continueIfBaseLocationIsBusy = value;
    }

    /**
     * Gets the value of the callerMayStopSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallerMayStopSearch() {
        return callerMayStopSearch;
    }

    /**
     * Sets the value of the callerMayStopSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallerMayStopSearch(Boolean value) {
        this.callerMayStopSearch = value;
    }

    /**
     * Gets the value of the location1 property.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation1() {
        return location1;
    }

    /**
     * Sets the value of the location1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation1(SequentialRingLocation value) {
        this.location1 = value;
    }

    /**
     * Gets the value of the location2 property.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation2() {
        return location2;
    }

    /**
     * Sets the value of the location2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation2(SequentialRingLocation value) {
        this.location2 = value;
    }

    /**
     * Gets the value of the location3 property.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation3() {
        return location3;
    }

    /**
     * Sets the value of the location3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation3(SequentialRingLocation value) {
        this.location3 = value;
    }

    /**
     * Gets the value of the location4 property.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation4() {
        return location4;
    }

    /**
     * Sets the value of the location4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation4(SequentialRingLocation value) {
        this.location4 = value;
    }

    /**
     * Gets the value of the location5 property.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation5() {
        return location5;
    }

    /**
     * Sets the value of the location5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation5(SequentialRingLocation value) {
        this.location5 = value;
    }

    /**
     * Gets the value of the criteriaActivationList property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivationList() {
        return criteriaActivationList;
    }

    /**
     * Sets the value of the criteriaActivationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivationList(CriteriaActivationList value) {
        this.criteriaActivationList = value;
    }

}
