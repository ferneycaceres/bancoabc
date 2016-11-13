
package com.ws.soap.saldo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.soap.saldo package. 
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

    private final static QName _ObtenerSaldo_QNAME = new QName("http://saldo.soap.ws.com/", "obtenerSaldo");
    private final static QName _ObtenerSaldoResponse_QNAME = new QName("http://saldo.soap.ws.com/", "obtenerSaldoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.soap.saldo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerSaldoResponse }
     * 
     */
    public ObtenerSaldoResponse createObtenerSaldoResponse() {
        return new ObtenerSaldoResponse();
    }

    /**
     * Create an instance of {@link ObtenerSaldo }
     * 
     */
    public ObtenerSaldo createObtenerSaldo() {
        return new ObtenerSaldo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSaldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saldo.soap.ws.com/", name = "obtenerSaldo")
    public JAXBElement<ObtenerSaldo> createObtenerSaldo(ObtenerSaldo value) {
        return new JAXBElement<ObtenerSaldo>(_ObtenerSaldo_QNAME, ObtenerSaldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerSaldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://saldo.soap.ws.com/", name = "obtenerSaldoResponse")
    public JAXBElement<ObtenerSaldoResponse> createObtenerSaldoResponse(ObtenerSaldoResponse value) {
        return new JAXBElement<ObtenerSaldoResponse>(_ObtenerSaldoResponse_QNAME, ObtenerSaldoResponse.class, null, value);
    }

}
