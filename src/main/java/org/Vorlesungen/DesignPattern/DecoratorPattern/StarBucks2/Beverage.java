package org.Vorlesungen.DesignPattern.DecoratorPattern.StarBucks2;

public abstract class Beverage {
    private boolean milk, soy;

    public Beverage(boolean milk, boolean soy) {
        this.milk = milk;
        this.soy = soy;
    }

    public Beverage() {
    }

    public double cost() {
        double price = 0;
        if (milk) { price += 0.5; }
        if (soy) { price += 0.7; }
        return price;
    }
    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }
}
