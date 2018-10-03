package com.cryptohash;

public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a = 42;
        int b = 13;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;
        int f = ~a;
        System.out.println(a+" "+b +" "+c+" "+d+" "+e+" "+f);
        byte byt = 2;
        byt= (byte)( byt<<5);
        System.out.println(byt);
    }
}
