package com.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee)context.getBean("emp");
		Address address = employee.getEmpAddress();
		System.out.println(employee.getEname());
		System.out.println(address.getDrno());
		System.out.println(address.getCity());
		System.out.println(address.getState());

	}

}
