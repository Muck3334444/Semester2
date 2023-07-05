package org.ExamPractice.patterns.decorator.concreteComponents;

import org.ExamPractice.patterns.decorator.Beverage;

public class Darkroast extends Beverage {
    public Darkroast() {
        setCost(2);
        setDescription("Dark-Roast");
    }
}
