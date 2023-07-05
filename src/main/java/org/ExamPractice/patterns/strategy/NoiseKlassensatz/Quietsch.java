package org.ExamPractice.patterns.strategy.NoiseKlassensatz;

public class Quietsch implements Noisable {
    @Override
    public void makeNoise() {
        System.out.println("Quietsch");
    }
}
