package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/normal")
public class NormalController {

	@RequestMapping("/method")
	public String normal() {
		return "normal";
	}
}
