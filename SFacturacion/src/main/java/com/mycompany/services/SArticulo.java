package com.mycompany.services;

import com.mycompany.entity.EArticulo;
import com.mycompany.operaciones.OArticulo;
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

@Path("articulo")
public class SArticulo {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        OArticulo op = new OArticulo();        
        List<EArticulo> datos = op.get();
        return Response.ok(datos).build() ;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)   
    public Response getArticulo(@PathParam("id") int id){
        EArticulo eArticulo = new EArticulo();
        eArticulo.setArtCod(id);        
        OArticulo op = new OArticulo();
        EArticulo datos = op.getArticulo(eArticulo);        
        return Response.ok(datos).build() ;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveArticulo(EArticulo obj){
        OArticulo op = new OArticulo();
        op.saveArticulo(obj);
        return Response.status(Response.Status.CREATED).build();        
    }
        
    @DELETE
    @Path("/{id}")    
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteArticulo(@PathParam("id") int id){
        EArticulo eArticulo = new EArticulo();
        eArticulo.setArtCod(id);
        OArticulo op = new OArticulo();
        op.deleteArticulo(eArticulo);
        return Response.ok().build() ;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateArticulo(EArticulo obj){
        OArticulo op = new OArticulo();
        op.updateArticulo(obj);
        return Response.status(Response.Status.ACCEPTED).build();
    }
}
