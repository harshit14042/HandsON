package com.practice.entity;

import org.springframework.stereotype.Component;

@Component
public class Personhv {

	public Personhv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personhv(long pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Personhv [pid=" + pid + ", pname=" + pname + "]";
	}

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

	private long pid;
	
	private String pname;
	
	
	
}
