package org.Vorlesungen.DesignPattern.ObserverPattern;

import java.util.List;

public class WeatherStation implements Subject{
    private WeatherData weatherData;
    public WeatherStation() {
        weatherData = new WeatherData();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            observer.update();
        }
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        measurementsChanged();
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
