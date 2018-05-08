package mx.com.cinepolis.scheduler.service.impl;

import mx.com.arquitectura.base.model.PermisosDO;
import mx.com.arquitectura.base.model.UserEmpleadoDO;
import mx.com.cinepolis.scheduler.commons.to.PermisosTO;
import mx.com.cinepolis.scheduler.commons.to.UserEmpleadoTO;
import mx.com.cinepolis.scheduler.data.persistence.PermisosDAO;
import mx.com.cinepolis.scheduler.data.persistence.UserEmpleadoDAO;
import mx.com.cinepolis.scheduler.data.persistence.constants.Constants;
import mx.com.cinepolis.scheduler.service.EmployeManagementService;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeManagementServiceImpl implements EmployeManagementService {

    @Inject
    UserEmpleadoDAO empleadoDAO;
    @Inject
    PermisosDAO permisosDAO;

    Function<UserEmpleadoDO, UserEmpleadoTO> function = e -> new UserEmpleadoTO() {{
        setIdUser(e.getIdUser());
        setUsuario(e.getUsuario());
        setNombre(e.getNombre());
        setPdw(e.getPdw());
        setIdPermiso(e.getIdPermiso());
    }};

    @Override
    public List<PermisosTO> getAllPermits() {
        Function<PermisosDO, PermisosTO> function = f -> new PermisosTO() {{
            setIdPermiso(f.getIdPermiso());
            setTipoPermiso(f.getTipoPermiso());
            setPermiso(f.getPermiso());
        }};
        List<PermisosTO> permisos = permisosDAO.findAll().stream().map(function).collect(Collectors.toList());
        return permisos;
    }

    @Override
    public UserEmpleadoTO addUserEmployee(UserEmpleadoTO empleado) {
        UserEmpleadoDO empleadoDO = new UserEmpleadoDO();
        empleadoDO.setIdUser(empleado.getIdUser());
        empleadoDO.setUsuario(empleado.getUsuario());
        empleadoDO.setNombre(empleado.getNombre());
        empleadoDO.setPdw(empleado.getPdw());
        empleadoDO.setIdPermiso(empleado.getIdPermiso());
        empleadoDAO.create(empleadoDO);
        return empleado;
    }
    @Override
    public List<UserEmpleadoTO> getAllUserEmployee() {
        List<UserEmpleadoTO> empleados = empleadoDAO.findAll().stream().map(function).collect(Collectors.toList());
        return empleados;
    }

    @Override
    public String deleteUser(Long idUser) {
        String menssaje = "usuario Eliminado Correctamente";
        if (idUser < 0) {
            menssaje = "Error al Eliminar";
        }
        empleadoDAO.delete(idUser);
        return menssaje;
    }

    @Override
    public UserEmpleadoTO updateUser(UserEmpleadoTO empleado) {
        UserEmpleadoDO empleadoDO = new UserEmpleadoDO();
        empleadoDO.setIdUser(empleado.getIdUser());
        empleadoDO.setUsuario(empleado.getUsuario());
        empleadoDO.setNombre(empleado.getNombre());
        empleadoDO.setPdw(empleado.getPdw());
        empleadoDO.setIdPermiso(empleado.getIdPermiso());
        empleadoDAO.update(empleadoDO);
        empleadoDAO.flush();
        return empleado;
    }

    @Override
    public String loginUser(String user,String pass) {
        String menssage = "listo";
        UserEmpleadoDO byColumn = empleadoDAO.getByColumn(Constants.COLUMNA_USUARIO, UserEmpleadoDO.class, user);
        if (byColumn.getUsuario().trim().equals(user.trim()) && byColumn.getPdw().trim().equals(pass.trim())){
            return menssage;
        }
        return null;
    }

}
