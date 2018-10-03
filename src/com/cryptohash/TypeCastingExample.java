package com.cryptohash;

public class TypeCastingExample {
    public static void main(String[] args) {


        byte b;
        int i=10;
        short s;
        long l;
        char ch = 'a';
        float f=3.14f;
        double d;

        b=(byte) i;
        s=b;
        i=(int) f;
        System.out.println(b+" "+s+" "+i);
    }

}
