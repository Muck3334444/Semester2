package org.ExamPractice.patterns.observer;

public class Penguin implements Subject {

    private int fishEaten;

    public int getFishEaten() {
        return fishEaten;
    }

    public void setFishEaten(int fishEaten) {
        this.fishEaten = fishEaten;
    }

    public void eat() {
        fishEaten++;
        System.out.println("I ate a fish");
        notifyObservers();
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
