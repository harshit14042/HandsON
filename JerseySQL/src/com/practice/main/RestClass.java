package com.practice.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.practice.entity.Person;
import com.practice.utils.DAO;
import com.practice.utils.Person_DAOImplementation;

@Path("person")
public class RestClass {

	private DAO dao;
	
	public RestClass() {
		System.out.println("Inside ResClass Constructor");
		dao=new Person_DAOImplementation();
	}
	
	
	@GET
	@Path("getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		List<Person> persons=new ArrayList<>();;
		try {
			persons = dao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(persons).build();
	}
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public int add(Person p) {
		int rows=0;
		try {
			rows=dao.add(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
	
	@DELETE
	@Path("delete/{id}")
	public int delete(@PathParam("id")long id) throws SQLException {
		return dao.removeById(id);
	}
	
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	public int update(Person p) throws SQLException {
		return dao.update(p);
	}
}
