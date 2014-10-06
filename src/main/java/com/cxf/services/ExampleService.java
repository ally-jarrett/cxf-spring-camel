package com.cxf.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Just a definition of the service. No implementation
 * needed.
 * 
 * Needs to be a class so that Spring can call a default
 * constructor (which it can't do with an interface).
 */
@Path("/example")
public class ExampleService
{
  /**
   * Camel intercepts this.
   * 
   * Receives a request with one URL-based argument and responds with JSON.
   * 
   * @return A response in String format with MIME of application/json
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/test")
  public String test() {
	return null;
  }
}
