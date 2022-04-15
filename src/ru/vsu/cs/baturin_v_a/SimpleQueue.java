package ru.vsu.cs.baturin_v_a;

public interface SimpleQueue<T> {
    void addElement(T element);
    int count();
    boolean isEmpty();
    T removeElement() throws Exception;
    T getElement() throws Exception;
}
