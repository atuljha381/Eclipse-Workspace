package com.jpa.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAOne2Many");
		EntityManager em = factory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			Dept department = em.find(Dept.class, 20);
			
			Emp emp1 = new Emp();
			emp1.setEmpno(105);
			emp1.setEname("Hemant");
			emp1.setGender("F");
			emp1.setJob("Executive");
			emp1.setSalary(60000);
			
			Emp emp2 = new Emp();
			emp2.setEmpno(104);
			emp2.setEname("Jaya");
			emp2.setGender("F");
			emp2.setJob("Associate");
			emp2.setSalary(30000);
			
			department.addEmp(emp1);
//			department.addEmp(emp2);
			em.persist(department);
			System.out.println("Added in department");
			transaction.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
