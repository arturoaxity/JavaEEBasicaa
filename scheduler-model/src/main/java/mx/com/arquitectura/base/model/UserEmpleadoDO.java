package mx.com.arquitectura.base.model;

import javax.persistence.*;

@Entity
@Table(name = "K_USER")
public class UserEmpleadoDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_USER")
    private Long idUser;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PWD")
    private String pdw;
    @Column(name = "ID_PERMISO")
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
}
