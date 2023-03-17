package org.Vorlesungen.ExeptionHandeling;

public class Person {

    public Person(int alter){
        personenAlterKontrollieren(alter);
    }
    public static void personenAlterKontrollieren(int alter) {
        if (alter > 0 && alter < 150) {
            System.out.println("Die Person hat ein akzeptiertes alter");
        }
        else {
            throw new OutOfRangeException();
        }
    }
}
