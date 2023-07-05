package org.ExamPractice.patterns.decorator.concreteComponents;

import org.ExamPractice.patterns.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        setCost(1.5);
        setDescription("Espresso");
    }
}
