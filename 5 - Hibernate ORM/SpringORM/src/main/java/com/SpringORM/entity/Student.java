package com.SpringORM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int studentid;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_city")
	private String city;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int studentid, String studentName, String city) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
