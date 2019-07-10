package com.cryptohash.javaworklevel;


import com.google.common.collect.Comparators;
import com.google.common.collect.Ordering;

import java.util.*;
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
        System.out.println("IS Sorted ? : " + methodFirstApproach(list));


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
        System.out.println("AFTER SORT IN Comparable Approach");
        System.out.println("IS Sorted ? : " + methodFirstApproach(stringList));


    }

    private static boolean methodFirstApproach(List<String> list) {
        Iterator<String> iterator = list.iterator();
        String current, prev = iterator.next();
        while (iterator.hasNext()) {
            current = iterator.next();
            if (prev.compareTo(current) > 0) {
                return false;
            }
            prev = current;
        }
        return true;
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
