package com.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.Dao.StudentDao;
import com.SpringORM.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao dao=context.getBean("studentDao",StudentDao.class);
        
        dao.insert(new Student(1, "SANYAM", "ABC"));
    }
}
