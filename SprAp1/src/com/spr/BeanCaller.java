package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCaller {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		MyMessage msg1 = (MyMessage) context.getBean("b1");
//		MyMessage msg2 = (MyMessage) context.getBean("b1");
//		
//		msg2.setMessage("I play badminton");
//		
//		System.out.println(msg1.getMessage());
//		System.out.println(msg2.getMessage());
//		
//		Person person = (Person)context.getBean("p");
//		System.out.println(person.getPname());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee)context.getBean("emp");
		Address address = employee.getEmpAddress();
		System.out.println(employee.getEname());
		System.out.println(address.getDrno()+"\n"+address.getCity()+"\n"+address.getState());
	}
}
