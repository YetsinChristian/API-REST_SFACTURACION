/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.services;

import com.mycompany.entity.ECategoria;
import com.mycompany.operaciones.OCategoria;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Christian
 */
@Path("categoria")
public class SCategoria {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        OCategoria op = new OCategoria();        
        List<ECategoria> datos = op.get();
        return Response.ok(datos).build() ;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)   
    public Response getCategoria(@PathParam("id") int id){
        ECategoria eCategoria = new ECategoria();
        eCategoria.setCatCod(id);        
        OCategoria op = new OCategoria();
        ECategoria datos = op.getCategoria(eCategoria);        
        return Response.ok(datos).build() ;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveCategoria(ECategoria obj){
        OCategoria op = new OCategoria();
        op.saveCategoria(obj);
        return Response.status(Response.Status.CREATED).build();        
    }
        
    @DELETE
    @Path("/{id}")    
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteCategoria(@PathParam("id") int id){
        ECategoria eCategoria = new ECategoria();
        eCategoria.setCatCod(id);
        OCategoria op = new OCategoria();
        op.deleteCategoria(eCategoria);
        return Response.ok().build() ;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCategoria(ECategoria obj){
        OCategoria op = new OCategoria();
        op.updateCategoria(obj);
        return Response.status(Response.Status.ACCEPTED).build();
    }
}
