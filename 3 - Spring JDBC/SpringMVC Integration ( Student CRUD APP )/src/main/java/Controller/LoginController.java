// --> SANYAM 21CSU234

package com.Spring.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Spring.Jdbc.StudentDao;
import com.Spring.entity.Admin;

@Controller
@SessionAttributes("Admin")
public class LoginController {
	
	// --> USING XML CONFIGURATION FOR JDBC 
		public static ApplicationContext context=new ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
	    public static StudentDao studentdao=context.getBean("studentDao",StudentDao.class);
		
		/* --> USING JAVA BASED CONFIGURATION FOR JDBC
		static ApplicationContext context=new AnnotationConfigApplicationContext("JdbcConfig.class");
		public static StudentDaoImpl studentdao=context.getBean("studentdao",StudentDaoImpl.class);
		*/
	
	/* Creating domain object/bean for data binding */
	@ModelAttribute("Admin")
	public Admin admin() {
		return new Admin();
	}
	
	@RequestMapping(value="/Admin-login")
	public String login() {	
		return"Login-form";	
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String Submit_form(@ModelAttribute("Admin")Admin admin,@Valid @ModelAttribute("Admin")Admin adminn,BindingResult bindingresult){	
		
		// FOR CHECKING VALIDATIONS
		if(bindingresult.hasErrors()) {
			return "Admin-login";
		}
		else{
			// CHECK FOR USERNAME AND PASSWORD FROM DATABASE
			List<Admin>list=studentdao.login(admin.getUsername(),admin.getPassword());
			
			System.out.println(list);
			if(list.isEmpty()) {
				// Means It is an empty set & USERNAME AND PASSWORD IS INCORRECT 
				
				return "redirect:/Admin-login";
			}
			else {
				// FOR CORRECT USERNAME AND PASSWORD
				
				/* --> OLD WAY OF INITITALIZING A SESSION
				 * HttpSession session=request.getSession();
				session.setAttribute("Admin", session);*/
				
				return "redirect:/ShowStudent";
			}	
		}
	}
}
