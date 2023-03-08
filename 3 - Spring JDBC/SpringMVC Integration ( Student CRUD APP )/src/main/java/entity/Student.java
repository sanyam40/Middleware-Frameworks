package com.Spring.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.Spring.Validation.coursecode;

public class Student {
	private String name;@NotNull
	
	private String rollno;@NotNull
	
	@Size(max=10,message="maximum 10 no is allowed")private String phnno;@NotNull
	
	@coursecode
	private String coursecode;@NotNull
	
	public String getName() {
		return name;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnno() {
		return phnno;
	}
	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", phnno=" + phnno + ", CourseCode=" + coursecode + "]";
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}	
}
