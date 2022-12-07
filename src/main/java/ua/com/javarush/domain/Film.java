package ua.com.javarush.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "movie", name = "film")
public class Film {
    @Id
    @Column(name = "film_id")
    private Short id;
}
