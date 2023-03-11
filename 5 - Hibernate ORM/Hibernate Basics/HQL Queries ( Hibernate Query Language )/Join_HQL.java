package com.Hibernate.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Join_HQL {
	
	public static void main(String[] args) {
		
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=f.openSession();
		
		Query q=s.createQuery("select q.question,q.questionId,a.question from Question as q INNER JOIN q.answer as a");
		
		List<Object []>list=q.getResultList();
		
		for(Object[] arr:list) {
			System.out.print(Arrays.toString(arr));
		}
		
		s.close();
	}

}
