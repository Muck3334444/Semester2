package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.FlyKlassensatz.NatuerlichesFliegen;
import org.Vorlesungen.DesignPattern.StrategyPattern.DuckSim2.NoiseKlassensatz.Quack;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I am a Mallard duck.");
	}

	public MallardDuck() {
		noisable = new Quack();
		flyable = new NatuerlichesFliegen();
	}
}
