package models;

import java.util.ArrayList;
import java.util.Iterator;

public class BoxIterator <T> implements Iterator<T> {
    int index;
    ArrayList<T> components;

    public BoxIterator(ArrayList<T> components) {
        index = 0;
        this.components = components;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public T next() {
        return components.get(index++);
    }
}
