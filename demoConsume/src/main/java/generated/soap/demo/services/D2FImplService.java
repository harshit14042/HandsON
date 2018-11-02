
package generated.soap.demo.services;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "D2FImplService", targetNamespace = "http://services.demo.SOAP/", wsdlLocation = "http://localhost:8080/test?wsdl")
public class D2FImplService
    extends Service
{

    private final static URL D2FIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException D2FIMPLSERVICE_EXCEPTION;
    private final static QName D2FIMPLSERVICE_QNAME = new QName("http://services.demo.SOAP/", "D2FImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/test?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        D2FIMPLSERVICE_WSDL_LOCATION = url;
        D2FIMPLSERVICE_EXCEPTION = e;
    }

    public D2FImplService() {
        super(__getWsdlLocation(), D2FIMPLSERVICE_QNAME);
    }

    public D2FImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), D2FIMPLSERVICE_QNAME, features);
    }

    public D2FImplService(URL wsdlLocation) {
        super(wsdlLocation, D2FIMPLSERVICE_QNAME);
    }

    public D2FImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, D2FIMPLSERVICE_QNAME, features);
    }

    public D2FImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public D2FImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns D2F
     */
    @WebEndpoint(name = "D2FImplPort")
    public D2F getD2FImplPort() {
        return super.getPort(new QName("http://services.demo.SOAP/", "D2FImplPort"), D2F.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns D2F
     */
    @WebEndpoint(name = "D2FImplPort")
    public D2F getD2FImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.demo.SOAP/", "D2FImplPort"), D2F.class, features);
    }

    private static URL __getWsdlLocation() {
        if (D2FIMPLSERVICE_EXCEPTION!= null) {
            throw D2FIMPLSERVICE_EXCEPTION;
        }
        return D2FIMPLSERVICE_WSDL_LOCATION;
    }

}