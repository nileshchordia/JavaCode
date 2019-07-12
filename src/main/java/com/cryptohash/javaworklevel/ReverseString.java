package com.cryptohash.javaworklevel;

import org.apache.commons.lang3.StringUtils;

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
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        /**
         * Common lang 3
         */

        System.out.println("APACHE COMMON LANG");

        String reverse = StringUtils.reverse(input);
        System.out.println(reverse);

        /**
         * Alternate Traditional Approach
         */


        System.out.println("TRADITIONAL APPROACH");
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString = reverseString + input.charAt(i);
        }

        System.out.println(reverseString);


        /**
         * reverse order of words in a sentence in a Tradtional Approach
         */

        String reverseSentence = reverseOrderOfWords("nilesh jain");
        System.out.println(reverseSentence);

        /**
         *reverse order of words in a sentence using String Builder
         */
//        reverseOrderOfWords()

    }

    public static String reverseOrderOfWords(String sentence) {
        String regex = " ";
        String[] split = sentence.split(regex);
        String reverse = "";
        for (int i = split.length - 1; i >= 0; i--) {
            reverse = reverse + split[i] + " ";
        }
        return reverse.trim();

    }


}
