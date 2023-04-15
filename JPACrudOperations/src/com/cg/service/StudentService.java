package com.cg.service;

import com.cg.entity.Student;

public interface StudentService {
	public abstract void addStudent(Student student);
	public abstract Student getStudentById(int id);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
}
