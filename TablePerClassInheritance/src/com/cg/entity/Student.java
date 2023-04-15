package com.cg.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "college")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Student implements Serializable {
	private static final long SerialVersionUid = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regNo;
	private String name;
	private String gender;
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public static long getSerialversionuid() {
		return SerialVersionUid;
	}
}
