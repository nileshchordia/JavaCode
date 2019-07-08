package com.cryptohash;

public class LocalVariable {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        {
            a=20;
            int b=10;
            System.out.println(a+" "+b);
        }
        System.out.println(a);
        func(a);
        System.out.println(a);
    }
    public static  void func(int a){
        System.out.println(a);
        a=50;
        System.out.println(a);


    }
}
