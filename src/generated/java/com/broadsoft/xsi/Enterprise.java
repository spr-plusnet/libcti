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
 *         &lt;element name="startIndex" type="{http://schema.broadsoft.com/xsi}PositiveInt"/&gt;
 *         &lt;element name="numberOfRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="totalAvailableRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="enterpriseDirectory" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetailsList"/&gt;
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
    "startIndex",
    "numberOfRecords",
    "totalAvailableRecords",
    "enterpriseDirectory"
})
@XmlRootElement(name = "Enterprise")
public class Enterprise {

    protected int startIndex;
    protected int numberOfRecords;
    protected int totalAvailableRecords;
    @XmlElement(required = true)
    protected UserAdditionalDetailsList enterpriseDirectory;

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the numberOfRecords property.
     * 
     */
    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Sets the value of the numberOfRecords property.
     * 
     */
    public void setNumberOfRecords(int value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the totalAvailableRecords property.
     * 
     */
    public int getTotalAvailableRecords() {
        return totalAvailableRecords;
    }

    /**
     * Sets the value of the totalAvailableRecords property.
     * 
     */
    public void setTotalAvailableRecords(int value) {
        this.totalAvailableRecords = value;
    }

    /**
     * Gets the value of the enterpriseDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public UserAdditionalDetailsList getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    /**
     * Sets the value of the enterpriseDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public void setEnterpriseDirectory(UserAdditionalDetailsList value) {
        this.enterpriseDirectory = value;
    }

}
