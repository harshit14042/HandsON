package com.practice.entity;

public class Person {

	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public Person(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
