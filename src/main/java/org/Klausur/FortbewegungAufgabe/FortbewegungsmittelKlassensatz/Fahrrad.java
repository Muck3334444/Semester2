package org.Klausur.FortbewegungAufgabe.FortbewegungsmittelKlassensatz;

public class Fahrrad implements Fortbewegungsmittel{
    @Override
    public void beschleunigen() {
        System.out.println("Schnell in die Pedalle treten");
    }

    @Override
    public void abbiegen() {
        System.out.println("Mit dem Lenker in die Richtung drehen und Gewicht verlagern");
    }

    @Override
    public void bremsen() {
        System.out.println("Die bremse ziehen und Ruecktritt ausfuehren");
    }
}
