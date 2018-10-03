package com.cryptohash;

public class Staticvariable1 {

    static  int count=0;
    public  void  test(){
        count++;
    }
}

class StaticVar{
    public static void main(String[] args) {
        Staticvariable1 sv = new Staticvariable1();
        Staticvariable1 sv1 = new Staticvariable1();

        sv.test();
        sv1.test();
        System.out.println(Staticvariable1.count);

    }
}
