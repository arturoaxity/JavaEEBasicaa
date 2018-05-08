package mx.com.cinepolis.scheduler.data.persistence.dao.impl;
import mx.com.arquitectura.arquitectura.persistence.impl.BaseDAOImpl;
import mx.com.arquitectura.base.model.UserEmpleadoDO;
import mx.com.cinepolis.scheduler.data.persistence.UserEmpleadoDAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserEmpledoDAOImpl extends  BaseDAOImpl<UserEmpleadoDO, Long> implements UserEmpleadoDAO {
    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}
