package org.Vorlesungen.Generics.Container;

import java.util.*;

public class Woerterbuch {
    private static Map<String, String> woerterBuch;
    public static void main(String[] args) {
        initFillMap();
        allGermanWords();
        allEnglishWords();
        allEnglishSortedWords();
        addValuePair("Heute", "Today");
        translate("Apfel");
        printMap();
    }

    public static void addValuePair(String key, String value) {
        woerterBuch.put(key, value);
    }

    public static void translate(String key) {
        System.out.println(key + " = " + woerterBuch.get(key) + "\n");
    }

    public static void allGermanWords() {
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Alle Deutschen Wörter: \n");
        List<String> keyList = new ArrayList<>(woerterBuch.keySet());
        Collections.sort(keyList);
        for (String s: keyList) {
            System.out.println(s);
        }
    }

    public static void allEnglishWords() {
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Alle Englischen Wörter sortiert: \n");
        List<String> keyList = new ArrayList<>(woerterBuch.values());
        for (String s: keyList) {
            System.out.println(s);
        }
    }

    public static void allEnglishSortedWords() {
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Alle Englischen Wörter: \n");
        List<String> keyList = new ArrayList<>(woerterBuch.values());
        Collections.sort(keyList);
        for (String s: keyList) {
            System.out.println(s);
        }
    }

    public static void printMap() {
        StringBuilder s = new StringBuilder();
        for (Map.Entry entry: woerterBuch.entrySet()) {
            s.append(entry.getKey()).append(":   ").append(entry.getValue()).append("\n");
        }
        System.out.println(s + "\n");
    }
    public static void initFillMap() {
        woerterBuch = new HashMap<>();
        woerterBuch.put("Hi", "Hi");
        woerterBuch.put("Apfel", "Apple");
        woerterBuch.put("Hallo", "Hello");
        woerterBuch.put("Wie", "How");
        woerterBuch.put("Wo", "Where");
    }
}
