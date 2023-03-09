package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	
	public static void main(String[] args) {
		/* --> Get() & load() Method : 
		 * 1) Get() will return null and load() return exception in case of no object.
		 * 2) Get() will directly hit the Db while load() will only work when use it only return proxy object.
		 * 3) Get() will be used when we are unsure
		 */
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Student student=(Student)session.get(Student.class,1);
		System.out.println(student);
		
		Student studentt=(Student)session.load(Student.class,1);
		System.out.println(studentt);
		
		session.close();
		factory.close();
	}
}
