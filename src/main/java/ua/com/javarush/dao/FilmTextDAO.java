package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText>{
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}
