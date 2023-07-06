package org.Vorlesungen.Generics.Container;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottozahlen {
    public static void main(String[] args) {
        getLottoNumbers().stream().sorted().forEach(System.out::println);
    }
    public static Set<Integer> getLottoNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random r = new Random();
        while(numbers.size() < 7) {
            numbers.add(r.nextInt(1,50));
        }
        return numbers;
    }
}
