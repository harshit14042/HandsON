package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personhv")
public class Personhv {

	private long pid;
	private String pname;
	
	@Id
	@Column(name="pid")
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	
	@Column(name="pname")
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (pid ^ (pid >>> 32));
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
		Personhv other = (Personhv) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [id=" + pid + ", name=" + pname + "]";
	}
	public Personhv(long id, String name) {
		super();
		this.pid = id;
		this.pname = name;
	}
	public Personhv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
