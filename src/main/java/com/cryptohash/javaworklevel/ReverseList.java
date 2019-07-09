package com.cryptohash.javaworklevel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseList extends ArrayList<String> {

    @Override
    public Iterator<String> iterator() {
        int startIndex = size() - 1;
        List<String> list = this;
        Iterator<String> iterator = new Iterator<String>() {
            int currentIndex = startIndex;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public String next() {
                String s = list.get(currentIndex);
                currentIndex--;
                return s;
            }
        };
        return iterator;
    }
}
