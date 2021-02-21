package Ex1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Id;


public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setId(1);
        worker1.setName("Andy");
        worker1.setSurname("King");
        worker1.setPosition("Engineer");
        worker1.setExperience(5);
        worker1.setSalary(100000);

        Worker worker2 = new Worker();
        worker2.setId(2);
        worker2.setName("Monika");
        worker2.setSurname("Rizana");
        worker2.setPosition("Secretary");
        worker2.setExperience(2);
        worker2.setSalary(25000);

        final SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(worker1);
        session.save(worker2);
        session.getTransaction().commit();

        session.beginTransaction();

        Worker otherWorker = session.find(Worker.class, 2L);
        otherWorker.setSalary(otherWorker.getSalary()* 2);
        session.save(otherWorker);
        session.getTransaction().commit();

        session.close();
        HibernateUtils.shutDownSession();


    }
}
