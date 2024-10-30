package IteratorAndComparator.exercises.ListIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator<T> implements Iterable<T> {
    private List<T> elements;
    private int currentIndex;

    public ListyIterator(T... elements) {
        this.elements = List.of(elements);
        this.currentIndex = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public T next() {
                return elements.get(index++);
            }
        };
    }

    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    boolean hasNext() {
        return this.currentIndex < elements.size() - 1;
    }

    public void print() {
        if (this.elements.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }

        System.out.println(this.elements.get(this.currentIndex));
    }
}
