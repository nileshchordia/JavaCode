package com.cryptohash.javaworklevel;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MultiLineString {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        /**
         * Java 8 Approach
         */

        String join = String.join(newLine, "nilesh", "jain", "love", "coding");
        System.out.println(join);
        System.out.println(newLine);

        /**
         * string concat
         */
        String concat = "".concat("nilesh").concat(newLine).concat("jain").concat(newLine).concat("love").concat(newLine).concat("coding").concat(newLine);
        System.out.println(concat);
        System.out.println(newLine);

        /**
         * Java Compiler convert concat() and + into same way
         */

        String s = "" + newLine + "nilesh" + newLine + "love" + newLine + "coding";
        System.out.println(s);
        System.out.println(newLine);

        /**
         * String Buffer same as String Builder
         */

        StringBuffer stringBuffer = new StringBuffer().append(newLine).append("nilesh").append(newLine).append("love")
                .append(newLine).append("coding");
        System.out.println(stringBuffer);

        /**
         * String Writer
         */

        StringWriter stringWriter = new StringWriter().append(newLine).append("nilesh").append(newLine).append("love")
                .append(newLine).append("coding");

        System.out.println(stringWriter.toString());

        /**
         * String Writer and Print Writer
         */

        StringWriter stringWriter1 = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter1);
        printWriter.println("nilesh");
        printWriter.println("love");
        printWriter.println("coding");
        System.out.println(stringWriter1.toString());

        /**
         * Guava jOiner
         */

        String join1 = Joiner.on(newLine).join(ImmutableList.of("nilesh", "love", "coding"));
        System.out.println(join1);


    }
}
