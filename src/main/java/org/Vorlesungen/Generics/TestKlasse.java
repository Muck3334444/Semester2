package org.Vorlesungen.Generics;

public class TestKlasse {
    public static void main(String[] args) {
        var pair1 = new Pair("Hallo", " Welt");
        var pair2 = new Pair(5, 3097);
        print(pair1);
        System.out.println(sum(pair2 ));
    }

    public static void print(Pair<?,?> p) {
        System.out.println("(" + p.getValue1() + "," + p.getValue2() +")");
    }

    public static double sum(Pair<? extends Number, ? extends Number> p) {
        return p.getValue1().doubleValue() + p.getValue2().doubleValue();
    }
}
