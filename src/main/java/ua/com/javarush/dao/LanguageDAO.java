package ua.com.javarush.dao;

import org.hibernate.SessionFactory;
import ua.com.javarush.domain.Language;

public class LanguageDAO extends GenericDAO<Language>{
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
