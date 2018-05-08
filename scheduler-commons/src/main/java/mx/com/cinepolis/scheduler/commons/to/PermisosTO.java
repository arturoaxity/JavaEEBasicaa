package mx.com.cinepolis.scheduler.commons.to;

import java.io.Serializable;

public class PermisosTO implements Serializable {
    private Long idPermiso;
    private String tipoPermiso;
    private String Permiso;

    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public String getPermiso() {
        return Permiso;
    }

    public void setPermiso(String permiso) {
        Permiso = permiso;
    }

    @Override
    public String toString() {
        return "PermisosTO{" +
                "idPermiso=" + idPermiso +
                ", tipoPermiso='" + tipoPermiso + '\'' +
                ", Permiso='" + Permiso + '\'' +
                '}';
    }
}
