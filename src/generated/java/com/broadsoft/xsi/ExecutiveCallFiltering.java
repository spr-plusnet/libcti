//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for filtering assigned to the Executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java class for ExecutiveCallFiltering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveCallFiltering"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableFiltering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="filteringMode" type="{http://schema.broadsoft.com/xsi}ExecutiveCallFilteringMode" minOccurs="0"/&gt;
 *         &lt;element name="simpleFilterType" type="{http://schema.broadsoft.com/xsi}ExecutiveCallSimpleFilterType" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivations" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveCallFiltering", propOrder = {
    "enableFiltering",
    "filteringMode",
    "simpleFilterType",
    "criteriaActivations"
})
public class ExecutiveCallFiltering {

    protected Boolean enableFiltering;
    @XmlSchemaType(name = "token")
    protected ExecutiveCallFilteringMode filteringMode;
    @XmlSchemaType(name = "token")
    protected ExecutiveCallSimpleFilterType simpleFilterType;
    protected CriteriaActivationList criteriaActivations;

    /**
     * Gets the value of the enableFiltering property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFiltering() {
        return enableFiltering;
    }

    /**
     * Sets the value of the enableFiltering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFiltering(Boolean value) {
        this.enableFiltering = value;
    }

    /**
     * Gets the value of the filteringMode property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveCallFilteringMode }
     *     
     */
    public ExecutiveCallFilteringMode getFilteringMode() {
        return filteringMode;
    }

    /**
     * Sets the value of the filteringMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveCallFilteringMode }
     *     
     */
    public void setFilteringMode(ExecutiveCallFilteringMode value) {
        this.filteringMode = value;
    }

    /**
     * Gets the value of the simpleFilterType property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveCallSimpleFilterType }
     *     
     */
    public ExecutiveCallSimpleFilterType getSimpleFilterType() {
        return simpleFilterType;
    }

    /**
     * Sets the value of the simpleFilterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveCallSimpleFilterType }
     *     
     */
    public void setSimpleFilterType(ExecutiveCallSimpleFilterType value) {
        this.simpleFilterType = value;
    }

    /**
     * Gets the value of the criteriaActivations property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivations() {
        return criteriaActivations;
    }

    /**
     * Sets the value of the criteriaActivations property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivations(CriteriaActivationList value) {
        this.criteriaActivations = value;
    }

}
