package org.Vorlesungen.DesignPattern.Observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private double temperature, humidity, pressure;
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
