//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.11.30 um 10:39:53 AM CET 
//


package com.broadsoft.xspxml;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für Event complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Event"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://schema.broadsoft.com/XspXMLInterface}RequestId"/&gt;
 *         &lt;element ref="{http://schema.broadsoft.com/XspXMLInterface}payload"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" default="17.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "requestId",
    "payload"
})
public class Event {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String requestId;
    @XmlElementRef(name = "payload", namespace = "http://schema.broadsoft.com/XspXMLInterface", type = JAXBElement.class)
    protected JAXBElement<? extends Payload> payload;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;

    /**
     * Ruft den Wert der requestId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Legt den Wert der requestId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmptyPayload }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmptyRequestPayload }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payload }{@code >}
     *     
     */
    public JAXBElement<? extends Payload> getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmptyPayload }{@code >}
     *     {@link JAXBElement }{@code <}{@link EmptyRequestPayload }{@code >}
     *     {@link JAXBElement }{@code <}{@link Payload }{@code >}
     *     
     */
    public void setPayload(JAXBElement<? extends Payload> value) {
        this.payload = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "17.0";
        } else {
            return version;
        }
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
