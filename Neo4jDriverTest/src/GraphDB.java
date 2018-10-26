import static org.neo4j.driver.v1.Values.parameters;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;
import org.neo4j.driver.v1.TransactionWork;

import com.training.entity.Person;

public class GraphDB implements AutoCloseable{

	private final Driver driver;
	
	public GraphDB(String uri,String user,String password) {
		driver=GraphDatabase.driver(uri, AuthTokens.basic(user, password));
	}
	
	public void printGreeting(String msg) {
		try(Session session=driver.session()) 
		{
			String greeting=session.writeTransaction(new TransactionWork<String>() {

				@Override
				public String execute(Transaction tx) {
					// TODO Auto-generated method stub
					//StatementResult res=tx.run("create (a:Greeting) set a.message=$msg return a.message,id(a)",parameters("msg",msg));
					StatementResult res=tx.run("match(p:Person)-[:ACTED_IN]->(m:Movie) return p.name,m.title");
					//return res.single().get(0).asString();
					String a="";
					while(res.hasNext()) {
						a+=(String) res.next().get("p.name", String.class)+"\n";
					}
					return a;
				}
				
			});
			System.out.println(greeting);
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(GraphDB db=new GraphDB("bolt://localhost:7687","neo4j","Harsh@2018"))
		{
			db.printGreeting("Hello it is working !!");
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		driver.close();
	}

}
