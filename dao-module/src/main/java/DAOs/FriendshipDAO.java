package DAOs;

import Entities.Friendship;
import org.hibernate.Session;

public class FriendshipDAO extends BaseDAO<Friendship> {
    public FriendshipDAO() {
        super(Friendship.class);
    }
}
