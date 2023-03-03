package com.Spring.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.Jdbc.StudentDao;
import com.Spring.entity.Student;

@Controller
public class RegisterController {
	
	public static ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
    public static StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
	
	@ModelAttribute("student")
	public Student student() {
		return new Student();
	}
	
	@RequestMapping(value="/Register-form")
	public String Register_form() {
		return "Register-form";
	}
	
	@RequestMapping(value="/Submit-form",method=RequestMethod.POST)
	public String Submit_form(@ModelAttribute("student")Student student,@Valid @ModelAttribute("student")Student studentt,BindingResult bindingresult) {
	    
		if(bindingresult.hasErrors()) {
			return "Register-form";
		}
		else {
			studentdao.insert(student);
			return "Display-Data";
		}	
	}
	
	@RequestMapping(value="/Display-Table")
	public ModelAndView display() {
		ModelAndView modelandview=new ModelAndView();
		
		List<Student>list=studentdao.Display_Table();
		for(Student e : list) {
    		list.add(e);
    	}
		
		modelandview.addObject("Student", list);
		modelandview.setViewName("Display-Table");
		return modelandview;
	}
}
