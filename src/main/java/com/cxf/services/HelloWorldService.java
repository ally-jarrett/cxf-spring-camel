package com.cxf.services;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService(serviceName = "helloServices", targetNamespace = "http://spring-cxf-rest/services")
public interface HelloWorldService {
	
	@GET
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({ MediaType.TEXT_PLAIN })
	@Path("/helloworld/{text}")
	public String sayHi(@PathParam("text") String text);
	
}
