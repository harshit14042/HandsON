
package generated.soap.demo.ifaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.demo.ifaces package. 
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

    private final static QName _DegToFah_QNAME = new QName("http://ifaces.demo.SOAP/", "degToFah");
    private final static QName _DegToFahResponse_QNAME = new QName("http://ifaces.demo.SOAP/", "degToFahResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.demo.ifaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DegToFahResponse }
     * 
     */
    public DegToFahResponse createDegToFahResponse() {
        return new DegToFahResponse();
    }

    /**
     * Create an instance of {@link DegToFah }
     * 
     */
    public DegToFah createDegToFah() {
        return new DegToFah();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DegToFah }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.demo.SOAP/", name = "degToFah")
    public JAXBElement<DegToFah> createDegToFah(DegToFah value) {
        return new JAXBElement<DegToFah>(_DegToFah_QNAME, DegToFah.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DegToFahResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.demo.SOAP/", name = "degToFahResponse")
    public JAXBElement<DegToFahResponse> createDegToFahResponse(DegToFahResponse value) {
        return new JAXBElement<DegToFahResponse>(_DegToFahResponse_QNAME, DegToFahResponse.class, null, value);
    }

}
