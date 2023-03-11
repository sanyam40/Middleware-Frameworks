package com.Hibernate.HQL;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.Hibernate.entity.Student;

public class Fetch_HQL {
	
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
		
		// HQL SYNTAX : 
		
		String query="from Student";
		
		String query2="from Student where id=1";
		
		String query3="from Student where id=:x";
		
		String query4="from Student as s where s.id=:x and s.city=:y";
		
		
		Query q=s.createQuery(query4);
		
		q.setParameter("x", 1);
		q.setParameter("y", "ABC");
		
		/* SINGLE - UNIQUE , MULITPLE - LIST */
		
		q.uniqueResult();
		
		List<Student> list=q.list();
		for(Student e:list) {
			System.out.println(e.getName());
		}

		s.close();
		f.close();	
	}
}
