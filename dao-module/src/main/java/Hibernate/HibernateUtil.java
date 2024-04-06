package Hibernate;

import Entities.Cat;
import Entities.Friendship;
import Entities.Owner;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Owner.class)
                    .addAnnotatedClass(Cat.class)
                    .addAnnotatedClass(Friendship.class);
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
