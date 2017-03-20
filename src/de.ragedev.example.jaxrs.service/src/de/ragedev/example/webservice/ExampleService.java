package de.ragedev.example.webservice;



import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;

@Component(service=ExampleService.class)
@Path("/hello")
public class ExampleService {

	public ExampleService() {
		// TODO Auto-generated constructor stub
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String hello(String value) {
		System.out.println("hello " + value);
		return "hello " + value;
	}
}