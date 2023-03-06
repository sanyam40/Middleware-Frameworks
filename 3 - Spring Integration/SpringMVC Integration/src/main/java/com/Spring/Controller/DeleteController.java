package com.Spring.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.Jdbc.StudentDao;

@Controller
public class DeleteController {
	
	public static ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
    public static StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
	
    
	/* Controller mapping for processing the delete operation */
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("rollno")String rollno) {
		studentdao.deleteStudent(rollno);
		return "redirect:/ShowStudent";
	}

}
