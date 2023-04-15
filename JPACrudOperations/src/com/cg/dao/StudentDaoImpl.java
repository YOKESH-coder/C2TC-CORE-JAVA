package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager entitymanager;
	
	public StudentDaoImpl() {
		entitymanager = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student student) {
		entitymanager.persist(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		Student student = entitymanager.find(Student.class, id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
		entitymanager.merge(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		entitymanager.remove(student);
		
	}

	@Override
	public void beginTransaction() {
		entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		entitymanager.getTransaction().commit();
		
	}
	
}
