package com.mycompany.services;

import com.mycompany.entity.ECliente;
import com.mycompany.operaciones.OCliente;
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

@Path("cliente")
public class SCliente {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        OCliente op = new OCliente();
        List<ECliente> datos = op.get();
        return Response.ok(datos).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCliente(@PathParam("id") int id){
        ECliente eCliente = new ECliente();
        eCliente.setCliCod(id);
        OCliente op = new OCliente();
        ECliente datos = op.getCliente(eCliente);        
        return Response.ok(datos).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveCliente(ECliente obj){
        OCliente op = new OCliente();
        op.saveCliente(obj);
        return Response.ok(Response.Status.CREATED).build();
    }
    
    @DELETE
    @Path("/{id}")
    public Response deleteCliente(@PathParam("id") int id){
        ECliente eCliente = new ECliente();
        eCliente.setCliCod(id);
        OCliente op = new OCliente();
        op.deleteCliente(eCliente);
        return Response.ok().build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response udpateCliente(ECliente obj){
        OCliente op = new OCliente();
        op.updateCliente(obj);
        return Response.status(Response.Status.ACCEPTED).build();
    }
}
