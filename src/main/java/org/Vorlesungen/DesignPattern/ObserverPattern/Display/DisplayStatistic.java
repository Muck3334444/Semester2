package org.Vorlesungen.DesignPattern.ObserverPattern.Display;

import org.Vorlesungen.DesignPattern.ObserverPattern.Observer;
import org.Vorlesungen.DesignPattern.ObserverPattern.WeatherData;
import org.Vorlesungen.DesignPattern.ObserverPattern.WeatherStation;

public class DisplayStatistic implements Observer {
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayStatistic(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
        System.out.println("Statistics: " + weatherData.getHumidity() + " " + weatherData.getPressure() + " " + weatherData.getTemperature());
    }
}
