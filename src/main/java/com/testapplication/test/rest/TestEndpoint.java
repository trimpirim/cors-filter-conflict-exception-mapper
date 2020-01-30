package com.testapplication.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/hello2")
public class TestEndpoint {
    @GET
    @Produces("application/json")
    public Response doGet() {
        return Response.ok("{\"message\": \"a\"}").build();
    }
}
