package org.Vorlesungen.Generics.Container;

import java.util.HashSet;
import java.util.Set;

public class VerwaltungsClass {
    public static void main(String[] args) {
//        Lottozahlen lottozahlen = new Lottozahlen();
//        for (Integer i: lottozahlen.getLottoNumbers()) {
//            System.out.println(i);
//        }

        SetWithEquals();
        SetWithHash();
        SetWithHashAndEquals();
    }

    public static void SetWithParentClass(KlasseOhneEqualsAndHash class1, KlasseOhneEqualsAndHash class2) {
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

    public static void SetWithEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit equals:\n");
        SetWithParentClass(new KlasseMitIDOnlyWithEquals(402213),new KlasseMitIDOnlyWithEquals(402213));
    }

    public static void SetWithHash() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit hash:\n");
        SetWithParentClass(new KlasseMitIDOnlyWithHash(402213),new KlasseMitIDOnlyWithHash(402213));
    }

    public static void SetWithHashAndEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("\nKlasse mit hash and equals:\n");
        SetWithParentClass(new KlasseMitIDWithHashAndEquals(402213),new KlasseMitIDWithHashAndEquals(402213));
    }
}
