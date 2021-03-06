package Ex3;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class HibernateUtils {

    private static final SessionFactory sessionFactory = createSessionFactory();

    private static SessionFactory createSessionFactory() {
        return new Configuration().configure(new File
                ("C:\\files\\SDA\\20.02.2021\\src\\main\\resources\\Ex3.cfg.xml")).buildSessionFactory();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutDownSession(){
        sessionFactory.close();
    }
}
