/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package API;

import DTO.ProfileDTO;
import dao.PerfilDAO;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

/**
 * REST Web Service
 *
 * @author erika
 */
@Path("perfiles")
@RequestScoped
public class PerfilesResource {
    
    private final PerfilDAO dao = new PerfilDAO();

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
    public ProfileDTO buscar(
            @QueryParam("genero") String genero,
            @QueryParam("pais") String pais,
            @QueryParam("edad") int edad
    ) {

        List<ProfileDTO> resultados = dao.buscarPorFiltros(genero, pais, edad);

        if (resultados.isEmpty()) {
            return null;
        }

        if (resultados.size() > 1) {
            Random r = new Random();
            return resultados.get(r.nextInt(resultados.size()));
        }

        return resultados.get(0);
    }

    /**
     * PUT method for updating or creating an instance of PerfilesResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(ProfileDTO content) {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void crearPerfil(ProfileDTO perfil) {
        dao.insertar(perfil);
    }
}
