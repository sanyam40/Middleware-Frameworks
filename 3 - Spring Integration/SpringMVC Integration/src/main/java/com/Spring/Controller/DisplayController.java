package com.Spring.Controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import com.Spring.Jdbc.StudentDao;
import com.Spring.entity.Student;

@Controller
public class DisplayController {
	
	public static ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
    public static StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
    
    
    
	//* Controller mapping for showing the student list dashboard */	
	@GetMapping("/ShowStudent")
	public ModelAndView showStudentList() {
		
		ModelAndView modelandview=new ModelAndView();
		List<Student> list=studentdao.Display_Table();
		
		modelandview.addObject("list", list);
		
		modelandview.setViewName("Display-Table");
		
		System.out.println(list);
		return modelandview;
	}

}
