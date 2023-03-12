package service.Impl;

import model.Weather;
import service.WeatherService;

import java.util.Map;

import static service.ApiConstants.OK_STATUS_CODE;
import static service.ApiConstants.WRONG_STATUS_CODE;

public class WeatherServiceImpl implements WeatherService {

    @Override
    public Weather getByCityName(String city) {
        validateByCityName(city);

        WeatherResponse weatherResponse = fakeHttpClient(city.toLowerCase());

        Weather weather = null;
        if (weatherResponse.statusCode != WRONG_STATUS_CODE) {
            weather = weatherResponse.body;
        }

        return weather;
    }

    public WeatherResponse fakeHttpClient(String cityName) {

        var kyiv = new Weather("Kyiv", "UA", 20);
        var lviv = new Weather("Lviv", "UA", 22);
        var odesa = new Weather("Odesa", "UA", 25);
        var kharkiv = new Weather("Kharkiv", "UA", 18);

        Map<String, Weather> cities = Map.of("kyiv", kyiv,
                "lviv", lviv, "odesa", odesa, "kharkiv", kharkiv);

        var weather = cities.get(cityName);

        WeatherResponse weatherResponse = null;
        if (weather == null) {
            weatherResponse = new WeatherResponse(WRONG_STATUS_CODE, null);
        } else {
            weatherResponse = new WeatherResponse(OK_STATUS_CODE, weather);
        }
        return weatherResponse;
    }

    class WeatherResponse {
        int statusCode;
        Weather body;

        public WeatherResponse(int statusCode, Weather body) {
            this.statusCode = statusCode;
            this.body = body;
        }
    }

}
