package org.giddap.dreamfactory.mitbbs;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 */
public class DeepIteratorImpl<T> implements Iterator<T> {

    Iterator<Data<T>> original = null;
    Iterator<Data<T>> current = null;

    // Constructor
    public DeepIteratorImpl(Collection<Data<T>> c) {
        // Implementation here
        original = c.iterator();
    }

    public T next() {
        // Implementation here
        if (current != null && current.hasNext()) {
            return current.next().getElement();
        }

        Data<T> data = original.next();
        if (data.isCollection()) {
            current = data.getCollection().iterator();
            return current.next().getElement();
        } else {
            return data.getElement();
        }
    }

    public boolean hasNext() {
        // Implementation here
        return current == null ? original.hasNext() : current.hasNext();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported in this implementation.");
    }
}

interface Data<T> {
    // Does this Data hold a collection?
    public boolean isCollection();

    // Returns the collection contained by this Data, or null if it is a
    //single element
    public Collection<Data<T>> getCollection();

    // Returns the single element contained by this Data, or null if it is a
    //collection
    public T getElement();
}