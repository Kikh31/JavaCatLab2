package DAOs;

import Entities.Owner;
import org.hibernate.Session;

public class OwnerDAO extends BaseDAO<Owner> {
    public OwnerDAO() {
        super(Owner.class);
    }
}
