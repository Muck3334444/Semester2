package org.Klausur.FortbewegungAufgabe;

import org.Klausur.FortbewegungAufgabe.FortbewegungsmittelKlassensatz.Auto;
import org.Klausur.FortbewegungAufgabe.FortbewegungsmittelKlassensatz.Fahrrad;

public class FortbewegungsTest {
    public static void main(String[] args) {
        Person person = new Person(new Auto());
        System.out.println("Bewegung mit Auto:");
        person.beschleunigen();
        person.bremsen();
        System.out.println("-------------------------");
        person.setFortbewegungsmittel(new Fahrrad());
        System.out.println("Bewegung mit dem Fahrrad:");
        person.beschleunigen();
        person.abbiegen();
    }
}
