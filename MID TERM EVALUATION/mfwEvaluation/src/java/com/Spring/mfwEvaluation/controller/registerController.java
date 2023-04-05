package com.Spring.mfwEvaluation.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Spring.mfwEvaluation.Dao.daoMethodsImpl;
import com.Spring.mfwEvaluation.entity.user;

@Controller
public class registerController {
	
	/* Creating a Model of product entity */
	@ModelAttribute("user")
	public user getUser() {
		return new user();
	}
	
	/* It will Display New User registration form */
	@RequestMapping("/new-register")
	public String register() {
		return"register";
	}
	
	/* This is the Handler Method for user registration page */
	@RequestMapping(value="/add-user",method=RequestMethod.POST)
	public String adduser(@Valid @ModelAttribute("user")user user,BindingResult bindingresult) throws ClassNotFoundException, SQLException {
		
		daoMethodsImpl daoMethodsImpl=new daoMethodsImpl();
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
