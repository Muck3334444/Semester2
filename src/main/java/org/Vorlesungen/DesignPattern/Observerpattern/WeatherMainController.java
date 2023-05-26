package org.Vorlesungen.DesignPattern.Observerpattern;

import org.Vorlesungen.DesignPattern.Observerpattern.Display.DisplayCurrentWeather;
import org.Vorlesungen.DesignPattern.Observerpattern.Display.DisplayForecast;
import org.Vorlesungen.DesignPattern.Observerpattern.Display.DisplayHeatIndex;
import org.Vorlesungen.DesignPattern.Observerpattern.Display.DisplayStatistic;

public class WeatherMainController {
    public static void main(String[] args) {
        WeatherData weatherData1 = new WeatherData(35,76.2,980.3);
        WeatherData weatherData2 = new WeatherData(27,53.2,1002.3);
        WeatherStation weatherStation = new WeatherStation();
        DisplayCurrentWeather dcw = new DisplayCurrentWeather(weatherStation);
        DisplayForecast df = new DisplayForecast(weatherStation);
        DisplayStatistic ds = new DisplayStatistic(weatherStation);
        DisplayHeatIndex dhi = new DisplayHeatIndex(weatherStation);
        weatherStation.setWeatherData(weatherData1);
        System.out.println("---------------------------------");
        weatherStation.setWeatherData(weatherData2);
    }
}
