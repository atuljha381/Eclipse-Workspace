package com.res;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/root")
public class MyService {
	@GET
	public String getMessage() {
		return "Hello!";
	}
	@GET
	@Path("invite/{user}")
	public String getGreeting(@PathParam("user")String un) {
		return "Welcome Sir <b>"+un+"</b>";
	}
	
	@GET
	@Path("/validate/{pname}/{pjob}")
	public String information(@PathParam("pname")String name,@PathParam("pjob")String job) {
		return name+" is appointed as "+job;
	}
	@GET
	@Path("/info")
	public String getInfo(@QueryParam("tname")String name,@QueryParam("tloc")String loc) {
		return name+" is from "+loc;
	}
}
