package com.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Spring.entity.Student;

@Controller
public class StudentController {
	
	@ModelAttribute("student")
	public Student student() {
		return new Student();
	}
	
	@RequestMapping(value="/Register-form")
	public String form() {
		return "Register-form";
	}
	
	@RequestMapping(value="/Display-Data")
	public String details(@ModelAttribute("student")Student student) {
		System.out.println(student.getName());
		System.out.println(student.getRollno());	
		return "Display-Data";
	}
}
