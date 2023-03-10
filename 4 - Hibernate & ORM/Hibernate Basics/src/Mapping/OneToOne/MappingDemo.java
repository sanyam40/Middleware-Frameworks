package com.Hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
	
	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		// CREATING QUESTION
		Question q1=new Question();
		q1.setQuestionId(123);
		q1.setQuestion("what is java?");
		
		Answer ans1=new Answer();
		ans1.setAnswerId(123);
		ans1.setAnswer("java is ");
		
		q1.setAnswer(ans1);
		
		
    	Session session=factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(q1);
    	session.save(ans1);
    	
    	session.getTransaction().commit();
		
		session.close();
	}

}
