package org.Vorlesungen.DesignPattern.DuckSim2;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.swim();
		mallard.display();
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.makeNoise();
		rubberDuck.display();
		rubberDuck.fly();
	}

}
