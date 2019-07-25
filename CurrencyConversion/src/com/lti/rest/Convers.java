package com.lti.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/currency")
public class Convers {

	//http://localhost:8087:MyFirstWS/rest/hello==>URI
		@GET
		@Path("/{rs}")
		@Produces(MediaType.TEXT_PLAIN)
		public String rsToDoll(@PathParam("rs") double rs)
		{
			return "USD = "+rs+", INR ="+rs*75;
		}
		
}
