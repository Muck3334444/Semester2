package org.Vorlesungen.DesignPattern.DuckSim2;

import org.Vorlesungen.DesignPattern.DuckSim2.FlyKlassensatz.FlugzeugFliegen;

public class DuckTest {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.ascend();
		mallard.holdCourse();
		mallard.land();
		System.out.println();
		mallard.setFlyable(new FlugzeugFliegen());
		mallard.ascend();
		mallard.holdCourse();
	}

}
