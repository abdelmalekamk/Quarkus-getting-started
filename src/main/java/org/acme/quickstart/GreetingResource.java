package org.acme.quickstart;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    PersonneService service ;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/personne/{name}")
    public String personne(@PathParam String name){
        return service.personne(name);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello guys !!!!";
    }

}