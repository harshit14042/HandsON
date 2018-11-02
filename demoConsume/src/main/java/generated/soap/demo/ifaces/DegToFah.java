
package generated.soap.demo.ifaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for degToFah complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="degToFah">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deg" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "degToFah", propOrder = {
    "deg"
})
public class DegToFah {

    protected double deg;

    /**
     * Gets the value of the deg property.
     * 
     */
    public double getDeg() {
        return deg;
    }

    /**
     * Sets the value of the deg property.
     * 
     */
    public void setDeg(double value) {
        this.deg = value;
    }

}
