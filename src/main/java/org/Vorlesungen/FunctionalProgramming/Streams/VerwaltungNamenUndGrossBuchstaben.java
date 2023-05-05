package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.*;

public class VerwaltungNamenUndGrossBuchstaben {
    public static void main(String[] args) {
        List<Person> personen = Arrays.asList(
                new Person("guenther guentherson", new GregorianCalendar(2000, Calendar.FEBRUARY, 15)),
                new Person("peter peterson", new GregorianCalendar(2000, Calendar.MARCH, 2)),
                new Person("Alexander Patola", new GregorianCalendar(2002, Calendar.DECEMBER, 7)),
                new Person("Joel Wolber", new GregorianCalendar(2004, Calendar.FEBRUARY, 23)));
        String [] personenNamen = personen.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .sorted()
                .toArray(String[]::new);
        for (String s: personenNamen) {
            System.out.println(s);
        }
    }
}
