package org.ncu.SpringWebAppDemo.entity;

import java.util.List;

public class User {
	private String username;
	private String userpassword;
	private String aadharId;
	private String state;
	private String gender;
	private List<String> otheroptions;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getAadharId() {
		return aadharId;
	}
	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
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
	public List<String> getotheroptions() {
		return otheroptions;
	}
	public void setotheroptions(List<String> otheroptions) {
		this.otheroptions = otheroptions;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userpassword=" + userpassword + ", aadharId=" + aadharId + ", state="
				+ state + ", Gender=" + gender + ", otheroptions=" + otheroptions + ", address=" + address + "]";
	}
}
