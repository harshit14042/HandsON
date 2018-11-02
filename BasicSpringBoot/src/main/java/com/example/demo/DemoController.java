package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DAOImpl;
import com.example.demo.entity.Person;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;


@RestController
@RequestMapping("/")
@Api(value="/")
public class DemoController {
	private DAOImpl dao;
	
	List<Person> persons;
	
	public Person getPersonById(long id) {
		for(Person p:persons) {
			if(p.getId()==id) {
				return p;
			}
		}
		return null;
	}
	
	
	public DemoController() {
		super();
		persons=new ArrayList<>();
		persons.add(new Person(1, "Harshit"));
		persons.add(new Person(2, "Ankeet"));
		persons.add(new Person(3, "Hamaad"));
	}
	
	@GetMapping("/getUsr/{id}")
	@ApiOperation(value="Find User by Id")
	public ResponseEntity<Person> getUsr(@PathVariable(name="id")long id) {
		return ResponseEntity.ok().body(getPersonById(id));
	}
	
	@PutMapping("/update")
	@ApiOperation(value="Update an existing person")
	public ResponseEntity<Person> updateUser(@RequestBody Person p){
		System.out.println(p);
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getId()==p.getId()) {
				persons.set(i, p);
			}
		}
		return ResponseEntity.ok().body(getPersonById(p.getId()));
	}
	
	@PostMapping("/create")
	@ApiOperation(value="Create a new person")
	public ResponseEntity<List<Person>> createUsr(@RequestBody Person p){
		persons.add(p);
		return ResponseEntity.ok().body(persons);
	}
	
	@GetMapping("/all")
	@ApiOperation(value="List all persons")
	public ResponseEntity<List<Person>> all(){
		return ResponseEntity.ok().body(persons);
	}
	
	@DeleteMapping("/delUsr/{id}")
	@ApiOperation(value="Delete a person")
	public ResponseEntity<List<Person>> deleteUsr(@PathVariable(name="id")long id){
		for(int i=0;i<persons.size();i++) {
			if(persons.get(i).getId()==id) {
				persons.remove(i);
			}
		}
		return ResponseEntity.ok().body(persons);
	}
	
}
