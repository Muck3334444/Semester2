package org.Vorlesungen.DesignPattern.StarBucks2;

public class StarSucksVerwaltung {
    public static void main(String[] args) {
        DarkRoast darkRoastWithMilk = new DarkRoast(true, false);
        DarkRoast darkRoastWithSoy = new DarkRoast(false, true);
        DarkRoast darkRoastWithMilkAndSoy = new DarkRoast(true, true);
        DarkRoast darkRoast = new DarkRoast();

        System.out.println("Dark roast with milk: " + darkRoastWithMilk.cost() + "\n");
        System.out.println("Dark roast with soy: " + darkRoastWithSoy.cost() + "\n");
        System.out.println("Dark roast with milk and soy: " + darkRoastWithMilkAndSoy.cost() + "\n");
        System.out.println("Dark roast: " + darkRoast.cost() + "\n");
    }
}
