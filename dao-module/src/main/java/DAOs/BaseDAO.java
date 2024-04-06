package DAOs;

import Hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public abstract class BaseDAO<T> {
    private final Class<T> tClass;
    private final SessionFactory sessionFactory;

    public BaseDAO(Class<T> _tClass) {
        tClass = _tClass;
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public T getById(Integer id) {
        Session session = sessionFactory.openSession();
        T t = session.get(tClass, id);
        session.close();
        return t;
    }

    public List<T> getAll() {
        Session session = sessionFactory.openSession();
        List<T> resList = session.createQuery("FROM " + tClass.getSimpleName(), tClass).list();
        session.close();
        return resList;
    }

    public Long getCount() {
        Session session = sessionFactory.openSession();
        Long resCount = (Long) session.createQuery("SELECT COUNT(*) FROM " + tClass.getSimpleName()).uniqueResult();
        session.close();
        return resCount;
    }

    public void save(T entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(T entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(T entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }
}
