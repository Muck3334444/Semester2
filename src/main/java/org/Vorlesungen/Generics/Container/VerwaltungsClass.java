package org.Vorlesungen.Generics.Container;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VerwaltungsClass {
    public static void main(String[] args) {
        Lottozahlen lottozahlen = new Lottozahlen();
//        for (Integer i: lottozahlen.getLottoNumbers()) {
//            System.out.println(i);
//        }
        SetWithDuplicates();
    }

    public static void SetWithDuplicates() {
        Set<KlasseMitID> classWithIDSet = new HashSet<>();
        KlasseMitID classWithId1 = new KlasseMitID(402213);
        KlasseMitID classWithId2 = new KlasseMitID(402213);
        classWithIDSet.add(classWithId1);
        classWithIDSet.add(classWithId1);
        classWithIDSet.add(classWithId2);
        System.out.println(classWithId1.equals(classWithId2));
        System.out.println(classWithIDSet.size());
        for (KlasseMitID classWithId: classWithIDSet) {
            System.out.println(classWithId.getId());
        }
    }
}
