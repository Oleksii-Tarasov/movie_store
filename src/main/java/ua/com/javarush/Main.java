package ua.com.javarush;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import ua.com.javarush.domain.*;

import java.util.Properties;

public class Main {
    private final SessionFactory sessionFactory;
    public Main() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        hibernateProperties.put(Environment.DRIVER, "com.p6spy.engine.spy.P6SpyDriver");
        hibernateProperties.put(Environment.URL, "jdbc:p6spy:mysql://localhost:3306/movie");
        hibernateProperties.put(Environment.USER, "root");
        hibernateProperties.put(Environment.PASS, "root");
        hibernateProperties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        hibernateProperties.put(Environment.HBM2DDL_AUTO, "validate");

        sessionFactory = new Configuration()
                .addAnnotatedClass(Actor.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(City.class)
                .addAnnotatedClass(Country.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Film.class)
                .addAnnotatedClass(FilmText.class)
                .addAnnotatedClass(Inventory.class)
                .addAnnotatedClass(Language.class)
                .addAnnotatedClass(Payment.class)
                .addAnnotatedClass(Rental.class)
                .addAnnotatedClass(Staff.class)
                .addAnnotatedClass(Store.class)
                .addProperties(hibernateProperties)
                .buildSessionFactory();
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
