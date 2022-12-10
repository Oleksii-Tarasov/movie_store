package ua.com.javarush.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RatingConverter implements AttributeConverter<Rating, String> {
    @Override
    public String convertToDatabaseColumn(Rating attribute) {
        return attribute.getValue();
    }

    @Override
    public Rating convertToEntityAttribute(String dbDate) {
        Rating[] ratings = Rating.values();

        for (Rating rating : ratings) {
            if (rating.getValue().equals(dbDate)) {
                return rating;
            }
        }
        
        return null;
    }
}
