// --> SANYAM 21CSU234

package com.Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertDemo {
    public static void main( String[] args ){
    	
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	
    	Student student=new Student();
    	student.setId(1);
    	student.setName("SANYAM");
    	student.setCity("ABC");
    	
    	Address add=new Address();
    	add.setStreet("street 1");
    	add.setIsopen(true);
    	add.setAddedDate(new Date());
    	add.setCity("abc");
    	
    	Session session=factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(student);
    	session.save(add);
    	
    	session.getTransaction().commit();
    	
    	session.close();  	       
    }
}
