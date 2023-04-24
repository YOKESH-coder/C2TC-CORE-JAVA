package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JP-API");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Department d1 = new Department();
		d1.setDept_no(101);
		d1.setName("Training");

		Department d2 = new Department();
		d2.setDept_no(102);
		d2.setName("Placement");
		
		Employee e1 = new Employee();
		e1.setName("Sanjay");
		e1.setSalary(4000.00);
		
		Employee e2 = new Employee();
		e2.setName("Yokesh");
		e2.setSalary(4500.50);
		
		Employee e3 = new Employee();
		e3.setName("Venkat");
		e3.setSalary(10000.770);
		
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d2.addEmployee(e3);
		
		manager.persist(d1);
		manager.persist(d2);
		
		System.out.println("Employee and manager data added successfully");
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
