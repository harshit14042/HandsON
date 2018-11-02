package SOAP.demoConsume;

import generated.soap.demo.services.D2F;
import generated.soap.demo.services.D2FImplService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	D2FImplService serv=new D2FImplService();
    	
    	D2F prx=serv.getD2FImplPort();
    	
    	double f=prx.degToFah(5);
    	
    	System.out.println(f);
    	
    }
}
