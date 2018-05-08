package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.PermisosTO;
import mx.com.cinepolis.scheduler.commons.to.UserEmpleadoTO;
import mx.com.cinepolis.scheduler.facade.EmployeManagementFacadeEJB;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;

@Path("/restperson")
public class EmployeMagnamentRest {

    @EJB
    EmployeManagementFacadeEJB facadeEJB;

    @GET
    @Produces("application/json")
    @Path("/getallpermits")
    public Response getAllPermits(){
        List<PermisosTO> allPermits = facadeEJB.getAllPermits();
        GenericEntity<List<PermisosTO>> entity = new GenericEntity<List<PermisosTO>>(allPermits) {};
    return Response.ok().entity(entity).build();
    }

    // listo ya queddo
    @POST
    @Produces("application/json")
    @Path("/adduseremployee")
    public Response addUserEmployee(UserEmpleadoTO empleado){
        UserEmpleadoTO empleadoTO = facadeEJB.addUserEmployee(empleado);
        return Response.ok().entity(empleadoTO).build();
    }

    // listo ya quedo
    @GET
    @Produces("application/json")
    @Path("/getalluseremployee")
    public Response getAllUserEmployee(){
        List<UserEmpleadoTO> allUserEmployee = facadeEJB.getAllUserEmployee();
        GenericEntity<List<UserEmpleadoTO>> entity = new GenericEntity<List<UserEmpleadoTO>>(allUserEmployee) {};
        return Response.ok().entity(entity).build();
    }

    @DELETE
    @Produces("application/json")
    @Path("/deleteuser")
    public Response deleteUser(@Context UriInfo ui){
        MultivaluedMap<String,String> queryParam = ui.getQueryParameters();
        String idUser = queryParam.getFirst("idUser");
        String s = facadeEJB.deleteUser(Long.parseLong(idUser));
        return Response.ok().tag(s).build();
    }
    
    @PUT
    @Produces("application/json")
    @Path("/updateuser")
    public Response updateUser(UserEmpleadoTO empleado){
        UserEmpleadoTO empleadoTO = facadeEJB.updateUser(empleado);
        return Response.ok().entity(empleadoTO).build();
    }

    @GET
    @Produces("application/json")
    @Path("/loginuser")
    public Response loginUser(@Context UriInfo ui){
        MultivaluedMap<String,String> queryParam = ui.getQueryParameters();
        String user = queryParam.getFirst("usuario");
        String pass = queryParam.getFirst("pwd");
        String loginUser = facadeEJB.loginUser(user,pass);
        return Response.ok().tag(loginUser).build();
    }
}
