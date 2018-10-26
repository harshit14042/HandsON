package com.example.demo.utility;

import java.awt.image.RescaleOp;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;
import org.neo4j.driver.v1.TransactionWork;

import com.example.demo.entity.Movie;
import com.example.demo.entity.Person;

public class DBOpsImpl implements DBOps<Person,Movie>, AutoCloseable {
	
	private Driver driver;
	private final String uri="bolt://localhost:7687",username="neo4j",password="Harsh@2018";
	
	public DBOpsImpl() {
		driver=GraphDatabase.driver(uri, AuthTokens.basic(username, password));
	}

	@Override
	public boolean addPerson(Person person) {
		// TODO Auto-generated method stub
		System.out.println(person);
		Session session=driver.session();
		session.writeTransaction(new TransactionWork<String>() {

			@Override
			public String execute(Transaction tx) {
				// TODO Auto-generated method stub
				System.out.println("Inside Execute");
				StatementResult res=tx.run("create(:Person{name:'"+person.getName()+"',born:'"+person.getBorn()+"'})");
				return res.toString();
			}
		});
		return true;
	}

	@Override
	public boolean addRelationShip(Person person, Movie movie) {
		// TODO Auto-generated method stub
		Session session=driver.session();
		session.writeTransaction(new TransactionWork<String>() {

			@Override
			public String execute(Transaction tx) {
				// TODO Auto-generated method stub
				StatementResult res=tx.run("match(p:Person{name:'"+person.getName()+"'}) match(m:Movie{title:'"+movie.getTitle()+"'}) create(p)-[:ACTED_IN]->(m)");
				return res.toString();
			}
			
		});
		return true;
	}

	@Override
	public boolean addMovie(Movie movie) {
		// TODO Auto-generated method stub
		Session session=driver.session();
		session.writeTransaction(new TransactionWork<String>() {

			@Override
			public String execute(Transaction tx) {
				// TODO Auto-generated method stub
				StatementResult res=tx.run("create(m:Movie{title:'"+movie.getTitle()+"',tagline:'"+movie.getTagline()+"',released:"+movie.getReleased()+"})");
				System.out.println(res.toString());
				return res.toString();
			}
		});
		
		return true;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		driver.close();
	}

}
