package org.ncu.SpringWebAppDemo.controller;

import org.ncu.SpringWebAppDemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class User_Controller {
	
	    // user entity object using @modelattribute
		@ModelAttribute("user")
		public User getUser() {
			return new User();
		}
		
		//return view for registration form
		@RequestMapping(value ="/register")
		public String showRegisteration() {
			return "register_form" ;
		}
			
			
		//return view for display form
		@RequestMapping(value ="/display")
		public String displayForm() {
				return "Display-form";		
		}
}
