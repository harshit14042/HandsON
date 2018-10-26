package com.example.demo.utility;

public interface DBOps<Person,Movie> {

	public boolean addPerson(Person person);
	
	public boolean addRelationShip(Person person,Movie movie);
	
	public boolean addMovie(Movie movie);
}
