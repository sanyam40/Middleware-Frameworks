package com.Spring.mfwEvaluation.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.Spring.mfwEvaluation.Dao.daoMethodsImpl;
import com.Spring.mfwEvaluation.entity.user;

@Controller
@SessionAttributes("loginDetails")
public class loginController {
	
	/* Creating a Model of user entity */
	@ModelAttribute("user")
	public user getUser() {
		return new user();
	}
		
	/* It will Display the login form for seller */
	@RequestMapping(value="/sellerLoginForm")
	public String sellerLoginForm() {
		return "sellerLoginForm";
	}
	
	/* It will Display the login form for customers*/
	@RequestMapping(value="/customerLoginForm")
	public String customerLoginForm() {
		return "customerLoginForm";
	}
	
	/* This is the Handler Method for seller login page */
	@RequestMapping(value ="/sellerLogin")
	public String sellerSubmitLogin(@ModelAttribute("user")user user,BindingResult bindingResult,Model model,HttpServletRequest request) throws ClassNotFoundException, SQLException {
				
		daoMethodsImpl daoMethodsImpl=new daoMethodsImpl();
		
		if(bindingResult.hasErrors()) {
			return "sellerLoginForm";
		}
		else {
			List<user>list=daoMethodsImpl.loginCheck(user.getUsername(),user.getPassword());
			
			System.out.println(list);
			if(list.isEmpty()) {
				// Means It is an empty set & USERNAME AND PASSWORD IS INCORRECT 
				System.out.println("INCORRECT PASSWORD");
				return "sellerLoginForm";
			}
			else {
				HttpSession session=request.getSession();
				session.setAttribute("type","seller"); 
				
				model.addAttribute("loginDetails", user.getUsername());
				
				System.out.println("INCORRECT DETAILS");
				return "redirect:/add-product";
			}
		}
	}
	
	/* This is the Handler Method for customer login page */
	@RequestMapping(value ="/customerLogin")
	public String customerSubmitLogin(@ModelAttribute("user")user user,BindingResult bindingResult,Model model,HttpServletRequest request) throws ClassNotFoundException, SQLException {
				
		daoMethodsImpl daoMethodsImpl=new daoMethodsImpl();
		
		if(bindingResult.hasErrors()) {
			return "customerLoginForm";
		}
		else {
			List<user>list=daoMethodsImpl.loginCheck(user.getUsername(),user.getPassword());
			System.out.println(list);
			
			if(list.isEmpty()) {
				// Means It is an empty set & USERNAME AND PASSWORD IS INCORRECT 
				System.out.println("INCORRECT PASSWORD");
				return "customerLoginForm";
			}
			else {
			HttpSession session=request.getSession();
			session.setAttribute("type","customer"); 
				
				model.addAttribute("loginDetails", user.getUsername());
					
				System.out.println("CORRECT DETAILS");
				return "redirect:/display-products";
			}
		}
	}
	
	/* This is the Handler Method for terminating the session */
	@RequestMapping(value="/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		session.invalidate();
		return "Home";
	}
}
