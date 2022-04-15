package com.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyPU");
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Stud stud = new Stud();
			stud.setId(1022);
			stud.setSname("Rahul Dravid");
			Address homeAddress = new Address();
			homeAddress.setAddressId(113);
			homeAddress.setStreet("GB road");
			homeAddress.setCity("Pune");
			homeAddress.setState("Maharashtra");
			homeAddress.setZipcode("411 017");
			
			stud.setAddress(homeAddress);
			em.persist(stud);
			transaction.commit();
			System.out.println("Added one with student address");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
