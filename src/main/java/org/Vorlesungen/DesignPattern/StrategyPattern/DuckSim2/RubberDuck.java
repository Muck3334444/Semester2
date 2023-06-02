package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.FlyKlassensatz.FlugzeugFliegen;
import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz.Quietsch;

public class RubberDuck extends Duck {

	public RubberDuck() {
		noisable = new Quietsch();
		flyable = new FlugzeugFliegen();
	}
	@Override
	public void display() {
		System.out.println("This is a toy duck made of rubber.");
	}
}
