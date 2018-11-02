package com.practice.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.entity.ContactList;
import com.practice.entity.Person;

public class Application {
	
	public static void main(String[] args) {

		ApplicationContext appCtx=new ClassPathXmlApplicationContext("Beans.xml");
		
		//Person p=appCtx.getBean(Person.class);
		
		ContactList cl=appCtx.getBean("contactList",ContactList.class);
		
		
		System.out.println(cl);
	}
	
}
