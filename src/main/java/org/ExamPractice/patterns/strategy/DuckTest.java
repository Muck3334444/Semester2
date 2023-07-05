package org.ExamPractice.patterns.strategy;

import org.ExamPractice.patterns.strategy.FlugKlassensatz.FlugzeugFliegen;
import org.ExamPractice.patterns.strategy.FlugKlassensatz.NatuerlichesFliegen;
import org.ExamPractice.patterns.strategy.NoiseKlassensatz.Quack;
import org.ExamPractice.patterns.strategy.NoiseKlassensatz.Quietsch;

public class DuckTest {
    public static void main(String[] args) {
        Duck duck1 = new Duck(new NatuerlichesFliegen(), new Quack());
        duck1.makeNoise();
        duck1.abheben();
        duck1.kurshalten();
        duck1.landen();
        Duck duck2 = new Duck(new FlugzeugFliegen(), new Quietsch());
        System.out.println("-----------------------------");
        duck2.makeNoise();
        duck2.abheben();
        duck2.kurshalten();
        duck2.landen();
    }
}
