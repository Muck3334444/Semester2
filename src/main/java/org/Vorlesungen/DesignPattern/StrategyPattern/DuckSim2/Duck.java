package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.FlyKlassensatz.Flyable;
import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz.Noisable;

public abstract class Duck {
	Noisable noisable;
	Flyable flyable;

	public Noisable getNoisable() {
		return noisable;
	}

	public void setNoisable(Noisable noisable) {
		this.noisable = noisable;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public void swim() {
		System.out.println("Swimming");
	}

	public void makeNoise() {
		this.noisable.makeSound();
	}

	public void ascend() {
		this.flyable.abheben();
	}
	public void holdCourse() {
		this.flyable.kurshalten();
	}
	public void land() {
		this.flyable.landen();
	}
	public abstract void display();
}
