package org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz;

public class NatuerlichesFliegen implements Flyable{
    @Override
    public void abheben() {
        System.out.println("Ich hebe ab mit meinen Flügeln");
    }

    @Override
    public void kurshalten() {
        System.out.println("Ich halte Kurs");
    }

    @Override
    public void landen() {
        System.out.println("Ich lande auf dem Wasser");
    }
}
