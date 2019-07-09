package com.cryptohash.javaworklevel;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSkipVslimit {
    public static void main(String[] args) {
        /**
         * skip(2)-> it skips first two element
         */

        System.out.println("SKIP------------------------------");
        List<Integer> integerList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0).skip(2).collect(Collectors.toList());
        Consumer<Integer> printList = System.out::println;
        integerList.forEach(printList);

        /**
         * limit(2)-> get list of size 2
         */
        System.out.println("LIMIT------------------------------");

        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(integer -> integer % 2 == 0).limit(2).collect(Collectors.toList());
        collect.forEach(printList);

        /**
         * working with infinite streams
         */

        System.out.println("Infinite Stream --------------------");
        List<Integer> infiniteStreamToList = Stream.iterate(0, integer -> integer + 1).limit(10).collect(Collectors.toList());
        infiniteStreamToList.forEach(printList);

        /**
         * Infinite Stream with skip() and limit()
         */

        System.out.println("SKIP AND LIMIT");
        List<Integer> infiniteStreamSkipLimit = Stream.iterate(0, i -> i + 1).filter(i -> i % 2 == 0).skip(2).limit(10).collect(Collectors.toList());
        infiniteStreamSkipLimit.forEach(printList);

        /**
         * Infinite Stream with limit() and skip()
         */

        System.out.println("LIMIT AND SKIP");
        List<Integer> infiniteStreamLimitSkip = Stream.iterate(0, i -> i + 1).filter(i -> i % 2 == 0).limit(10).skip(2).collect(Collectors.toList());
        infiniteStreamLimitSkip.forEach(printList);




    }
}
