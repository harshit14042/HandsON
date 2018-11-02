package com.practice.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HBUtils {

	private static final SessionFactory sessionFactory=buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		 ServiceRegistry serviceRegistry =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		 
		 Metadata metaData=new MetadataSources(serviceRegistry).getMetadataBuilder().build();
		 
		 return metaData.getSessionFactoryBuilder().build();
	}
	 public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	 
	    public static void shutdown() {
	        getSessionFactory().close();
	    }
}
