package com.Spring.Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Spring.entity.Student;

public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName(rs.getString("name"));
		student.setRollno(rs.getString("rollno"));
		student.setPhnno(rs.getString("phnno"));
		student.setCoursecode(rs.getString("coursecode"));
		return student;
	}

}
