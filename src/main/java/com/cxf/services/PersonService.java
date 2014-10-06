package com.cxf.services;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService(serviceName = "personServices", targetNamespace = "http://spring-cxf-rest/services")
public interface PersonService {
	
    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public String personServiceMethod();

}
