//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.30 at 02:59:52 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The ACD Subscription event is issued immediately after a subscription
 *         is added or refreshed, provided that the subscription target is
 *         not a collection of subscriber (e.g. a group).
 *       
 * 
 * <p>Java class for ACDSubscriptionEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACDSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueEntries" type="{http://schema.broadsoft.com/xsi}ACDQueueEntryList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDSubscriptionEvent", propOrder = {
    "queueEntries"
})
@XmlSeeAlso({
    ACDSubscriptionResyncEvent.class
})
public class ACDSubscriptionEvent
    extends EventData
{

    protected ACDQueueEntryList queueEntries;

    /**
     * Gets the value of the queueEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ACDQueueEntryList }
     *     
     */
    public ACDQueueEntryList getQueueEntries() {
        return queueEntries;
    }

    /**
     * Sets the value of the queueEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDQueueEntryList }
     *     
     */
    public void setQueueEntries(ACDQueueEntryList value) {
        this.queueEntries = value;
    }

}
