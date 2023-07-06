package org.Klausur.FuchsUndHaseObserverPattern;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    List<Observer> observers = new ArrayList<>();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
