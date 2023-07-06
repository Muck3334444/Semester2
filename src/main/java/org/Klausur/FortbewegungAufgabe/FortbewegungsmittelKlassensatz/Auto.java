package org.Klausur.FortbewegungAufgabe.FortbewegungsmittelKlassensatz;

public class Auto implements Fortbewegungsmittel{
    @Override
    public void beschleunigen() {
        System.out.println("Auf das Gaspedall drücken und Schalten");
    }

    @Override
    public void abbiegen() {
        System.out.println("Blinker setzen und geschwindigkeit drosseln");
    }

    @Override
    public void bremsen() {
        System.out.println("Das bremspedall drücken und die Kupplung durchdrücken");
    }
}
