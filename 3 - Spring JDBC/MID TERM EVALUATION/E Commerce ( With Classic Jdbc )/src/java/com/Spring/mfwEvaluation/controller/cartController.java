package com.Spring.mfwEvaluation.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.Spring.mfwEvaluation.Dao.daoMethodsImpl;
import com.Spring.mfwEvaluation.entity.product;
import com.Spring.mfwEvaluation.entity.cart;

@Controller
public class cartController {
	
	/* Creating a Model Of Cart Entity */
	@ModelAttribute("cart")
	public cart getCart() {
		return new cart();
	}
	
	/* This Method will only dislpay the list of products stored in the DB */
	@RequestMapping(value="/display-products")
	public ModelAndView display(@SessionAttribute("loginDetails")String user,Model model) throws ClassNotFoundException, SQLException {
		model.addAttribute("username",user);
		System.out.println(user);
		
		daoMethodsImpl daoMethodsImpl=new daoMethodsImpl();
		
		ModelAndView modelAndView=new ModelAndView();
		List<product>list=daoMethodsImpl.display();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("DisplayProducts");
		
		return modelAndView;
	}
	
	/* This Method will Disply the cart details from the selected Menu */
	@RequestMapping(value="/cartt",method=RequestMethod.POST)
	public ModelAndView cart(@ModelAttribute("cart")cart cartModel) throws ClassNotFoundException, SQLException {
		List<String>list=cartModel.getNameList();
		
		daoMethodsImpl daoMethodsImpl=new daoMethodsImpl();
		List<product>list2=daoMethodsImpl.getCartItems(list);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("list",list2);
		modelAndView.setViewName("cart-display");
		
		return modelAndView;
	}
}
