package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Customer;

public class CustomerDAO extends GenericDAO<Customer>{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
