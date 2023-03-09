package com.Spring.Jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.entity.Admin;
import com.Spring.entity.Student;

public class StudentDaoImpl implements StudentDao{

	@Autowired	
	private JdbcTemplate jdbcTemplate;
		
		public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	// method for adding a record into the database
	public void insert(Student student) {
		String query="insert into studentdetails(name,rollno,phnno,coursecode)values(?,?,?,?)";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getRollno(),student.getPhnno(),student.getCoursecode());
		System.out.print(r);
	}
	
	
	// method for fetching all the student records from the database
	public List<Student>Display_Table(){
		List<Student>list=new ArrayList<>();
		String query="select * from studentdetails";
		list=jdbcTemplate.query(query,new BeanPropertyRowMapper<Student>(Student.class));
		return list;
	}

	
	// method to delete a student record from the database
	public void deleteStudent(String rollno) {
		String sql = "delete from studentdetails where rollno = ?";
		jdbcTemplate.update(sql, rollno);
	}
	
	public int updateRecord(Student std) {
		String sql = "update studentdetails set name = ?, phnno=?,coursecode=? where rollno = ?";
		Object[] args = {std.getName(), std.getPhnno(), std.getCoursecode(),std.getRollno()};
		int recordsUpdated = jdbcTemplate.update(sql, args);
		return recordsUpdated;
	}
	
	// method for fetching all the student records from the database from login table
		@SuppressWarnings("deprecation")
		public List<Admin> login(String username,String password){
			List<Admin>list=new ArrayList<>();
			String query="select username,password from logindetails where username=? and password=?";
			list=jdbcTemplate.query(query, new Object[] {username,password},new AdminRowMapper());
			return list;			
		}
}
