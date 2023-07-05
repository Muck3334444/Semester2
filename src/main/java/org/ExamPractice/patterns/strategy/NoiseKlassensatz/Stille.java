package org.ExamPractice.patterns.strategy.NoiseKlassensatz;

public class Stille implements Noisable {
    @Override
    public void makeNoise() {
        System.out.println("...");
    }
}
