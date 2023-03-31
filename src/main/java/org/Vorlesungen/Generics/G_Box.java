package org.Vorlesungen.Generics;

public class G_Box<T> implements Markierbar<T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public void setMarke(T m) {

    }

    @Override
    public T getMarke() {
        return value;
    }
}