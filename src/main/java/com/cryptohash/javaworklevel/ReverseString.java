package com.cryptohash.javaworklevel;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        /**
         * Traditional Approach
         */

        char[] charArray = input.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char c = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = c;
        }
        System.out.println(charArray);

        /**
         * String Buffer
         */

        System.out.println("STRING BUFFER");
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());

        /**
         *STRING BUILDER
         */
        System.out.println("STRING BUILDER");
        StringBuilder stringBuilder = new StringBuilder(input);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
