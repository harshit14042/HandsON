package Hibernate.HSQL;

import java.sql.SQLException;
import java.util.List;

import com.practice.entity.Personhv;
import com.practice.utils.Person_DAOImplementation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person_DAOImplementation dao=new Person_DAOImplementation();
       
        try {
        	//dao.add(new Personhv(4,"Ayush"));
        	//dao.removeById(4);
			List<Personhv> persons=dao.findAll();
			System.out.println(persons);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
}
