package org.Vorlesungen.DesignPattern.Observerpattern.Display;

import org.Vorlesungen.DesignPattern.Observerpattern.Observer;
import org.Vorlesungen.DesignPattern.Observerpattern.WeatherData;
import org.Vorlesungen.DesignPattern.Observerpattern.WeatherStation;

public class DisplayForecast implements Observer {
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayForecast(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
        System.out.println("Forecast: " + weatherData.getHumidity() + " " + weatherData.getPressure() + " " + weatherData.getTemperature());
    }
}
