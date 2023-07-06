package org.Klausur.ArtikelAufgabe;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ArtikelTest {
    public static void main(String[] args) {
        Artikel[] artikels = new Artikel[3];
        artikels[0] = new Artikel(1,'A',15);
        artikels[1] = new Artikel(2,'b',25);
        artikels[2] = new Artikel(3,'c',35);
        Arrays.stream(artikels).sorted(Comparator.comparingInt(Artikel::getId)).forEach(x->System.out.println(x));
        Arrays.stream(artikels).sorted((x,y)->(int)(y.getPreis()-x.getPreis())).forEach(x->System.out.println(x));
        System.out.println(Arrays.stream(artikels).filter(x->x.getTyp() == 'A').count());
        List<Artikel> artikelList = Arrays.stream(artikels).filter(x->x.getTyp() == 'B').toList();
        System.out.println((Arrays.stream(artikels).mapToDouble(x->x.getPreis()).average()).getAsDouble());
    }
}
