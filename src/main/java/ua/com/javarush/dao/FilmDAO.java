package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Film;

public class FilmDAO extends GenericDAO<Film>{
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
