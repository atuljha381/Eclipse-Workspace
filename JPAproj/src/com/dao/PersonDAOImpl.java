package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.db.EntityProvider;
import com.entity.Person;

public class PersonDAOImpl implements IPerson {
	private EntityManager em=null;
	private EntityTransaction trans=null;
	public PersonDAOImpl() {
		em = EntityProvider.getEntityManager();
	}

	public boolean addPerson(Person person) {
		boolean flag = true;
		try {
				trans = em.getTransaction();
				trans.begin();
				em.persist(person);
				trans.commit();
				System.out.println("Record Inserted");
				flag = true;
		} catch (Exception e) {
			System.out.println(e);
			flag = false;
			trans.rollback();
		}
		return flag;
	}

	public List<Person> viewAll() {
		return em.createQuery("select p from Person p").getResultList();
	}

	public Person getPerson(int id) {
		return em.find(Person.class, id);
	}

	public List<Person> viewAllByJob(String job) {
		return em.createQuery("select p from Person p where p.pjob=:job").setParameter("job", job).getResultList();
	}

	public boolean updatePerson(int id, String job) {
		boolean flag=false;
		try {
			trans=em.getTransaction();
			trans.begin();
			Person person = em.find(Person.class, id);
			person.setPjob(job);
			em.merge(person);
			trans.commit();
			System.out.println("record inserted");
			flag=true;
		} catch (Exception e) {
			System.out.println(e);
			flag=false;
			trans.rollback();
		}
		return flag;
	}

	public boolean deletePerson(int id) {
		boolean flag=false;
		try {
			trans=em.getTransaction();
			trans.begin();
			Person person = em.find(Person.class, id);
			em.remove(person);
			trans.commit();
			System.out.println("record inserted");
			flag=true;
		} catch (Exception e) {
			System.out.println(e);
			flag=false;
			trans.rollback();
		}
		return flag;
	}

	public List<Person> namedQueryByJob(String job) {
		return em.createNamedQuery("byJob").setParameter("job",job).getResultList();
	}

}
