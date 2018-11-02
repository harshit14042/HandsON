
package SOAP.demo.ifaces.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "degToFah", namespace = "http://ifaces.demo.SOAP/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "degToFah", namespace = "http://ifaces.demo.SOAP/")
public class DegToFah {

    @XmlElement(name = "deg", namespace = "")
    private double deg;

    /**
     * 
     * @return
     *     returns double
     */
    public double getDeg() {
        return this.deg;
    }

    /**
     * 
     * @param deg
     *     the value for the deg property
     */
    public void setDeg(double deg) {
        this.deg = deg;
    }

}
