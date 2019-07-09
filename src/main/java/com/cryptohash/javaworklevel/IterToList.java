package com.cryptohash.javaworklevel;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.apache.commons.collections.IteratorUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class IterToList {
    public static void main(String[] args) {
        /**
         * 1st approach iterator to list
         */
        Iterator<String> iterator = Arrays.asList("1", "2", "3").iterator();
        Iterable<String> iterable = () -> iterator;
        Consumer<String> printList = System.out::println;

/*        List<String> actualList = new ArrayList<>();
        while (iterator.hasNext()) {
            actualList.add(iterator.next());
        }

        actualList.forEach(printList);*/


        /**
         * 2nd approach iterator to list
         */


        Iterator<String> iterator1 = Arrays.asList("4", "5", "6").iterator();
        List<String> stringList = new ArrayList<>();
        iterator1.forEachRemaining(stringList::add);
        stringList.forEach(printList);


        /**
         * 3rd approach iterator to list
         */

        List<String> stringList1 = StreamSupport.stream(iterable.spliterator(), false).collect(Collectors.toList());
        stringList1.forEach(printList);


        /**
         * 4th approach iterator to list ---> Guava
         */

        //imutable list
        ImmutableList<String> strings = ImmutableList.copyOf(iterator);

        //mutable list
        List<String> strings1 = Lists.newArrayList(iterator);


        /**
         * 5th approach iterator to list ---> commons-lang3
         */


        List<String> list = IteratorUtils.toList(iterator);



    }
}
