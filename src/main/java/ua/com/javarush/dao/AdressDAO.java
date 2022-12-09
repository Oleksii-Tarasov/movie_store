package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Address;

public class AdressDAO extends GenericDAO<Address>{
    public AdressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
