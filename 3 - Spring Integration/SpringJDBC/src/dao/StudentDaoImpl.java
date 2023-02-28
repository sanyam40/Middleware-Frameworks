package com.Spring.Jdbc.SpringJDBC.dao;

import java.util.List;


import org.springframework.jdbc.core.RowMapper;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	public int delete(Student student) {
		String query="delete from student where rollno=?";
		int r=this.jdbcTemplate.update(query,student.getRollno());
		return r;
	}
	
	public List<Student> fetchAllRecords(){
		String query="select * from student";
		RowMapper<Student> rowMapper = new StudentRowMapper();
		List<Student>student=jdbcTemplate.query(query,new BeanPropertyRowMapper<Student>(Student.class));
		return student;	
	}
	
	public void updateRecordByRollNo(String name,String rollno) {
		String query="update student set name=? where rollno=?";
		int r=this.jdbcTemplate.update(query,name,rollno);
		System.out.println(r);	
	}

}
