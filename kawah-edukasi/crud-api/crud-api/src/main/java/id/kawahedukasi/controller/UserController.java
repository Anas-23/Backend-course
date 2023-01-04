package id.kawahedukasi.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    @POST
    public Map<String, Object> create(){
        return Map.of(
                "message", "CREATED"
        );
    }

    @GET
    public Map<String, Object> get(){
        return Map.of(
                "nama", "Anas",
                "gender", "male"
        );
    }

    @PUT
    public Map<String, Object> update(){
        return Map.of(
                "message", "UPDATED"
        );
    }

    @DELETE
    public Map<String, Object> delete(){
        return Map.of(
                "message", "DELETED"
        );
    }
}
