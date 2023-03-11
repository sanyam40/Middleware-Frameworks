package com.Hibernate.Pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Hibernate.entity.Student;

public class HQLPegination {
	
	public static void main(String[] args) {
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=f.openSession();
		
		
		Query<Student> q=s.createQuery("from Student",Student.class);
		
		// IMPLEMENTING PREGINATION
		
		q.setFirstResult(0); // STARTING ROW
		q.setMaxResults(5); // NO OF RESULTS
		
		List<Student> list=q.list();
		
		for(Student e:list) {
			System.out.println(e.getName()+" : "+e.getCity());
		}
	
		s.close();
		f.close();
	}
}
