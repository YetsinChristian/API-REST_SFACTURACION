package com.mycompany.services;

import com.mycompany.entity.EFacCabe;
import com.mycompany.entity.EFacDeta;
import com.mycompany.operaciones.OFacDeta;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("facdeta")
public class SFacDeta {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id){
        EFacCabe obj = new EFacCabe();
        obj.setFacNum(id);
        OFacDeta op = new OFacDeta();
        List<EFacDeta> datos = op.get(obj);        
        return Response.ok(datos).build() ;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveFacDeta(EFacDeta obj){
        OFacDeta op = new OFacDeta();
        op.saveFacDeta(obj);
        return Response.ok().build();
    }
        
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteFacDeta(@PathParam("id") int id){
        EFacCabe obj = new EFacCabe();
        obj.setFacNum(id);
        OFacDeta op = new OFacDeta();
        op.deleteFacDeta(obj);
        return Response.ok().build() ;
    }
}
