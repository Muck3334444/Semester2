package org.ExamPractice.patterns.decorator.concreteDecorators;

import org.ExamPractice.patterns.decorator.Beverage;
import org.ExamPractice.patterns.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
        setCost(0.5);
        setDescription("Milk");
    }

    public Milk() {
        this(null);
    }
}
