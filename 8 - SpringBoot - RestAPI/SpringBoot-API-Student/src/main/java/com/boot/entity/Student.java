package com.boot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@Column(name="student_id")
	private int id;
	
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Stream stream;

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

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public Student(int id, String name, Stream stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
