package com.cryptohash.javaworklevel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Collection can iterate via indices
 * while stream is not collection, so ways to iterate stream via indices
 *
 */


public class JavaStreamIndices {
    public static void main(String[] args) {
        /**
         * getting even strings
         */
        String[] names = new String[]{"nilesh", "nil", "apple", "rakesh", "dinesh", "monu"};
        List<String> evenString = IntStream.range(0, names.length).filter(i -> i % 2 == 0).mapToObj(i -> names[i]).collect(Collectors.toList());
        evenString.forEach(System.out::println);


        /**
         * some others way are there , but we have to add dependency
         *
         *
         *********************2nd way******************************
         <dependency>
         <groupId>one.util</groupId>
         <artifactId>streamex</artifactId>
         <version>0.6.5</version>
         </dependency>

         *********************3rd way******************************
         <dependency>
             <groupId>io.vavr</groupId>
             <artifactId>vavr</artifactId>
             <version>0.9.0</version>
         </dependency>

         *********************4th way******************************

         <dependency>
             <groupId>com.codepoetics</groupId>
             <artifactId>protonpack</artifactId>
             <version>1.13</version>
         </dependency>

         */



    }
}
