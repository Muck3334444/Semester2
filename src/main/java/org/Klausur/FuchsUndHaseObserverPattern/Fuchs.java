package org.Klausur.FuchsUndHaseObserverPattern;

public class Fuchs implements Observer{
    private Hase hase;
    public Fuchs(Hase hase) {
        this.hase = hase;
        hase.addObserver(this);
    }
    @Override
    public void update() {
        if (hase.getLastAction().equals("Movement")) {
            System.out.println("A fox attacks");
        }
    }
}
