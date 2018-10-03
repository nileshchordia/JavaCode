package com.cryptohash;

import java.util.Scanner;

public class CelsiusToFarehnhit {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        sc.close();
        double farenhit = 9*(celsius)/5+32;
        System.out.println(farenhit);
    }

}
