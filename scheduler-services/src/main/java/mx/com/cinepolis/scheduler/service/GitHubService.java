package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.GitHubUserTO;
import mx.com.cinepolis.scheduler.commons.to.LoginGitHubTO;

public interface GitHubService

{
    GitHubUserTO getUserGitHub(String user);
    LoginGitHubTO loginUser(String user , String password);
}
