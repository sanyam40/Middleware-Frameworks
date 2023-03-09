package com.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
  
 @Entity --> It is used to mark class as entity. 
 @Entity(name="student_details") --> To Change Table Name.
 @Table(name="mystudents") --> It is used to change table details.
 @Id --> It is use to mark column as primary key. 
 @GeneratedValue -->Hibernate will automatically generate values.
 @Column --> can be used to specify column mappings.
 @Transient --> this tells hibernate not to save this field.
 @Temporal --> Format in which date to be saved
 @Lob --> this tells this is a large object.
 
*/

@Entity 
public class Student {
	
	@Id 
	private int id;
	private String name;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
