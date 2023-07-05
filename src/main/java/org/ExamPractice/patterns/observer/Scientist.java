package org.ExamPractice.patterns.observer;

public class Scientist implements Observer{
    private Penguin subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Penguin subject) {
        this.subject = subject;
    }

    public Scientist(Penguin subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Noted that the penguin ate its " + subject.getFishEaten() + "th fish");
    }
}
