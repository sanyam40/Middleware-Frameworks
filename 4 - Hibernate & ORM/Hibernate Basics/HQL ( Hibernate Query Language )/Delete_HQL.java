package com.Hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Student;

public class Delete_HQL {
	
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
		Query q=s.createQuery("delete from Student as s where s.city=:c");
		
		q.setParameter("c","ABC");
		q.executeUpdate();
		
		s.getTransaction().commit();
	
		s.close();
		f.close();	
	}

}
