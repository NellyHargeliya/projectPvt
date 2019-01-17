package by.pvt.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author nelli_kh
 */
@MappedSuperclass
public class BasePojo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

}
