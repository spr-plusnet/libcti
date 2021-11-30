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
 * <p>Java-Klasse für Request complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://schema.broadsoft.com/XspXMLInterface}RequestId"/&gt;
 *         &lt;element name="sessionId" type="{http://schema.broadsoft.com/XspXMLInterface}SessionId"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="credentials" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="ssoCredentials" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *           &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://schema.broadsoft.com/XspXMLInterface}payload"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}token" default="18.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "requestId",
    "sessionId",
    "credentials",
    "ssoCredentials",
    "authorization",
    "payload"
})
public class Request {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String requestId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sessionId;
    protected byte[] credentials;
    protected byte[] ssoCredentials;
    protected String authorization;
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
     * Ruft den Wert der sessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Legt den Wert der sessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Ruft den Wert der credentials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCredentials() {
        return credentials;
    }

    /**
     * Legt den Wert der credentials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCredentials(byte[] value) {
        this.credentials = value;
    }

    /**
     * Ruft den Wert der ssoCredentials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSsoCredentials() {
        return ssoCredentials;
    }

    /**
     * Legt den Wert der ssoCredentials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSsoCredentials(byte[] value) {
        this.ssoCredentials = value;
    }

    /**
     * Ruft den Wert der authorization-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Legt den Wert der authorization-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorization(String value) {
        this.authorization = value;
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
            return "18.0";
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
