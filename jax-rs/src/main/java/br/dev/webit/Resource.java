package br.dev.webit;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/test")
@RequestScoped
public class Resource {

    @GET
    public String test() {
        return "Hello, World! from Helidon JAX-RS";
    }
}
