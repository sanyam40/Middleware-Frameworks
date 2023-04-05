package com.entity;

public class product {
	
	private String name;
	private String category;
	private String quantity;
	private String description;
	private String price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public product(String name, String category, String quantity, String description, String price) {
		super();
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.description = description;
		this.price = price;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "product [name=" + name + ", category=" + category + ", quantity=" + quantity + ", description="
				+ description + ", price=" + price + "]";
	}
	
}
