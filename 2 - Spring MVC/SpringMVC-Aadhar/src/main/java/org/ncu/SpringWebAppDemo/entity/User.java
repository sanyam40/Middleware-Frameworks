package org.ncu.SpringWebAppDemo.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@NotNull(message="is required")
	@Size(max=30,message="is required")
	@Pattern(regexp="^[a-zA-z0-9]")
	private String username;
	
	@NotNull(message="is required")
	@Pattern(regexp="^[0-9]")
	private String aadharId;
	
	@NotNull(message="is required")
	@Email
	private String email;
	
	@NotNull(message="is required")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Past
	private Date dob;
	
	@Size(max=10)
	@Pattern(regexp="^[0-9]")
	private String phnno;
		
	@NotNull(message="is required")
	private String state;
	
	@NotNull(message="is required")
	private String gender;
	
	@NotNull(message="is required")
	private List<String> otheroptions;
	
	@NotNull(message="is required")
	@Size(max=50)
	private String address;
	
	@NotNull(message="is required")
	@Size(max=11)
	@Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,12}$",
    message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	private String userpassword;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", aadharId=" + aadharId + ", email=" + email + ", dob=" + dob
				+ ", phnno=" + phnno + ", state=" + state + ", gender=" + gender + ", otheroptions=" + otheroptions
				+ ", address=" + address + ", userpassword=" + userpassword + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhnno() {
		return phnno;
	}

	public void setPhnno(String phnno) {
		this.phnno = phnno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtheroptions() {
		return otheroptions;
	}

	public void setOtheroptions(List<String> otheroptions) {
		this.otheroptions = otheroptions;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	
	
	
	
}
