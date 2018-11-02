package SOAP.demo.apps;

import javax.xml.ws.Endpoint;

import SOAP.demo.services.D2FImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Endpoint.publish("http://localhost:8080/test",new D2FImpl());
        
        System.out.println("Published");
    }
}
