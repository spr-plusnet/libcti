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
 *         Contains the Call Transfer service configuration data.
 *       
 * 
 * <p>Java class for CallTransferInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallTransferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recallActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recallNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/&gt;
 *         &lt;element name="busyCampOnActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="busyCampOnSeconds" type="{http://schema.broadsoft.com/xsi}CallTransferBusyCampOnSeconds" minOccurs="0"/&gt;
 *         &lt;element name="useDiversionInhibitorForBlindTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDiversionInhibitorForConsultativeCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallTransferInfo", propOrder = {
    "recallActive",
    "recallNumberOfRings",
    "busyCampOnActive",
    "busyCampOnSeconds",
    "useDiversionInhibitorForBlindTransfer",
    "useDiversionInhibitorForConsultativeCalls"
})
public class CallTransferInfo {

    protected Boolean recallActive;
    protected Integer recallNumberOfRings;
    protected Boolean busyCampOnActive;
    protected Integer busyCampOnSeconds;
    protected Boolean useDiversionInhibitorForBlindTransfer;
    protected Boolean useDiversionInhibitorForConsultativeCalls;

    /**
     * Gets the value of the recallActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecallActive() {
        return recallActive;
    }

    /**
     * Sets the value of the recallActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallActive(Boolean value) {
        this.recallActive = value;
    }

    /**
     * Gets the value of the recallNumberOfRings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecallNumberOfRings() {
        return recallNumberOfRings;
    }

    /**
     * Sets the value of the recallNumberOfRings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecallNumberOfRings(Integer value) {
        this.recallNumberOfRings = value;
    }

    /**
     * Gets the value of the busyCampOnActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusyCampOnActive() {
        return busyCampOnActive;
    }

    /**
     * Sets the value of the busyCampOnActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusyCampOnActive(Boolean value) {
        this.busyCampOnActive = value;
    }

    /**
     * Gets the value of the busyCampOnSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusyCampOnSeconds() {
        return busyCampOnSeconds;
    }

    /**
     * Sets the value of the busyCampOnSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusyCampOnSeconds(Integer value) {
        this.busyCampOnSeconds = value;
    }

    /**
     * Gets the value of the useDiversionInhibitorForBlindTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitorForBlindTransfer() {
        return useDiversionInhibitorForBlindTransfer;
    }

    /**
     * Sets the value of the useDiversionInhibitorForBlindTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitorForBlindTransfer(Boolean value) {
        this.useDiversionInhibitorForBlindTransfer = value;
    }

    /**
     * Gets the value of the useDiversionInhibitorForConsultativeCalls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitorForConsultativeCalls() {
        return useDiversionInhibitorForConsultativeCalls;
    }

    /**
     * Sets the value of the useDiversionInhibitorForConsultativeCalls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitorForConsultativeCalls(Boolean value) {
        this.useDiversionInhibitorForConsultativeCalls = value;
    }

}
