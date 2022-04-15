package com.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPU");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Stud stud = new Stud();
			stud.setId(1012);
			stud.setSname("Pavani");
			Address adr1 = new Address();
			adr1.setAddressId(11);
			adr1.setStreet("Bank Street");
			adr1.setState("TS");
			adr1.setCity("Hyderabad");
			adr1.setZipcode("500001");
			stud.setAddress(adr1);
			System.out.println("Student and address information registered");
			em.persist(stud);
			transaction.commit();
			System.out.println("Information Saved");
		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		}
	}
}
