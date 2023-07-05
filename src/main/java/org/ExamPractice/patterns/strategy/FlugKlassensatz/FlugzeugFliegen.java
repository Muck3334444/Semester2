package org.ExamPractice.patterns.strategy.FlugKlassensatz;

public class FlugzeugFliegen implements FlyingBehaviour {
    @Override
    public void abheben() {
        System.out.println("Das Flugzeug hebt ab");
    }

    @Override
    public void kurshalten() {
        System.out.println("Das Flugzeug hält kurs");
    }

    @Override
    public void landen() {
        System.out.println("Das Flugzeug landet sicher");
    }
}
