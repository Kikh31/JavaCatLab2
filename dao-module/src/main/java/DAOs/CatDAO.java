package DAOs;

import Entities.Cat;
import org.hibernate.Session;

public class CatDAO extends BaseDAO<Cat> {
    public CatDAO() {
        super(Cat.class);
    }
}
