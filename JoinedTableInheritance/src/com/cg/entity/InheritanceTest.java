package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//create child
		Child child1 = new Child();
		child1.setName("Sanjay");
		child1.setAge(21);
		child1.setGender("Male");
		child1.setOrder(1);
		em.persist(child1);
		
		Child child2 = new Child();
		child2.setName("Sarath");
		child2.setAge(16);
		child2.setGender("Male");
		child2.setOrder(2);
		em.persist(child2);
		
		//create parent
		Parent father = new Parent();
		father.setName("Sankar");
		father.setAge(46);
		father.setParent("Father");
		em.persist(father);
		
		Parent mother = new Parent();
		mother.setName("Chitra");
		mother.setAge(39);
		mother.setParent("Mother");
		em.persist(mother);
		
		em.getTransaction().commit();
		System.out.println("Data added successfully");
		
		em.close();
		factory.close();
	}
}
