package com.Spring.Jdbc.SpringJDBC.dao;

import java.util.List;

import com.Spring.Jdbc.SpringJDBC.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int delete(Student student);
	
	public List<Student> fetchAllRecords();
	
	public void updateRecordByRollNo(String name,String rollno);
}
