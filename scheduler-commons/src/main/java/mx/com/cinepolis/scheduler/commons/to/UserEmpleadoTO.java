package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class UserEmpleadoTO implements Serializable {
    private Long idUser;
    private String usuario;
    private String nombre;
    private String pdw;
    private int idPermiso;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPdw() {
        return pdw;
    }

    public void setPdw(String pdw) {
        this.pdw = pdw;
    }

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    @Override
    public String toString() {
        return "UserEmpleadoTO{" +
                "idUser=" + idUser +
                ", usuario='" + usuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", pdw='" + pdw + '\'' +
                ", idPermiso=" + idPermiso +
                '}';
    }
}
