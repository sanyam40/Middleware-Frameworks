package com.Controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.DaoMethodsImpl;
import com.entity.User;

@Controller
public class RegisterController {
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/new-register")
	public String register() {
		return"register";
	}
	
	@RequestMapping(value="/add-user",method=RequestMethod.POST)
	public String adduser(@ModelAttribute("user")User user,BindingResult bindingresult) throws ClassNotFoundException, SQLException {
		
		DaoMethodsImpl daoMethodsImpl=new DaoMethodsImpl();
		if(bindingresult.hasErrors()) {
			return "register";
		}
		else {
			daoMethodsImpl.add_user(user);
			System.out.println(user);
			return "redirect:/home";
		}
	}

}
