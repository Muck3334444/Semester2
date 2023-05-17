package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.List;

public class VerwaltungArtikel {
    public static void main(String[] args) {
        List<Artikel> artikelList = new ArrayList<>();
        artikelList.add(new Artikel("000001","Lebensmittel",25.4,10));
        artikelList.add(new Artikel("000002","Lebensmittel",3,80));
        artikelList.add(new Artikel("000003","Gartenzubehör",99.5,15));
        artikelList.add(new Artikel("000004","Hygiene",15.99,40));
        artikelList.add(new Artikel("000005","Sonstiges",155.49,6));
        artikelList.add(new Artikel("000006","Lebensmittel",1.99,150));
        String gesuchteWarengruppe = "Lebensmittel";
        int bestandGrenze = 25;
        artikelList.stream().filter(x->x.getGroup() == gesuchteWarengruppe).filter(x->x.getStorage() > bestandGrenze).forEach(x-> System.out.println(x));
    }
}
