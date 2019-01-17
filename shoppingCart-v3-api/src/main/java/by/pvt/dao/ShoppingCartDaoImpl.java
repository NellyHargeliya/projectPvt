package by.pvt.dao;

import by.pvt.model.shoppingcart.ShoppingCart;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Repository
public class ShoppingCartDaoImpl extends BaseDaoImpl{

    private static Logger log = Logger.getLogger(ShoppingCartDaoImpl.class.getName());

    private Class<ShoppingCart> tClass = ShoppingCart.class;

    @Autowired
    public ShoppingCartDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<ShoppingCart> getAll() {
        log.info("Call getAll()");
        return openSession().createQuery("from ShoppingCart").list();
    }

    public void save(ShoppingCart item) {
        openSession().saveOrUpdate(item);
    }

    @Override
    public ShoppingCart get(Serializable id) {
        return openSession().find(tClass, id);
    }

}
