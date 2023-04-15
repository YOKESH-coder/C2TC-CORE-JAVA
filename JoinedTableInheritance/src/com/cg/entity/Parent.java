package com.cg.entity;

import javax.persistence.Entity;

@Entity
public class Parent extends Child{
	
	private String parent;

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
}
