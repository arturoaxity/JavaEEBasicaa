package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.PermisosTO;
import mx.com.cinepolis.scheduler.commons.to.UserEmpleadoTO;
import mx.com.cinepolis.scheduler.service.EmployeManagementService;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
@LocalBean
public class EmployeManagementFacadeEJB {
    @Inject
    EmployeManagementService employeManagementService;

    public List<PermisosTO> getAllPermits(){
        return employeManagementService.getAllPermits();
    }
    public UserEmpleadoTO addUserEmployee(UserEmpleadoTO empleado){
       return employeManagementService.addUserEmployee(empleado);
    }
    public List<UserEmpleadoTO> getAllUserEmployee(){
        return  employeManagementService.getAllUserEmployee();
    }
    public String deleteUser(Long idUser){
        return employeManagementService.deleteUser(idUser);
    }
    public UserEmpleadoTO updateUser(UserEmpleadoTO empleado){
        return employeManagementService.updateUser(empleado);
    }
    public String loginUser(String user,String pass){
        return employeManagementService.loginUser(user,pass);
    }
}
