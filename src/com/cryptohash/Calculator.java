package com.cryptohash;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subTotal = sc.nextDouble();
        double gratitude = sc .nextDouble();
        sc.close();
        double total = subTotal+(subTotal*gratitude/100);
        System.out.println(total);
    }
}
