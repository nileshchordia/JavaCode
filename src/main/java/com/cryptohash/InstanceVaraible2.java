package com.cryptohash;

public class InstanceVaraible2 {
   public void test(){
        int b=10;
       System.out.println(b+" "+a);
    }

    int a;
    public static void main(String[] args) {
    InstanceVaraible2 iv = new InstanceVaraible2();
    iv.test();
    System.out.println(iv.a);
    }
}
