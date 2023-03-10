package com.Hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Certificate;
import com.Hibernate.entity.Student;

public class EmbeddingDemo {
	public static void main(String[] args) {
		
		Student student=new Student();
    	student.setId(2);
    	student.setName("SAKSHAM");
    	student.setCity("XYZ");
    	
    	Certificate certi=new Certificate();
    	certi.setCourse("Android");
    	certi.setDuration("2mon");
    	student.setCerti(certi);
    	
    	// --> HIBERNATE STEPS TO SAVE 
    	
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session session=factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(student);
    	
    	session.getTransaction().commit();
		
		session.close();
	}
}
