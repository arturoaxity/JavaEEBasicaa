package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.RegistrarUserTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.facade.CatalogFacadeEJB;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

/**
 * @author jrodriguez
 */
@Path("/catalog")
public class CatalogRest {

    @EJB
    private CatalogFacadeEJB catalogFacadeEJB;


    @GET
    @Produces("application/json")
    @Path("/user")
    public Response getSimpleCatalog()
    {
        UserTO userTO = catalogFacadeEJB.getSimpleUser();
        return Response.ok().entity(userTO).build();
    }
    
    /*@GET
    @Produces("application/json")
    @Path("/country/{pais}")
    public Response getEstados(@PathParam("pais") String pais) {
    	List<CatalogsTO> catalogsTOLits =  catalogFacadeEJB.getEstadosList(pais);
    	
    	GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOLits) {};
                
    	return Response.ok().entity(entity).build();
    }*/



    @GET
    @Produces("application/json")
    @Path("/country")
    public Response getEstados(@Context UriInfo ui) {
        MultivaluedMap<String,String> queryParam = ui.getQueryParameters();
        String pais = queryParam.getFirst("pais");
        List<CatalogsTO> catalogsTOLits =  catalogFacadeEJB.getEstadosList(pais);

        GenericEntity<List<CatalogsTO>> entity = new GenericEntity<List<CatalogsTO>>(catalogsTOLits) {};

        return Response.ok().entity(entity).build();
    }

    @GET
    @Produces("application/json")
    @Path("/userlist")
    public Response getUserTO() {
        List<UserTO> catalogsTOLits =  catalogFacadeEJB.getUserAll();
        GenericEntity<List<UserTO>> entity = new GenericEntity<List<UserTO>>(catalogsTOLits) {};
        return Response.ok().entity(entity).build();
    }

    @POST
    @Produces("application/json")
    @Path("/registerto")
    public Response registerUser(UserTO registrarUserTO){
        UserTO user = catalogFacadeEJB.addUser(registrarUserTO);
        return Response.ok().entity(user).build();
    }



    @GET
    @Produces("application/json")
    @Path("/obteneruser")
    public Response getExistUserTO(@Context UriInfo ui) {
        MultivaluedMap<String,String> queryParam = ui.getQueryParameters();
        String pais = queryParam.getFirst("idUser");
        catalogFacadeEJB.getUser((long) Integer.parseInt(pais));
        return Response.ok().entity(pais).build();
    }


}
