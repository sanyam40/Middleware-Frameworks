package com.Spring.Jdbc.SpringJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.Jdbc.SpringJDBC.entity.Student;

public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query="insert into student(name,rollno)values(?,?)";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getRollno());
		return r;
	}

}
