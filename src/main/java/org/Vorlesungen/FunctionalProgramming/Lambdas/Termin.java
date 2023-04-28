package org.Vorlesungen.FunctionalProgramming.Lambdas;

import java.util.Calendar;
import java.util.Date;

public class Termin {
    private String beschreibung;
    private String ort;
    private Calendar zeit;

    public Termin(String beschreibung, String ort, Calendar zeit) {
        this.beschreibung = beschreibung;
        this.ort = ort;
        this.zeit = zeit;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Calendar getZeit() {
        return zeit;
    }

    public void setZeit(Calendar zeit) {
        this.zeit = zeit;
    }

    @Override
    public String toString() {
        return "Termin{" +
                "beschreibung='" + beschreibung + '\'' +
                ", ort='" + ort + '\'' +
                ", zeit=" + zeit.getTime() +
                '}';
    }
}
