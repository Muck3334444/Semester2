package org.ExamPractice.patterns.observer;

public class PengiunTest {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.setFishEaten(5);

        Scientist scientist1 = new Scientist(penguin);
        Scientist scientist2 = new Scientist(penguin);
        penguin.eat();
    }
}
