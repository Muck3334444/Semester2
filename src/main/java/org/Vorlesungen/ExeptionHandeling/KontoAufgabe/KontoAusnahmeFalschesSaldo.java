package org.Vorlesungen.ExeptionHandeling.KontoAufgabe;

public class KontoAusnahmeFalschesSaldo extends KontoAusnahme{
    public KontoAusnahmeFalschesSaldo(){
        super("Betrag > Saldo aber speziell");
    }
}
