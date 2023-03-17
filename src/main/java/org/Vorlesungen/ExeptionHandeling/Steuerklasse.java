package org.Vorlesungen.ExeptionHandeling;

import java.util.Scanner;

public class Steuerklasse {
    public static void main(String[] args) {
        Person person = new Person(149);
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        String[] sArray = new String[]{"Hi","Das","Ist","Eine", "Trap"};
        System.out.println(sArray[index]);
        System.out.println("Programmende");
        // Mensch eine Out of Bounds exeption, we hätte es gedacht
    }


}
