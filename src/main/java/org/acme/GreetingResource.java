package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    static String name = "OpenShift";

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from "+name;
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void name(String name){
        this.name=name;
    }
}