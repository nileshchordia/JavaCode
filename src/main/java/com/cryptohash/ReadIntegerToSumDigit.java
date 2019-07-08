package com.cryptohash;

import java.util.Scanner;

public class ReadIntegerToSumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum=0;
        sc.close();
        while(number!=0){
            sum = sum+number%10;
            number/=10;
        }
        System.out.println(sum);
    }
}
