package com.cryptohash.javaworklevel;


import com.google.common.collect.Comparators;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class SortedListWays {
    public static void main(String[] args) {

        //imutable list from JAVA 9
        List<String> list = List.of("nilesh", "apple", "nilu");

        List<String> stringList = new ArrayList<String>();
        stringList.addAll(list);


        /**
         * 1st approach comparable
         *
         */

        /**
         * 2nd approach comparator
         *
         */

        /**
         * 3rd approach recursive
         *
         */

        System.out.println(recursiveSort(stringList));


        /**
         * 4th approach gauva
         *
         */

        System.out.println("BEFORE SORT");
        System.out.println(Ordering.natural().isOrdered(stringList));
        Ordering<Comparable> ordering = Ordering.natural();

        //from JAVA 8
        System.out.println(Comparators.isInOrder(stringList, Comparator.<String>naturalOrder()));

        Collections.sort(stringList, ordering);
        Consumer<String> printList = System.out::println;
        System.out.println("AFTER SORT");
        System.out.println(Ordering.natural().isOrdered(stringList));
        stringList.forEach(printList);

        //from JAVA 8
        System.out.println(Comparators.isInOrder(stringList, Comparator.<String>naturalOrder()));

        System.out.println("AFTER SORT IN RECURSIVE APPROACH");
        System.out.println(recursiveSort(stringList));

    }

    private static boolean recursiveSort(List<String> stringList) {
        return recursive(stringList, stringList.size());
    }

    private static boolean recursive(List<String> stringList, int index) {
        if (index < 2) {
            return true;
        } else if (stringList.get(index - 2).compareTo(stringList.get(index - 1)) > 0) {
            return false;
        } else {
            return recursive(stringList, index - 1);
        }

    }
}
