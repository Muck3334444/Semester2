package org.ExamPractice.patterns.decorator.concreteDecorators;

import org.ExamPractice.patterns.decorator.Beverage;
import org.ExamPractice.patterns.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
        setCost(0.3);
        setDescription("Whip");
    }

    public Whip() {
        this(null);
    }
}
