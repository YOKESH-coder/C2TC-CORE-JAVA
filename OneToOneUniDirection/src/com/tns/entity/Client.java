package com.tns.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		
		Student student = new Student(); 
		student.setName("Yokesh");
		  
		Address address = new Address(); 
		address.setAddressId(1);
		address.setArea("Tambaram");
		address.setCity("Chennai"); 
		address.setState("Tamilnadu");
		address.setStreet("Thaka street"); 
		address.setZipcode(600058);
		  
		student.setAddress(address);
		 
		
		manager.persist(student);
		
		manager.getTransaction().commit();
		
		System.out.println("Data added successfully");
		
		manager.close();
		factory.close();

	}

}
