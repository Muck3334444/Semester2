package org.Vorlesungen.DesignPattern.DuckSim2.NoiseKlassensatz;

public class Stille implements Noisable {
    @Override
    public void makeSound() {
        System.out.println("...");
    }
}
