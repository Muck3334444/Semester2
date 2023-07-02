package org.Vorlesungen.FunctionalProgramming.Lambdas;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.function.Predicate;

public class TerminVerwaltung {
    public static void main(String[] args) {
        Termin[] termine = new Termin[]{
                new Termin("Meeting1", "Jupiter", Calendar.getInstance()),
                new Termin("Meeting2", "Merkur", Calendar.getInstance()),
                new Termin("Mee", "Pluto", Calendar.getInstance())
        };

        termine[2].getZeit().add(Calendar.HOUR,30);
        termine[1].getZeit().add(Calendar.DATE,30);

        System.out.println();
        sortTerminArray(termine, (t1,t2) -> t1.getZeit().getTimeInMillis() > t2.getZeit().getTimeInMillis() ? 1 : -1);
        printTermine(termine, t -> t.getBeschreibung().length() > 3);

    }

    private static void sortTerminArray(Termin[] termine, Comparator<Termin> comparable) {
        Arrays.sort(termine, comparable);
    }

    private static void printTermine(Termin[] termine, Predicate<Termin> kriterium) {
        for (Termin termin: termine) {
            if (kriterium.test(termin)) {
                System.out.println(termin.toString());
            }
        }
    }
}
