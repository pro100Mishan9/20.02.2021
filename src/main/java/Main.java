import entities.MyEnum;
import entities.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setId(1);
        person.setFirstName("Andy");
        person.setSurname("King");
        person.setAge(22);
        person.setPesel(11231231233L);
        person.setaBoolean(true);
        person.setAddress("address1");
        person.setMyEnum(MyEnum.EUR);
        person.setBigDecimal(BigDecimal.valueOf(123123123));
        person.setInteger(45);

        final SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();

        session.close();
        HibernateUtils.shutDownSession();
    }
}
