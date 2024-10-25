package Generics.Lab._01_Jar;

import java.util.ArrayDeque;

public class Jar<T> {
    // При съсздаване на обект от този клас, полетата се инициализират със стойст null
    private ArrayDeque<T> elements;

    public Jar() {
        // Създавам един празен стек срещу това поле
        this.elements = new ArrayDeque<>();
    }

    public void add(T element) {
        this.elements.push(element);
    }

    public T remove() {
        return this.elements.pop();
    }
}
