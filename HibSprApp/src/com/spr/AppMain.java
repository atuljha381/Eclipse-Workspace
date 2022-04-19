package com.spr;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO dao = context.getBean(StudentDAO.class);
//		dao.addStudent(new Student(101,"Prasad",66,76));
//		dao.addStudent(new Student(102,"Savita",69,79));
//		dao.addStudent(new Student(103,"Sonal",65,73));
//		System.out.println("Record Added");
//		System.out.println(dao.getAllStudents(66));
		List<Student> stud = dao.getAllStudents(66);
		System.out.println(stud.toString());
		System.out.println("Records Extracted");
	}

}
