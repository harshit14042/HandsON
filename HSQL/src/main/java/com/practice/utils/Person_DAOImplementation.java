package com.practice.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.practice.entity.Personhv;

public class Person_DAOImplementation{ //implements DAO<Person> {
	
	
	private Session session;

	public Person_DAOImplementation() {
		super();
		SessionFactory fact=HBUtils.getSessionFactory();
		
		session=fact.getCurrentSession();
		
		session.beginTransaction();
		// TODO Auto-generated constructor stub
	}
	
	

	public int add(Personhv person) throws SQLException {
		// TODO Auto-generated method stub
		//session.beginTransaction();
		
		session.save(person);
		session.flush();
		//session.getTransaction().commit();
		return 1;
	}

	public List<Personhv> findAll() throws SQLException {
		// TODO Auto-generated method stub
		//session.beginTransaction();
		String sql="select e from "+Personhv.class.getName()+" e";
		
		Query<Personhv> query=session.createQuery(sql);
		
		List<Personhv> persons=query.getResultList();
		
		session.getTransaction().commit();
		
		return persons;
		
		
	}

	public int removeById(long id) throws SQLException {
		// TODO Auto-generated method stub
		int rowsRemoved=0;
		
		Personhv p=session.find(Personhv.class,id);
		
		session.remove(p);
		
		return rowsRemoved;
	}

	/*public Person findById(long id) throws SQLException {
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



	public Person convertToObj(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Person person=null;
		
		long id=rs.getLong("pid");
		String name=rs.getString("pname");
		
		person=new Person(id, name);
		
		return person;
	}



	public int update(Person t) throws SQLException {
		// TODO Auto-generated method stub
		int rows=0;
		
		String sql="update personhv set pname=? where pid=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setString(1, t.getName());
		ps.setLong(2, t.getId());
		
		rows=ps.executeUpdate();
		return rows;
	}*/

}
