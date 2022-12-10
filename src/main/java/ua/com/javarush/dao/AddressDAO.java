package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Address;

public class AddressDAO extends GenericDAO<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
