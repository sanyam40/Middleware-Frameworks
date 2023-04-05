package com.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.DaoMethodsImpl;
import com.entity.User;

@Controller
public class LoginController {
	
	@ModelAttribute("user")
	public User getUser() {
		return new User();
	}
	
	@RequestMapping("/home")
	public String home() {
		return "login";
	}
	
	@RequestMapping(value = "/")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String submit_login(@ModelAttribute("user")User user,BindingResult bindingresult) throws ClassNotFoundException, SQLException {
		DaoMethodsImpl daoMethodsImpl=new DaoMethodsImpl();
		
		if(bindingresult.hasErrors()) {
			return "login";
		}
		else {
			// CHECK FOR USERNAME AND PASSWORD FROM DATABASE
              List<User>list=daoMethodsImpl.login(user.getUsername(),user.getPassword());
              System.out.println(list);
						
						if(list.isEmpty()) {
							// Means It is an empty set & USERNAME AND PASSWORD IS INCORRECT 
							return "redirect:/home";
						}
						else if(list.size()<=1){
							if(user.getUsertype()=="seller") {
							    // FOR CORRECT USERNAME AND PASSWORD IN SELLER
								return "redirect:/add-product";
							}
							else if(user.getUsertype()=="customer"){
								// FOR CUSTOMER LOGIN
								return "redirect:/display-products";
							}
							else {
								return null;
							}
						}
						else {
							return null;
						}
		}
		}
	}
