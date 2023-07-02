package org.Vorlesungen.Generics;

public class TestKlasse {
    public static void main(String[] args) {
        var pair1 = new Pair("Hallo", " Welt");
        var pair2 = new Pair(5, 3097d);
        print(pair1);
        System.out.println(sum(pair2));
    }

    public static void print(Pair<?,?> p) {
        System.out.println("(" + p.getValue1() + "," + p.getValue2() +")");
    }

    public static double sum(Pair<? extends Number, ? extends Number> p) {
        if (p.value1 instanceof Number && p.value2 instanceof Number) {
            return ((Number)p.getValue1()).doubleValue() + ((Number)p.getValue2()).doubleValue();
        }
        return 0;
    }
}
