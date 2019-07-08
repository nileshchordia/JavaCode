package com.cryptohash;

public class StaticVariable {
    static int i;
    static float f;
    static boolean b;
    static Object o;
    static  double d =10.0;
     static {
        String st = "Nilesh";
        int iv=1;
    }
//    iv=10;
    static  String s="nil";
    public static void main(String[] args) {
        System.out.println(i+" "+f+" "+b+" "+o);
        System.out.println(d+" "+i+" "+s);
    }

}
