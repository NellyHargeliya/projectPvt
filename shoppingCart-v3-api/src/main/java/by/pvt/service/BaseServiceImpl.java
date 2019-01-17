package by.pvt.service;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author nelli_kh
 */
public abstract class BaseServiceImpl<T> {

    private static Logger log = Logger.getLogger(BaseServiceImpl.class.getName());

    public abstract List<T> list();

}
