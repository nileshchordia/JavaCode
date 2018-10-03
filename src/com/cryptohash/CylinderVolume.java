package com.cryptohash;

import java.util.Scanner;

public class CylinderVolume {
    public  static final double PI=3.14;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius=sc.nextDouble();
        double height = sc .nextDouble();
        sc.close();
        double area = PI*radius*radius;
        double volume = area*height;
        System.out.println("Area "+area+" Volume "+volume);

    }
}
