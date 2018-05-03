package mx.com.cinepolis.schedule.rest;

import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.LoginGitHubTO;
import mx.com.cinepolis.scheduler.facade.GitHubFacadeEJB;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("/github")
public class GitHubServiceRest {

    @EJB
    GitHubFacadeEJB gitHubFacadeEJB;

    @GET
    @Produces("application/json")
    @Path("/user")
    public Response getUserGitHub(@Context UriInfo info) {
        MultivaluedMap<String, String> queryParam = info.getQueryParameters();
        String user = queryParam.getFirst("user");
        GitHubUserTO userTo = gitHubFacadeEJB.getUserGitHub(user);
        return Response.ok().entity(userTo).build();
    }

    @GET
    @Produces("application/json")
    @Path("/login")
    public  Response loginUser(@Context UriInfo info){
        MultivaluedMap<String, String> queryParam = info.getQueryParameters();
        String user = queryParam.getFirst("user");
        String password = queryParam.getFirst("password");
        LoginGitHubTO loginTo = gitHubFacadeEJB.LoginUser(user,password);
        return  Response.ok().entity(loginTo).build();
    }


}
