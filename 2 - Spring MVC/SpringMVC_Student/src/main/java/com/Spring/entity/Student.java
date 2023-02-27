package com.Spring.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	@Size(min=1,message="required")private String name;@NotNull
	private String rollno;@NotNull
	
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
}
