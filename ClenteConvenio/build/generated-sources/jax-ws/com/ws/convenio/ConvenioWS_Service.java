
package com.ws.convenio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConvenioWS", targetNamespace = "http://convenio.ws.com/", wsdlLocation = "http://localhost:8080/ConvenioWS/ConvenioWS?wsdl")
public class ConvenioWS_Service
    extends Service
{

    private final static URL CONVENIOWS_WSDL_LOCATION;
    private final static WebServiceException CONVENIOWS_EXCEPTION;
    private final static QName CONVENIOWS_QNAME = new QName("http://convenio.ws.com/", "ConvenioWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ConvenioWS/ConvenioWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVENIOWS_WSDL_LOCATION = url;
        CONVENIOWS_EXCEPTION = e;
    }

    public ConvenioWS_Service() {
        super(__getWsdlLocation(), CONVENIOWS_QNAME);
    }

    public ConvenioWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVENIOWS_QNAME, features);
    }

    public ConvenioWS_Service(URL wsdlLocation) {
        super(wsdlLocation, CONVENIOWS_QNAME);
    }

    public ConvenioWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVENIOWS_QNAME, features);
    }

    public ConvenioWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvenioWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConvenioWS
     */
    @WebEndpoint(name = "ConvenioWSPort")
    public ConvenioWS getConvenioWSPort() {
        return super.getPort(new QName("http://convenio.ws.com/", "ConvenioWSPort"), ConvenioWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConvenioWS
     */
    @WebEndpoint(name = "ConvenioWSPort")
    public ConvenioWS getConvenioWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://convenio.ws.com/", "ConvenioWSPort"), ConvenioWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVENIOWS_EXCEPTION!= null) {
            throw CONVENIOWS_EXCEPTION;
        }
        return CONVENIOWS_WSDL_LOCATION;
    }

}