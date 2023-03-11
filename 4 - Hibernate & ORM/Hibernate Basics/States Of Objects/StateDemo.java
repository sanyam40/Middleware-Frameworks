package com.Hibernate.States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Certificate;
import com.Hibernate.entity.Student;

public class StateDemo {

	public static void main(String[] args) {
		
		/* STATES OF HIBERNATE OBJECTS : X
		 * 1.Transient
		 * 2.Persistent
		 * 3.Detached
		 * 4.Removed
		 */
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Student student=new Student();
		student.setId(4);
		student.setCity("Abc");
		student.setName("SAHIL");
		student.setCerti(new Certificate("java","2"));
		
		// IN Transient State : AS NOT IN CONTACT OF DB AND SESSION
		
		Session s=f.openSession();
		s.save(student);
		
		// In Persistent State : As Now in contact with db ans ession
		
		s.beginTransaction().commit();
		s.close();
		
		// In Detached State
	}
}
