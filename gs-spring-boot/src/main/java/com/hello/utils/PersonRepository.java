package com.hello.utils;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hello.entity.Person;



@Repository
public interface PersonRepository extends CrudRepository<Person,Integer>{

	
	
}
