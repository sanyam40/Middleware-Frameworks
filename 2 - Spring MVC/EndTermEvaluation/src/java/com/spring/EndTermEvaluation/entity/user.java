package com.spring.EndTermEvaluation.entity;

import javax.validation.constraints.NotNull;

import com.spring.EndTermEvaluation.validation.rollno;

public class user {
	
	private String username;
	
	@rollno
	private String rollno;@NotNull
	
	private String email;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "user [username=" + username + ", rollno=" + rollno + ", email=" + email + ", password=" + password
				+ "]";
	}
	public user(String username, String rollno, String email, String password) {
		super();
		this.username = username;
		this.rollno = rollno;
		this.email = email;
		this.password = password;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
}
