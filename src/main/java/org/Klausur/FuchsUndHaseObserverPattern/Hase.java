package org.Klausur.FuchsUndHaseObserverPattern;

public class Hase implements Subject{
    private String lastAction;
    public void move() {
        System.out.println("Der Hase bewegt sich");
        lastAction = "Movement";
        notifyObservers();
    }
    public void eat() {
        System.out.println("Der Hase isst");
        lastAction = "Eat";
        notifyObservers();
    }
    public void sleep() {
        System.out.println("Der Hase schläft");
        lastAction = "Sleep";
        notifyObservers();
    }

    public String getLastAction() {
        return lastAction;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
