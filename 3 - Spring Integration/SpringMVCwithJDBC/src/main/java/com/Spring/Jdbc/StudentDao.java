package com.Spring.Jdbc;

import java.util.List;

import com.Spring.entity.Student;

public interface StudentDao {
	
	public void insert(Student student);
	
	public List<Student> Display_Table();

}
