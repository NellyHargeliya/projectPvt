package by.pvt.service;

import by.pvt.dao.ShoppingCartDaoImpl;
import by.pvt.model.shoppingcart.ShoppingCart;
import by.pvt.model.shoppingcart.ShoppingCartUpdate;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author nelli_kh
 */
@Service
@Transactional
public class ShoppingCartServiceImpl extends BaseServiceImpl {

    private static Logger log = Logger.getLogger(ShoppingCartServiceImpl.class.getName());

    private ShoppingCartDaoImpl shoppingCartDao;


    public ShoppingCartServiceImpl(ShoppingCartDaoImpl shoppingCartDao) {
        this.shoppingCartDao = shoppingCartDao;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<ShoppingCart> list() {
        log.info("shoppingCartDao: " + shoppingCartDao);
        return shoppingCartDao.getAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    @SuppressWarnings("unchecked")
    public void save(ShoppingCart item) {
        log.info("save(): " + item);
        shoppingCartDao.save(item);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(Serializable id, ShoppingCartUpdate shoppingCartUpdate) {
        ShoppingCart shoppingCart = shoppingCartDao.get(id);
        BeanUtils.copyProperties(shoppingCartUpdate, shoppingCart);
        shoppingCartDao.save(shoppingCart);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    @SuppressWarnings("unchecked")
    public void create(List<ShoppingCart> items) {
        log.info("create(): " + items);
        for (ShoppingCart t : items) {
            shoppingCartDao.save(t);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public ShoppingCart retrieve(Serializable id) {
        return shoppingCartDao.get(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOne(ShoppingCart item) {
        shoppingCartDao.save(item);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(Serializable id) {
        ShoppingCart item = shoppingCartDao.get(id);
        shoppingCartDao.delete(item);
    }

}
