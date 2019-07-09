package com.cryptohash.javaworklevel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DiffCollectionStreamIterate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        /**
         * 1st way to iterate list
         */
        for (String s : list) {
            System.out.println(s);
        }

        Consumer<String> consumer = System.out::print;
        /**
         * 2nd way
         */
        list.forEach(consumer);
        System.out.println();
        /**
         * 3rd way
         */
        list.parallelStream().forEach(consumer);
        System.out.println();


        /**
         * reverse iteration
         */
        List<String> myList = new ReverseList();
        myList.addAll(list);
        myList.forEach(consumer);
        System.out.println();
        myList.parallelStream().forEach(consumer);
        System.out.println();

        Consumer<String> removeElement = s -> {
            if (s != null && s.equalsIgnoreCase("A")) {
                list.remove("d");
            }
        };

//        list.forEach(removeElement);
        list.forEach(consumer);
        list.parallelStream().forEach(consumer);

        list.forEach(e->list.set(3,"E"));
        list.forEach(consumer);

    }
}
