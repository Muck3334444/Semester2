package org.Klausur.FuchsUndHaseObserverPattern;

public class Fuchstest {
    public static void main(String[] args) {
        Hase hase = new Hase();
        Fuchs fuchs = new Fuchs(hase);
        hase.eat();
        hase.sleep();
        hase.move();
    }
}
