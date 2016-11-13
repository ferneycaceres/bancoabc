
package com.ws.convenio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.convenio package. 
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

    private final static QName _ObtenerConvenioResponse_QNAME = new QName("http://convenio.ws.com/", "obtenerConvenioResponse");
    private final static QName _ObtenerConvenio_QNAME = new QName("http://convenio.ws.com/", "obtenerConvenio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.convenio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerConvenioResponse }
     * 
     */
    public ObtenerConvenioResponse createObtenerConvenioResponse() {
        return new ObtenerConvenioResponse();
    }

    /**
     * Create an instance of {@link ObtenerConvenio }
     * 
     */
    public ObtenerConvenio createObtenerConvenio() {
        return new ObtenerConvenio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerConvenioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convenio.ws.com/", name = "obtenerConvenioResponse")
    public JAXBElement<ObtenerConvenioResponse> createObtenerConvenioResponse(ObtenerConvenioResponse value) {
        return new JAXBElement<ObtenerConvenioResponse>(_ObtenerConvenioResponse_QNAME, ObtenerConvenioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerConvenio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://convenio.ws.com/", name = "obtenerConvenio")
    public JAXBElement<ObtenerConvenio> createObtenerConvenio(ObtenerConvenio value) {
        return new JAXBElement<ObtenerConvenio>(_ObtenerConvenio_QNAME, ObtenerConvenio.class, null, value);
    }

}
