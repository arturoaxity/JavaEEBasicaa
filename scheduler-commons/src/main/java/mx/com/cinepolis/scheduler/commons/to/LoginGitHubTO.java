package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class LoginGitHubTO implements Serializable {

    private static final long serialVersionUID = -8853482566070472169L;

    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
