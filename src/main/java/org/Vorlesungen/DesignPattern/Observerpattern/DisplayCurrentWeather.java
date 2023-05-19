package org.Vorlesungen.DesignPattern.Observerpattern;

public class DisplayCurrentWeather implements Observer{
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayCurrentWeather(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        update();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
    }
}
