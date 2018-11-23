package com.davdeenko.jersey.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
    @GET
    public Response getMsg() {

        String output = "Hello, World!";

        return Response.status(200).entity(output).build();

    }

}
