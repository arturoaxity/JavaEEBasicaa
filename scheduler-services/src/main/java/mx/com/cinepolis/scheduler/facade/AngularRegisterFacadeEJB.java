package mx.com.cinepolis.scheduler.facade;

import mx.com.cinepolis.scheduler.commons.to.RegistrarUserTO;
import mx.com.cinepolis.scheduler.service.AngularServiceRegister;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
@LocalBean
public class AngularRegisterFacadeEJB {

    @Inject
    AngularServiceRegister serviceRegister;

    public RegistrarUserTO RegisterUser(RegistrarUserTO registrarUserTO){
        return serviceRegister.registerUser(registrarUserTO);
    }
}
