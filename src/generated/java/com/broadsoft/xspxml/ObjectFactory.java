//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.11.30 um 10:39:53 AM CET 
//


package com.broadsoft.xspxml;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.broadsoft.xspxml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "request");
    private final static QName _Response_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "response");
    private final static QName _Event_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "event");
    private final static QName _EventResponse_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "eventResponse");
    private final static QName _Payload_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "payload");
    private final static QName _EmptyPayload_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "emptyPayload");
    private final static QName _EmptyRequestPayload_QNAME = new QName("http://schema.broadsoft.com/XspXMLInterface", "emptyRequestPayload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.broadsoft.xspxml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link Keepalive }
     * 
     */
    public Keepalive createKeepalive() {
        return new Keepalive();
    }

    /**
     * Create an instance of {@link KeepaliveResponse }
     * 
     */
    public KeepaliveResponse createKeepaliveResponse() {
        return new KeepaliveResponse();
    }

    /**
     * Create an instance of {@link Payload }
     * 
     */
    public Payload createPayload() {
        return new Payload();
    }

    /**
     * Create an instance of {@link EmptyPayload }
     * 
     */
    public EmptyPayload createEmptyPayload() {
        return new EmptyPayload();
    }

    /**
     * Create an instance of {@link EmptyRequestPayload }
     * 
     */
    public EmptyRequestPayload createEmptyRequestPayload() {
        return new EmptyRequestPayload();
    }

    /**
     * Create an instance of {@link RequestPayload }
     * 
     */
    public RequestPayload createRequestPayload() {
        return new RequestPayload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Request }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Event }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Event }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "event")
    public JAXBElement<Event> createEvent(Event value) {
        return new JAXBElement<Event>(_Event_QNAME, Event.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "eventResponse")
    public JAXBElement<EventResponse> createEventResponse(EventResponse value) {
        return new JAXBElement<EventResponse>(_EventResponse_QNAME, EventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Payload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Payload }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "payload")
    public JAXBElement<Payload> createPayload(Payload value) {
        return new JAXBElement<Payload>(_Payload_QNAME, Payload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmptyPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "emptyPayload", substitutionHeadNamespace = "http://schema.broadsoft.com/XspXMLInterface", substitutionHeadName = "payload")
    public JAXBElement<EmptyPayload> createEmptyPayload(EmptyPayload value) {
        return new JAXBElement<EmptyPayload>(_EmptyPayload_QNAME, EmptyPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyRequestPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmptyRequestPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://schema.broadsoft.com/XspXMLInterface", name = "emptyRequestPayload", substitutionHeadNamespace = "http://schema.broadsoft.com/XspXMLInterface", substitutionHeadName = "payload")
    public JAXBElement<EmptyRequestPayload> createEmptyRequestPayload(EmptyRequestPayload value) {
        return new JAXBElement<EmptyRequestPayload>(_EmptyRequestPayload_QNAME, EmptyRequestPayload.class, null, value);
    }

}
