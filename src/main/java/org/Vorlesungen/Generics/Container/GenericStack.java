package org.Vorlesungen.Generics.Container;

import java.util.List;

public class GenericStack<T> {
    private List<T> stack;

    public GenericStack(List<T> stack) {
        this.stack = stack;
    }
    public boolean empty() {
        return stack.isEmpty();
    }

    public T push(T item) {
        stack.add(0,item);
        return stack.get(stack.size() - 1);
    }

    public T pop() {
        T item = stack.get(0);
        stack.remove(0);
        return item;
    }

    public T peek() {
        return stack.get(0);
    }
}
