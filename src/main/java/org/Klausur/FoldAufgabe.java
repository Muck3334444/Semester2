package org.Klausur;

import java.util.function.BinaryOperator;

public class FoldAufgabe {
    public static void main(String[] args) {

    }

    public static <T> T fold(BinaryOperator<T> op, T first, T... items) {
        T result = first;
        for (T item: items) {
            result = op.apply(result,item);
        }
        return result;
    }
}
