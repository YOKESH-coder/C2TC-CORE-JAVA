package com.cg.entity;

import javax.persistence.Entity;

@Entity
public class Hod extends Employee{
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
