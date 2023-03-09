package com.Hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/*
  
 @Entity --> It is used to mark class as entity. 
 @Entity(name="student_details") --> To Change Table Name.
 @Table(name="mystudents") --> It is used to change table details.
 @Id --> It is use to mark column as primary key. 
 @GeneratedValue -->Hibernate will automatically generate values.
 @Column --> can be used to specify column mappings.
 @Transient --> this tells hibernate not to save this field.
 @Temporal --> Format in which date to be saved.
 @Lob --> this tells this is a large object.
 
*/

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int Addressid;
	
	@Column(length=50,name="Street")
	private String street;
	private String city;
	private boolean isopen;
	
	@Transient
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	@Lob
	private byte[] image;
	
	public int getAddressid() {
		return Addressid;
	}
	public void setAddressid(int addressid) {
		Addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address(int addressid, String street, String city, boolean isopen, double x, Date addedDate, byte[] image) {
		super();
		Addressid = addressid;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
