package com.dao;

import java.util.List;

import com.entity.Person;

public interface IPerson {
	boolean addPerson(Person person);
	List<Person> viewAll();
	Person getPerson(int id);
	List<Person> viewAllByJob(String job);
	boolean updatePerson(int id,String job);
	boolean deletePerson(int id);
	List<Person> namedQueryByJob(String job);
}
