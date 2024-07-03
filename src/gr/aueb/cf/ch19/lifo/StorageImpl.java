package gr.aueb.cf.ch19.lifo;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Delegation Design Pattern.
 *
 * @param <T>
 */
public class StorageImpl<T> implements IStorage<T> {
    // Composition
    private final Deque<T> myStack;

    // Forwarding
    public StorageImpl(int size) {
        myStack = new ArrayDeque<>(size);  //LinkedList<>()
    }

    @Override
    public void push(T t) {
        myStack.push(t);
    }

    @Override
    public T pop() {
        return myStack.pop();
    }

    @Override
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    @Override
    public T[] toArray(T[] a) {
        return myStack.toArray(a);
    }

    @Override
    public void printItems() {
        myStack.forEach(System.out::println);
    }
}
