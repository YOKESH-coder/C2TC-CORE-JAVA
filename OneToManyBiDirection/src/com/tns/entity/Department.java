package com.tns.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_master")
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private int dept_no;
	private String name;
	
	@OneToMany(mappedBy="department", cascade=CascadeType.PERSIST)
	private Set<Employee> employees = new HashSet<>();

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employee.setDepartment(this);
		this.getEmployees().add(employee);
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
