package org.Vorlesungen.FunctionalProgramming.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guthaben {
    public static void main(String[] args) {
        List<Integer> guthaben = Arrays.asList(5,3000,20,712);
        List<Integer> guthabenZinsenNoStream = new ArrayList<>();
        double zinsen = 1.05;
        for (int i: guthaben) {
            guthabenZinsenNoStream.add((int)(i * zinsen));
        }
        printList(guthabenZinsenNoStream);
        int sum = 0;
        for (int i: guthabenZinsenNoStream) {
            sum += i;
        }
        System.out.println("\n" + sum + "\n");

        guthaben.stream().map((x) -> (int)(x*zinsen)).forEach(System.out::println);
        System.out.println(guthaben.stream().map((x) -> (int)(x*zinsen)).reduce(0,Integer::sum));
        System.out.println("\n" + sum + "\n");
    }

    private static void printList(List<Integer> list) {
        for (int i: list) {
            System.out.println(i);
        }
    }
}
