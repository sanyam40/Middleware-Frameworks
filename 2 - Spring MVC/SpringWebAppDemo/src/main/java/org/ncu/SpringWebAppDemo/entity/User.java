package org.ncu.SpringWebAppDemo.entity;

import java.util.List;

public class User {
	private String name;
	private String password;
	private String aadhar;
	private String state;
	private String gender;
	private List<String> otherOptions;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
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
	public List<String> getOtherOptions() {
		return otherOptions;
	}
	public void setOtherOptions(List<String> otherOptions) {
		this.otherOptions = otherOptions;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", aadhar=" + aadhar + ", state=" + state + ", gender="
				+ gender + ", otherOptions=" + otherOptions + ", address=" + address + "]";
	}
	
	

}
