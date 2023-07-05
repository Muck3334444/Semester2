package org.ExamPractice.patterns.decorator;

public abstract class Beverage {
    private double cost;
    private String description;

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
