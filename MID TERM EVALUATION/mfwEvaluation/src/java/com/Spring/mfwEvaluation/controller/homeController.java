package com.Spring.mfwEvaluation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping(value="/")
	public String home() {
		return "Home";
	}
	
	@RequestMapping(value="/home")
	public String homee() {
		return "Home";
	}
}
