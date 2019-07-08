package com.cryptohash.javaworklevel;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class CheckingStringEmptyNull {

    /**
     * strings are imutable
     *
     * @param args
     */


    public static void main(String[] args) {
        System.out.println(isEmpty(null) + " " + getLength(null));
        System.out.println(isEmpty("nilesh") + "  " + getLength("nilesh"));
        System.out.println(isEmpty("") + "   " + getLength(""));


        System.out.println(isBlankString("         nil   ") + "   " + getLength("      nil  "));
        System.out.println(isBlankString("               ") + "   " + getLength("         "));
        System.out.println(isBlankString("   nul") + "    " + getLength("     nul"));

        System.out.println("STRING-UTILS JAVA COMMONS LANG");
        System.out.println(StringUtils.isEmpty("nilesh"));
        System.out.println(StringUtils.isEmpty("                         "));
        System.out.println(StringUtils.isBlank("                            "));
        System.out.println(StringUtils.isNotBlank("nilesh"));
        System.out.println(StringUtils.isNotBlank("    "));
        System.out.println(StringUtils.isAnyBlank("nil   esh    "));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isEmpty(null));


        System.out.println("STRING GUAVA");
        System.out.println(Strings.isNullOrEmpty("     "));
        System.out.println(Strings.isNullOrEmpty("nilesh"));
        System.out.println(Strings.nullToEmpty(null));
        System.out.println(Strings.isNullOrEmpty(""));
        System.out.println(Strings.isNullOrEmpty(null));


    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();

    }

    public static int getLength(String s) {
        if (s == null) {
            return 0;
        }
        return s.trim().length();
    }

    public static boolean isBlankString(String s) {
        return s == null || s.trim().isEmpty();
    }


}
