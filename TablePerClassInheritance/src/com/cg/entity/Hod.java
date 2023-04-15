package com.cg.entity;

import javax.persistence.Entity;

@Entity
public class Hod extends Student{
	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
