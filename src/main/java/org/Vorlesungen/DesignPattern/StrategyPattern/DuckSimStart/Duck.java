package org.Vorlesungen.DesignPattern.StrategyPattern.DuckSimStart;

public abstract class Duck {
	
	public void quack() {
		System.out.println("Quacking");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void fly() {
		System.out.println("Flying");
	}
	
	public abstract void display();
}
