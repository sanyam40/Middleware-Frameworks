package com.Spring.mfwEvaluation.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import com.Spring.mfwEvaluation.Dao.daoMethods;
import com.Spring.mfwEvaluation.Dao.daoMethodsImpl;
import com.Spring.mfwEvaluation.entity.product;

@Controller
public class productController {
		
	/* Creating a Model of product entity */
	@ModelAttribute("product")
	public product getProduct() {
		return new product();
	}
	
	/* It will Display Add Product Page for seller */
	@RequestMapping(value="/add-product")
	public String product_add(@SessionAttribute("loginDetails")String user,Model model) {
		model.addAttribute("username",user);
		System.out.println(user);
		return "addProduct";
	}
	
	/* This is the Handler Method for add product page */
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String product(@ModelAttribute("product")product product,BindingResult bindingresult) throws ClassNotFoundException, SQLException {
		
		daoMethods daoMethodsImpl=new daoMethodsImpl();
		if(bindingresult.hasErrors()) {
			return "addProduct";
		}
		else {
			daoMethodsImpl.add_product(product);
			return "redirect:/add-product";
		}	
	}
}
