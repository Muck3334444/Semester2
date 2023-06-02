package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz;

public class Quack implements Noisable {
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
