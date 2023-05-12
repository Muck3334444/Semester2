package org.Vorlesungen.DesignPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz.Fliegen;
import org.Vorlesungen.DesignPattern.DuckSim2.NoiseKlassensatz.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		noisable = new Quack();
		flyable = new Fliegen();
	}
	@Override
	public void display() {
		System.out.println("I am a Redhead duck.");
	}

}
