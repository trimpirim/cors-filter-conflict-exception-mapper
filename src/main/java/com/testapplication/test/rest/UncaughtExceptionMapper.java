package com.testapplication.test.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UncaughtExceptionMapper extends Throwable implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable exception) {
        exception.printStackTrace();
        return Response.status(500).entity("{\"message\": \"a\"}").build();
    }
}
