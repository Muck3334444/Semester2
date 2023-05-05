package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class VerwaltungGeburtsMonat {
    public static void main(String[] args) {
        List<Person> personen = Arrays.asList(
                new Person("Guenther Guentherson", new GregorianCalendar(2000, Calendar.FEBRUARY, 15)),
                new Person("Peter Peterson", new GregorianCalendar(2000, Calendar.MARCH, 2)),
                new Person("Alexander Patola", new GregorianCalendar(2002, Calendar.DECEMBER, 7)),
                new Person("Joel Wolber", new GregorianCalendar(2004, Calendar.FEBRUARY, 23)));
        System.out.println(personen.stream()
                .filter(x->x.getBirthday().get(Calendar.MONTH) == Calendar.FEBRUARY)
                .map(Person::getName)
                .reduce((a,b) -> a + ", "+ b).get());
    }
}
