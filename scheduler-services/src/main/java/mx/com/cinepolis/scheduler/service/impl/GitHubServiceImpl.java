package mx.com.cinepolis.scheduler.service.impl;

import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.LoginGitHubTO;
import mx.com.cinepolis.scheduler.commons.to.RegistrarUserTO;
import mx.com.cinepolis.scheduler.service.GitHubService;

public class GitHubServiceImpl implements GitHubService {
    @Override
    public GitHubUserTO getUserGitHub(String user) {
        GitHubUserTO gitHubUserTO = new GitHubUserTO();
        if (user.equals("Arturo")) {
            gitHubUserTO.setLogin("arturoAxity");
            gitHubUserTO.setAvatarUri("https://andro4all.com/files/2016/07/pokemon-hulu-pikachu800.0-700x500.jpg");
            gitHubUserTO.setName("arturo");
            gitHubUserTO.setFollogin(4);
            gitHubUserTO.setFollowers(8);
        } else if (user.equals("Daniel")) {
            gitHubUserTO.setLogin("danielAxity");
            gitHubUserTO.setAvatarUri("https://andro4all.com/files/2016/07/pokemon-hulu-pikachu800.0-700x500.jpg");
            gitHubUserTO.setName("daniel");
            gitHubUserTO.setFollogin(10);
            gitHubUserTO.setFollowers(1);
        }
        return gitHubUserTO;
    }

    @Override
    public LoginGitHubTO loginUser(String user, String password) {
        LoginGitHubTO loginTo = new LoginGitHubTO();
        if (user.equals("Arturo") && password.equals("pass1234"))
            loginTo.setUser(user);
            loginTo.setPassword(password);
        return loginTo;
    }

}
