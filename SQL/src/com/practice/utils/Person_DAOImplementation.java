package com.practice.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.practice.entity.Person;

public class Person_DAOImplementation implements DAO<Person> {
	
	private Connection con;

	public Person_DAOImplementation() {
		super();
		try {
			InitialContext ictx=new InitialContext();
			Context ctx=(Context)ictx.lookup("java:comp/env");
			DataSource ds=(DataSource) ctx.lookup("jdbc/ds");
			con=ds.getConnection();
			System.out.println(con);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Connection not Found");
		}
		
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int add(Person person) throws SQLException {
		// TODO Auto-generated method stub
		int rowAdded=0;
		String sql="insert into personhv values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		long newId=getNewId();
		ps.setLong(1, newId);
		ps.setString(2, person.getName());
		rowAdded=ps.executeUpdate();
		return rowAdded;
	}

	@Override
	public List<Person> findAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Person> persons=new ArrayList<>();
		
		String sql="select pid,pname from personhv";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Person p=convertToObj(rs);
			persons.add(p);
		}
		
		return persons;
	}

	@Override
	public int removeById(long id) throws SQLException {
		// TODO Auto-generated method stub
		int rowsRemoved=0;
		
		String sql="delete from personhv where pid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setLong(1, id);
		rowsRemoved=ps.executeUpdate();
		return rowsRemoved;
	}

	@Override
	public Person findById(long id) throws SQLException {
		// TODO Auto-generated method stub
		Person p=null;
		
		String sql="select pid,pname from personhv where pid=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setLong(1, id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			p=convertToObj(rs);
		}
		return p;
	}



	@Override
	public long getNewId() throws SQLException {
		// TODO Auto-generated method stub
		long id=0;
		
		String sql="select max(pid) from personhv";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			id=rs.getLong(1);
		}
		
		return ++id;
	}



	@Override
	public Person convertToObj(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Person person=null;
		
		long id=rs.getLong("pid");
		String name=rs.getString("pname");
		
		person=new Person(id, name);
		
		return person;
	}

}
