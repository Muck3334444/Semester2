package org.ExamPractice.patterns.decorator.concreteDecorators;

import org.ExamPractice.patterns.decorator.Beverage;
import org.ExamPractice.patterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
        setCost(0.7);
        setDescription("Mocha");
    }

    public Mocha() {
        this(null);
    }
}
