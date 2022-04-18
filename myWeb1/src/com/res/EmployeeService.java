package com.res;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Employee> getEmployees_JSON(){
		List<Employee> listofEmployees = EmployeeDAO.getAllEmployees();
		return listofEmployees;
	}
	
	@GET
	@Path("/{empno}")
	@Produces({MediaType.APPLICATION_XML})
	public Employee getEmployee(@PathParam("empno")String empno) {
		return EmployeeDAO.getEmployee(empno);
	}
}
