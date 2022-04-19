package com.spr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDAO {
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	public void addStudent(Student student) {
		try {
			template.save(student); //also can use template.persist() instead of template.save()
			System.out.println("Record Inserted"); 
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void updateStudent(Student student) {
		try {
			template.update(student);
			System.out.println("Record Updated");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public Student getStudent(int id) {
		return template.get(Student.class, id);
	}
	public List<Student> getAllStudents(){
		List<Student> list = new ArrayList<Student>();
		list = template.loadAll(Student.class);
		return list;
	}
	public List<Student> getAllStudents(int sub1){
		return template.getSessionFactory().openSession().
				createQuery("select s from Student s where s.s1>=:marks").setParameter("marks",sub1).list();		
//		return template.getSessionFactory().openSession().createSQLQuery("select * from student s where s.s1>=:marks").setParameter("marks", sub1).list();		
		
	}
	
	
}
