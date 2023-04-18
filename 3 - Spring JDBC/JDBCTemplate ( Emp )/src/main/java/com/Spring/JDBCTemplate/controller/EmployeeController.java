package com.Spring.JDBCTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Spring.JDBCTemplate.Service.EmployeeService;
import com.Spring.JDBCTemplate.entity.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@ModelAttribute(name="employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	@GetMapping(value ="/register")
	public String showForm() {
		return "register-form";
	}
	
	@PostMapping(value ="/processForm")
	@ResponseBody
	public String processForm(@ModelAttribute("employee")Employee emp,Model model) {
		
		employeeService.createRecord(emp);
		
		return "RECORD ADDED";
	}

}
