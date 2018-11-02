package com.hello.utils;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hello.entity.Person;


@Service
public interface PersonRepository extends CrudRepository<Person,Integer>{

	
	
}
