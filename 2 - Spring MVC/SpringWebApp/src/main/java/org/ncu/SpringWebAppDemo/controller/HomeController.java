package org.ncu.SpringWebAppDemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String test(){
		return "home";
	}
	
	@RequestMapping(value="/date-page")
	public String getDate(Model model) {
		Date date=new Date();
		model.addAttribute("currentDate", date);
		return "date";
	}
}
