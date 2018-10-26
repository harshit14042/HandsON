package com.training.entity;

public class Movie {

	private long id;
	private String title;
	private long released;
	private String tagline;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getReleased() {
		return released;
	}
	public void setReleased(long released) {
		this.released = released;
	}
	public String getTagline() {
		return tagline;
	}
	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", released=" + released + ", tagline=" + tagline + "]";
	}
	public Movie(long id, String title, long released, String tagline) {
		super();
		this.id = id;
		this.title = title;
		this.released = released;
		this.tagline = tagline;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
