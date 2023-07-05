package org.ExamPractice.patterns.strategy.NoiseKlassensatz;

public class Quack implements Noisable {
    @Override
    public void makeNoise() {
        System.out.println("Quack Quack Quack");
    }
}
