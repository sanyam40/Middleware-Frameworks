package com.Spring.Jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Spring.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Student student) {
		String query="insert into studentdetails(name,rollno,phnno,coursecode)values(?,?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getRollno(),student.getPhnno(),student.getCoursecode());
	}
	
	public List<Student>Display_Table(){
		String query="select * from studentdetails";
		RowMapper<Student> rowMapper = new StudentRowMapper();
		List<Student>student=jdbcTemplate.query(query,new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}

}
