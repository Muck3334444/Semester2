package org.ExamPractice.patterns.decorator.concreteComponents;

import org.ExamPractice.patterns.decorator.Beverage;

public class Houseblend extends Beverage {
    public Houseblend() {
        setCost(2.5);
        setDescription("Houseblend");
    }
}
