package org.Vorlesungen.DesignPattern.DecoratorPattern.StarBucks;

public class Ingredient {
    private double price;
    private String description;

    public Ingredient(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public Ingredient() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
