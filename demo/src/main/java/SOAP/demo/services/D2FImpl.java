package SOAP.demo.services;

import javax.jws.WebService;

import SOAP.demo.ifaces.D2F;

@WebService(endpointInterface="SOAP.demo.ifaces.D2F")
public class D2FImpl implements D2F{

	
	public double degToFah(double deg) {
		return deg*2;
	}
}
