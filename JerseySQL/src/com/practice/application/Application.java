package com.practice.application;

import java.sql.SQLException;

import com.practice.entity.Person;
import com.practice.utils.Person_DAOImplementation;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_DAOImplementation dao=new Person_DAOImplementation();
		
		Person person1=new Person(3, "Harshit");
		Person person2=new Person(2, "Hamaad");
		
		try {
			int rows=dao.add(person1);
			if(rows==0) {
				System.err.println("Not added");
			}
			else {
				System.out.println("added");
			}
			rows=dao.add(person2);
			if(rows==0) {
				System.err.println("Not added");
			}
			else {
				System.out.println("added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("Unable to add rows");
		}
		
	}

}
