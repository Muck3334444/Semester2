package org.Vorlesungen.DesignPattern.Singleton.ChocolateBoiler;

public class ChocolateBoilerStart {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerStart singleton;

    private ChocolateBoilerStart() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerStart getInstance(){
        if (singleton == null) {
            singleton = new ChocolateBoilerStart();
        }
        return singleton;
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
