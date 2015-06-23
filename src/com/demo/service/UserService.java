package com.demo.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserService {

	/**
	 * When enter 'http://localhost:8080/JerseyDemoFormParam/UserForm.html' URL on browser, @FormParam will map
 	 * input data and redirect to the 'http://localhost:8080/JerseyDemoFormParam/demo/user/add' URL
	 * 
	 * @param name - input name 
	 * @param age - input age
	 * @return - response with user entered details
	 */
	@POST
	@Path("/add")
	public Response addUser(@FormParam("name") String name, 
							@FormParam("age") int age){
				
		return Response.status(200)
				.entity("User name is: " + name + " and age is: " + age)
				.build();		
	}
}
