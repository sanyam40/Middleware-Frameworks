package com.Hibernate.SqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlDemo {
	
	public static void main(String[] args) {
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=f.openSession();
		
		String q="select * from student";
		
		NativeQuery nq=s.createSQLQuery(q);
		
		List<Object []> list=nq.list();
		
		for(Object[] e:list) {
			System.out.println(Arrays.toString(e));
		}
		
		s.close();
		f.close();
	}
}
