package com.Spring.Jdbc.SpringJDBC;

import java.util.List;

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
        
        // --> INSER THE RECORD
        //int result=studentdao.insert(student);
        //System.out.println(result);
        
        // --> DELETE THE RECORD
        int r=studentdao.delete(student);
        System.out.println(r);
        
        
        // --> FETCHING ALL THE RECORDS
        List<Student> studentt = studentdao.fetchAllRecords();
    	for(Student e : studentt) {
    		System.out.println(e);
    	}
    	
    	// --> UPDATE THE RECORD
    	studentdao.updateRecordByRollNo("SANYAM NARNG","21CSU234");
    }
}
