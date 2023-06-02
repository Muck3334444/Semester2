package org.Vorlesungen.DesignPattern.ObserverPattern;

import org.Vorlesungen.DesignPattern.ObserverPattern.Display.DisplayCurrentWeather;
import org.Vorlesungen.DesignPattern.ObserverPattern.Display.DisplayForecast;
import org.Vorlesungen.DesignPattern.ObserverPattern.Display.DisplayHeatIndex;
import org.Vorlesungen.DesignPattern.ObserverPattern.Display.DisplayStatistic;

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
