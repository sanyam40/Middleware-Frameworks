package com.Hibernate.HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Student;

public class Update_HQL {
	
	public static void main(String[] args) {
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=f.openSession();
		
		Student student=new Student();
    	student.setId(1);
    	student.setName("SANYAM");
    	student.setCity("ABC");
    	s.beginTransaction();
    	s.save(student);
    	s.getTransaction().commit();
    	
    	s.beginTransaction();
    	Query q=s.createQuery("update Student set city=:c where name=:n");
    	q.setParameter("c", "XYZ");
    	q.setParameter("n", "SANYAM");
    	q.executeUpdate();
    	
    	s.getTransaction().commit();
    	
    	
    	s.close();
    	f.close();	
	}

}
