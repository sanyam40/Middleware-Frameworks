package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SECONDController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
