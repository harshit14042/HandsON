package com.example.demo.utility;

import com.example.demo.entity.Movie;
import com.example.demo.entity.Person;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(1, "Christian Bale", "1970");
		Movie m=new Movie(1, "Dark Knight", 2008, "I am an agent of chaos");
		DBOpsImpl dbo=new DBOpsImpl();
		dbo.addPerson(p);
		dbo.addMovie(m);
		dbo.addRelationShip(p, m);
	}

}