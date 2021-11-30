//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.11.30 um 10:39:53 AM CET 
//


package com.broadsoft.xspxml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://schema.broadsoft.com/XspXMLInterface}RequestPayload"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="params" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="payload" type="{http://schema.broadsoft.com/XspXMLInterface}EmptyPayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class EmptyRequestPayload
    extends RequestPayload
{


}
