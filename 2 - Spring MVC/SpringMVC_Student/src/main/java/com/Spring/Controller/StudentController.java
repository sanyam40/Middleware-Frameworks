package com.Spring.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.ncu.SpringWebAppDemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/Display-Data",method=RequestMethod.POST)
	public String details(@ModelAttribute("student")Student student,HttpServletRequest request,@RequestParam("name")String namee,@Valid @ModelAttribute("student")Student studentt,BindingResult bindingresult) {
		/* 3 METHODS TO FETCH DATA :
		 * 1- HttpServletRequest
		 * 2- @Requestparam
		 * 3- @ModelAttribute
		 * */
		String name=request.getParameter("name");
		System.out.println(name);
		
		System.out.println(namee);
		
		System.out.println(student.getRollno());
		if(bindingresult.hasErrors()) {
			return "Register-form";
		}
		else {
			return "Display-Data";
		}
	}
}
