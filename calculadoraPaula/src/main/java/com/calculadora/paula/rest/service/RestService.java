package com.calculadora.paula.rest.service;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import com.calculadora.paula.rest.dto.RequestDTO;
import javax.ws.rs.Path;

@Path("/")
public interface RestService
{
    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    void getMethod(final RequestDTO p0);
}
