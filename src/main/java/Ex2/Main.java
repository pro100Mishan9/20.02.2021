package Ex2;

import Ex1.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setType("type1");
        movie.setDescription("description1");
        movie.setTitle("title1");

        Movie movie2 = new Movie();
        movie2.setType("type2");
        movie2.setDescription("description2");
        movie2.setTitle("title2");



        final SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(movie);
        session.save(movie2);

        session.getTransaction().commit();

        session.close();
        HibernateUtils.shutDownSession();
    }
}
