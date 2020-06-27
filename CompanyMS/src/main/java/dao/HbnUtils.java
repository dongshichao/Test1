package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbnUtils {
    private static SessionFactory sessionFactory;
    public static Session getSession(){
        return getSessionFactory().getCurrentSession();
    }
    //单例模式
    private static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        return sessionFactory;
    }
}
