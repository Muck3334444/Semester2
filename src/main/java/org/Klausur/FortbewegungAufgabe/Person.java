package org.Klausur.FortbewegungAufgabe;

import org.Klausur.FortbewegungAufgabe.FortbewegungsmittelKlassensatz.Fortbewegungsmittel;

public class Person {
    private Fortbewegungsmittel fortbewegungsmittel;

    public Person(Fortbewegungsmittel fortbewegungsmittel) {
        this.fortbewegungsmittel = fortbewegungsmittel;
    }

    public Person() {
        fortbewegungsmittel = null;
    }

    public Fortbewegungsmittel getFortbewegungsmittel() {
        return fortbewegungsmittel;
    }

    public void setFortbewegungsmittel(Fortbewegungsmittel fortbewegungsmittel) {
        this.fortbewegungsmittel = fortbewegungsmittel;
    }

    public void beschleunigen() {
        fortbewegungsmittel.beschleunigen();;
    }

    public void abbiegen() {
        fortbewegungsmittel.abbiegen();
    }

    public void bremsen() {
        fortbewegungsmittel.bremsen();
    }
}
