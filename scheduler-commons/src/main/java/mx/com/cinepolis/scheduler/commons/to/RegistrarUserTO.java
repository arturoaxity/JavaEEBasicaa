package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class RegistrarUserTO implements Serializable {
    private static final long serialVersionUID = -8853482566070472169L;

    private String userName;
    private String nombre;
    private String password;
    private String confPassword;
    private String email;
    private boolean terminosCondiciones;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public void setConfPassword(String confPassword) {
        this.confPassword = confPassword;
    }

    public boolean isTerminosCondiciones() {
        return terminosCondiciones;
    }

    public void setTerminosCondiciones(boolean terminosCondiciones) {
        this.terminosCondiciones = terminosCondiciones;
    }
}
