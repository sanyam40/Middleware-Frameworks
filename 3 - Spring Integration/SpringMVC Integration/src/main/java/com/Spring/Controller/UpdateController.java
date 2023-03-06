package com.Spring.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Spring.Jdbc.StudentDao;
import com.Spring.entity.Student;

@Controller
public class UpdateController {
	
	public static ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
    public static StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
	
	
	/* Controller mapping for update form */
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("rollno")String rollno, @ModelAttribute("student") Student student, Model model) {
		model.addAttribute(student); 
		return "Student-updateform";
	}
	
	@PostMapping("/processUpdate")
	public String processUpdateForm(@ModelAttribute("student") Student student) {
		studentdao.updateRecord(student);
		return "Display-Data";
	}
}
