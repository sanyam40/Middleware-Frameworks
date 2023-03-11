package com.Hibernate.OneToMany;

import java.util.ArrayList;
import java.util.List;

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
		
		Answer ans2=new Answer();
		ans2.setAnswerId(124);
		ans2.setAnswer("java is language ");
		
		List<Answer>list=new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		
		q1.setAnswer(list);
		
		
    	Session session=factory.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(q1);
    	session.save(ans1);
    	session.save(ans2);
    	
    	session.getTransaction().commit();
    	
    	
    	Question q=(Question)session.get(Question.class, 123);
    	System.out.println(q.getQuestionId());
    	System.out.println(q.getQuestion());
    	System.out.println(q.getAnswer().size());
		
		session.close();
	}
}
