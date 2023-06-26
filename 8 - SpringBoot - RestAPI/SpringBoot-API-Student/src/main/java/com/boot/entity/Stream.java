package com.boot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Stream {
	
	@Id
	@Column(name="stream_id")
	private int id;
	
	private String specilisation;
	private String section;
	
	@OneToOne(mappedBy = "stream")
	@JsonBackReference
	private Student student;
	
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecilisation() {
		return specilisation;
	}
	public void setSpecilisation(String specilisation) {
		this.specilisation = specilisation;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Stream(int id, String specilisation, String section) {
		super();
		this.id = id;
		this.specilisation = specilisation;
		this.section = section;
	}
	@Override
	public String toString() {
		return "Stream [id=" + id + ", specilisation=" + specilisation + ", section=" + section + "]";
	}
	public Stream() {
		super();
		// TODO Auto-generated constructor stub
	}
}
