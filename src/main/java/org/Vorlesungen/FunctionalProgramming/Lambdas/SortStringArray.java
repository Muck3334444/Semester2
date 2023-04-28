package org.Vorlesungen.FunctionalProgramming.Lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringArray {
    public static void main(String[] args) {
        arraySortLambdaExpression();
        arraySortComparatorMethodReference();
        arraySortComparatorLambdas();

    }

    private static void arraySortLambdaExpression() {
        String strings[] = new String[]{"hallo", "EEE", "Ein toller String ist das hier", "Guten Abend"};
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        for (String s: strings) {
            System.out.println(s);
        }

    }

    private static void arraySortComparatorLambdas() {
        String[] strings = { "Werkstoffkunde", "WiIng", "Germanistik", "TierGenetik", "Physik", "Altorientalistik"};
        System.out.println("Alphabetical Sort\n");
        Arrays.sort(strings, (s1,s2)->s1.compareTo(s2));
        printStringArray(strings);
        System.out.println("\nLength Sort\n");
        Arrays.sort(strings, (s1,s2) -> s1.length() - s2.length());
        printStringArray(strings);
        System.out.println("\nE Sort\n");
        Arrays.sort(strings, (s1,s2) -> countE(s1) - countE(s2));
        printStringArray(strings);
    }

    private static void arraySortComparatorMethodReference() {
        String[] strings = { "Werkstoffkunde", "WiIng", "Germanistik", "TierGenetik", "Physik", "Altorientalistik"};
        System.out.println("Alphabetical Sort\n");
        Arrays.sort(strings, Comparator.naturalOrder());
        printStringArray(strings);
        System.out.println("\nLength Sort\n");
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        printStringArray(strings);
        System.out.println("\nE Sort\n");
        Arrays.sort(strings, Comparator.comparingInt(SortStringArray::countE));
        printStringArray(strings);
    }

    private static int countE(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }

    private static void printStringArray(String[] strings) {
        for (String s: strings) {
            System.out.println(s);
        }
    }
}
