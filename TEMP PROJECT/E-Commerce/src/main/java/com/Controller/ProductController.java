package com.Controller;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dao.DaoMethodsImpl;
import com.entity.product;

@Controller
public class ProductController {
	
	@ModelAttribute("product")
	public product getProduct() {
		return new product();
	}
	
	@RequestMapping(value="/add-product")
	public String product_add() {
		return "product";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public String product(@ModelAttribute("product")product product,BindingResult bindingresult) throws ClassNotFoundException, SQLException {
		
		DaoMethodsImpl daoMethodsImpl=new DaoMethodsImpl();
		if(bindingresult.hasErrors()) {
			return "product";
		}
		else {
			daoMethodsImpl.add_product(product);
			return "redirect:/add-product";
		}	
	}
	
	

}
