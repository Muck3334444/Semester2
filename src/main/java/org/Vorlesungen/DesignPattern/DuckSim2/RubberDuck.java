package org.Vorlesungen.DesignPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz.FliegenRaketenBoost;
import org.Vorlesungen.DesignPattern.DuckSim2.NoiseKlassensatz.Quietsch;

public class RubberDuck extends Duck {

	public RubberDuck() {
		noisable = new Quietsch();
		flyable = new FliegenRaketenBoost();
	}
	@Override
	public void display() {
		System.out.println("This is a toy duck made of rubber.");
	}
}
