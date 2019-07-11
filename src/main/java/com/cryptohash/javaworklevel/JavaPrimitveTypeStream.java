package com.cryptohash.javaworklevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Stream basically work with Collection
 * But provide 3 stream for Primitive Types
 * IntStream
 * LongStream
 * DoubleStream
 */


public class JavaPrimitveTypeStream {
    public static void main(String[] args) {
        /**
         * Arithmetic Operation
         */
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = IntStream.of(intArray).sum();
        double average = Arrays.stream(intArray).average().getAsDouble();
        int min = Arrays.stream(intArray).min().getAsInt();
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("SUM " + sum + " AVG " + average + " MIN " + min + " MAX " + max);
        double asDouble = IntStream.range(0, 10).average().getAsDouble();
        System.out.println(asDouble);
        /**
         * range() is available for IntStream and LongStream
         * not for DoubleStream
         */

        System.out.println("RANGE CLOSED");
        IntStream intStream = IntStream.rangeClosed(0, 10);
        int sum1 = intStream.sum();
        System.out.println(sum);

        System.out.println("DOUBLE STREAM");
        double[] doubleArray = new double[]{1, 2, 3, 4};
        DoubleStream.of(doubleArray).forEach(System.out::println);
        /**
         * iterate
         */
        System.out.println("ITERATION");
        LongStream.range(0, 10).forEach(System.out::println);

        /**
         * parallel Stream, donot use for iterate!!!!
         */
        System.out.println("PARALLEL STREAM");
        IntStream.range(0, 10).parallel().forEach(System.out::println);

        /**
         * boxing
         */

        System.out.println("BOXING");
        List<Integer> collect = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        collect.forEach(System.out::println);

        /**
         * UNBOXING
         */

        System.out.println("UNBOXING");

        //we can use flatMapTo also
        int sum2 = collect.stream().mapToInt(i -> i).sum();
        System.out.println(sum2);


    }
}
