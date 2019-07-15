package com.cryptohash.javaworklevel;

import org.apache.commons.lang3.StringUtils;

public class IfStringIsASubStrings {
    public static void main(String[] args) {

        /**
         * Traditional Approach --> order of (n ^ 2)
         */

        String pattern = "abab";
        System.out.println(getSubString(pattern));


        /**
         *  New Approach --> order of (n)
         */
        String s = pattern + pattern;
        System.out.println((s + s).indexOf(pattern, 1));

        /**
         * to understand above approach , see below example
         */

        String str = "abcdefabcdefabcdefabcdef";
        String str1 = "abcdefabcdefabcdef";
        System.out.println(str.length() + "  " + str1.length());
        System.out.println((str).indexOf(str1, 1));


    }

    private static boolean getSubString(String str) {
        if (str.length() < 2) {
            return false;
        }

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < str.toCharArray().length / 2; i++) {
            stringBuffer.append(str.charAt(i));
            String clearedString = str.replaceAll(stringBuffer.toString(), "");
            if (StringUtils.isBlank(clearedString)) {
                return true;
            }
        }
        return false;
    }

}
