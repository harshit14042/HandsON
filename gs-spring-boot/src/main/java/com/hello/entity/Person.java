package com.hello.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personhv")
public class Person {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="pid")
	private long pid;
	
	@Column(name="pname")
	private String pname;
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
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
		Person other = (Person) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [id=" + pid + ", name=" + pname + "]";
	}
	public Person(long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
