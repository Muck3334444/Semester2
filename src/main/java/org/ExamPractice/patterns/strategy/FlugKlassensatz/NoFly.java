package org.ExamPractice.patterns.strategy.FlugKlassensatz;

public class NoFly implements FlyingBehaviour{
    @Override
    public void abheben() {
        System.out.println("Mit vollem anlauf hinfliegen");
    }

    @Override
    public void kurshalten() {
        System.out.println("Kurshalten nur auf dem Boden");
    }

    @Override
    public void landen() {
        System.out.println("Mit dem Gesicht landen");
    }
}
