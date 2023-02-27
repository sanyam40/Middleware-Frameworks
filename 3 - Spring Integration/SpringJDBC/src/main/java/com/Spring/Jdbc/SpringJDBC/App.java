package com.Spring.Jdbc.SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.Jdbc.SpringJDBC.dao.StudentDao;
import com.Spring.Jdbc.SpringJDBC.entity.Student;

public class App {
    public static void main( String[] args ){  
        ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/SpringJDBC/Config.xml");
        
        StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
        
        Student student=new Student();
        student.setName("SANYAM NARANG");
        student.setRollno("21CSU2344");
        
        int result=studentdao.insert(student);
        System.out.println(result);
    }
}
