package org.Vorlesungen.Generics.Container;

import java.util.HashSet;
import java.util.Set;

public class VerwaltungsClass {
    public static void main(String[] args) {
//        Lottozahlen lottozahlen = new Lottozahlen();
//        for (Integer i: lottozahlen.getLottoNumbers()) {
//            System.out.println(i);
//        }

        setWithEquals();
        setWithHash();
        setWithHashAndEquals();
    }

    public static void setWithParentClass(KlasseOhneEqualsAndHash class1, KlasseOhneEqualsAndHash class2) {
        Set<KlasseOhneEqualsAndHash> classWithIdSet = new HashSet<>();
        System.out.println("Hash wert class1: " + class1);
        System.out.println("Hash wert class2: " + class2 + "\n");

        classWithIdSet.add(class1);
        System.out.println("class1 eingefuegt");
        classWithIdSet.add(class2);

        System.out.println("class2 eingefuegt\n");

        System.out.println("class1 == class2 ist " + class1.equals(class2) + "\n");

        System.out.println("Anzahl Klassen im Set: " + classWithIdSet.size()+ "\n");

        System.out.println("Ids in den Klassen: ");
        for (KlasseOhneEqualsAndHash classWithId: classWithIdSet) {
            System.out.println("    " + classWithId.getId());
        }
    }

    public static void setWithEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit equals:\n");
        setWithParentClass(new KlasseMitIDOnlyWithEquals(402213),new KlasseMitIDOnlyWithEquals(402213));
    }

    public static void setWithHash() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit hash:\n");
        setWithParentClass(new KlasseMitIDOnlyWithHash(402213),new KlasseMitIDOnlyWithHash(402213));
    }

    public static void setWithHashAndEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit hash and equals:\n");
        setWithParentClass(new KlasseMitIDWithHashAndEquals(402213),new KlasseMitIDWithHashAndEquals(402213));
    }
}
