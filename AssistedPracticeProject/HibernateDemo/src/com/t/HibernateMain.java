package com.t ;
import java.util.List;


import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.player;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
        configuration.addAnnotatedClass(com.player.class);
        StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties ());
        SessionFactory factory= configuration.buildSessionFactory(builder.build());
        Session session=factory.openSession();
         Transaction transaction=session.beginTransaction();
       // player p1=new player(10,"virat","india",30);
        //player p2=new player(12,"rohit","india",20);

        //session.save(p1);
        //session.save(p2);
      System.out.println("player Details");
      player p=session.get(player.class,10);
      System.out.println("deatils "+p);
      
        
        transaction.commit();
        session.close();
        
	}

}
