package com.Hibernate.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.OneToMany.Answer;
import com.Hibernate.OneToMany.Question;



public class CascadeExample {
	public static void main(String[] args) {
		
		
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=f.openSession();
		
		
		Question q=new Question();
		
		q.setQuestionId(47);
		q.setQuestion("What is javaAA");
		
		Answer a1=new Answer(451,"java is");
		Answer a2=new Answer(452,"java is 2");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		
		q.setAnswer(list);
		
		s.save(q);
		
		// WHILE USING CASCADE WE DON'T HAVE TO SAVE ANSWERS SEPERATELY
		// IT WILL BE SAVED AUTOMATICLLY WITH QUESTION
		
		s.beginTransaction().commit();
		
		s.close();
		f.close();	
	}
}
