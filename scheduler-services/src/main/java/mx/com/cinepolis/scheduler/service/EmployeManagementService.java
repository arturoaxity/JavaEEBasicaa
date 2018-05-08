package mx.com.cinepolis.scheduler.service;

import mx.com.cinepolis.scheduler.commons.to.PermisosTO;
import mx.com.cinepolis.scheduler.commons.to.UserEmpleadoTO;

import java.util.List;

public interface EmployeManagementService {

    List<PermisosTO> getAllPermits();
    UserEmpleadoTO addUserEmployee(UserEmpleadoTO empleado);
    List<UserEmpleadoTO> getAllUserEmployee();
    String deleteUser(Long idUser);
    UserEmpleadoTO updateUser(UserEmpleadoTO empleado);
    String loginUser(String user, String pass);
}
