package Ex3;

import Ex1.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDetails userDetails1 = new UserDetails();
        UserDetails userDetails2 = new UserDetails();

        Address address1 = new Address();
        Address address2 = new Address();

        Mobile mobile = new Mobile();
        Mobile mobile2 = new Mobile();
        Mobile mobile3 = new Mobile();
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(mobile);
        mobileList.add(mobile2);
        mobileList.add(mobile3);

        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        Vehicle vehicle3 = new Vehicle();
        Vehicle vehicle4 = new Vehicle();
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);

        List<UserDetails> userDetailsList = new ArrayList<>();

        address1.setCity("City1");
        address1.setStreet("Street1");
        address1.setUserDetails(userDetails1);

        address2.setCity("City2");
        address2.setStreet("Street2");
        address2.setUserDetails(userDetails2);

        mobile.setMobileNumber(123123123);
        mobile2.setMobileNumber(321321321);
        mobile3.setMobileNumber(987987987);
        mobile.setUserDetails(userDetails1);
        mobile2.setUserDetails(userDetails1);
        mobile3.setUserDetails(userDetails2);

        vehicle1.setName("VehicleName1");
        vehicle2.setName("VehicleName2");
        vehicle3.setName("VehicleName3");
        vehicle4.setName("VehicleName4");
        vehicle1.setUserDetailsList(userDetailsList);
        vehicle2.setUserDetailsList(userDetailsList);
        vehicle3.setUserDetailsList(userDetailsList);
        vehicle4.setUserDetailsList(userDetailsList);

        userDetails1.setUserName("UserName1");
        userDetails1.setAddress(address1);
        userDetails1.setMobileList(mobileList);
        userDetails1.setVehicleList(vehicleList);

        userDetails2.setUserName("UserName2");
        userDetails2.setAddress(address2);
        userDetails2.setVehicleList(vehicleList);

        userDetailsList.add(userDetails1);
        userDetailsList.add(userDetails2);

        final SessionFactory sessionFactory = Ex3.HibernateUtils.getSessionFactory();
        final Session session = sessionFactory.openSession();

        session.beginTransaction();
        session.save(userDetails1);
        session.save(userDetails2);
        session.save(address1);
        session.save(address2);
        session.persist(mobile);
        session.persist(mobile2);
        session.persist(mobile3);
        session.persist(vehicle1);
        session.persist(vehicle2);
        session.persist(vehicle3);
        session.persist(vehicle4);

/*
        Query from_userDetails = session.createQuery("from UserDetails where id = 1");
        List<UserDetails> resultList = from_userDetails.getResultList();
        resultList.forEach(userDetails -> System.out.println(userDetails.getUserName()));

        Query from_userDetails2 = session.createQuery("select sum(mobileNumber) from Mobile");
        long singleResult = (long) from_userDetails2.getSingleResult();
        System.out.println(singleResult);
*/



        session.getTransaction().commit();

        //session.refresh(address1);

        session.close();
        HibernateUtils.shutDownSession();
    }
}
