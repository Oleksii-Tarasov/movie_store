package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Inventory;

public class InventoryDAO extends GenericDAO<Inventory>{
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}
