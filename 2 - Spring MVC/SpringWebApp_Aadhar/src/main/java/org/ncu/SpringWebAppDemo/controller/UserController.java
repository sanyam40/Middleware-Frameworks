package org.ncu.SpringWebAppDemo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.ncu.SpringWebAppDemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
//@RequestMapping(value="/user")
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
	
	//process the input form
	@RequestMapping(value="/display")
	public String displayinputform(@ModelAttribute("user")User user) {
		return "Display-form";
	}
	
	/*
	@RequestMapping(value="/AddData",method=RequestMethod.POST)
	public String Add(@ModelAttribute User user) throws ClassNotFoundException, SQLException {
		CredController cred=new CredController();
		cred.Add(user);
		return "Display-form";
	}
	
	@RequestMapping(value="/DisplayData")
	public String Display(@ModelAttribute User user) throws ClassNotFoundException, SQLException {
		CredController cred=new CredController();
		cred.loadUsers(user);
		return "Display-Data";
	}*/
}
