package by.pvt.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * @author nelli_kh
 */
public abstract class BaseDaoImpl<T> {
    @Autowired
    SessionFactory sessionFactory;

    Session openSession() {
        return sessionFactory.getCurrentSession();
    }

    public abstract List<T> getAll();

    public boolean add(List<T> items) {
        return false;
    }

    abstract T get(Serializable id);

    public void save(T item) {
        openSession().saveOrUpdate(item);
    }

    public void update(T item) {
        openSession().update(item);
    }

    public void delete(T item) {
        openSession().delete(item);
    }

}
