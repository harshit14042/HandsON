
package generated.soap.demo.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import generated.soap.demo.ifaces.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "D2F", targetNamespace = "http://ifaces.demo.SOAP/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface D2F {


    /**
     * 
     * @param deg
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "degToFah", targetNamespace = "http://ifaces.demo.SOAP/", className = "soap.demo.ifaces.DegToFah")
    @ResponseWrapper(localName = "degToFahResponse", targetNamespace = "http://ifaces.demo.SOAP/", className = "soap.demo.ifaces.DegToFahResponse")
    public double degToFah(
        @WebParam(name = "deg", targetNamespace = "")
        double deg);

}
