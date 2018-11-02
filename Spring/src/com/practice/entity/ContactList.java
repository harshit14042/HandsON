package com.practice.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class ContactList {

	@Autowired
	private Person person;

	public Person getPerson() {
		return person;
	}

	
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "ContactList [person=" + person + "]";
	}
	
	
	
}
