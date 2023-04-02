package com.example;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("todos")
public class MyResources {
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Hello, world!";
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ToDo getTodo(@PathParam("id") Integer id) {
		return new ToDo(id, "todo", "2023-04-01", false, 0);
	}

	@GET
   	@Path("/list")
   	@Produces(MediaType.APPLICATION_JSON)
    public List<ToDo> getList() {
   		return List.of(
   				new ToDo(0, "todo0", "2023-04-01", false, 0),	
   				new ToDo(1, "todo1", "2023-04-01", false, 0),	
   				new ToDo(2, "todo2", "2023-04-01", false, 0)
 				);   		
    }
}