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

    public static void SetWithHashAndEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("Klasse mit hash and equals:\n");
        Set<KlasseMitIDWithHashAndEquals> classWithIdSet = new HashSet<>();
        KlasseMitIDWithHashAndEquals classWithId1 = new KlasseMitIDWithHashAndEquals(402213);
        KlasseMitIDWithHashAndEquals classWithId2 = new KlasseMitIDWithHashAndEquals(402213);
        System.out.println("Hash wert class1: " + classWithId1);
        System.out.println("Hash wert class2: " + classWithId2 + "\n");

        classWithIdSet.add(classWithId1);
        classWithIdSet.add(classWithId2);

        System.out.println();

        System.out.println("class1 == class2 ist " + classWithId1.equals(classWithId2) + "\n");

        System.out.println("Anzahl Klassen im Set: " + classWithIdSet.size()+ "\n");

        System.out.println("Ids in den Klassen: ");
        for (KlasseMitIDWithHashAndEquals classWithId: classWithIdSet) {
            System.out.println("    " + classWithId.getId());
        }
    }

    public static void SetWithHash() {
        System.out.println("\n----------------------------------------");
        System.out.println("Klasse mit hash\n");
        Set<KlasseMitIDOnlyWithHash> classWithIdSet = new HashSet<>();
        KlasseMitIDOnlyWithHash classWithId1 = new KlasseMitIDOnlyWithHash(402213);
        KlasseMitIDOnlyWithHash classWithId2 = new KlasseMitIDOnlyWithHash(402213);
        System.out.println("Hash wert class1: " + classWithId1);
        System.out.println("Hash wert class2: " + classWithId2 + "\n");

        classWithIdSet.add(classWithId1);
        classWithIdSet.add(classWithId2);

        System.out.println();

        System.out.println("class1 == class2 ist " + classWithId1.equals(classWithId2) + "\n");

        System.out.println("Anzahl Klassen im Set: " + classWithIdSet.size()+ "\n");

        System.out.println("Ids in den Klassen: ");
        for (KlasseMitIDOnlyWithHash classWithId: classWithIdSet) {
            System.out.println("    " + classWithId.getId());
        }
    }

    public static void SetWithEquals() {
        System.out.println("\n----------------------------------------");
        System.out.println("Klasse mit equals:\n");
        Set<KlasseMitIDOnlyWithEquals> classWithIdSet = new HashSet<>();
        KlasseMitIDOnlyWithEquals classWithId1 = new KlasseMitIDOnlyWithEquals(402213);
        KlasseMitIDOnlyWithEquals classWithId2 = new KlasseMitIDOnlyWithEquals(402213);
        System.out.println("Hash wert class1: " + classWithId1);
        System.out.println("Hash wert class2: " + classWithId2 + "\n");

        classWithIdSet.add(classWithId1);
        classWithIdSet.add(classWithId2);

        System.out.println();

        System.out.println("class1 == class2 ist " + classWithId1.equals(classWithId2) + "\n");

        System.out.println("Anzahl Klassen im Set: " + classWithIdSet.size()+ "\n");

        System.out.println("Ids in den Klassen: ");
        for (KlasseMitIDOnlyWithEquals classWithId: classWithIdSet) {
            System.out.println("    " + classWithId.getId());
        }
    }
}
