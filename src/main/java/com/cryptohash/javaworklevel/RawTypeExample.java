package com.cryptohash.javaworklevel;

import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
    /**
     * raw type is generic interface and class with out its type arguments
     * List list = new ArrayList()
     * Generally donot use raw types
     * because
     * 1. unexpressive
     * 2. type unsafe
     * 3. getting run time exception in our code , but compile will success
     */


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nilesh");
        method(list);
        /**
         * it will get class cast exception in runtime but compile is success
         * raw type return object ---> type cast issue
         */


        String s = list.get(1);


    }

    private static void method(List list) {
        list.add(1);


    }
}
