package SOAP.demo.ifaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
public interface D2F {

	@WebMethod
	public double degToFah(@WebParam(name="deg")double deg);
	
}
