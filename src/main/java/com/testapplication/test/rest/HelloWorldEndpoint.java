package com.testapplication.test.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/hello")
public class HelloWorldEndpoint {
    @GET
    @Produces("application/json")
    public Response doGet() {
        a().replace("T", "T");
        return Response.ok("{\"message\": \"a\"}").build();
    }

    public String a() {
        return null;
    }
}
