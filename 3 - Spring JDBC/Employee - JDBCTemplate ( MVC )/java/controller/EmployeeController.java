package com.Spring.JDBCTemplate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/display-records")
	public ModelAndView display_form() {
		
		List<Employee>list=employeeService.loadEmployees();
		
		ModelAndView modelAndView=new ModelAndView();
		
		System.out.println(list+" AT CONTROLLER LAYER");
		
		modelAndView.addObject("list",list);
		modelAndView.setViewName("display-records");
		
		return modelAndView;
	}
	
	@RequestMapping("/updateForm")
	public String update(@RequestParam("emp_id")String empId,@ModelAttribute("employee")Employee employee,Model model) {
		
		model.addAttribute("empId",empId);

		return "update";
	}
	
	@RequestMapping("processUpdate")
	public String processUpdate(@ModelAttribute("employee")Employee employee) {
		
		System.out.println(employee);
		
		employeeService.updateRecord(employee);
		
		return "redirect:/display-records";
		
	}
	
	@RequestMapping("/deleteform")
	public String delete(@RequestParam("emp_id")String empId) {
		
		employeeService.deleteRecord(empId);
		
		System.out.println(empId);
		return "redirect:/display-records";
	}

}
