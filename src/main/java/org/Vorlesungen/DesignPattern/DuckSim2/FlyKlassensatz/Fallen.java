package org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz;

public class Fallen implements Flyable{
    @Override
    public void fly() {
        System.out.println("Kann nicht fliegen");
    }
}
