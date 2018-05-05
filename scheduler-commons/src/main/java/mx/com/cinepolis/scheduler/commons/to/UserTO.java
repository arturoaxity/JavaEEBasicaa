package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

/**
 * @author ohurtado
 */

public class UserTO implements Serializable {


    private static final long serialVersionUID = -8853482566070472169L;

    private Long idUser;
    private String login;
    private String avatar_url;
    private String name;
    private int followers;
    private int following;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }
}
