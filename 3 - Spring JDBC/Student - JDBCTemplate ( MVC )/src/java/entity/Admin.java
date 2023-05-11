package com.Spring.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Admin {

	@NotNull(message="is required")
	@Size(max=30,message="is required")
	@Pattern(regexp="^[a-zA-z0-9]")
	private String username;@NotNull
	
	
	@NotNull(message="is required")
	@Size(max=11)
	@Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,12}$",
    message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	private String password;@NotNull
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + "]";
	}
}
