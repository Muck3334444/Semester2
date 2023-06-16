package org.Vorlesungen.DesignPattern.DecoratorPattern.StarBucks2;

public class DarkRoast extends Beverage{
    public DarkRoast(boolean milk, boolean soy) {
        super(milk, soy);
    }
    public DarkRoast() {

    }
    @Override
    public double cost() {
        return super.cost() + 1.2;
    }
}
