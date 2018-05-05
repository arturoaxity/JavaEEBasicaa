package mx.com.cinepolis.scheduler.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mx.com.arquitectura.base.model.UserDO;
import mx.com.cinepolis.scheduler.commons.to.CatalogsTO;
import mx.com.cinepolis.scheduler.commons.to.UserTO;
import mx.com.cinepolis.scheduler.data.persistence.dao.UserDAO;
import mx.com.cinepolis.scheduler.service.CatalogService;

import javax.inject.Inject;

public class CatalogServiceImpl implements CatalogService {

    @Inject
    private UserDAO userDAO;

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTO getUser() {
        UserTO userTO = new UserTO();
        userTO.setIdUser(1L);
        userTO.setName("Javier");
        userTO.setLogin("ArturoAxity");
        userTO.setAvatar_url("");
        userTO.setFollowers(5);
        userTO.setFollowing(9);
        return userTO;
    }

    @Override
    public List<CatalogsTO> getEstados(String pais) {
        List<CatalogsTO> catalogsTOList = new ArrayList<>();
        if (pais.equals("Mexico")) {
            catalogsTOList.add(new CatalogsTO() {{
                setId(1);
                setName("Puebla");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(2);
                setName("Tlaxcala");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(3);
                setName("CDMX");
            }});
        } else if (pais.equals("USA")) {
            catalogsTOList.add(new CatalogsTO() {{
                setId(1);
                setName("California");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(2);
                setName("New York");
            }});
            catalogsTOList.add(new CatalogsTO() {{
                setId(3);
                setName("Texas");
            }});
        }
        return catalogsTOList;
    }

    @Override
    public List<UserTO> getAllUser() {
        List<UserDO> doList = userDAO.findAll();
        return doList
                .stream()
                .map(x -> new UserTO() {{
                    setLogin(x.getLogin());
                    setFollowers(x.getFollowers());
                    setFollowing(x.getFollowing());
                    setAvatar_url(x.getAvatar_url());
                    setName(x.getName());
                    setIdUser(x.getIdUser());
                }})
                .collect(Collectors.toList());

    }

    @Override
    public UserTO addUser(UserTO userTO) {
        UserDO user = new UserDO();
        user.setIdUser(userTO.getIdUser());
        user.setLogin(userTO.getLogin());
        user.setName(userTO.getName());
        user.setAvatar_url(userTO.getAvatar_url());
        user.setFollowers(userTO.getFollowers());
        user.setFollowing(userTO.getFollowing());
       userDAO.create(user);
       return userTO;
    }

    @Override
    public boolean getAddUser(Long id) {
        if (id > 0 ) {
        userDAO.getById(id);
        return true;
        }
        return false;
    }



}
