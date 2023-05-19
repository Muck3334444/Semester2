package org.Vorlesungen.DesignPattern.Observerpattern;

public class DisplayStatistic implements  Observer{
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public DisplayStatistic(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        update();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        weatherData = weatherStation.getWeatherData();
    }
}
