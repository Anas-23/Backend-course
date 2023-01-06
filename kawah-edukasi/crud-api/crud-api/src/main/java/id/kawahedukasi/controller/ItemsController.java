package id.kawahedukasi.controller;

import id.kawahedukasi.model.Items;


import javax.json.JsonObject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/items")
public class ItemsController {
    @POST
    @Transactional
    public Response create(JsonObject request){
        Items items = new Items();
        items.name = request.getString("name");
        items.count = request.getInt("count");
        items.type = request.getString("type");
        items.price = request.getInt("price");
        items.description = request.getString("description");

        items.persist();

        return Response.ok().entity(new HashMap<>()).build();
    }

    //get all data
    @GET
    public Response list(){
        return Response.ok().entity(Items.listAll()).build();
    }

    //get by id
    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Integer id){
        Items items = Items.findById(id);
        if(items == null){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("message", "PESERTA_NOT_FOUND"))
                    .build();
        }

        return Response.ok().entity(items).build();
    }

    //get by type
    @GET
    @Path("/type/{type}")
    public Response getByRole(@PathParam("type") String type){
        if(!type.equalsIgnoreCase("makanan") && !type.equalsIgnoreCase("minuman")){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(Map.of("message", "INVALID_ROLE"))
                    .build();
        }
        List<Items> itemsList = Items.find("UPPER(type) = ?1", type.toUpperCase(Locale.ROOT)).list();
        return Response.ok().entity(itemsList).build();
    }

    //update data by id
    @PUT
    @Path("/{id}")
    @Transactional
    public Response update(@PathParam("id") Integer id, JsonObject request){
        Items items = Items.findById(id);
        items.name = request.getString("name");
        items.count = request.getInt("count");
        items.type = request.getString("type");
        items.price = request.getInt("price");
        items.description = request.getString("description");

        items.persist();

        return Response.ok().entity(new HashMap<>()).build();
    }

    //delete by id
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Integer id){
        Items.deleteById(id);
        return Response.ok().entity(new HashMap<>()).build();
    }
}
