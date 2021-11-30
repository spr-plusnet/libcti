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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The base event for ACD Events
 *       
 * 
 * <p>Java class for ACDEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}ACDQueueEntry"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDEvent", propOrder = {
    "queueEntry"
})
@XmlSeeAlso({
    ACDCallAbandonedEvent.class,
    ACDCallAddedEvent.class,
    ACDCallAnsweredByAgentEvent.class,
    ACDCallBouncedEvent.class,
    ACDCallEscapedEvent.class,
    ACDCallOfferedToAgentEvent.class,
    ACDCallOverflowedEvent.class,
    ACDCallOverflowedTreatmentCompletedEvent.class,
    ACDCallPromotedEvent.class,
    ACDCallReleasedEvent.class,
    ACDCallReorderedEvent.class,
    ACDCallStrandedEvent.class,
    ACDCallStrandedTreatementCompletedEvent.class,
    ACDCallStrandedUnavailableEvent.class,
    ACDCallStrandedUnavailableTreatementCompletedEvent.class,
    ACDCallTransferredEvent.class,
    ACDCallUpdatedEvent.class,
    ACDWhisperStartedEvent.class
})
public class ACDEvent
    extends EventData
{

    @XmlElement(required = true)
    protected ACDQueueEntry queueEntry;

    /**
     * Gets the value of the queueEntry property.
     * 
     * @return
     *     possible object is
     *     {@link ACDQueueEntry }
     *     
     */
    public ACDQueueEntry getQueueEntry() {
        return queueEntry;
    }

    /**
     * Sets the value of the queueEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDQueueEntry }
     *     
     */
    public void setQueueEntry(ACDQueueEntry value) {
        this.queueEntry = value;
    }

}
