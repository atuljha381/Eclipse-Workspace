package com.res;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeDAO {
//	private List<Employee> emps;
	private static Map<String, Employee> empMap= new HashMap<String, Employee>();
	static {
		init();
	}
	public static void init() {
		Employee emp1 = new Employee("E01", "Smith", "Clerk");
	    Employee emp2 = new Employee("E02", "Allen", "Salesman");
	    Employee emp3 = new Employee("E03", "Jones", "Manager");
	    empMap.put(emp1.getEmpNo(), emp1);
	    empMap.put(emp2.getEmpNo(), emp2);
	    empMap.put(emp3.getEmpNo(), emp3);
	}
	public static Employee getEmployee(String empNo) {
		return empMap.get(empNo);
	}
	public static Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	public static Employee updateEmployee(Employee emp) {
		empMap.put(emp.getEmpNo(), emp);
		return emp;
	}
	public static void deleteEmployee(String empno) {
		empMap.remove(empno);
	}
	
	public static List<Employee> getAllEmployees(){
		Collection<Employee> collection= empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(collection);
		return list;
	}
}
