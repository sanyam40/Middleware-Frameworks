package org.ncu.SpringWebAppDemo.controller;


import javax.validation.Valid;

import org.ncu.SpringWebAppDemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	// create a model attribute method to load the domain object/entity
	@ModelAttribute("user")
	public User getUserEntity() {
		return new User();
	}
	
	// generate  or show the input form
	@RequestMapping(value="/register")
	public String showRegistrationform() {
		return "register_form";
	}
	
	// process the input form
	@RequestMapping(value="/display")
	public String displayinputform(@ModelAttribute("user")User user,@Valid @ModelAttribute("user")User userr,BindingResult bindingresult) {
		if(bindingresult.hasErrors()) {
			return "register_form";
		}
		else {
			return "Display-form";
		}
	}
}
