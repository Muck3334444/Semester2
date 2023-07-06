package org.Klausur;

public class Zentralheizung {
    private final static Zentralheizung zentralheizung = new Zentralheizung();
    private double fuellstand;

    private Zentralheizung() {

    }

    public static Zentralheizung getInstance() {
        return zentralheizung;
    }

    public double getFuellstand() {
        return fuellstand;
    }

    public void setFuellstand(double fuellstand) {
        this.fuellstand = fuellstand;
    }
    public void hausHeizen() {
        System.out.println("Die Heizung wärmt das Haus mit " + getFuellstand() + " % der Energie");
    }
}
