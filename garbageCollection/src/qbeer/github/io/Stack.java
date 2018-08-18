package qbeer.github.io;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object[] elements;
    private int size = 0;
    private final static int DEFAULT_SIZE = 16;

    public Stack() {
        elements = new Object[DEFAULT_SIZE];
    }

    public void push(Object object) {
        if( size == elements.length )
            elements = Arrays.copyOf(elements, 2*size + 1);
        elements[size++ ] = object;
    }


    /*
    * This part is crucial since the popped value
    * is not dereferenced so therefore it is not
    * garbage collected and clutters the memory.
    * // solution
    * */

    public Object pop() {
        if(size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // solution - dereference manually
        return result;
    }

}
