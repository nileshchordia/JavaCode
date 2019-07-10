package com.cryptohash.javaworklevel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaIntStreamConvert {
    public static void main(String[] args) {

        /**
         * IntStream to Array
         */
        int[] ints = IntStream.iterate(0, i -> i + 2).limit(50).toArray();
        for (int anInt : ints) {
            System.out.println(anInt);
        }

        /**
         * IntStream to List
         * range is including 0 and not including 50---> (0,50]
         */

        List<Integer> collect = IntStream.range(0, 50).boxed().collect(Collectors.toList());
        collect.forEach(System.out::println);

        /**
         * IntStream to String
         */

        List<String> collect1 = IntStream.of(111,222,333).mapToObj(value -> String.valueOf(value)).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }


}
