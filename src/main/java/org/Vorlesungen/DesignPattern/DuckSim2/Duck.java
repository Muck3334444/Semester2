package org.Vorlesungen.DesignPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz.Flyable;
import org.Vorlesungen.DesignPattern.DuckSim2.NoiseKlassensatz.Noisable;

public abstract class Duck {
	public Noisable noisable;
	public Flyable flyable;
	public void swim() {
		System.out.println("Swimming");
	}

	public void makeNoise() {
		this.noisable.makeSound();
	}

	public void fly() {
		this.flyable.fly();
	}
	public abstract void display();
}
