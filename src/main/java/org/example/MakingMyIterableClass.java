package org.example;

import java.util.Iterator;

public class MakingMyIterableClass <T>  implements Iterable<T>{
    private T[] elements;

    // Constructor
    public MakingMyIterableClass(T[] elements) {
        this.elements = elements;
    }

    // Implement the iterator() method to return an Iterator instance
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    // Define a nested class that implements the Iterator interface
    private class MyIterator implements Iterator<T> {
        private int currentIndex = 0;

        // Implement the hasNext() method
        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }

        // Implement the next() method
        @Override
        public T next() {
            return elements[currentIndex++];
        }

        // Optionally, implement the remove() method (if supported)
        @Override
        public void remove() {
            if (currentIndex <= 0) {
                throw new IllegalStateException("next() has not been called, or remove() has already been called after the last call to next()");
            }
            // Perform the removal operation here
            // Example: elements[currentIndex - 1] = null;
            currentIndex--; // Adjust the index after removal
        }
    }


}
