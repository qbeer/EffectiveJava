package qbeer.github.io;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ProperStack implements Cloneable {

    private final int DEFAULT_SIZE = 16;
    private Object[] elements;
    private int size = 0;

    public ProperStack() {
        elements = new Object[DEFAULT_SIZE];
    }

    public void push(Object object) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
        elements[size++] = object;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object object = elements[--size];
        elements[size] = null;
        return object;
    }

    public String getObjectArrayReference() {
        return elements.toString();
    }

    @Override
    protected ProperStack clone() {
        try {
            ProperStack result = (ProperStack) super.clone();
            // preferred idiom to copy array
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
