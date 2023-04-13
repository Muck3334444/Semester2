package org.Vorlesungen.Generics.Container;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Sortieren {
    private static List<String> stringsList;
    private static String[] stringsArrayLengthSorted;
    private static String[]  stringsArrayAlphabeticallySorted;

    public static void main(String[] args) {
        fillList();
        sortByLength();
        sortByAlphabet();
    }

    private static void sortByLength() {
        stringsArrayLengthSorted = stringsList.toArray(new String[0]);
        for (int i = 1; i < stringsArrayLengthSorted.length - 1; i++) {
            if (stringsArrayLengthSorted[i].length() > stringsArrayLengthSorted[i + 1].length()) {
                String buffer = stringsArrayLengthSorted[i];
                stringsArrayLengthSorted[i] = stringsArrayLengthSorted[i + 1];
                stringsArrayLengthSorted[i + 1] = buffer;
            }
            checkPriorLength(i);
        }
        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("List sorted by length:\n");
        printArray(stringsArrayLengthSorted);
    }

    private static void checkPriorLength(int index) {
        if (stringsArrayLengthSorted[index - 1].length() > stringsArrayLengthSorted[index].length()) {
            String buffer = stringsArrayLengthSorted[index - 1];
            stringsArrayLengthSorted[index - 1] = stringsArrayLengthSorted[index];
            stringsArrayLengthSorted[index] = buffer;
            if (index != 1) {
                checkPriorLength(index - 1);
            }
        }
    }

    private static void sortByAlphabet() {
        stringsArrayAlphabeticallySorted = stringsList.toArray(new String[0]);
        for (int i = 0; i < stringsArrayAlphabeticallySorted.length; i++) {
            stringsArrayAlphabeticallySorted[i] = stringsArrayAlphabeticallySorted[i].toLowerCase(Locale.ROOT);
        }

        for (int i = 1; i < stringsArrayAlphabeticallySorted.length - 1; i++) {
            int letterIndex = 0;

            do {
                if (stringsArrayAlphabeticallySorted[i].charAt(letterIndex) > stringsArrayAlphabeticallySorted[i + 1].charAt(letterIndex)){
                    String buffer = stringsArrayAlphabeticallySorted[i];
                    stringsArrayAlphabeticallySorted[i] = stringsArrayAlphabeticallySorted[i + 1];
                    stringsArrayAlphabeticallySorted[i + 1] = buffer;
                    break;
                }
                else if (stringsArrayAlphabeticallySorted[i].charAt(letterIndex) == stringsArrayAlphabeticallySorted[i + 1].charAt(letterIndex)) {
                    if (letterIndex == stringsArrayAlphabeticallySorted[i + 1].length() - 1 && letterIndex < stringsArrayAlphabeticallySorted[i].length() - 1) {
                        String buffer = stringsArrayAlphabeticallySorted[i];
                        stringsArrayAlphabeticallySorted[i] = stringsArrayAlphabeticallySorted[i + 1];
                        stringsArrayAlphabeticallySorted[i + 1] = buffer;
                        break;
                    }
                    else if (letterIndex < stringsArrayAlphabeticallySorted[i].length() - 1 && letterIndex < stringsArrayAlphabeticallySorted[i + 1].length() - 1) {
                        letterIndex++;
                    }
                }
            } while(letterIndex < stringsArrayAlphabeticallySorted[i - 1].length() - 1 && letterIndex < stringsArrayAlphabeticallySorted[i].length() - 1);

            checkPriorAlphabetically(i, 0);
        }

        System.out.println("\n-----------------------------------------------------\n");
        System.out.println("List sorted by Alphabetical order:\n");
        printArray(stringsArrayAlphabeticallySorted);
    }

    private static void checkPriorAlphabetically(int index, int letterIndex) {
        if (stringsArrayAlphabeticallySorted[index - 1].charAt(letterIndex) > stringsArrayAlphabeticallySorted[index].charAt(letterIndex)){
            switchBaseAlphabetically(index, letterIndex);
        }
        else if (stringsArrayAlphabeticallySorted[index - 1].charAt(letterIndex) == stringsArrayAlphabeticallySorted[index].charAt(letterIndex)) {
            if (letterIndex == stringsArrayAlphabeticallySorted[index].length() - 1 && letterIndex < stringsArrayAlphabeticallySorted[index - 1].length() - 1) {
                switchBaseAlphabetically(index, letterIndex);
            }
            else if (letterIndex < stringsArrayAlphabeticallySorted[index - 1].length() - 1 && letterIndex < stringsArrayAlphabeticallySorted[index].length() - 1) {
                checkPriorAlphabetically(index, letterIndex + 1);
            }
        }
    }

    private static void switchBaseAlphabetically(int index, int letterIndex) {
        String buffer = stringsArrayAlphabeticallySorted[index - 1];
        stringsArrayAlphabeticallySorted[index - 1] = stringsArrayAlphabeticallySorted[index];
        stringsArrayAlphabeticallySorted[index] = buffer;
        if (index != 1) {
            checkPriorAlphabetically(index - 1, 0);
        }
    }

    private static void fillList() {
        stringsList = new ArrayList<>();
        stringsList.add("Af");
        stringsList.add("B");
        stringsList.add("Cweraw");
        stringsList.add("U");
        stringsList.add("QawOih");
        stringsList.add("Czawvac");
        stringsList.add("Czawva");
        stringsList.add("D");
        stringsList.add("Ab");
    }

    public static void printArray(String[] toPrint) {
        for (String s: toPrint) {
            System.out.println(s);
        }
    }
}
