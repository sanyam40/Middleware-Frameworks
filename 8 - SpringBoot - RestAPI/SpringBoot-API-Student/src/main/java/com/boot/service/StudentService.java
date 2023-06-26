package com.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.StudentRepo;
import com.boot.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentrepo;

	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student test=studentrepo.save(student);
		return test;
	}
	
	
	
	

}
