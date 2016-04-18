package com.ratnesh.restful.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/user-management")
public class UserManagementModule {
	
	@GET
	@Path("/users")
	public Response getAllUsers(){
		String result = "<h1>RESTful Demo Application</h1>In real world application, a collection of users will be returned !!";
        return Response.status(200).entity(result).build();
	}

}
