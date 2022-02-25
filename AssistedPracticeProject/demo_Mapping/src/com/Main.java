package com;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

import com.Student;

public class Main {

	public static void main(String[] args) {
	    Student s1=new Student();
		s1.setStudentName("raham");
		s1.setStudentId(232);
		Address address=new Address();
		address.setCity("guntakal");
		address.setState("ap");
		address.setStreet("bus stand");
		address.setZipcode(515801);
		Address address2=new Address();
		address2.setCity("gooty");
		address2.setState("pune");
		address2.setStreet("thilak");
		address2.setZipcode(1111);
	    s1.getListofAddresses().add(address);
	    s1.getListofAddresses().add(address2);
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	}
}
		
		