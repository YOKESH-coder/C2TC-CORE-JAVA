package com.cg.dao;

import com.cg.entity.Student;

public interface StudentDao {
	
	//CRUD operation
	public abstract void addStudent(Student student);
	public abstract Student getStudentById(int id);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
