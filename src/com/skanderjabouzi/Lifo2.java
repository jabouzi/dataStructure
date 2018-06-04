package com.skanderjabouzi;

import java.util.*;

public class Lifo2<E> {

    private ArrayList<E> list = new ArrayList<E>();

    public void add(E o) {
        list.add(o);
    }

    public E get() {
        return list.remove(list.size() - 1);
    }


}
