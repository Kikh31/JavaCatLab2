package DAOs;

import Entities.Cat;
import Entities.Friendship;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class FriendshipDAO extends BaseDAO<Friendship> {
    public FriendshipDAO() {
        super(Friendship.class);
    }

    /*public List<Friendship> getFriendshipsOfCat(Cat cat) {
        Session session = sessionFactory.openSession();
        Query<Friendship> resQuery = session.createQuery("FROM Friendship WHERE cat = :pcat", Friendship.class);
        resQuery.setParameter("pcat", cat);
        session.close();
        return resQuery.list();
    }*/
}
