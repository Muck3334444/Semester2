package org.Vorlesungen.DesignPattern.ObserverPattern.Display;

import org.Vorlesungen.DesignPattern.ObserverPattern.Observer;
import org.Vorlesungen.DesignPattern.ObserverPattern.WeatherData;
import org.Vorlesungen.DesignPattern.ObserverPattern.WeatherStation;

public class DisplayCurrentWeather implements Observer {
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayCurrentWeather(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
        System.out.println("Current weather: " + weatherData.getHumidity() + " " + weatherData.getPressure() + " " + weatherData.getTemperature());
    }
}
