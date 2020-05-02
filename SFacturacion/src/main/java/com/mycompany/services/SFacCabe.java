package com.mycompany.services;

import com.mycompany.entity.EFacCabe;
import com.mycompany.operaciones.OFacCabe;
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

@Path("faccabe")
public class SFacCabe {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        OFacCabe op = new OFacCabe();        
        List<EFacCabe> datos = op.get();        
        return Response.ok(datos).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFacCabe(@PathParam("id") int id){
        EFacCabe eFacCabe = new EFacCabe();
        eFacCabe.setFacNum(id);
        OFacCabe op = new OFacCabe();
        EFacCabe datos = op.getFacCabe(eFacCabe);
        return Response.ok(datos).build();
    }
            
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveFacCabe(EFacCabe obj){
        OFacCabe op = new OFacCabe();
        op.saveFacCabe(obj);
        return Response.status(Response.Status.CREATED).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteFacCabe(@PathParam("id") int id){
        EFacCabe eFacCabe = new EFacCabe();
        eFacCabe.setFacNum(id);
        OFacCabe op = new OFacCabe();
        op.deleteFacCabe(eFacCabe);
        return Response.ok().build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateFacCabe(EFacCabe obj){
        OFacCabe op = new OFacCabe();
        op.updateFacCabe(obj);
        return Response.status(Response.Status.ACCEPTED).build();
    }    
}
