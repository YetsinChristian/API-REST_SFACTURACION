package com.mycompany.services;

import com.mycompany.entity.EVendedor;
import com.mycompany.operaciones.OVendedor;
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

@Path("vendedor")
public class SVendedor {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(){
        OVendedor op = new OVendedor();        
        List<EVendedor> datos = op.get();        
        return Response.ok(datos).build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVendedor(@PathParam("id") int id){
        EVendedor eVendedor = new EVendedor();
        eVendedor.setVenCod(id);
        OVendedor op = new OVendedor();
        EVendedor datos = op.getVendedor(eVendedor);
        return Response.ok(datos).build();
    }
            
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveVendedor(EVendedor obj){
        OVendedor op = new OVendedor();
        op.saveVendedor(obj);
        return Response.status(Response.Status.CREATED).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteVendedor(@PathParam("id") int id){
        EVendedor eVendedor = new EVendedor();
        eVendedor.setVenCod(id);
        OVendedor op = new OVendedor();
        op.deleteVendedor(eVendedor);
        return Response.ok().build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateCategoria(EVendedor obj){
        OVendedor op = new OVendedor();
        op.updateVendedor(obj);
        return Response.status(Response.Status.ACCEPTED).build();
    }    
}
