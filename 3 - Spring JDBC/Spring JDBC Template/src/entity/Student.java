package com.Spring.Jdbc.SpringJDBC.entity;

public class Student {
	private String name;
	private String rollno;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public Student(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
}
