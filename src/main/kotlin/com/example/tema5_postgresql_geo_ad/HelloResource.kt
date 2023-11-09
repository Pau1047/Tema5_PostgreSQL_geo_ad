package com.example.tema5_postgresql_geo_ad

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces

@Path("/hello-world")
class HelloResource {
    @GET
    @Produces("text/plain")
    fun hello(): String {
        return "Hello, World!"
    }
}