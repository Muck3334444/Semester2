package org.Klausur;

import java.util.Arrays;
import java.util.Comparator;

public class NR1 {
    public static void main(String[] args) {
        String[] strings = {"werkstoffkunde", "elektrotechnik", "germanistik", "theaterwissenschaften", "physik", "altorienthalik"};
        Comparator<String> comp = (x1,x2)->x1.length()-x2.length();
        Arrays.sort(strings,comp);
        showArray(strings);

        comp = Comparator.naturalOrder();
        Arrays.sort(strings,comp);
        showArray(strings);

        comp = (x1,x2)->countEsStream(x1)-countEsStream(x2);
        Arrays.sort(strings,comp);
        showArray(strings);
    }

    private static <T> void showArray(T[] arr) {
        System.out.println("--------------------");
        System.out.println(Arrays.toString(arr));
    }

    private static int countEsStream(String s) {
        long result = s.chars().filter(x->x=='e').count();
        return (int) result;
    }
}
