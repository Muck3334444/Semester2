package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.FlyKlassensatz.NatuerlichesFliegen;
import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		noisable = new Quack();
		flyable = new NatuerlichesFliegen();
	}
	@Override
	public void display() {
		System.out.println("I am a Redhead duck.");
	}

}
