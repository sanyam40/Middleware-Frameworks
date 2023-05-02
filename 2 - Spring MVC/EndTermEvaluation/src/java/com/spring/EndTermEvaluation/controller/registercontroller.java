package com.spring.EndTermEvaluation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.EndTermEvaluation.entity.user;

@Controller
public class registercontroller {
	
	@ModelAttribute("user")
	public user getUser() {
		return new user();
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/display")
	public String display(@Valid @ModelAttribute("user")user user,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "register";
		}
		else {
			System.out.println(user);
			return "home";
		}
		
	}

}
