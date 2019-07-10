package com.cryptohash.javaworklevel;

import java.util.List;
import java.util.stream.Stream;

/**
 * java 7's break is similar to java 9's takeWhile
 * java 8 , we have to implement , i am unable to understand , after lambda practice lets see!!!!!!!
 */

public class OnlyJava9BreakTakeWhile {
    public static void main(String[] args) {

        /**
         * java 9's takeWhile  (jabki lelo)
         */

        Stream.of("cat", "monkey", "dog", "horse", "donkey")
                .takeWhile(s -> s.length() % 2 != 0).forEach(System.out::println);


        /**
         * java 7 break
         */

        List<String> cat = List.of("cat", "monkey", "dog", "horse", "donkey");

        for (String s : cat) {
            if (s.length() % 2 == 0) {
                break;
            }
            System.out.println(s);
        }


    }
}
