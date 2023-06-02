package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz;

public class Stille implements Noisable {
    @Override
    public void makeSound() {
        System.out.println("...");
    }
}
