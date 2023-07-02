package org.Vorlesungen.FunctionalProgramming.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerController {
    public static void main(String[] args) {
        Consumer<Integer> consumer = x -> System.out.println(x*x);
        consumer.accept(5);
        Consumer<Integer> con = consumer.andThen(x-> System.out.println(x+x+x+x));
        con.accept(3);
        List<String> names = new ArrayList<>();
        names.add("Klaus");
        names.add("Hanz");
        names.add("Peter");
        Consumer<String> consumerString = x -> System.out.println(x);
        names.iterator().forEachRemaining(consumerString);
    }
}
