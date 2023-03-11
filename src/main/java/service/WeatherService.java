package service;

import exceptions.IncorrectCityNameException;

import static service.ApiConstants.CITY_REGEX;

public interface WeatherService {

    Weather getByCityName(String city);

    default void validateByCityName(String city) {
        if (city.matches(CITY_REGEX)) {
            throw new IncorrectCityNameException(String.format("Incorrect city name %s", city));
        }
    }
}
