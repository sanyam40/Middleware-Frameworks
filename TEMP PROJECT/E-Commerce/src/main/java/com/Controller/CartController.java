package com.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DaoMethodsImpl;
import com.entity.cart;
import com.entity.product;

@Controller 
@SessionAttributes({"cart"})
public class CartController {
	
	@ModelAttribute("cart")
	public cart getCart() {
		return new cart();
	}
	
	@RequestMapping(value="/display-products")
	public ModelAndView display() throws ClassNotFoundException, SQLException {
		
		DaoMethodsImpl daoMethodsImpl=new DaoMethodsImpl();
		
		ModelAndView modelAndView=new ModelAndView();
		List<product>list=daoMethodsImpl.display();
		modelAndView.addObject("list",list);
		modelAndView.setViewName("DisplayProducts");
		
		return modelAndView;
	}
	
	
	@RequestMapping(value="/cartt",method=RequestMethod.POST)
	public ModelAndView cart(@ModelAttribute("cart")cart cartModel) throws ClassNotFoundException, SQLException {
		List<String>list=cartModel.getNameList();
		
		DaoMethodsImpl daoMethodsImpl=new DaoMethodsImpl();
		List<product>list2=daoMethodsImpl.getCartItems(list);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("list",list2);
		modelAndView.setViewName("cart-display");
		
		return modelAndView;
	}
	
	

}
