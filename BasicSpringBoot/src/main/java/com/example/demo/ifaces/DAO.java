package com.example.demo.ifaces;

import com.example.demo.entity.Person;

public interface DAO {

	public Person getPersonById(long id);
	
	public int deletePersonById(long id);
	
	public int updatePerson(Person p);
	
	public int addPerson(Person p);
	
}
