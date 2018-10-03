package com.cryptohash;

public class BitwiseLeftShiftExample {
    public static void main(String[] args) {
        int a=2;
        a=a<<1;
        int b=5;
        b=b<<2;
        int c=(int)Math.pow(2,31 )-1;

        c=c<<1;
        System.out.println(a+" "+b+" "+c);
        c=(-c)<<1;
        System.out.println(c);

    }
}
