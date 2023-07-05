package org.ExamPractice.patterns.strategy.FlugKlassensatz;

public class NatuerlichesFliegen implements FlyingBehaviour {
    @Override
    public void abheben() {
        System.out.println("Mit Anlauf und viel Flügel schlagen wird abgehoben");
    }

    @Override
    public void kurshalten() {
        System.out.println("Auf den Luftströmungen wird der Kurs gehalten");
    }

    @Override
    public void landen() {
        System.out.println("Landen nach einem anstrengenden Flug");
    }
}
