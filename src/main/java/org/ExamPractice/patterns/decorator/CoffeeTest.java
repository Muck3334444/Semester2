package org.ExamPractice.patterns.decorator;

import org.ExamPractice.patterns.decorator.concreteComponents.Darkroast;
import org.ExamPractice.patterns.decorator.concreteComponents.Espresso;
import org.ExamPractice.patterns.decorator.concreteDecorators.Milk;
import org.ExamPractice.patterns.decorator.concreteDecorators.Mocha;
import org.ExamPractice.patterns.decorator.concreteDecorators.Whip;

public class CoffeeTest {
    public static void main(String[] args) {
        Beverage beverage1 = new Mocha(new Mocha(new Whip(new Milk(new Darkroast()))));
        System.out.println(beverage1.getDescription());
        System.out.println("beverage1 cost " + beverage1.getCost());
        System.out.println("------------------------------------------------");
        Beverage beverage2 = new Espresso();
        System.out.println(beverage2.getDescription());
        System.out.println("beverage2 cost " + beverage2.getCost());
    }
}
