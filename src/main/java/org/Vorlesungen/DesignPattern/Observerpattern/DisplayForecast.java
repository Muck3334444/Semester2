package org.Vorlesungen.DesignPattern.Observerpattern;

public class DisplayForecast implements Observer{
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayForecast(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        update();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
    }
}
