package org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz;

public class FlugzeugFliegen implements Flyable{
    @Override
    public void abheben() {
        System.out.println("Ich hebe ab durch meinen Turbinen");
    }

    @Override
    public void kurshalten() {
        System.out.println("Ich halte Kurs durch den Autopiloten");
    }

    @Override
    public void landen() {
        System.out.println("Ich lande auf der Landebahn");
    }
}
