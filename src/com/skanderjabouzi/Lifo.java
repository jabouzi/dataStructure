package com.skanderjabouzi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FIFO based on LinkedList.
 */
public class Lifo<E> {

    private LinkedList<E> list = new LinkedList<E>();

    /**
     * Puts object in queue.
     */
    public void put(E o) {
        list.addLast(o);
    }

    /**
     * Returns an element (object) from queue.
     *
     * @return element from queue or <code>null</code> if queue is empty
     */
    public E get() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeLast();
    }

    /**
     * Returns all elements from the queue and clears it.
     */
    public Object[] getAll() {
        Object[] res = new Object[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void clear() {
        list.clear();
    }


    /**
     * Peeks an element in the queue. Returned elements is not removed from the queue.
     */
    public E peek() {
        return list.getLast();
    }

    /**
     * Returns <code>true</code> if queue is empty, otherwise <code>false</code>
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Returns queue size.
     */
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        List<Object> list = Arrays.asList(getAll());
        return list.toString();
    }
}

