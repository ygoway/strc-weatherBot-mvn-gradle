package org.BotRun;

import service.Impl.WeatherServiceImpl;
import service.WeatherService;

public class AppMain {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherServiceImpl();

        System.out.println(weatherService.getByCityName("kyiv"));

    }
}
