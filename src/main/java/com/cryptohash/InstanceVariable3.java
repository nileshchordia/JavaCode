package com.cryptohash;

public class InstanceVariable3 {
    float f=10.5f;
    int i;
    InstanceVariable3(){
        i=10;
    }

    public  void  test(){
        int b=10;
        System.out.println(b+" "+f+" "+i);

    }
    public static void main(String[] args) {
    InstanceVariable3 iv = new InstanceVariable3();
    iv.test();
    }
}
