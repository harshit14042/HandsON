package com.practice.entity;

public class Movie {
	
	private long id;
	private String name;
	private long released;
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
	public long getReleased() {
		return released;
	}
	public void setReleased(long released) {
		this.released = released;
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
		Movie other = (Movie) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", released=" + released + "]";
	}
	public Movie(long id, String name, long released) {
		super();
		this.id = id;
		this.name = name;
		this.released = released;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
