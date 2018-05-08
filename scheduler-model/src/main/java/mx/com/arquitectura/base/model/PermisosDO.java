package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table(name = "C_PERMISOS")
public class PermisosDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERMISO")
    private Long idPermiso;
    @Column(name = "TIPO_PERMISO")
    private String tipoPermiso;
    @Column(name = "PERMISO")
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
}
