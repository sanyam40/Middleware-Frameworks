// --> SANYAM 21CSU234

package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ){
    	
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	
    	Student student=new Student();
    	student.setId(1);
    	student.setName("SANYAM");
    	student.setCity("ABC");
    	
    	Session session=factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(student);
    	
    	session.getTransaction().commit();
    	
    	session.close();  	       
    }
}
