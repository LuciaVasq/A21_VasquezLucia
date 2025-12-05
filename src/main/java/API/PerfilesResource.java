/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package API;

import DTO.ProfileDTO;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.core.MediaType;
import java.util.GregorianCalendar;

/**
 * REST Web Service
 *
 * @author erika
 */
@Path("perfiles")
@RequestScoped
public class PerfilesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PerfilesResource
     */
    public PerfilesResource() {
    }

    /**
     * Retrieves representation of an instance of API.PerfilesResource
     * @return an instance of DTO.ProfileDTO
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ProfileDTO getJson() {
        return new ProfileDTO("Alexander","Gaskarth","William",new GregorianCalendar(2004, 11, 11), "photo.png","alex.gw@gmail.com","Male","GB","111-111-1111","111-111-111","123, Westheimer Rd",21);
    }

    /**
     * PUT method for updating or creating an instance of PerfilesResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(ProfileDTO content) {
    }
}
