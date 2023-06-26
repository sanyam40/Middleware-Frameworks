package com.boot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.Student;
import com.boot.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	/* CREATING NEW DATA */
	@PostMapping("/students")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		Student b=null;
		
		try {
		b=this.studentservice.addStudent(student);
		System.out.println(student);
		return ResponseEntity.of(Optional.of(b));
		}
		catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}	
	}	
}
