package com.cryptohash;

import java.util.Scanner;

public class BmiCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightPounds = sc.nextDouble();
        double heightInches = sc.nextDouble();
        double weightKg = weightPounds*0.45359237;
        double heightMetre = heightInches*0.0254;
//        System.out.println(weightKg+" "+heightMetre);
        double bmi = weightKg/(heightMetre*heightMetre);
        System.out.println("BMI "+ bmi);
    }
}
