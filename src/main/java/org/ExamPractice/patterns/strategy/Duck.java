package org.ExamPractice.patterns.strategy;

import org.ExamPractice.patterns.strategy.FlugKlassensatz.FlyingBehaviour;
import org.ExamPractice.patterns.strategy.NoiseKlassensatz.Noisable;

public class Duck {
    private FlyingBehaviour flyingBehaviour;
    private Noisable noisable;

    public Duck(FlyingBehaviour flyingBehaviour, Noisable noisable) {
        this.flyingBehaviour = flyingBehaviour;
        this.noisable = noisable;
    }

    public Duck() {
        flyingBehaviour = null;
        noisable = null;
    }

    public FlyingBehaviour getFlyingBehaviour() {
        return flyingBehaviour;
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public Noisable getNoisable() {
        return noisable;
    }

    public void setNoisable(Noisable noisable) {
        this.noisable = noisable;
    }

    public void makeNoise() {
        if (noisable != null){
            noisable.makeNoise();
        }
    }

    public void abheben() {
        if (flyingBehaviour != null){
            flyingBehaviour.abheben();
        }
    }

    public void kurshalten() {
        if (flyingBehaviour != null){
            flyingBehaviour.kurshalten();
        }
    }

    public void landen() {
        if (flyingBehaviour != null){
            flyingBehaviour.landen();
        }
    }
}
