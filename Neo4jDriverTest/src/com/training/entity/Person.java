package com.training.entity;

public class Person {

	private long id;
	private String name;
	private String born;
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
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", born=" + born + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Person(long id, String name, String born) {
		super();
		this.id = id;
		this.name = name;
		this.born = born;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
