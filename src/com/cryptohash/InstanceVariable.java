package com.cryptohash;

public class InstanceVariable {

    public static void main(String[] args) {
        Instance inst = new Instance();
        System.out.println(inst.i+" "+inst.f+" "+inst.d+" "+inst.o);

    }
}


class Instance{

    int i;
    float f;
    double d;
    Object o;
}
