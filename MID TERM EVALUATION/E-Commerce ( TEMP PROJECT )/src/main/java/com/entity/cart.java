package com.entity;

import java.util.List;

public class cart {
	
	List<String>nameList;

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	@Override
	public String toString() {
		return "cart [nameList=" + nameList + "]";
	}

	public cart(List<String> nameList) {
		super();
		this.nameList = nameList;
	}

	public cart() {
		super();
		// TODO Auto-generated constructor stub
	}
}
