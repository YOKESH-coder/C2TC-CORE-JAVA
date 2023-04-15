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
		 * //create one employee Employee employee = new Employee();
		 * employee.setName("Yokesh"); employee.setSalary(50000.94);
		 * em.persist(employee);
		 * 
		 * //create one manager Hod hod = new Hod(); hod.setDeptName("CSE");
		 * hod.setName("Vara"); hod.setSalary(100000.999); em.persist(hod);
		 */
		
		em.getTransaction().commit();
		
		System.out.println("One employee and one hod data entry is successful");
		
		em.close();
		factory.close();
	}

}
