package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {

	  public static void main( String[] args )  
	    {  
		  Configuration configuration=new Configuration().configure();
	        configuration.addAnnotatedClass(Employee.class);
	        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties ());
	        SessionFactory factory= configuration.buildSessionFactory(builder.build());
	        Session session=factory.openSession();
	         Transaction transaction=session.beginTransaction();
	        Employee p1=new Employee(10,"virat","india");
	        session.save(p1);
	        System.out.println("deatils"+p1);
	        transaction.commit();
	        session.close();
	        
		}

	

	             
	    }  
	 

	


