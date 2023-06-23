package org.Vorlesungen.DesignPattern.Singleton.ChocolateBoiler;

public enum ChocolateBoilerEnum {
    UNIQUE_INSTANCE;
    private boolean empty;
    private boolean boiled;

    ChocolateBoilerEnum() {
        empty = true;
        boiled = false;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filled boiler");
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            boiled = false;
            System.out.println("Drain Chocy");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            System.out.println("Boil chocy");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
