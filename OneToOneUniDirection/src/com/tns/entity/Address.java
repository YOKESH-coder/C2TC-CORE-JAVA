package com.tns.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int addressId;
	
	@Column(name="address_street")
	private String street;
	
	@Column(name="address_area")
	private String area;
	
	@Column(name="address_city")
	private String city;
	
	@Column(name="address_state")
	private String state;
	
	@Column(name="address_zipcode")
	private int zipcode;
	
	@OneToOne(mappedBy="address")
	private Student student;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
