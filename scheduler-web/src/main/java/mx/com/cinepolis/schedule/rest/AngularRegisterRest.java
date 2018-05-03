package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.RegistrarUserTO;
import mx.com.cinepolis.scheduler.facade.AngularRegisterFacadeEJB;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/angular")
public class AngularRegisterRest {

    @EJB
    AngularRegisterFacadeEJB registerFacadeEJB;

    @POST
    @Produces("application/json")
    @Path("/register")
    public Response registerUser(RegistrarUserTO registrarUserTO){
        RegistrarUserTO registrarUser = registerFacadeEJB.RegisterUser(registrarUserTO);
        System.out.println(registrarUser.toString());
        return Response.ok().entity(registrarUser).build();
    }
}
