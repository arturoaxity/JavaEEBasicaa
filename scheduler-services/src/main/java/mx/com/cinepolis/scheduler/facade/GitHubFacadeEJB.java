package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.LoginGitHubTO;
import mx.com.cinepolis.scheduler.commons.to.RegistrarUserTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class GitHubFacadeEJB {

    @Inject
    GitHubService gitHubService;

    public GitHubUserTO getUserGitHub(String user){

        return gitHubService.getUserGitHub(user);
    }

    public LoginGitHubTO LoginUser(String user , String password){
        return gitHubService.loginUser(user,password);
    }


}
