package com.Hibernate.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Hibernate.entity.Student;

public class SecondLevelCache {
	
	public static void main(String[] args) {
		
/* --> STEP 1 : DEPENDECIES TO BE ADDED IN POM.XML
		 
<!-- https://mvnrepository.com/artifact/org.ehcache/ehcache -->
<dependency>
    <groupId>org.ehcache</groupId>
    <artifactId>ehcache</artifactId>
    <version>3.10.8</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-ehcache -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-ehcache</artifactId>
    <version>5.6.14.Final</version>
</dependency>

--> STEP 2 : PROPERTY TO BE ADDED

 <property name="cache.use_second_Level_cache">true</property>
    <property name="cache.region.factory_class">net.sf.ehcache.hibernate.EhCacheRegionFactory</property>


--> STEP 3 : ANNOTATION TO BE ADDED IN ENTITY CLASS

@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
 */
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		Student student=s.get(Student.class, 1);
		System.out.println(student);
		
		s.close();
		
		Session s2=factory.openSession();
		
		Student student2=s.get(Student.class, 1);
		System.out.println(student2);
		
		s2.close();
		
		factory.close();
	}

}
