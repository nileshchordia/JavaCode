package com.cryptohash;

public class CharcterVariable {
    static char ch1;
    public static void main(String[] args) {
        char ch= 88;
        char ch3='T';
        char ch2='\u0100';
        System.out.println(ch);
        System.out.println((int)ch);
        System.out.println(Character.SIZE);
        System.out.println(ch1);
        System.out.println(ch2);
        ch2++;
        System.out.println(ch2);
        System.out.println((int)ch2);
        System.out.println(ch3);
        System.out.println((int)ch3);
        ch3++;
        System.out.println(ch3);

    }
}
