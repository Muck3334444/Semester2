package org.Vorlesungen.ExeptionHandeling.KontoAufgabe;

public class Test1 {
	// folgende Zeile fuehrt zu Compiler-Fehler
	//public static void main(String[] args) {
	public static void main(String[] args) throws KontoAusnahme {
		// Ausnahmen vom Typ KontoAusnahme werden weitergereicht
		// und f�hren zum Abbruch des Programms.
		Konto kto = new Konto(4711, 500);
		kto.zahleAus(1000);
		kto.info();
	}
}
