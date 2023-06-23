package org.Vorlesungen.DesignPattern.Singleton.ChocolateBoiler;

public class ChocyTest {
    public static void main(String[] args) {
        ChocolateBoilerStart chocolateBoilerStart = ChocolateBoilerStart.getInstance();
        ChocolateBoilerStart chocolateBoilerStart1 = ChocolateBoilerStart.getInstance();
        chocolateBoilerStart.fill();
        chocolateBoilerStart1.boil();
        chocolateBoilerStart.drain();
        System.out.println("---------------------------------");
        ChocolateBoilerEnum chocolateBoilerEnum = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        ChocolateBoilerEnum chocolateBoilerEnum1 = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        chocolateBoilerEnum.fill();
        chocolateBoilerEnum1.boil();
        chocolateBoilerEnum.drain();
    }
}
