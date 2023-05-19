package org.Vorlesungen.DesignPattern.Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private WeatherData weatherData;
    final private List<Observer> observerList;

    public WeatherStation() {
        weatherData = new WeatherData();
        observerList = new ArrayList<>();
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
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void measurementsChanged(){
        notifyObservers();
    }
}
