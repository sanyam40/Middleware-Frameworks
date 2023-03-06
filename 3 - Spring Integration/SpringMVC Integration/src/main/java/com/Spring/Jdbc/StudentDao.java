package com.Spring.Jdbc;

import java.util.List;

import com.Spring.entity.Student;

public interface StudentDao {
	
	// method for adding a record into the database
	public void insert(Student student);
	
	
	// method for fetching all the student records from the database
	public List<Student> Display_Table();
	
	
	// method to delete a student record from the database
	public void deleteStudent(String rollno);
	
	
	public int updateRecord(Student std);
}
