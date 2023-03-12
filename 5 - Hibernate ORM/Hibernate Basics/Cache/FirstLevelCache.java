package com.Hibernate.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Student;

public class FirstLevelCache {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		Student sa=s.get(Student.class, 12);
		System.out.println(sa);
		
		// NOW IT WILL NOT HIT THE DATABASE IT WILL PROVIDE DATA FROM CACHE MEMORY.
		
		Student sa1=s.get(Student.class, 12);
		System.out.println(sa1);
		
		System.out.print(s.contains(sa1));
		
		s.close();
		factory.close();	
	}
}
