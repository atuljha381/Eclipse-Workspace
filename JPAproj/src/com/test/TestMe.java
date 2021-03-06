package com.test;

import java.util.List;
import java.util.function.Consumer;

import com.dao.IPerson;
import com.dao.PersonDAOImpl;
import com.entity.Person;

public class TestMe {

	public static void main(String[] args) {
		System.out.println("Application Main");
		IPerson dao = new PersonDAOImpl(); //declare parent class object, initialize child reference is called upcasting
//		Person p = new Person();
//		p.setPid(221);
//		p.setPname("Bhuvana");
//		p.setPjob("accountant");
//		dao.addPerson(p);
//		System.out.println("Record Added");
//		dao.viewAll().forEach(new Consumer<Person>() {
//			public void accept(Person e) {
//				System.out.println(e.getPname());
//			}
//		});
		List<Person> persons = dao.namedQueryByJob("Clerk");
		persons.forEach(new Consumer<Person>() {
			public void accept(Person p) {
				System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPjob());
			}
		});

	}

}
