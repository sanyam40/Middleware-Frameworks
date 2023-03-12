package com.Hibernate.CriteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Hibernate.entity.Student;

public class CriteriaDemo {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		Criteria c=s.createCriteria(Student.class);
		
		c.add(Restrictions.eq("city","ABC"));
		
		List<Student>list=c.list();
		
		for(Student se:list) {
			System.out.println(se);	
		}
			
		s.close();
		factory.close();
	}

}
