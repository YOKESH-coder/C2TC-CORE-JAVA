package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		/*
		 * //create student details Student stud = new Student();
		 * stud.setName("Yokesh"); stud.setGender("Male"); em.persist(stud);
		 * 
		 * Student student = new Student(); student.setName("Aishu");
		 * student.setGender("Female"); em.persist(student);
		 * 
		 * //create hod details Hod hod = new Hod(); hod.setName("Vasanth");
		 * hod.setGender("Male"); hod.setDeptName("CSE"); em.persist(hod);
		 */
		
		em.getTransaction().commit();
		
		System.out.println("Data added successfully");
		
		em.close();
		factory.close();
	}
}
