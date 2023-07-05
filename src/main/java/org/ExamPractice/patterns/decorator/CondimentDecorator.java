package org.ExamPractice.patterns.decorator;

public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public CondimentDecorator() {
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double getCost() {
        if (beverage != null) {
            return super.getCost() + beverage.getCost();
        }
        return super.getCost();
    }

    @Override
    public String getDescription() {
        if (beverage != null) {
            return beverage.getDescription() + " " + super.getDescription();
        }
        return super.getDescription();
    }
}
