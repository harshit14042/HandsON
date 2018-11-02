package com.example.demo.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.example.demo.ifaces.DAO;

public class DAOImpl implements DAO {

	private Connection con;
	
	public DAOImpl() throws Exception {
		Context ctx=new InitialContext();
		DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/ds");
		con=ds.getConnection();
	}
	
	public Person convertToPerson(ResultSet rs) {
		Person p=new Person();
		
		try {
			p.setId(rs.getLong("pid"));
			p.setName(rs.getString("pname"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
	@Override
	public Person getPersonById(long id) {
		// TODO Auto-generated method stub
		String sql="select pid,pname from personhv where pid=?";
		Person p=new Person();
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				p=convertToPerson(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public int deletePersonById(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePerson(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addPerson(Person p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
