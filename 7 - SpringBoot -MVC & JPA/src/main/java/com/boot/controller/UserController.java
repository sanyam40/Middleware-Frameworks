package com.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dao.UserRepo;
import com.boot.entity.User;

@Controller
public class UserController {
	
	@Autowired
    private UserRepo UserRepo;
	
	@ModelAttribute("user")
	public User user() {
		return new User();
	}
	
	@RequestMapping("/addRecord")
	public String addRecord() {
		return "add_data";
	}
	
	
	// Create data
	@ResponseBody
	@PostMapping("/ProcessForm")
	public String Processdata(@ModelAttribute("user")User user) {
		System.out.println(user);
		
		User test=UserRepo.save(user);
		System.out.println(test);
		
		return "Data Stored";
	}
	
	
	// Read data
	@GetMapping("/displayData")
	public String display_data(Model model) {
		List<User>users=new ArrayList<>();
		Iterable<User>list=UserRepo.findAll();
		
		list.forEach(user->{
			users.add(user);
		});
		
		System.out.println(users);
		
		model.addAttribute("users", users);
		
		return "display";
	}
}
