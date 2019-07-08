package com.cryptohash;

import java.util.Scanner;

public class PowerNumberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int result=(int)Math.pow(a,b);
        System.out.println(result);
    }
}
