package com.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityProvider {
	private static EntityManagerFactory factory = null;
	private EntityProvider() {}
	public static EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("MyPU");
		EntityManager em = factory.createEntityManager();
		return em;
	}
	
}
