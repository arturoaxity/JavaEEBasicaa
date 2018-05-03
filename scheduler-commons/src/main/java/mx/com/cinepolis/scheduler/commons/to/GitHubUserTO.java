package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class GitHubUserTO implements Serializable {

    private static final long serialVersionUID = -8853482566070472169L;

    private String login;
    private String name;
    private String avatarUri;
    private int followers;
    private int follogin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollogin() {
        return follogin;
    }

    public void setFollogin(int follogin) {
        this.follogin = follogin;
    }
}
