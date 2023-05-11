package com.Spring.Jdbc.SpringJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Spring.Jdbc.SpringJDBC.entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName(rs.getString("name"));
		student.setRollno(rs.getString("rollno"));
		return student;
	}
	
	

}
