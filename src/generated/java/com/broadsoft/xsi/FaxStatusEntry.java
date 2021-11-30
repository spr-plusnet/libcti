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
 *         The data for a single fax transaction.       
 *       
 * 
 * <p>Java class for FaxStatusEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaxStatusEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faxId" type="{http://schema.broadsoft.com/xsi}FaxId"/&gt;
 *         &lt;element name="faxStatus" type="{http://schema.broadsoft.com/xsi}FaxStatusCode"/&gt;
 *         &lt;element name="faxFileName" type="{http://schema.broadsoft.com/xsi}FileName"/&gt;
 *         &lt;element name="faxDestination" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="timestamp" type="{http://schema.broadsoft.com/xsi}Timestamp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaxStatusEntry", propOrder = {
    "faxId",
    "faxStatus",
    "faxFileName",
    "faxDestination",
    "timestamp"
})
public class FaxStatusEntry {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String faxId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected FaxStatusCode faxStatus;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String faxFileName;
    @XmlElement(required = true)
    protected Address faxDestination;
    protected long timestamp;

    /**
     * Gets the value of the faxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxId() {
        return faxId;
    }

    /**
     * Sets the value of the faxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxId(String value) {
        this.faxId = value;
    }

    /**
     * Gets the value of the faxStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FaxStatusCode }
     *     
     */
    public FaxStatusCode getFaxStatus() {
        return faxStatus;
    }

    /**
     * Sets the value of the faxStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxStatusCode }
     *     
     */
    public void setFaxStatus(FaxStatusCode value) {
        this.faxStatus = value;
    }

    /**
     * Gets the value of the faxFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxFileName() {
        return faxFileName;
    }

    /**
     * Sets the value of the faxFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxFileName(String value) {
        this.faxFileName = value;
    }

    /**
     * Gets the value of the faxDestination property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFaxDestination() {
        return faxDestination;
    }

    /**
     * Sets the value of the faxDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFaxDestination(Address value) {
        this.faxDestination = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

}
