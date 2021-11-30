//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.11.30 um 10:39:53 AM CET 
//


package com.broadsoft.xspxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für RequestPayload complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestPayload"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/XspXMLInterface}Payload"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="payload" type="{http://schema.broadsoft.com/XspXMLInterface}Payload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestPayload", propOrder = {
    "uri",
    "method",
    "version",
    "params",
    "payload"
})
@XmlSeeAlso({
    EmptyRequestPayload.class
})
public class RequestPayload
    extends Payload
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String method;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String version;
    @XmlElement(required = true)
    protected Object params;
    @XmlElement(required = true)
    protected Payload payload;

    /**
     * Ruft den Wert der uri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Legt den Wert der uri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
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
        return version;
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

    /**
     * Ruft den Wert der params-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParams() {
        return params;
    }

    /**
     * Legt den Wert der params-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParams(Object value) {
        this.params = value;
    }

    /**
     * Ruft den Wert der payload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Payload }
     *     
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * Legt den Wert der payload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Payload }
     *     
     */
    public void setPayload(Payload value) {
        this.payload = value;
    }

}
